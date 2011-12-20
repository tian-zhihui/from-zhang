/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.shop;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class SHOP_FITMENT_FORENOTICEBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_SHOP_ID = "SHOP_ID";
    public final static String ATTR_FORM_ID = "FORM_ID";
    public final static String ATTR_USER_NAME = "USER_NAME";
    public final static String ATTR_USER_CODE = "USER_CODE";
    public final static String ATTR_DEPARTMENT_CODE = "DEPARTMENT_CODE";
    public final static String ATTR_DEPARTMENT_NAME = "DEPARTMENT_NAME";
    public final static String ATTR_SUBCOMPANY_CODE = "SUBCOMPANY_CODE";
    public final static String ATTR_SUBCOMPANY_NAME = "SUBCOMPANY_NAME";
    public final static String ATTR_APPLICATION_DATE = "APPLICATION_DATE";
    public final static String ATTR_CONTRACT_DATE = "CONTRACT_DATE";
    public final static String ATTR_ACTUAL_DATE = "ACTUAL_DATE";
    public final static String ATTR_ACTUAL_IN_TIME = "ACTUAL_IN_TIME";
    public final static String ATTR_ESTIMATE_TIME = "ESTIMATE_TIME";
    public final static String ATTR_DIRECTOR = "DIRECTOR";
    public final static String ATTR_DIRECTOR_CONTACT = "DIRECTOR_CONTACT";
    public final static String ATTR_CONSTRUCTION_TEAM = "CONSTRUCTION_TEAM";
    public final static String ATTR_CONSTRUCTION_CONTACT = "CONSTRUCTION_CONTACT";
    public final static String ATTR_STATUS = "STATUS";
    public final static String ATTR_EXT1 = "EXT1";
    public final static String ATTR_EXT2 = "EXT2";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(SHOP_FITMENT_FORENOTICE.class);
            s_classInfo.setTableName("SHOP_FITMENT_FORENOTICE");
            s_classInfo.setUIDElements(new String[]{ATTR_FORM_ID});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SHOP_ID);
                ai.setJavaName(ATTR_SHOP_ID);
                ai.setColumnName(ATTR_SHOP_ID);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SHOP_ID);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
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
                AttributeInfo ai = new AttributeInfo(ATTR_USER_NAME);
                ai.setJavaName(ATTR_USER_NAME);
                ai.setColumnName(ATTR_USER_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_USER_NAME);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_USER_CODE);
                ai.setJavaName(ATTR_USER_CODE);
                ai.setColumnName(ATTR_USER_CODE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_USER_CODE);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DEPARTMENT_CODE);
                ai.setJavaName(ATTR_DEPARTMENT_CODE);
                ai.setColumnName(ATTR_DEPARTMENT_CODE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_DEPARTMENT_CODE);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DEPARTMENT_NAME);
                ai.setJavaName(ATTR_DEPARTMENT_NAME);
                ai.setColumnName(ATTR_DEPARTMENT_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_DEPARTMENT_NAME);
                v.setMaxLength(40);
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
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_APPLICATION_DATE);
                ai.setJavaName(ATTR_APPLICATION_DATE);
                ai.setColumnName(ATTR_APPLICATION_DATE);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CONTRACT_DATE);
                ai.setJavaName(ATTR_CONTRACT_DATE);
                ai.setColumnName(ATTR_CONTRACT_DATE);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ACTUAL_DATE);
                ai.setJavaName(ATTR_ACTUAL_DATE);
                ai.setColumnName(ATTR_ACTUAL_DATE);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ACTUAL_IN_TIME);
                ai.setJavaName(ATTR_ACTUAL_IN_TIME);
                ai.setColumnName(ATTR_ACTUAL_IN_TIME);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ESTIMATE_TIME);
                ai.setJavaName(ATTR_ESTIMATE_TIME);
                ai.setColumnName(ATTR_ESTIMATE_TIME);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DIRECTOR);
                ai.setJavaName(ATTR_DIRECTOR);
                ai.setColumnName(ATTR_DIRECTOR);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_DIRECTOR);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DIRECTOR_CONTACT);
                ai.setJavaName(ATTR_DIRECTOR_CONTACT);
                ai.setColumnName(ATTR_DIRECTOR_CONTACT);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_DIRECTOR_CONTACT);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CONSTRUCTION_TEAM);
                ai.setJavaName(ATTR_CONSTRUCTION_TEAM);
                ai.setColumnName(ATTR_CONSTRUCTION_TEAM);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CONSTRUCTION_TEAM);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CONSTRUCTION_CONTACT);
                ai.setJavaName(ATTR_CONSTRUCTION_CONTACT);
                ai.setColumnName(ATTR_CONSTRUCTION_CONTACT);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CONSTRUCTION_CONTACT);
                v.setMaxLength(30);
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
        }
        return s_classInfo;
    }

    public SHOP_FITMENT_FORENOTICEBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getSHOP_ID()
    {
        return getStringProperty(ATTR_SHOP_ID);
    }

    public void setSHOP_ID(String value)
    {
        setProperty(ATTR_SHOP_ID, value, 0);
    }

    public String getFORM_ID()
    {
        return getStringProperty(ATTR_FORM_ID);
    }

    public void setFORM_ID(String value)
    {
        setProperty(ATTR_FORM_ID, value, 0);
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

    public java.util.Date getAPPLICATION_DATE()
    {
        return getDateTimestampProperty(ATTR_APPLICATION_DATE);
    }

    public void setAPPLICATION_DATE(java.util.Date value)
    {
        setProperty(ATTR_APPLICATION_DATE, value, 0);
    }

    public java.util.Date getCONTRACT_DATE()
    {
        return getDateTimestampProperty(ATTR_CONTRACT_DATE);
    }

    public void setCONTRACT_DATE(java.util.Date value)
    {
        setProperty(ATTR_CONTRACT_DATE, value, 0);
    }

    public java.util.Date getACTUAL_DATE()
    {
        return getDateTimestampProperty(ATTR_ACTUAL_DATE);
    }

    public void setACTUAL_DATE(java.util.Date value)
    {
        setProperty(ATTR_ACTUAL_DATE, value, 0);
    }

    public java.util.Date getACTUAL_IN_TIME()
    {
        return getDateTimestampProperty(ATTR_ACTUAL_IN_TIME);
    }

    public void setACTUAL_IN_TIME(java.util.Date value)
    {
        setProperty(ATTR_ACTUAL_IN_TIME, value, 0);
    }

    public java.util.Date getESTIMATE_TIME()
    {
        return getDateTimestampProperty(ATTR_ESTIMATE_TIME);
    }

    public void setESTIMATE_TIME(java.util.Date value)
    {
        setProperty(ATTR_ESTIMATE_TIME, value, 0);
    }

    public String getDIRECTOR()
    {
        return getStringProperty(ATTR_DIRECTOR);
    }

    public void setDIRECTOR(String value)
    {
        setProperty(ATTR_DIRECTOR, value, 0);
    }

    public String getDIRECTOR_CONTACT()
    {
        return getStringProperty(ATTR_DIRECTOR_CONTACT);
    }

    public void setDIRECTOR_CONTACT(String value)
    {
        setProperty(ATTR_DIRECTOR_CONTACT, value, 0);
    }

    public String getCONSTRUCTION_TEAM()
    {
        return getStringProperty(ATTR_CONSTRUCTION_TEAM);
    }

    public void setCONSTRUCTION_TEAM(String value)
    {
        setProperty(ATTR_CONSTRUCTION_TEAM, value, 0);
    }

    public String getCONSTRUCTION_CONTACT()
    {
        return getStringProperty(ATTR_CONSTRUCTION_CONTACT);
    }

    public void setCONSTRUCTION_CONTACT(String value)
    {
        setProperty(ATTR_CONSTRUCTION_CONTACT, value, 0);
    }

    public String getSTATUS()
    {
        return getStringProperty(ATTR_STATUS);
    }

    public void setSTATUS(String value)
    {
        setProperty(ATTR_STATUS, value, 0);
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

    public static BusObjectIterator<com.laiyifen.shop.SHOP_FITMENT_FORENOTICE> getNextShopFitmentForenoticeObjects(String FORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SHOP_FITMENT_FORENOTICE\" where (\"FORM_ID\" > :FORM_ID) order by \"FORM_ID\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SHOP_FITMENT_FORENOTICE.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SHOP_FITMENT_FORENOTICE.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_FITMENT_FORENOTICE> getPreviousShopFitmentForenoticeObjects(String FORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SHOP_FITMENT_FORENOTICE\" where (\"FORM_ID\" < :FORM_ID) order by \"FORM_ID\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SHOP_FITMENT_FORENOTICE.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SHOP_FITMENT_FORENOTICE.class);
        query.setCursor(cursor);
        return query.getObjects();
    }


    public static com.laiyifen.shop.SHOP_FITMENT_FORENOTICE getShopFitmentForenoticeObject(String FORM_ID)
    {
        String queryText = "select * from \"SHOP_FITMENT_FORENOTICE\" where \"FORM_ID\" = :FORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SHOP_FITMENT_FORENOTICE.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SHOP_FITMENT_FORENOTICE.class);
        return (SHOP_FITMENT_FORENOTICE)query.getObject();
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_FITMENT_FORENOTICE> getShopFitmentForenoticeObjects(String fromFORM_ID, String toFORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SHOP_FITMENT_FORENOTICE\" where \"FORM_ID\" between :fromFORM_ID and :toFORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromFORM_ID", "SHOP_FITMENT_FORENOTICE.FORM_ID", QueryObject.PARAM_STRING, fromFORM_ID);
        query.addParameter("toFORM_ID", "SHOP_FITMENT_FORENOTICE.FORM_ID", QueryObject.PARAM_STRING, toFORM_ID);
        query.setResultClass(SHOP_FITMENT_FORENOTICE.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_FITMENT_FORENOTICE> getShopFitmentForenoticeObjects(String fromFORM_ID, String toFORM_ID)
    {
        String queryText = "select * from \"SHOP_FITMENT_FORENOTICE\" where \"FORM_ID\" between :fromFORM_ID and :toFORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromFORM_ID", "SHOP_FITMENT_FORENOTICE.FORM_ID", QueryObject.PARAM_STRING, fromFORM_ID);
        query.addParameter("toFORM_ID", "SHOP_FITMENT_FORENOTICE.FORM_ID", QueryObject.PARAM_STRING, toFORM_ID);
        query.setResultClass(SHOP_FITMENT_FORENOTICE.class);
        return query.getObjects();
    }


}
