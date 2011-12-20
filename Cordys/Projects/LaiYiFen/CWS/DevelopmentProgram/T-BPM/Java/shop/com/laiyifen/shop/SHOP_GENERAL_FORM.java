/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.shop;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.event.AccessMode;
import com.cordys.cpc.bsf.event.AttributeAccessEvent;
import com.cordys.cpc.bsf.event.AttributeInitializeEvent;
import com.laiyifen.common.core.User;


public class SHOP_GENERAL_FORM extends SHOP_GENERAL_FORMBase
{
	private User userObj = null;
    public SHOP_GENERAL_FORM()
    {
        this((BusObjectConfig)null);
    }

    public SHOP_GENERAL_FORM(BusObjectConfig config)
    {
        super(config);
    }

    public static com.laiyifen.shop.SHOP_GENERAL_FORM getShopGeneralFormByFilter(String shopId, String formId)
    {
    	String queryText = "select * from \"SHOP_GENERAL_FORM\" where \"SHOP_ID\" = :SHOP_ID";
    	queryText += " AND \"FORM_ID\" =:FORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SHOP_ID", "SHOP_GENERAL_FORM.SHOP_ID", QueryObject.PARAM_STRING, shopId);
        query.addParameter("FORM_ID", "SHOP_GENERAL_FORM.FORM_ID", QueryObject.PARAM_STRING, formId);
        query.setResultClass(SHOP_GENERAL_FORM.class);
        return (SHOP_GENERAL_FORM)query.getObject();
    }
    
    
    /*
     ** 初始化用户信息
     */
       public void onInitialize_CREATER(AttributeInitializeEvent context){
    	  context.setInitialValue(this.getCurrUserInfo().getUserCode());
       }
        public void onInitialize_CREATE_NAME(AttributeInitializeEvent context){
        	context.setInitialValue(this.getCurrUserInfo().getUserName());
        }
       public void onInitialize_DEPT_NAME(AttributeInitializeEvent context){
        	context.setInitialValue(this.getCurrUserInfo().getDeptName());
        }
        public void onInitialize_DEPT_ID(AttributeInitializeEvent context){
        	context.setInitialValue(this.getCurrUserInfo().getDeptCode());
        }
      //创建时间
        public void onInitialize_CREATE_TIME(AttributeInitializeEvent context){
        	SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");      
        	String date = sDateFormat.format(new Date());
        	context.setInitialValue(date);
        }
        
        /*
         * 控制用户名只可读.
         */
        public void onDisplay_CREATE_NAME(AttributeAccessEvent context){
        	context.setAccess(AccessMode.READONLY);
        }
        /*
         * 控制用户编码只可读.
         */
        public void onDisplay_CREATER(AttributeAccessEvent context){
        	context.setAccess(AccessMode.READONLY);
        }
        /*
         * 控制部门名称只可读.
         */
        public void onDisplay_DEPT_NAME(AttributeAccessEvent context){
        	context.setAccess(AccessMode.READONLY);
        }
        /*
         * 控制填写时间只可读.
         */
        public void onDisplay_CREATE_TIME(AttributeAccessEvent context){
        	context.setAccess(AccessMode.READONLY);
        }
        
        public User getCurrUserInfo(){
        	if( this.userObj==null){        		
        	   this.userObj= com.laiyifen.common.core.User.getUserInfo();   
        	}
        	return this.userObj;
        }

}
