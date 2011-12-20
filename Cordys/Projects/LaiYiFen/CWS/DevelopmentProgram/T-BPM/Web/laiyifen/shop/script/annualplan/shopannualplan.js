var insertOperation = 0;
var submitOperation = 0;   //辨别提交和其他操作，1表示提交，0表示其他,2表示驳回
var popupEvent = null;
var userInfo;
var updateDocTemplate ;
var deleteDocTemplate;
var insertDocTemplate;

var modelCol_Single = new Array();
var modelCol_Multi = new Array();

/********************************************************************
 * 功能名称	: refreshModels();
 * 描述: 刷新复合对象模型数据
 * 输入参数：eventObject
 * 输出参数：无
 */
function refreshModels(eventObject)
{
     var responseNode = eventObject.response;
     
     if(cordys.selectXMLNode(responseNode,".//*[local-name()='faultcode']"))	return;
     
     //操作数据后设置FormId供下条流程使用
     if(cordys.selectXMLNode(responseNode,".//*[local-name()='FORM_ID']"))
     {
    	 formid.setValue(cordys.getTextContent(cordys.selectXMLNode(responseNode ,".//*[local-name()='FORM_ID']")));
     }
     
    if(insertOperation == 1)
    {
    	insertOperation=0; 
    	getCompositeObject();
    	if(submitOperation == 0)
      	{
      		application.inform("保存成功");
      	}	
    }
}

/********************************************************************
 * 功能名称	: do_Form_Init();
 * 描述: 初始化表单
 * 输入参数：eventObject
 * 输出参数：无
 */
function do_Form_Init(eventObject)
{
	//用户在其任务完成时,只能查看表单内容,而不能修改表单内容
	var messageStatus = Workflow.getMessageStatus();
	if(messageStatus == "COMPLETED" || messageStatus == "ABORTED" || messageStatus == "TERMINATED")
	{
		tbbSave.disable();
		tbbSubmit.disable();
		tbbReturn.disable();
	}
	
    gpxhide.hide();
    if(stepcode.getValue() == "01")
    {
    	tbbReturn.hide();	
    }
    if(Workflow.getProcessInstanceId() != undefined && Workflow.getProcessInstanceId() != "")
    {
        gbxmonthly.disable();
    }
    else
    {
        tabapprovalhistory.hide();
    }
    
    if(Workflow.getProcessInstanceId()!=null)
	{
    	//隐藏待办页面缺省的按钮
    	if(Workflow!=null) Workflow.hideTaskToolbar();
	}

     //初始化每月事件
     for (var i = 1; i < 13; i++) 
    { 
           document.getElementById("iptMonth"+i).onchange = function() { 
           setSumValue(); 
     } 
    }
}

/********************************************************************
 * 功能名称	: initForm();
 * 描述: 表单加载完成后查询复合对象并绑定到相应的model
 * 输入参数：eventObject
 * 输出参数：无
 */
function initForm(eventObject)
{
    WebForm.getLayoutElement(gbxshopannual).style.height = "auto";
    WebForm.getLayoutElement(gbxshopannual).className += "autoextent";
    
    File_RepositoryTable.hideColumn(6);
    File_RepositoryTable.hideColumn(7);
    File_RepositoryTable.hideColumn(8);
    File_RepositoryTable.hideColumn(9);
    userInfo = getUserInfo();
    cordys.addDOMListener(File_RepositoryTable,"ondblclick",completeDownloadFile);
    
    //创建单条记录模型数组
    modelCol_Single["GetShopMonthlyPlanObjectModel"] = GetShopMonthlyPlanObjectModel;
    modelCol_Single["GetApprovalModel"] = GetApprovalModel;
    
    //创建多条记录模型数组
    modelCol_Multi["GetAttachmentModel"] = GetAttachmentModel;

    tabapprovalhistory.create();
    
    if(Workflow.getProcessInstanceId() == undefined || Workflow.getProcessInstanceId() == "")
    {
         gbxuserinfo.create();
         var dataTemp = application.event.data;
         if(undefined != dataTemp && undefined != dataTemp.subformid && null != dataTemp.subformid)
        {
        	 formid.setValue(dataTemp.subformid);
        	 getCompositeObject();
        	 setSumValue();
        }

    }
    else
    {
    	getCompositeObject();
        setSumValue();
        printProgress(Workflow.getTask());
    }
}

