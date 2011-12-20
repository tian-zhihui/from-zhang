/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.bpc.core;

import com.cordys.cpc.bsf.busobject.BSF;
import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.eibus.xml.nom.Document;
import com.eibus.xml.nom.Node;
import com.eibus.xml.xpath.NodeSet;
import com.eibus.xml.xpath.ResultNode;
import com.eibus.xml.xpath.XPath;
import com.eibus.xml.xpath.XPathMetaInfo;
import com.laiyifen.bpc.util.BpcCommonUtil;
import com.laiyifen.bpc.util.DateFormatUtil;
import com.laiyifen.common.ConnectorManager;



public class BPC_BUDGET extends BPC_BUDGETBase
{
	
    public BPC_BUDGET()
    {
        this((BusObjectConfig)null);
    }

    public BPC_BUDGET(BusObjectConfig config)
    {
        super(config);
    }

    public static boolean UpdateBpcBudgetByXML(int NOMxml) throws Exception
    {
        return true;
    }

    
    public static boolean SycnBpcBudgetByMonth(String strP_CC, String strTIME, String strP_ACCT) throws Exception
    {
    	
        return true;
    }
    
    public static boolean SycnBpcBudgetByParams(String strP_CC, String strTIME, String strP_ACCT) throws Exception{
    	 // TODO implement body
    	
        return true;
    }
    
    public static boolean UpdateBpcBudgetAmountByFormID(String formID,String operateType,String tableName)
    {
    	String year = null;
    	String month = null;
    	String costcenter = null;
    	String subjectCode = null;
    	String projectid = null;
    	Double amount = 0.0;
    	if("BPC_FEE".equals(tableName)){
    		BPC_FEE bpcFee = BPC_FEE.getBpcFeeObjectByFormID(formID);    		
    		year = BpcCommonUtil.DateFormatToString(bpcFee.getPETITION_DATE(),"yyyy") ;
    		month = BpcCommonUtil.changeMonthToQuarter(BpcCommonUtil.DateFormatToString(bpcFee.getPETITION_DATE(),"MM"));
    		costcenter = bpcFee.getCOSTCENTER_CODE();
    		subjectCode = bpcFee.getBUSINESS_CODE();
    		amount = bpcFee.getTOTAL_AMOUNT();
    		projectid = bpcFee.getPROJECT_CODE();
    		//是否预算分摊
    		if("0".equals(bpcFee.getIS_BUDGET_SELFDEP())){
    			BusObjectIterator<BPC_FEEDEP> bpc_feedepObjects = BPC_FEEDEP.getBpcFeedepObjectsByFormID(formID);
    			if (bpc_feedepObjects != null) {
    	    		while(bpc_feedepObjects.hasMoreElements()){
    	    			BPC_FEEDEP bpc_feedep = bpc_feedepObjects.nextElement();
    	    			UpdateBpcBudgetAmount( operateType,  year,  month,  bpc_feedep.getDEP_CODE(),  subjectCode,projectid,   bpc_feedep.getSUM() ,tableName,formID);
    	    		}
    			}
    		}else{
    			UpdateBpcBudgetAmount( operateType,  year,  month,  costcenter,  subjectCode,projectid,  amount  , tableName,formID);
    		}
    		
    	}
    	if("BPC_LOAN".equals(tableName)){
    		BPC_LOAN bpcLoan = BPC_LOAN.getBpcLoanObjectByFormID(formID);    		
    		year = BpcCommonUtil.DateFormatToString(bpcLoan.getPETITION_DATE(),"yyyy") ;
    		month = BpcCommonUtil.changeMonthToQuarter(BpcCommonUtil.DateFormatToString(bpcLoan.getPETITION_DATE(),"MM"));
    		costcenter = bpcLoan.getCOSTCENTER_CODE();
    		subjectCode = bpcLoan.getBUSINESS_CODE();
    		amount = bpcLoan.getTOTAL_AMOUNT();

    		UpdateBpcBudgetAmount( operateType,  year,  month,  costcenter,  subjectCode,projectid,   amount  , tableName,formID);
    		
    	}
    	
    	if("BPC_TRAVEL".equals(tableName)){
    		BPC_TRAVEL bpcTravel = BPC_TRAVEL.getBpcTravelObjectByFormID(formID);    		
    		year = BpcCommonUtil.DateFormatToString(bpcTravel.getPETITION_DATE(),"yyyy") ;
    		month = BpcCommonUtil.changeMonthToQuarter(BpcCommonUtil.DateFormatToString(bpcTravel.getPETITION_DATE(),"MM"));
    		costcenter = bpcTravel.getCOSTCENTER_CODE();
    		subjectCode = bpcTravel.getBUSINESS_CODE();
    		amount = bpcTravel.getTOTAL_AMOUNT();
    		//是否预算分摊
    		if("0".equals(bpcTravel.getIS_BUDGET_SELFDEP())){
    			BusObjectIterator<BPC_FEEDEP> bpc_feedepObjects = BPC_FEEDEP.getBpcFeedepObjectsByFormID(formID);
    			if (bpc_feedepObjects != null) {
    	    		while(bpc_feedepObjects.hasMoreElements()){
    	    			BPC_FEEDEP bpc_feedep = bpc_feedepObjects.nextElement();
    	    			UpdateBpcBudgetAmount( operateType,  year,  month,  bpc_feedep.getDEP_CODE(),  subjectCode, projectid,  bpc_feedep.getSUM() , tableName,formID);
    	    		}
    			}
    		}else{
    			UpdateBpcBudgetAmount( operateType,  year,  month,  costcenter,  subjectCode, projectid, amount  , tableName,formID);
    		}
    	}
		return true;
    }
 
