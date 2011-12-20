/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.common.core;

import java.util.Vector;
import com.cordys.cpc.bsf.busobject.BusObjectArray;
import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.soap.SOAPRequestObject;
import com.eibus.xml.nom.Node;
import com.eibus.xml.xpath.NodeSet;
import com.eibus.xml.xpath.ResultNode;
import com.eibus.xml.xpath.XPath;
import com.eibus.xml.xpath.XPathMetaInfo;

public class OrgModelService extends OrgModelServiceBase
{
	public static final String UM_NAMESPACE = "http://schemas.cordys.com/1.0/ldap";
	
    public OrgModelService()
    {
        this((BusObjectConfig)null);
    }

    public OrgModelService(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.laiyifen.common.core.OrgModelService> getOrgModelServiceObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        // TODO implement body
        return null;
    }

    public static BusObjectIterator<com.laiyifen.common.core.OrgModelService> getOrgUserInfo(String dn,String filter)
    {
    	Vector<OrgModelService> vectorList = new Vector<OrgModelService>();
    	String[] paramNames = {"dn","scope","filter","sort","returnValues"};
    	Object[] paramValues = {dn,"2",filter,"ascending","true"};
    	                           
    	SOAPRequestObject sro = new SOAPRequestObject("o=system,cn=cordys,cn=defaultInst,o=laiyifen",
    			UM_NAMESPACE, "SearchLDAP", paramNames, paramValues);
    	sro.setUser("cn=root,cn=organizational users,o=laiyifen,cn=cordys,cn=defaultInst,o=laiyifen");
    	int response = sro.execute();                
    	try {
			if (response > 0) {
				XPathMetaInfo metaInfo = new XPathMetaInfo();
				metaInfo.addNamespaceBinding("", UM_NAMESPACE);
				XPath opath = XPath.getXPathInstance(".//tuple");
				NodeSet oNodeSet = opath.selectNodeSet(response, metaInfo);
				if (oNodeSet != null) {
					while (oNodeSet.hasNext()) {
						long iResultNode = oNodeSet.next();
						OrgModelService orgModel = new OrgModelService();
						int iNode = ResultNode.getElementNode(iResultNode);
						String userName=Node.getData(XPath.getFirstMatch(".//description/string",null,
								iNode));
						String enable=Node.getData(XPath.getFirstMatch(".//enable/string",null,
								iNode));
						String defaultContext=Node.getData(XPath.getFirstMatch(".//defaultcontext/string",null,
								iNode));
						String cn=Node.getData(XPath.getFirstMatch(".//cn/string",null,
								iNode));
						orgModel.setUserName(userName);
						orgModel.setEnable(enable);
						orgModel.setDeptCode(defaultContext);
						orgModel.setDeptName(cn);
						vectorList.add(orgModel);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			Node.delete(response);
			response = 0;
		}
    	return new BusObjectArray<OrgModelService>(vectorList);
    }

    public void onInsert()
    {
    }

    public void onUpdate()
    {
    }

    public void onDelete()
    {
    }

}