/********************************************************************
 * 功能名称	: getCompositeObject();
 * 描述: 查询复合对象并绑定到相应的model
 * 输入参数：eventObject
 * 输出参数：无
 */
function getCompositeObject()
{
	 var getCompleteXMLDocument = cordys.cloneXMLDocument(getCompleteXML.XMLDocument);
     cordys.setNodeText(getCompleteXMLDocument,".//*[local-name()='formId']",formid.getValue());
     CompositeAnnualDevPlanInfoModel.setMethodRequest(getCompleteXMLDocument);
     CompositeAnnualDevPlanInfoModel.reset();
     var compositeData=CompositeAnnualDevPlanInfoModel.getData();
     bindDataToModels(compositeData);
}

/********************************************************************
 * 功能名称	: saveForm();
 * 描述: 发送更新的复合对象请求，进行保存操作
 * 输入参数：无
 * 输出参数：无
 */
function saveForm()
{
	insertOperation = 1;
	saveCompositeObject(CompositeAnnualDevPlanInfoModel,modelCol_Single,modelCol_Multi);
}

/********************************************************************
 * 功能名称	: fillBusiValueOnModels();
 * 描述: 保存前，对业务相关model进行单独赋值
 * 输入参数：modelName,modelDataDoc,modelBObjName,tupleNode
 * 输出参数：无
 */
function fillBusiValueOnModels(modelName,modelDataDoc,modelBObjName,tupleNode)
{
    switch(modelName)
    {
        case "GetApprovalModel":
            fillValuesOnGetApprovalModel(modelDataDoc,modelBObjName,tupleNode);
        break;
    }
}

/********************************************************************
 * 功能名称	: fillValuesOnGetApprovalModel();
 * 描述: 保存前，对审批意见model进行单独赋值
 * 输入参数：modelDataDoc,modelBObjName,tupleNode
 * 输出参数：无
 */
function fillValuesOnGetApprovalModel(modelDataDoc,modelBObjName,tupleNode)
{
	//点击保存按钮时，添加ext1标志位，用于区分打开待办时审批意见是update还是insert
	if(submitOperation == 0)
	{
	var ext1Node = cordys.createElementNS(modelDataDoc,"http://schemas.cordys.com/tbpm/shop","EXT1");
	if(Workflow.getTaskInstanceId() == null)
	{
		cordys.setTextContent(ext1Node, "444");
	}
	else
	{
		cordys.setTextContent(ext1Node, Workflow.getTaskInstanceId());
	}
	
	cordys.appendXMLNode(ext1Node, cordys.selectXMLNode(tupleNode,".//*[local-name()='" + modelBObjName + "']"));
	}

	var instanceNode = cordys.createElementNS(modelDataDoc,"http://schemas.cordys.com/tbpm/shop","INSTANCE_ID");
	var formIdNode = cordys.createElementNS(modelDataDoc,"http://schemas.cordys.com/tbpm/shop","FORM_ID");
	var stepCdNode = cordys.createElementNS(modelDataDoc,"http://schemas.cordys.com/tbpm/shop","STEP_CODE");
	var stepNmNode = cordys.createElementNS(modelDataDoc,"http://schemas.cordys.com/tbpm/shop","STEP_NAME");
	var chargerCdNode = cordys.createElementNS(modelDataDoc,"http://schemas.cordys.com/tbpm/shop","CHARGER_CODE");
	
	cordys.setTextContent(instanceNode,Workflow.getProcessInstanceId());
	cordys.setTextContent(formIdNode, formid.getValue());
	cordys.setTextContent(stepCdNode, stepcode.getValue());
	if(Workflow.getTaskInstanceId() == null)
	{
		stepname.setValue("制定网点开发计划");
	}
	cordys.setTextContent(stepNmNode, stepname.getValue());
	cordys.setTextContent(chargerCdNode, chargercode.getValue());
	
	var insertParentNewNode = cordys.selectXMLNode(tupleNode,".//*[local-name()='new']");
	cordys.appendXMLNode(instanceNode, cordys.selectXMLNode(insertParentNewNode,".//*[local-name()='" + modelBObjName + "']"));
	cordys.appendXMLNode(formIdNode, cordys.selectXMLNode(insertParentNewNode,".//*[local-name()='" + modelBObjName + "']"));
	cordys.appendXMLNode(stepCdNode, cordys.selectXMLNode(insertParentNewNode,".//*[local-name()='" + modelBObjName + "']"));
	cordys.appendXMLNode(stepNmNode, cordys.selectXMLNode(insertParentNewNode,".//*[local-name()='" + modelBObjName + "']"));
	cordys.appendXMLNode(chargerCdNode, cordys.selectXMLNode(insertParentNewNode,".//*[local-name()='" + modelBObjName + "']"));
	
}

