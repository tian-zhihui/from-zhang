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


public abstract class SHOP_MASTER_OPERATIONBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_SHOP_ID = "SHOP_ID";
    public final static String ATTR_FORM_ID = "FORM_ID";
    public final static String ATTR_USER_NAME = "USER_NAME";
    public final static String ATTR_USER_CODE = "USER_CODE";
    public final static String ATTR_DEPARTMENT_CODE = "DEPARTMENT_CODE";
    public final static String ATTR_DEPARTMENT_NAME = "DEPARTMENT_NAME";
    public final static String ATTR_COMPANY_NAME = "COMPANY_NAME";
    public final static String ATTR_COMPANY_CODE = "COMPANY_CODE";
    public final static String ATTR_APPLICATION_DATE = "APPLICATION_DATE";
    public final static String ATTR_SHOP_STATUS = "SHOP_STATUS";
    public final static String ATTR_OPENING_HOURS = "OPENING_HOURS";
    public final static String ATTR_CLOSE_HOURS = "CLOSE_HOURS";
    public final static String ATTR_ISCENTER_SHOP = "ISCENTER_SHOP";
    public final static String ATTR_PREMIUM_REGION = "PREMIUM_REGION";
    public final static String ATTR_PREMIUM_REGIONANAME = "PREMIUM_REGIONANAME";
    public final static String ATTR_REGION_PERSONG_NAME = "REGION_PERSONG_NAME";
    public final static String ATTR_REGION_PERSONG_CODE = "REGION_PERSONG_CODE";
    public final static String ATTR_AREA_PERSONG_NAME = "AREA_PERSONG_NAME";
    public final static String ATTR_AREA_PERSONG_CODE = "AREA_PERSONG_CODE";
    public final static String ATTR_TELEPHONE = "TELEPHONE";
    public final static String ATTR_STATUS = "STATUS";
    public final static String ATTR_EXT1 = "EXT1";
    public final static String ATTR_EXT2 = "EXT2";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(SHOP_MASTER_OPERATION.class);
            s_classInfo.setTableName("SHOP_MASTER_OPERATION");
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
                AttributeInfo ai = new AttributeInfo(ATTR_COMPANY_NAME);
                ai.setJavaName(ATTR_COMPANY_NAME);
                ai.setColumnName(ATTR_COMPANY_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_COMPANY_NAME);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_COMPANY_CODE);
                ai.setJavaName(ATTR_COMPANY_CODE);
                ai.setColumnName(ATTR_COMPANY_CODE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_COMPANY_CODE);
                v.setMaxLength(4);
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
                AttributeInfo ai = new AttributeInfo(ATTR_SHOP_STATUS);
                ai.setJavaName(ATTR_SHOP_STATUS);
                ai.setColumnName(ATTR_SHOP_STATUS);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SHOP_STATUS);
                v.setMaxLength(2);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_OPENING_HOURS);
                ai.setJavaName(ATTR_OPENING_HOURS);
                ai.setColumnName(ATTR_OPENING_HOURS);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_OPENING_HOURS);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CLOSE_HOURS);
                ai.setJavaName(ATTR_CLOSE_HOURS);
                ai.setColumnName(ATTR_CLOSE_HOURS);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CLOSE_HOURS);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ISCENTER_SHOP);
                ai.setJavaName(ATTR_ISCENTER_SHOP);
                ai.setColumnName(ATTR_ISCENTER_SHOP);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ISCENTER_SHOP);
                v.setMaxLength(1);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_PREMIUM_REGION);
                ai.setJavaName(ATTR_PREMIUM_REGION);
                ai.setColumnName(ATTR_PREMIUM_REGION);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_PREMIUM_REGION);
                v.setMaxLength(4);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_PREMIUM_REGIONANAME);
                ai.setJavaName(ATTR_PREMIUM_REGIONANAME);
                ai.setColumnName(ATTR_PREMIUM_REGIONANAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_PREMIUM_REGIONANAME);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_REGION_PERSONG_NAME);
                ai.setJavaName(ATTR_REGION_PERSONG_NAME);
                ai.setColumnName(ATTR_REGION_PERSONG_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_REGION_PERSONG_NAME);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_REGION_PERSONG_CODE);
                ai.setJavaName(ATTR_REGION_PERSONG_CODE);
                ai.setColumnName(ATTR_REGION_PERSONG_CODE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_REGION_PERSONG_CODE);
                v.setMaxLength(8);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_AREA_PERSONG_NAME);
                ai.setJavaName(ATTR_AREA_PERSONG_NAME);
                ai.setColumnName(ATTR_AREA_PERSONG_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_AREA_PERSONG_NAME);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_AREA_PERSONG_CODE);
                ai.setJavaName(ATTR_AREA_PERSONG_CODE);
                ai.setColumnName(ATTR_AREA_PERSONG_CODE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_AREA_PERSONG_CODE);
                v.setMaxLength(8);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TELEPHONE);
                ai.setJavaName(ATTR_TELEPHONE);
                ai.setColumnName(ATTR_TELEPHONE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TELEPHONE);
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
                v.setMaxLength(5);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_EXT2);
                ai.setJavaName(ATTR_EXT2);
                ai.setColumnName(ATTR_EXT2);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_EXT2);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public SHOP_MASTER_OPERATIONBase(BusObjectConfig config)
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

    public String getCOMPANY_NAME()
    {
        return getStringProperty(ATTR_COMPANY_NAME);
    }

    public void setCOMPANY_NAME(String value)
    {
        setProperty(ATTR_COMPANY_NAME, value, 0);
    }

    public String getCOMPANY_CODE()
    {
        return getStringProperty(ATTR_COMPANY_CODE);
    }

    public void setCOMPANY_CODE(String value)
    {
        setProperty(ATTR_COMPANY_CODE, value, 0);
    }

    public java.util.Date getAPPLICATION_DATE()
    {
        return getDateTimestampProperty(ATTR_APPLICATION_DATE);
    }

    public void setAPPLICATION_DATE(java.util.Date value)
    {
        setProperty(ATTR_APPLICATION_DATE, value, 0);
    }

    public String getSHOP_STATUS()
    {
        return getStringProperty(ATTR_SHOP_STATUS);
    }

    public void setSHOP_STATUS(String value)
    {
        setProperty(ATTR_SHOP_STATUS, value, 0);
    }

    public String getOPENING_HOURS()
    {
        return getStringProperty(ATTR_OPENING_HOURS);
    }

    public void setOPENING_HOURS(String value)
    {
        setProperty(ATTR_OPENING_HOURS, value, 0);
    }

    public String getCLOSE_HOURS()
    {
        return getStringProperty(ATTR_CLOSE_HOURS);
    }

    public void setCLOSE_HOURS(String value)
    {
        setProperty(ATTR_CLOSE_HOURS, value, 0);
    }

    public String getISCENTER_SHOP()
    {
        return getStringProperty(ATTR_ISCENTER_SHOP);
    }

    public void setISCENTER_SHOP(String value)
    {
        setProperty(ATTR_ISCENTER_SHOP, value, 0);
    }

    public String getPREMIUM_REGION()
    {
        return getStringProperty(ATTR_PREMIUM_REGION);
    }

    public void setPREMIUM_REGION(String value)
    {
        setProperty(ATTR_PREMIUM_REGION, value, 0);
    }

    public String getPREMIUM_REGIONANAME()
    {
        return getStringProperty(ATTR_PREMIUM_REGIONANAME);
    }

    public void setPREMIUM_REGIONANAME(String value)
    {
        setProperty(ATTR_PREMIUM_REGIONANAME, value, 0);
    }

    public String getREGION_PERSONG_NAME()
    {
        return getStringProperty(ATTR_REGION_PERSONG_NAME);
    }

    public void setREGION_PERSONG_NAME(String value)
    {
        setProperty(ATTR_REGION_PERSONG_NAME, value, 0);
    }

    public String getREGION_PERSONG_CODE()
    {
        return getStringProperty(ATTR_REGION_PERSONG_CODE);
    }

    public void setREGION_PERSONG_CODE(String value)
    {
        setProperty(ATTR_REGION_PERSONG_CODE, value, 0);
    }

    public String getAREA_PERSONG_NAME()
    {
        return getStringProperty(ATTR_AREA_PERSONG_NAME);
    }

    public void setAREA_PERSONG_NAME(String value)
    {
        setProperty(ATTR_AREA_PERSONG_NAME, value, 0);
    }

    public String getAREA_PERSONG_CODE()
    {
        return getStringProperty(ATTR_AREA_PERSONG_CODE);
    }

    public void setAREA_PERSONG_CODE(String value)
    {
        setProperty(ATTR_AREA_PERSONG_CODE, value, 0);
    }

    public String getTELEPHONE()
    {
        return getStringProperty(ATTR_TELEPHONE);
    }

    public void setTELEPHONE(String value)
    {
        setProperty(ATTR_TELEPHONE, value, 0);
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

    public static BusObjectIterator<com.laiyifen.shop.SHOP_MASTER_OPERATION> getNextShopMasterOperationObjects(String FORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SHOP_MASTER_OPERATION\" where (\"FORM_ID\" > :FORM_ID) order by \"FORM_ID\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SHOP_MASTER_OPERATION.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SHOP_MASTER_OPERATION.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_MASTER_OPERATION> getPreviousShopMasterOperationObjects(String FORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SHOP_MASTER_OPERATION\" where (\"FORM_ID\" < :FORM_ID) order by \"FORM_ID\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SHOP_MASTER_OPERATION.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SHOP_MASTER_OPERATION.class);
        query.setCursor(cursor);
        return query.getObjects();
    }


    public static com.laiyifen.shop.SHOP_MASTER_OPERATION getShopMasterOperationObject(String FORM_ID)
    {
        String queryText = "select * from \"SHOP_MASTER_OPERATION\" where \"FORM_ID\" = :FORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("FORM_ID", "SHOP_MASTER_OPERATION.FORM_ID", QueryObject.PARAM_STRING, FORM_ID);//NOPMD
        query.setResultClass(SHOP_MASTER_OPERATION.class);
        return (SHOP_MASTER_OPERATION)query.getObject();
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_MASTER_OPERATION> getShopMasterOperationObjects(String fromFORM_ID, String toFORM_ID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SHOP_MASTER_OPERATION\" where \"FORM_ID\" between :fromFORM_ID and :toFORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromFORM_ID", "SHOP_MASTER_OPERATION.FORM_ID", QueryObject.PARAM_STRING, fromFORM_ID);
        query.addParameter("toFORM_ID", "SHOP_MASTER_OPERATION.FORM_ID", QueryObject.PARAM_STRING, toFORM_ID);
        query.setResultClass(SHOP_MASTER_OPERATION.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.laiyifen.shop.SHOP_MASTER_OPERATION> getShopMasterOperationObjects(String fromFORM_ID, String toFORM_ID)
    {
        String queryText = "select * from \"SHOP_MASTER_OPERATION\" where \"FORM_ID\" between :fromFORM_ID and :toFORM_ID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromFORM_ID", "SHOP_MASTER_OPERATION.FORM_ID", QueryObject.PARAM_STRING, fromFORM_ID);
        query.addParameter("toFORM_ID", "SHOP_MASTER_OPERATION.FORM_ID", QueryObject.PARAM_STRING, toFORM_ID);
        query.setResultClass(SHOP_MASTER_OPERATION.class);
        return query.getObjects();
    }

}
