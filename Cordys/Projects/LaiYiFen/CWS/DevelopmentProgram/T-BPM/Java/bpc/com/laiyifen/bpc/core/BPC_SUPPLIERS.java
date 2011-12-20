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
import com.eibus.xml.nom.XMLException;
import com.eibus.xml.xpath.NodeSet;
import com.eibus.xml.xpath.ResultNode;
import com.eibus.xml.xpath.XPath;
import com.eibus.xml.xpath.XPathMetaInfo;
import com.laiyifen.common.ConnectorManager;


public class BPC_SUPPLIERS extends BPC_SUPPLIERSBase
{
    public BPC_SUPPLIERS()
    {
        this((BusObjectConfig)null);
    }

    public BPC_SUPPLIERS(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.laiyifen.bpc.core.BPC_SUPPLIERS> getBpcSuppliersObjectsByName(String suppliersname)
    {
        // TODO implement body
  	 	String queryText = "select * from \"BPC_SUPPLIERS\" where SUPPLIERS_NAME like '%" + suppliersname + "%' ";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(BPC_SUPPLIERS.class);
        return query.getObjects();
    }
    public static void newnBpcBudgetSuppliersObject(String LIFNR,String NAME1,String BANKS,
    		String KOINH,String BKREF,String BANKA,String NAMEV,String TELE){
    	BPC_SUPPLIERS bpcSuppliers = new BPC_SUPPLIERS();
    	bpcSuppliers.setSUPPLIERS_CODE(LIFNR);
    	bpcSuppliers.setSUPPLIERS_NAME(NAME1);
    	bpcSuppliers.setBANKS(BANKS);
    	bpcSuppliers.setNAMES(KOINH);
    	bpcSuppliers.setBANK_ACCOUNT(BKREF);
    	bpcSuppliers.setBANK_NAME(BANKA);
    	bpcSuppliers.setCONTACT_NAME(NAMEV);
    	bpcSuppliers.setCONTACT_PHONE(TELE);
    }

    public static boolean sycnBpcSuppliersFromBPC() throws Exception, XMLException{
    	boolean ret = false;
    	String organization = BSF.getOrganization();
  		String workspaceID = "__Organization Staging__";
  		Document doc = new Document();
  		int params = doc.parseString("<T_LIFNR></T_LIFNR>");
  		int response = ConnectorManager._callSoapMethod(organization,
  				SAPSyncService.BPC_SAP_NAMESPACE, "ZIFFI_GET_LIFNR", null,null,params);
  		String s1 = Node.writeToString(response, false);
  		try {
   			if (response > 0) { 
   				XPathMetaInfo info = new XPathMetaInfo();
   				info.addNamespaceBinding("", SAPSyncService.BPC_SAP_NAMESPACE);
   				XPath opath = XPath.getXPathInstance(".//T_LIFNR/item");
   				NodeSet oNodeSet = opath.selectNodeSet(response, info);
   				while (oNodeSet.hasNext()) {
					long iResultNode = oNodeSet.next();
					int iNode = ResultNode.getElementNode(iResultNode);
					String LIFNR = Node.getData(Node.getElement(iNode, "LIFNR"));
					String NAME1 = Node.getData(Node.getElement(iNode, "NAME1"));
					String BANKS = Node.getData(Node.getElement(iNode, "BANKS"));
					String KOINH = Node.getData(Node.getElement(iNode, "KOINH"));
					String BKREF = Node.getData(Node.getElement(iNode, "BKREF"));
					String BANKA = Node.getData(Node.getElement(iNode, "BANKA"));
					String NAMEV = Node.getData(Node.getElement(iNode, "NAMEV"));
					String TELE = Node.getData(Node.getElement(iNode, "TELE"));
					
					if(LIFNR!=null)
					newnBpcBudgetSuppliersObject( LIFNR, NAME1, BANKS, KOINH, BKREF, BANKA, NAMEV, TELE);
   				}
   			}
   		} finally {
   			Node.delete(response);
   			response = 0;
   		}
		return true;
    }
}