/********************************************************************
 * 功能名称	: bindDataToModels();
 * 描述: 将复合对象的响应结构拆分到子对象中，将数据显示到页面
 * 输入参数：responseNode，响应节点
 * 输出参数：无
 */
function bindDataToModels(responseNode)
{
	
	//提交或驳回任务时刷新可编辑的审批意见GetApprovalModel
    if(submitOperation == 1 || submitOperation == 2)
    {
    	GetApprovalModel.clear();
    	GetApprovalModel.refreshAllViews();
    	tabapprovalhistory.disable();		
    }
    
    if(cordys.selectXMLNode(responseNode,".//*[local-name()='SHOP_MONTHLY_PLAN']"))
    {
        var shopInfoDataNode = cordys.cloneXMLDocument(dataXML.XMLDocument);
        bindSingleTupleModel(GetShopMonthlyPlanObjectModel,responseNode,"SHOP_MONTHLY_PLAN",shopInfoDataNode);
        //formid.setValue(cordys.getNodeText(GetShopMonthlyPlanObjectModel.getData(),".//*[local-name()='FORM_ID']"));
    }
    
    if(cordys.selectXMLNode(responseNode,".//*[local-name()='ATTACHMENT']"))
    {
        dataDoc = dataXML.XMLDocument;
        bindMultiTupleModel(GetAttachmentModel,responseNode,"ATTACHMENT",dataDoc);
    }

    //处理人暂存后再次打开待办时将审批意见显示到可编辑区域
	 var approvalNodes = cordys.cloneXMLDocument(responseNode.documentElement);
     if(cordys.selectXMLNode(approvalNodes,".//*[local-name()='APPROVAL_HISTORY'][*[local-name()='EXT1']!='']"))
    {
    	 if(Workflow.getTaskInstanceId() == null)
		{
    		 GetApprovalModel.refreshAllViews();
		}
        var approvalNodeList = cordys.selectXMLNodes(approvalNodes,".//*[local-name()='APPROVAL_HISTORY'][*[local-name()='EXT1']!='']");
        for(var i=0; i < approvalNodeList.length; i++)
        {
			var approvalNode = cordys.selectXMLNode(approvalNodeList[i],  ".");
			if(cordys.getNodeText(approvalNode,".//*[local-name()='EXT1']") == Workflow.getTaskInstanceId())
			{
				var approvalDataNode = cordys.cloneXMLDocument(dataXML.XMLDocument);
				cordys.appendXMLNode(approvalNode,cordys.selectXMLNode(approvalDataNode,".//*[local-name()='old']"));
				GetApprovalModel.clear();
				GetApprovalModel.putData(approvalDataNode);
				GetApprovalModel.refreshAllViews();
			}
        }
    }

    if(cordys.selectXMLNode(responseNode,".//*[local-name()='APPROVAL_HISTORY']"))
    {
        dataDoc = dataXML.XMLDocument;
        bindMultiTupleModel(GetApprovalHistoryModel,responseNode,"APPROVAL_HISTORY",dataDoc);
    }
     
}


