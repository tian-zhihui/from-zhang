/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.shop;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.laiyifen.shop.util.ShopUtil;


public class SHOP_MATERIAL_CONFIGURATION extends SHOP_MATERIAL_CONFIGURATIONBase
{
    public SHOP_MATERIAL_CONFIGURATION()
    {
        this((BusObjectConfig)null);
    }

    public SHOP_MATERIAL_CONFIGURATION(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_MATERIAL_CONFIGURATION> getShopMaterialConfigurationByCompany(String companyCode)
    {
    	String queryText = "select * from \"SHOP_MATERIAL_CONFIGURATION\" where \"SUBCOMPANY_CODE\" = :SUBCOMPANY_CODE";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SUBCOMPANY_CODE", "SHOP_MATERIAL_CONFIGURATION.SUBCOMPANY_CODE", QueryObject.PARAM_STRING, companyCode);
        query.setResultClass(SHOP_MATERIAL_CONFIGURATION.class);
        return query.getObjects();
    }
    
    public static BusObjectIterator<com.laiyifen.shop.SHOP_MATERIAL_CONFIGURATION> getShopMaterialConfigurations(String subCompanyCd, String subCompanyNm, com.cordys.cpc.bsf.query.Cursor cursor)
    {
    	if(subCompanyCd==null) subCompanyCd = "";
		if(subCompanyNm==null) subCompanyNm = "";
        String queryText = "select t.id,t.material_name,t.product_code,t.product_name,t.subcompany_code,t.subcompany_name " +
				"from SHOP_MATERIAL_CONFIGURATION t " +
				"where t.subcompany_code like '%" + subCompanyCd + "%' " +
				"and t.subcompany_name like '%" + subCompanyNm + "%' ";
		QueryObject query = new QueryObject(queryText);
		query.setResultClass(SHOP_MATERIAL_CONFIGURATION.class);
		query.setCursor(cursor);
		return query.getObjects();
    }
    
    /**
     * 提交辅料配送单配置表数据前对主键ID进行赋值GUID.
     * @param event	
     * @return
     */
    public void onBeforeInsert() {
    	if (this.getID()== null || this.getID().equals("")){
    		ShopUtil _formIDGenerator = new ShopUtil();
			String ID = _formIDGenerator.setFormID(null);
    		this.setID(ID);
		}
    }
}