/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.shop;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;


public class SHOP_MATERIAL_DETAIL extends SHOP_MATERIAL_DETAILBase
{
    public SHOP_MATERIAL_DETAIL()
    {
        this((BusObjectConfig)null);
    }

    public SHOP_MATERIAL_DETAIL(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_MATERIAL_DETAIL> getShopMaterialDetailByFormId(String formID)
    {
    	String queryText = "select * from \"SHOP_MATERIAL_DETAIL\" where \"FORM_ID\" = :FORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SHOP_MATERIAL_DETAIL.FORM_ID", QueryObject.PARAM_STRING, formID);
        query.setResultClass(SHOP_MATERIAL_DETAIL.class);
        return query.getObjects();
    }

}