/********************************************************************
 * 功能名称	: do_tbbsave_Click();
 * 描述: 点击工具栏的保存按钮，触发此方法
 * 输入参数：eventObject
 * 输出参数：无
 */
function do_tbbsave_Click(eventObject)
{
    showConfirm(false,closeHandler);
}

/********************************************************************
 * 功能名称	: closeHandler();
 * 描述: 点击保存确认框的按钮时所触发的回调函数
 * 输入参数：confirmReturnValue，确认框的返回值：1--是；0--否
 * 输出参数：无
 */
function closeHandler(confirmReturnValue)
{
    if (confirmReturnValue == 1)
    {
    	//设置流程状态
    	resetStatus();
    	saveForm();
    	if(CompositeAnnualDevPlanInfoModel.soapFaultOccurred)
        {
            return;
        }
    }
    else if (confirmReturnValue == 0)
    {
    }
}

/********************************************************************
 * 功能名称	: submitTask();
 * 描述: 点击工具栏的提交按钮，触发此操作
 * 输入参数：eventObject
 * 输出参数：无
 */
function submitTask(eventObject)
{
	//审批意见是否填写判断
    if(!validateApporval())	return;
    
    showConfirm(false,submitHandler,"您确定提交任务到下一环节吗？");
    
}

/********************************************************************
 * 功能名称	: validateApporval();
 * 描述: 点击工具栏的提交按钮，判断审批意见是否填写
 * 输入参数：eventObject
 * 输出参数：无
 */
function validateApporval()
{
	if(stepcode.getValue() != "01" && Workflow.getProcessInstanceId()!= null)
	{
		if(remark.getValue() == null || remark.getValue() == "")
		{
			application.notify("请输入您的审批意见");
			gpxcommon.expand();
			remark.setFocus();
			return false;	
		}
		return true;
	}
	return true;
}

/********************************************************************
 * 功能名称	: submitHandler();
 * 描述: 点击提交确认框的按钮时所触发的回调函数
 * 输入参数：confirmReturnValue，确认框的返回值：1--是；0--否
 * 输出参数：无
 */
function submitHandler(confirmReturnValue)
{
		if (confirmReturnValue == 1)
		{
			submitOperation = 1;
			changeStatusForAttachments();
			
				//start process
			if(Workflow.getProcessInstanceId()==undefined || Workflow.getProcessInstanceId()=="")
			{
				//设置流程状态
				iptStatus.setValue("1");
				saveForm();
	            if(CompositeAnnualDevPlanInfoModel.soapFaultOccurred)
	            {
	            	submitOperation = 0;
	                return;
	            }
				var request = executeProcess.XMLDocument.cloneNode(true);
				cordys.setNodeText(request,".//*[local-name()='receiver']","Business Process Models/com/laiyifen/shop/planning/网点年度开发计划");
				cordys.setNodeText(request,".//*[local-name()='FormID']",formid.getValue());
				cordys.setNodeText(request,".//*[local-name()='DecisionAttribute']","10");
				cordys.setNodeText(request,".//*[local-name()='ExecutionType']","1");
		        cordys.setNodeText(request,".//*[local-name()='CompanyCode']",subcompanycode.getValue());
		        cordys.setNodeText(request,".//*[local-name()='CompanyName']",subcompanyname.getValue());
		        cordys.setNodeText(request,".//*[local-name()='CreateName']",username.getValue());
		        cordys.setNodeText(request,".//*[local-name()='CreateTime']",applicationdate.getValue());                                                
	
				ExecuteProcessModel.clear();
				ExecuteProcessModel.setMethodRequest(request);
				ExecuteProcessModel.reset();
	            do_tbbquit_Click();
			}
			else
			{ 
				if(stepcode.getValue() == "25")
				{
					iptStatus.setValue("2");
				}
				saveForm();
	            if(CompositeAnnualDevPlanInfoModel.soapFaultOccurred)
	            {
	            	submitOperation = 0;
	                return;
	            }
				decisionattribute.setValue("01");
				Workflow.completeTask();
			}
		}
		else if (confirmReturnValue == 0)
		{
		}
}

