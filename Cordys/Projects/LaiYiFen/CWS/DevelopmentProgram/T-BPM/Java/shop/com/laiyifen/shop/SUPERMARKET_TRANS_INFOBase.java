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


public abstract class SUPERMARKET_TRANS_INFOBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_FORM_ID = "FORM_ID";
    public final static String ATTR_USER_NAME = "USER_NAME";
    public final static String ATTR_USER_DN = "USER_DN";
    public final static String ATTR_USER_CODE = "USER_CODE";
    public final static String ATTR_DEPARTMENT_CODE = "DEPARTMENT_CODE";
    public final static String ATTR_DEPARTMENT_NAME = "DEPARTMENT_NAME";
    public final static String ATTR_APPLICATION_DATE = "APPLICATION_DATE";
    public final static String ATTR_SUPERMARKET_NAME = "SUPERMARKET_NAME";
    public final static String ATTR_POSITION = "POSITION";
    public final static String ATTR_FLOORS = "FLOORS";
    public final static String ATTR_AREA = "AREA";
    public final static String ATTR_CONTACT_PERSON = "CONTACT_PERSON";
    public final static String ATTR_CONTACT = "CONTACT";
    public final static String ATTR_LOCATION_SITUATION = "LOCATION_SITUATION";
    public final static String ATTR_REMARK = "REMARK";
    public final static String ATTR_STATUS = "STATUS";
    public final static String ATTR_EXT1 = "EXT1";
    public final static String ATTR_EXT2 = "EXT2";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(SUPERMARKET_TRANS_INFO.class);
            s_classInfo.setTableName("SUPERMARKET_TRANS_INFO");
            s_classInfo.setUIDElements(new String[]{ATTR_FORM_ID});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_FORM_ID);
                ai.setJavaName(ATTR_FORM_ID);
                ai.setColumnName(ATTR_FORM_ID);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_FORM_ID);
                v.setMaxLength(50);
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
                AttributeInfo ai = new AttributeInfo(ATTR_USER_DN);
                ai.setJavaName(ATTR_USER_DN);
                ai.setColumnName(ATTR_USER_DN);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_USER_DN);
                v.setMaxLength(255);
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
                v.setMaxLength(40);
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
                AttributeInfo ai = new AttributeInfo(ATTR_SUPERMARKET_NAME);
                ai.setJavaName(ATTR_SUPERMARKET_NAME);
                ai.setColumnName(ATTR_SUPERMARKET_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SUPERMARKET_NAME);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_POSITION);
                ai.setJavaName(ATTR_POSITION);
                ai.setColumnName(ATTR_POSITION);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_POSITION);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_FLOORS);
                ai.setJavaName(ATTR_FLOORS);
                ai.setColumnName(ATTR_FLOORS);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_FLOORS);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_AREA);
                ai.setJavaName(ATTR_AREA);
                ai.setColumnName(ATTR_AREA);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_AREA);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CONTACT_PERSON);
                ai.setJavaName(ATTR_CONTACT_PERSON);
                ai.setColumnName(ATTR_CONTACT_PERSON);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CONTACT_PERSON);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CONTACT);
                ai.setJavaName(ATTR_CONTACT);
                ai.setColumnName(ATTR_CONTACT);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CONTACT);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_LOCATION_SITUATION);
                ai.setJavaName(ATTR_LOCATION_SITUATION);
                ai.setColumnName(ATTR_LOCATION_SITUATION);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_LOCATION_SITUATION);
                v.setMaxLength(2000);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_REMARK);
                ai.setJavaName(ATTR_REMARK);
                ai.setColumnName(ATTR_REMARK);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_REMARK);
                v.setMaxLength(2000);
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

    public SUPERMARKET_TRANS_INFOBase(BusObjectConfig config)
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

    public String getUSER_NAME()
    {
        return getStringProperty(ATTR_USER_NAME);
    }

    public void setUSER_NAME(String value)
    {
        setProperty(ATTR_USER_NAME, value, 0);
    }

    public String getUSER_DN()
    {
        return getStringProperty(ATTR_USER_DN);
    }

    public void setUSER_DN(String value)
    {
        setProperty(ATTR_USER_DN, value, 0);
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

    public java.util.Date getAPPLICATION_DATE()
    {
        return getDateTimestampProperty(ATTR_APPLICATION_DATE);
    }

    public void setAPPLICATION_DATE(java.util.Date value)
    {
        setProperty(ATTR_APPLICATION_DATE, value, 0);
    }

    public String getSUPERMARKET_NAME()
    {
        return getStringProperty(ATTR_SUPERMARKET_NAME);
    }

    public void setSUPERMARKET_NAME(String value)
    {
        setProperty(ATTR_SUPERMARKET_NAME, value, 0);
    }

    public String getPOSITION()
    {
        return getStringProperty(ATTR_POSITION);
    }

    public void setPOSITION(String value)
    {
        setProperty(ATTR_POSITION, value, 0);
    }

    public String getFLOORS()
    {
        return getStringProperty(ATTR_FLOORS);
    }

    public void setFLOORS(String value)
    {
        setProperty(ATTR_FLOORS, value, 0);
    }

    public String getAREA()
    {
        return getStringProperty(ATTR_AREA);
    }

    public void setAREA(String value)
    {
        setProperty(ATTR_AREA, value, 0);
    }

    public String getCONTACT_PERSON()
    {
        return getStringProperty(ATTR_CONTACT_PERSON);
    }

    public void setCONTACT_PERSON(String value)
    {
        setProperty(ATTR_CONTACT_PERSON, value, 0);
    }

    public String getCONTACT()
    {
        return getStringProperty(ATTR_CONTACT);
    }

    public void setCONTACT(String value)
    {
        setProperty(ATTR_CONTACT, value, 0);
    }

    public String getLOCATION_SITUATION()
    {
        return getStringProperty(ATTR_LOCATION_SITUATION);
    }

    public void setLOCATION_SITUATION(String value)
    {
        setProperty(ATTR_LOCATION_SITUATION, value, 0);
    }

    public String getREMARK()
    {
        return getStringProperty(ATTR_REMARK);
    }

    public void setREMARK(String value)
    {
        setProperty(ATTR_REMARK, value, 0);
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


    public static BusObjectIterator<com.laiyifen.shop.SUPERMARKET_TRANS_INFO> getNextSupermarketTransInfoObjects(String FORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SUPERMARKET_TRANS_INFO\" where (\"FORM_ID\" > :FORM_ID) order by \"FORM_ID\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SUPERMARKET_TRANS_INFO.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SUPERMARKET_TRANS_INFO.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.laiyifen.shop.SUPERMARKET_TRANS_INFO> getPreviousSupermarketTransInfoObjects(String FORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SUPERMARKET_TRANS_INFO\" where (\"FORM_ID\" < :FORM_ID) order by \"FORM_ID\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SUPERMARKET_TRANS_INFO.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SUPERMARKET_TRANS_INFO.class);
        query.setCursor(cursor);
        return query.getObjects();
    }


    public static com.laiyifen.shop.SUPERMARKET_TRANS_INFO getSupermarketTransInfoObject(String FORM_ID)
    {
        String queryText = "select * from \"SUPERMARKET_TRANS_INFO\" where \"FORM_ID\" = :FORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SUPERMARKET_TRANS_INFO.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SUPERMARKET_TRANS_INFO.class);
        return (SUPERMARKET_TRANS_INFO)query.getObject();
    }

    public static BusObjectIterator<com.laiyifen.shop.SUPERMARKET_TRANS_INFO> getSupermarketTransInfoObjects(String fromFORM_ID, String toFORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SUPERMARKET_TRANS_INFO\" where \"FORM_ID\" between :fromFORM_ID and :toFORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromFORM_ID", "SUPERMARKET_TRANS_INFO.FORM_ID", QueryObject.PARAM_STRING, fromFORM_ID);
        query.addParameter("toFORM_ID", "SUPERMARKET_TRANS_INFO.FORM_ID", QueryObject.PARAM_STRING, toFORM_ID);
        query.setResultClass(SUPERMARKET_TRANS_INFO.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.laiyifen.shop.SUPERMARKET_TRANS_INFO> getSupermarketTransInfoObjects(String fromFORM_ID, String toFORM_ID)
    {
        String queryText = "select * from \"SUPERMARKET_TRANS_INFO\" where \"FORM_ID\" between :fromFORM_ID and :toFORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromFORM_ID", "SUPERMARKET_TRANS_INFO.FORM_ID", QueryObject.PARAM_STRING, fromFORM_ID);
        query.addParameter("toFORM_ID", "SUPERMARKET_TRANS_INFO.FORM_ID", QueryObject.PARAM_STRING, toFORM_ID);
        query.setResultClass(SUPERMARKET_TRANS_INFO.class);
        return query.getObjects();
    }

}