    public static void LogBpcBudget(String formID,String tableName,String subjectCode, String costcenter,double amount ,double BUDGET_USED,double BUDGET_FREESE,double BUDGET_SURPLUS,double BUDGET_RATIO ,String operateType)
    {
    	BPC_LOG_BUDGET.newBpcLogBudgetObject(formID, tableName,costcenter, subjectCode, amount, BUDGET_USED, BUDGET_FREESE, BUDGET_SURPLUS, BUDGET_RATIO, operateType, "", "", "");
	}
	public static boolean UpdateBpcBudgetAmount(String operateType, String year, String month, String costcenter, String subjectCode,String projectid, double amount,String tableName,String formID)
    {
        // TODO implement body
		BPC_BUDGET bpc_budget = getBpcBudgetInfoObject(year,month,costcenter,subjectCode,projectid);
		if(bpc_budget==null){
			return false;
		}
		Double budget_sum = bpc_budget.getBUDGET_SUM();
		Double budget_used = bpc_budget.getBUDGET_USED();
		Double budget_freese = bpc_budget.getBUDGET_FREESE();
		Double budget_surplus =bpc_budget.getBUDGET_SURPLUS();
		Double budget_ratio = bpc_budget.getBUDGET_RATIO();
		//初始化数据
		if(budget_sum == null || budget_sum == 0.0){
			budget_sum = bpc_budget.getBUDGET_STANDARD();
		}
		if(budget_used == null){
			budget_used =  0.0;
		}
		if(budget_freese == null){
			budget_freese = 0.0 ;
		}
		if(budget_surplus == null || budget_surplus == 0.0){
			budget_surplus = budget_sum;
		}
		//流程提交，锁定预算。冻结增加，剩余减少，已用不变
		if("1".equals(operateType)){
			budget_freese = budget_freese +amount;
			budget_surplus = budget_surplus - amount;
			budget_used = budget_used;
		//流程驳回,作废，解除锁定。冻结减少，剩余增加，已用不变
		}else if("2".equals(operateType)){
			budget_freese = budget_freese - amount;
			budget_surplus = budget_surplus + amount;
			budget_used = budget_used;
		//流程结束，解除锁定。冻结减少，剩余不变,已用增加
		}else if("3".equals(operateType)){
			budget_freese = budget_freese - amount;
			budget_surplus = budget_surplus;
			budget_used = budget_used  + amount;
		//流程作废（已结束）。冻结不变，剩余增加，已用减少	
		}else if("4".equals(operateType)){
			budget_freese = budget_freese ;
			budget_surplus = budget_surplus + amount;
			budget_used = budget_used  - amount;
		}
		bpc_budget.setBUDGET_SUM(budget_sum);
		bpc_budget.setBUDGET_FREESE(budget_freese);
		bpc_budget.setBUDGET_USED(budget_used);
		bpc_budget.setBUDGET_SURPLUS(budget_surplus);
		bpc_budget.setBUDGET_RATIO(budget_ratio);
		LogBpcBudget( formID, tableName, costcenter,subjectCode,  amount , budget_used, budget_freese, budget_surplus, budget_ratio , operateType);
        return true;
    }
    
    
    public static com.laiyifen.bpc.core.BPC_BUDGET getBpcBudgetInfoObject(String year, String month, String costcenter, String subjectcode ,String projectid)
    {
    	String queryText = "select * from BPC_BUDGET where YEAR = '"+year+"' AND MONTH= '"+month+"' AND COSTCENTER_CODE= '"+costcenter+"' AND SUBJECT_CODE = '"+subjectcode+"'";
    	if(projectid!=null && !"".equals(projectid)){
    		queryText += " AND EXT1='"+projectid+"'";
    	}else{
    		queryText += " AND EXT1='D_NONE'";
    	}
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(BPC_BUDGET.class);
        return (BPC_BUDGET)query.getObject();
    }
    
    public static String getBpcBudgetInfoByBusiness(String year, String month, String costcenter, String busnisscode,String projectid)
    {
//    	String queryText = "select sum(budget_sum) budget_sum,sum(budget_used) budget_used,sum(budget_freese) budget_freese,sum(budget_surplus) budget_surplus from bpc_budget where 1=1 ";
//    	if(!"".equals(year)){
//    		queryText += " and year = '" + year + "' ";
//    	}
//    	if(!"".equals(month)){ 
//    		queryText += " and month = '" + month + "' ";
//    	}
//    	if(!"".equals(costcenter)){
//    		queryText += " and costcenter_code = '" + costcenter + "' ";
//    	}
//    	if(!"".equals(busnisscode)){
//    		queryText += " and subject_code_sap in (select budget_subject_code_sap from bpc_budget_subject_business where business_code= '" + busnisscode + "')  ";
//    	}
//        QueryObject query = new QueryObject(queryText);
//        query.setResultClass(BPC_BUDGET.class);
//        BPC_BUDGET bpc_budget = (BPC_BUDGET)query.getObject();
    	BPC_BUDGET bpc_budget = getBpcBudgetInfoObject(year,month,costcenter,busnisscode, projectid);
        String tmp ="";
        tmp = bpc_budget.getBUDGET_SUM() + ";" + bpc_budget.getBUDGET_USED() + ";" + bpc_budget.getBUDGET_FREESE() + ";" + bpc_budget.getBUDGET_SURPLUS() +";";
       
        return tmp;
    }

    public static BusObjectIterator<com.laiyifen.bpc.core.BPC_BUDGET> getBpcBudgetInfoObjects(String year, String month, String costcenter, String objectcode)
    {
        // TODO implement body
        return null;
    }
}