/********************************************************************
 * 功能名称	: fnAddFile();
 * 描述: 将附件内容从弹出页中带到主页面
 * 输入参数：fileObject,fileUrl和fileName
 * 输出参数：无
 */
function fnAddFile(fileObject,fileUrl,fileName)
{
    if(fileName != null && fileName !="")
    {
	    File_RepositoryTable.create();
	    var rowInx = File_RepositoryTable.getIndex();
	    filename[rowInx].setValue(fileName);
	    filetype[rowInx].setValue(cordys.getNodeText(fileObject,".//*[local-name()='FileType']"));
	    deptNm[rowInx].setValue(userInfo.deptName);
	    userNm[rowInx].setValue(userInfo.userName);
	    fileurl[rowInx].setValue(fileUrl);
	    fileformid[rowInx].setValue(formid.getValue());
	    if(Workflow.getProcessInstanceId() == undefined || Workflow.getProcessInstanceId() == "")
	    {
	    	fileinstanceid[rowInx].setValue("mou");
	    }
	    else
    	{
	    	fileinstanceid[rowInx].setValue(Workflow.getProcessInstanceId());
    	}
	    submitstatus[rowInx].setValue("0");	//status=0表示当前附件可以删除
	    
    }
}

/********************************************************************
 * 功能名称	: validateAttachment();
 * 描述: 判断此附件是否可以被删除
 * 输入参数：rowInx
 * 输出参数：boolean
 */
function validateAttachment(rowInx)
{
	if(submitstatus[rowInx].getValue()=="1")
	{
		application.notify("对不起，您没有权限删除第" + rowInx + "行附件");
		return false;
	}
	return true;
}

/********************************************************************
 * 功能名称	: do_navDelete2_BeforeDelete();
 * 描述: 删除附件记录
 * 输入参数：eventObject
 * 输出参数：无
 */
function do_navDelete2_BeforeDelete(eventObject)
{
	var rows=File_RepositoryTable.getCheckedRows();
	if(rows.length==0)
	{
		application.notify("请选择所需删除的附件，谢谢");
		return;	
	}
	showConfirm(false,removeHandler,"您确定删除所选附件吗？");
}

/********************************************************************
 * 功能名称	: removeHandler();
 * 描述: 点击附件删除按钮时所触发的回调函数
 * 输入参数：confirmReturnValue，确认框的返回值：1--是；0--否
 * 输出参数：无
 */
function removeHandler(confirmReturnValue)
{
	if(confirmReturnValue == 1)
	{
		var rows=File_RepositoryTable.getCheckedRows();
		for(var i = 0;i < rows.length;i++)
		{
			//在文件系统中删除文件
			var rowInx = rows[i].sectionRowIndex;
			//判断是否有权限删除此附件
			if(!validateAttachment(rowInx))	return;
			
			var guid = fileurl[rowInx].getValue();
			var request = DeleteFileModel.getMethodRequest();
			cordys.setNodeText(request,".//*[local-name()='guid']",guid);
			DeleteFileModel.setMethodRequest(request);
			DeleteFileModel.reset();
			if(DeleteFileModel.soapFaultOccurred) 
			{ 
				application.notify("您的操作未能成功执行，请您重新尝试或联系系统管理员，谢谢");
				return; 
			}
		}
		removeDataFromModel();
	}
}


/********************************************************************
 * 功能名称	: removeDataFromModel();
 * 描述: 在页面上去除删除数据
 * 输入参数：eventObject
 * 输出参数：无
 */
