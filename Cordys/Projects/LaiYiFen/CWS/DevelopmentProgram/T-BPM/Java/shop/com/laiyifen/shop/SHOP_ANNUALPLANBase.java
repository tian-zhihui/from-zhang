/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.shop;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.classinfo.RelationInfo_FK;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class SHOP_ANNUALPLANBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_FORM_ID = "FORM_ID";
    public final static String ATTR_YEAR = "YEAR";
    public final static String ATTR_AREA = "AREA";
    public final static String ATTR_USER_NAME = "USER_NAME";
    public final static String ATTR_USER_CODE = "USER_CODE";
    public final static String ATTR_USER_DN = "USER_DN";
    public final static String ATTR_DEPARTMENT_CODE = "DEPARTMENT_CODE";
    public final static String ATTR_DEPARTMENT_NAME = "DEPARTMENT_NAME";
    public final static String ATTR_SUBCOMPANY_CODE = "SUBCOMPANY_CODE";
    public final static String ATTR_SUBCOMPANY_NAME = "SUBCOMPANY_NAME";
    public final static String ATTR_CREATE_TIME = "CREATE_TIME";
    public final static String ATTR_EXT1 = "EXT1";
    public final static String ATTR_EXT2 = "EXT2";
    public final static String ATTR_STATUS = "STATUS";
    private final static String REL_SHOP_ANNUALPLAN_DETAILSObjects = "FK:SHOP_ANNUALPLAN[FORM_ID]:SHOP_ANNUALPLAN_DETAILS[FORM_ID]";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(SHOP_ANNUALPLAN.class);
            s_classInfo.setTableName("SHOP_ANNUALPLAN");
            s_classInfo.setUIDElements(new String[]{ATTR_FORM_ID});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_FORM_ID);
                ai.setJavaName(ATTR_FORM_ID);
                ai.setColumnName(ATTR_FORM_ID);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_FORM_ID);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_YEAR);
                ai.setJavaName(ATTR_YEAR);
                ai.setColumnName(ATTR_YEAR);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_YEAR);
                v.setMaxLength(4);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_AREA);
                ai.setJavaName(ATTR_AREA);
                ai.setColumnName(ATTR_AREA);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_AREA);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_USER_NAME);
                ai.setJavaName(ATTR_USER_NAME);
                ai.setColumnName(ATTR_USER_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_USER_NAME);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_USER_CODE);
                ai.setJavaName(ATTR_USER_CODE);
                ai.setColumnName(ATTR_USER_CODE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_USER_CODE);
                v.setMaxLength(8);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_USER_DN);
                ai.setJavaName(ATTR_USER_DN);
                ai.setColumnName(ATTR_USER_DN);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_USER_DN);
                v.setMaxLength(256);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DEPARTMENT_CODE);
                ai.setJavaName(ATTR_DEPARTMENT_CODE);
                ai.setColumnName(ATTR_DEPARTMENT_CODE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_DEPARTMENT_CODE);
                v.setMaxLength(8);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DEPARTMENT_NAME);
                ai.setJavaName(ATTR_DEPARTMENT_NAME);
                ai.setColumnName(ATTR_DEPARTMENT_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_DEPARTMENT_NAME);
                v.setMaxLength(25);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SUBCOMPANY_CODE);
                ai.setJavaName(ATTR_SUBCOMPANY_CODE);
                ai.setColumnName(ATTR_SUBCOMPANY_CODE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SUBCOMPANY_CODE);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SUBCOMPANY_NAME);
                ai.setJavaName(ATTR_SUBCOMPANY_NAME);
                ai.setColumnName(ATTR_SUBCOMPANY_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SUBCOMPANY_NAME);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CREATE_TIME);
                ai.setJavaName(ATTR_CREATE_TIME);
                ai.setColumnName(ATTR_CREATE_TIME);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_EXT1);
                ai.setJavaName(ATTR_EXT1);
                ai.setColumnName(ATTR_EXT1);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_EXT1);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_EXT2);
                ai.setJavaName(ATTR_EXT2);
                ai.setColumnName(ATTR_EXT2);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_EXT2);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_STATUS);
                ai.setJavaName(ATTR_STATUS);
                ai.setColumnName(ATTR_STATUS);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_STATUS);
                v.setMaxLength(1);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                // relation SHOP_ANNUALPLAN_DETAILSObjects (FK:SHOP_ANNUALPLAN[FORM_ID]:SHOP_ANNUALPLAN_DETAILS[FORM_ID])
                RelationInfo_FK ri = new RelationInfo_FK(REL_SHOP_ANNUALPLAN_DETAILSObjects);
                ri.setName("SHOP_ANNUALPLAN_DETAILSObjects");
                ri.setLocalAttributes(new String[]{ATTR_FORM_ID});
                ri.setLocalIsPK(true);
                ri.setRelatedClass(com.laiyifen.shop.SHOP_ANNUALPLAN_DETAILS.class);
                ri.setRelatedAttributes(new String[]{"FORM_ID"});//NOPMD
                ri.setRelatedIdentifier("FK:SHOP_ANNUALPLAN_DETAILS[FORM_ID]:SHOP_ANNUALPLAN[FORM_ID]");
                ri.setLoadMethod("loadSHOP_ANNUALPLAN_DETAILSObjects");
                s_classInfo.addRelationInfo(ri);
            }
        }
        return s_classInfo;
    }

    public SHOP_ANNUALPLANBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getFORM_ID()
    {
        return getStringProperty(ATTR_FORM_ID);
    }

    public void setFORM_ID(String value)
    {
        setProperty(ATTR_FORM_ID, value, 0);
    }

    public String getYEAR()
    {
        return getStringProperty(ATTR_YEAR);
    }

    public void setYEAR(String value)
    {
        setProperty(ATTR_YEAR, value, 0);
    }

    public String getAREA()
    {
        return getStringProperty(ATTR_AREA);
    }

    public void setAREA(String value)
    {
        setProperty(ATTR_AREA, value, 0);
    }

    public String getUSER_NAME()
    {
        return getStringProperty(ATTR_USER_NAME);
    }

    public void setUSER_NAME(String value)
    {
        setProperty(ATTR_USER_NAME, value, 0);
    }

    public String getUSER_CODE()
    {
        return getStringProperty(ATTR_USER_CODE);
    }

    public void setUSER_CODE(String value)
    {
        setProperty(ATTR_USER_CODE, value, 0);
    }

    public String getUSER_DN()
    {
        return getStringProperty(ATTR_USER_DN);
    }

    public void setUSER_DN(String value)
    {
        setProperty(ATTR_USER_DN, value, 0);
    }

    public String getDEPARTMENT_CODE()
    {
        return getStringProperty(ATTR_DEPARTMENT_CODE);
    }

    public void setDEPARTMENT_CODE(String value)
    {
        setProperty(ATTR_DEPARTMENT_CODE, value, 0);
    }

    public String getDEPARTMENT_NAME()
    {
        return getStringProperty(ATTR_DEPARTMENT_NAME);
    }

    public void setDEPARTMENT_NAME(String value)
    {
        setProperty(ATTR_DEPARTMENT_NAME, value, 0);
    }

    public String getSUBCOMPANY_CODE()
    {
        return getStringProperty(ATTR_SUBCOMPANY_CODE);
    }

    public void setSUBCOMPANY_CODE(String value)
    {
        setProperty(ATTR_SUBCOMPANY_CODE, value, 0);
    }

    public String getSUBCOMPANY_NAME()
    {
        return getStringProperty(ATTR_SUBCOMPANY_NAME);
    }

    public void setSUBCOMPANY_NAME(String value)
    {
        setProperty(ATTR_SUBCOMPANY_NAME, value, 0);
    }

    public java.util.Date getCREATE_TIME()
    {
        return getDateTimestampProperty(ATTR_CREATE_TIME);
    }

    public void setCREATE_TIME(java.util.Date value)
    {
        setProperty(ATTR_CREATE_TIME, value, 0);
    }

    public String getEXT1()
    {
        return getStringProperty(ATTR_EXT1);
    }

    public void setEXT1(String value)
    {
        setProperty(ATTR_EXT1, value, 0);
    }

    public String getEXT2()
    {
        return getStringProperty(ATTR_EXT2);
    }

    public void setEXT2(String value)
    {
        setProperty(ATTR_EXT2, value, 0);
    }

    public String getSTATUS()
    {
        return getStringProperty(ATTR_STATUS);
    }

    public void setSTATUS(String value)
    {
        setProperty(ATTR_STATUS, value, 0);
    }

    public BusObjectIterator<SHOP_ANNUALPLAN_DETAILS> getSHOP_ANNUALPLAN_DETAILSObjects()
    {
        return getMultiRelationObjects(REL_SHOP_ANNUALPLAN_DETAILSObjects);
    }
    public BusObjectIterator<SHOP_ANNUALPLAN_DETAILS> loadSHOP_ANNUALPLAN_DETAILSObjects()
    {
        String queryText = "select * from \"SHOP_ANNUALPLAN_DETAILS\" where \"FORM_ID\" = :FORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SHOP_ANNUALPLAN_DETAILS.FORM_ID", QueryObject.PARAM_STRING, getFORM_ID());//NOPMD
        query.setResultClass(SHOP_ANNUALPLAN_DETAILS.class);
        return query.getObjects();
    }


    public void addSHOP_ANNUALPLAN_DETAILSObject(SHOP_ANNUALPLAN_DETAILS a_SHOP_ANNUALPLAN_DETAILS)
    {
        a_SHOP_ANNUALPLAN_DETAILS.setFORM_ID(this.getFORM_ID());
    }

    public void removeSHOP_ANNUALPLAN_DETAILSObject(SHOP_ANNUALPLAN_DETAILS a_SHOP_ANNUALPLAN_DETAILS)
    {
        a_SHOP_ANNUALPLAN_DETAILS.setNull("FORM_ID");//NOPMD
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_ANNUALPLAN> getNextShopAnnualplanObjects(String FORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SHOP_ANNUALPLAN\" where (\"FORM_ID\" > :FORM_ID) order by \"FORM_ID\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SHOP_ANNUALPLAN.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SHOP_ANNUALPLAN.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_ANNUALPLAN> getPreviousShopAnnualplanObjects(String FORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SHOP_ANNUALPLAN\" where (\"FORM_ID\" < :FORM_ID) order by \"FORM_ID\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SHOP_ANNUALPLAN.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SHOP_ANNUALPLAN.class);
        query.setCursor(cursor);
        return query.getObjects();
    }


    public static com.laiyifen.shop.SHOP_ANNUALPLAN getShopAnnualplanObject(String FORM_ID)
    {
        String queryText = "select * from \"SHOP_ANNUALPLAN\" where \"FORM_ID\" = :FORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SHOP_ANNUALPLAN.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SHOP_ANNUALPLAN.class);
        return (SHOP_ANNUALPLAN)query.getObject();
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_ANNUALPLAN> getShopAnnualplanObjects(String fromFORM_ID, String toFORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SHOP_ANNUALPLAN\" where \"FORM_ID\" between :fromFORM_ID and :toFORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromFORM_ID", "SHOP_ANNUALPLAN.FORM_ID", QueryObject.PARAM_STRING, fromFORM_ID);
        query.addParameter("toFORM_ID", "SHOP_ANNUALPLAN.FORM_ID", QueryObject.PARAM_STRING, toFORM_ID);
        query.setResultClass(SHOP_ANNUALPLAN.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_ANNUALPLAN> getShopAnnualplanObjects(String fromFORM_ID, String toFORM_ID)
    {
        String queryText = "select * from \"SHOP_ANNUALPLAN\" where \"FORM_ID\" between :fromFORM_ID and :toFORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromFORM_ID", "SHOP_ANNUALPLAN.FORM_ID", QueryObject.PARAM_STRING, fromFORM_ID);
        query.addParameter("toFORM_ID", "SHOP_ANNUALPLAN.FORM_ID", QueryObject.PARAM_STRING, toFORM_ID);
        query.setResultClass(SHOP_ANNUALPLAN.class);
        return query.getObjects();
    }


}