function removeDataFromModel()
{
	 var newNodesDoc = cordys.loadXMLDocument("<collection/>")
	    var modelData = GetAttachmentModel.getData();
	    var chekedRows = File_RepositoryTable.getCheckedRows();
	    for(var i=0;i<chekedRows.length;i++)
	    {
	        var rowBObjId = cordys.getNodeText(chekedRows[i].businessObject,".//*[local-name()='FILEURL']");
	        var selectedRowTuple= cordys.selectXMLNode(modelData,".//*[local-name()='tuple'][.//*[local-name()='FILEURL']='"+rowBObjId+"']");
	        selectedRowTuple.parentNode.removeChild(selectedRowTuple);
	    }
	    var newNodes = modelData.getElementsByTagName("new");
	    for(var i=0;i<newNodes.length;i++)
	    {
	    	var nde = newNodes[i].cloneNode(true);
            cordys.appendXMLNode(nde,newNodesDoc.documentElement);
	    }
	    GetAttachmentModel.refreshAllViews();
	    rebindNewNodes(newNodesDoc);
}

/********************************************************************
 * 功能名称	: rebindNewNodes();
 * 描述: 将未删除的new tuple数据重新绑定到model
 * 输入参数：newNodesDoc
 * 输出参数：无
 */
function rebindNewNodes(newNodesDoc)
{
   var newNodes = newNodesDoc.getElementsByTagName("new");
   for(var i=0;i<newNodes.length;i++)
   {
       File_RepositoryTable.create();
       var numRows  = File_RepositoryTable.getIndex();
       filename[numRows].setValue(cordys.getNodeText(newNodes[i],".//*[local-name()='FILENAME']"));
       filetype[numRows].setValue(cordys.getNodeText(newNodes[i],".//*[local-name()='FILETYPE']"));
       deptNm[numRows].setValue(cordys.getNodeText(newNodes[i],".//*[local-name()='DEPTMENT_NAME']"));
       userNm[numRows].setValue(cordys.getNodeText(newNodes[i],".//*[local-name()='OPERATOR_NAME']"));
       fileurl[numRows].setValue(cordys.getNodeText(newNodes[i],".//*[local-name()='FILEURL']"));
       fileformid[numRows].setValue(cordys.getNodeText(newNodes[i],".//*[local-name()='FORM_ID']"));
       fileinstanceid[numRows].setValue(cordys.getNodeText(newNodes[i],".//*[local-name()='INSTANCE_ID']"));
   }
   application.inform("附件删除成功");
}

/********************************************************************
 * 功能名称	: completeDownloadFile();
 * 描述: 点击table的某行，触发下载附件操作
 * 输入参数：无
 * 输出参数：无
 */
function completeDownloadFile()
{
    var rowInx = File_RepositoryTable.getIndex();
    var urlNode = fileurl[rowInx].getValue();
    var request = DownloadFileModel.getMethodRequest();
    cordys.setNodeText(request,".//*[local-name()='id']",urlNode);
    DownloadFileModel.setMethodRequest(request);
    DownloadFileModel.reset();
    var filePath = cordys.getNodeText(DownloadFileModel.getData(),".//*[local-name()='downloadFile']");
    if(filePath == "" || filePath == undefined)
    {
       application.notify("This file does not exist or has been backed up elsewhere, please contact the system administrator.");
       return;
    }
   window.open(filePath);
}

/********************************************************************
 * 功能名称	: changeStatusForAttachments();
 * 描述: 点击提交或驳回按钮时将当前人上传的附件状态置为1，即不允许删除
 * 输入参数：无
 * 输出参数：无
 */
function changeStatusForAttachments()
{
	var rows = File_RepositoryTable.getRows();
	for(var i=0; i<rows.length;i++)
	{
		if(submitstatus[i+1].getValue()=="0")
		{
			submitstatus[i+1].setValue("1");
			continue;
		}
	}
}

/********************************************************************
 * 功能名称	: do_tbbreturn_Click();
 * 描述: 点击工具栏的驳回按钮，触发此操作
 * 输入参数：eventObject
 * 输出参数：无
 */
function do_tbbreturn_Click(eventObject)
{
	//审批意见是否填写判断
    if(!validateApporval())	return;
    
    popupEvent = eventObject;
    showConfirm(false,returnHandler,"您确定执行驳回操作吗？");
}


/********************************************************************
 * 功能名称	: returnHandler();
 * 描述: 点击驳回确认框的按钮时所触发的回调函数
 * 输入参数：confirmReturnValue，确认框的返回值：1--是；0--否
 * 输出参数：无
 */
function returnHandler(confirmReturnValue)
{
    if (confirmReturnValue == 1)
    {
		application.showDialog(dialogRevert.XMLDocument.documentElement,null, null, GetRevertValue, false); 
		placePopup(popupEvent);
    }
    else if (confirmReturnValue == 0)
    {
    }
}

/********************************************************************
 * 功能名称	: GetRevertValue();
 * 描述: 驳回位置弹出页关闭时的回调函数
 * 输入参数：rtnValue，03--驳回到发起人；04--驳回到上一级
 * 输出参数：无
 */
function GetRevertValue(rtnValue)
{
    decisionattribute.setValue(rtnValue);
    
    //complete current task
    if(decisionattribute.getValue() != "" && decisionattribute.getValue() != null)
    {
    	//点击驳回按钮时，记录当前驳回人
		var curUserCd = getCurrentUserDN().split(",")[0].substring(3);
		revertuser.setValue(curUserCd);
		
        submitOperation = 2;
        changeStatusForAttachments();
        saveForm();

       if(CompositeAnnualDevPlanInfoModel.soapFaultOccurred)
        {
    	   submitOperation = 0;
           return;
        }
        Workflow.completeTask();
    }
    else
    {
        application.notify("请选择驳回位置");
    }
}


/********************************************************************
 * 功能名称	: setSumValue();
 * 描述: 计算每月计划总数
 * 输入参数：无
 * 输出参数：无
 */
function setSumValue()
{
      var sumValue = new Number("0") ;
      for(var i=1; i<13; i++)
     {
         if (""  != document.getElementById("iptMonth"+i).value)
         {
           sumValue= sumValue + parseInt(document.getElementById("iptMonth"+i).value);
         }
     }
     iptsum.setValue(sumValue);
}


/********************************************************************
 * 功能名称	: do_tbbquit_Click();
 * 描述: 点击工具栏的退出按钮，调用此方法
 * 输入参数：无
 * 输出参数：无
 */
function do_tbbquit_Click()
{
    if(Workflow.getProcessInstanceId()!=null)
   {
       //待办中使用下面方式进行关闭页面
       parent.parent.parent.application.container.close();
   }
   else
  {
  		//不在流程中时使用下面方式进行关闭页面
      application.container.close();
  }
}


/********************************************************************
 * 功能名称	: do_appresult_Change();
 * 描述: 审批意见中常用语变化时将常用语赋值到审批意见textarea中
 * 输入参数：eventObject
 * 输出参数：无
 */
function do_appresult_Change(eventObject)
{
    if(app_roval.getValue()=="")
    {
        return;
    }
    var oldValue = remark.getFormattedValue();
    if(oldValue.search("\n")!=-1)
    {
        oldValue = oldValue.substring(oldValue.search("\n")+1);
    }   
    remark.setValue(app_roval.getValue()+"\n"+oldValue);
}

/********************************************************************
 * 功能名称	: do_Form_BeforeClose();
 * 描述: 关闭页面前释放全局变量
 * 输入参数：eventObject
 * 输出参数：无
 */
function do_Form_BeforeClose(eventObject)
{
	if(submitOperation == 1 || submitOperation == 2)
	{
		CordysRoot.application.inform("操作已成功，请继续其他操作");
	}
	insertOperation = null;
	submitOperation = null;
	popupEvent = null;
	modelCol_Single =null;
	modelCol_Multi = null;
	updateDocTemplate = null;
	deleteDocTemplate = null;
	insertDocTemplate = null;
	userInfo = null;
}

/********************************************************************
 * 功能名称	: resetStatus();
 * 描述: 设置流程状态
 * 输入参数：无
 * 输出参数：无
 */
function resetStatus()
{
	if(Workflow.getProcessInstanceId() != undefined && Workflow.getProcessInstanceId() != "")
	{
		iptStatus.setValue("1");	
	}
	 else
	{
		iptStatus.setValue("0");
	}
}