/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.bpc.core;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class BPC_BUDGET_ECCBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_ID = "ID";
    public final static String ATTR_YEAR = "YEAR";
    public final static String ATTR_MONTH = "MONTH";
    public final static String ATTR_COSTCENTER_CODE = "COSTCENTER_CODE";
    public final static String ATTR_SUBJECT_CODE = "SUBJECT_CODE";
    public final static String ATTR_SUBJECT_NAME = "SUBJECT_NAME";
    public final static String ATTR_SUBJECT_CODE_SAP = "SUBJECT_CODE_SAP";
    public final static String ATTR_BUDGET_SUM = "BUDGET_SUM";
    public final static String ATTR_BUDGET_STANDARD = "BUDGET_STANDARD";
    public final static String ATTR_BUDGET_USED = "BUDGET_USED";
    public final static String ATTR_BUDGET_FREESE = "BUDGET_FREESE";
    public final static String ATTR_BUDGET_SURPLUS = "BUDGET_SURPLUS";
    public final static String ATTR_BUDGET_RATIO = "BUDGET_RATIO";
    public final static String ATTR_STATUS = "STATUS";
    public final static String ATTR_EXT1 = "EXT1";
    public final static String ATTR_EXT2 = "EXT2";
    public final static String ATTR_EXT3 = "EXT3";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(BPC_BUDGET_ECC.class);
            s_classInfo.setTableName("BPC_BUDGET_ECC");
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ID);
                ai.setJavaName(ATTR_ID);
                ai.setColumnName(ATTR_ID);
                ai.setAttributeClass(double.class);
                NumberValidator v = new NumberValidator(ATTR_ID);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_YEAR);
                ai.setJavaName(ATTR_YEAR);
                ai.setColumnName(ATTR_YEAR);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_YEAR);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_MONTH);
                ai.setJavaName(ATTR_MONTH);
                ai.setColumnName(ATTR_MONTH);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_MONTH);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_COSTCENTER_CODE);
                ai.setJavaName(ATTR_COSTCENTER_CODE);
                ai.setColumnName(ATTR_COSTCENTER_CODE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_COSTCENTER_CODE);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SUBJECT_CODE);
                ai.setJavaName(ATTR_SUBJECT_CODE);
                ai.setColumnName(ATTR_SUBJECT_CODE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SUBJECT_CODE);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SUBJECT_NAME);
                ai.setJavaName(ATTR_SUBJECT_NAME);
                ai.setColumnName(ATTR_SUBJECT_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SUBJECT_NAME);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SUBJECT_CODE_SAP);
                ai.setJavaName(ATTR_SUBJECT_CODE_SAP);
                ai.setColumnName(ATTR_SUBJECT_CODE_SAP);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SUBJECT_CODE_SAP);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_BUDGET_SUM);
                ai.setJavaName(ATTR_BUDGET_SUM);
                ai.setColumnName(ATTR_BUDGET_SUM);
                ai.setAttributeClass(double.class);
                NumberValidator v = new NumberValidator(ATTR_BUDGET_SUM);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_BUDGET_STANDARD);
                ai.setJavaName(ATTR_BUDGET_STANDARD);
                ai.setColumnName(ATTR_BUDGET_STANDARD);
                ai.setAttributeClass(double.class);
                NumberValidator v = new NumberValidator(ATTR_BUDGET_STANDARD);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_BUDGET_USED);
                ai.setJavaName(ATTR_BUDGET_USED);
                ai.setColumnName(ATTR_BUDGET_USED);
                ai.setAttributeClass(double.class);
                NumberValidator v = new NumberValidator(ATTR_BUDGET_USED);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_BUDGET_FREESE);
                ai.setJavaName(ATTR_BUDGET_FREESE);
                ai.setColumnName(ATTR_BUDGET_FREESE);
                ai.setAttributeClass(double.class);
                NumberValidator v = new NumberValidator(ATTR_BUDGET_FREESE);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_BUDGET_SURPLUS);
                ai.setJavaName(ATTR_BUDGET_SURPLUS);
                ai.setColumnName(ATTR_BUDGET_SURPLUS);
                ai.setAttributeClass(double.class);
                NumberValidator v = new NumberValidator(ATTR_BUDGET_SURPLUS);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_BUDGET_RATIO);
                ai.setJavaName(ATTR_BUDGET_RATIO);
                ai.setColumnName(ATTR_BUDGET_RATIO);
                ai.setAttributeClass(double.class);
                NumberValidator v = new NumberValidator(ATTR_BUDGET_RATIO);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_STATUS);
                ai.setJavaName(ATTR_STATUS);
                ai.setColumnName(ATTR_STATUS);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_STATUS);
                v.setMaxLength(2);
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
            {
                AttributeInfo ai = new AttributeInfo(ATTR_EXT3);
                ai.setJavaName(ATTR_EXT3);
                ai.setColumnName(ATTR_EXT3);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_EXT3);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public BPC_BUDGET_ECCBase(BusObjectConfig config)
    {
        super(config);
    }

    public double getID()
    {
        return getDoubleProperty(ATTR_ID);
    }

    public void setID(double value)
    {
        setProperty(ATTR_ID, value, 0);
    }

    public String getYEAR()
    {
        return getStringProperty(ATTR_YEAR);
    }

    public void setYEAR(String value)
    {
        setProperty(ATTR_YEAR, value, 0);
    }

    public String getMONTH()
    {
        return getStringProperty(ATTR_MONTH);
    }

    public void setMONTH(String value)
    {
        setProperty(ATTR_MONTH, value, 0);
    }

    public String getCOSTCENTER_CODE()
    {
        return getStringProperty(ATTR_COSTCENTER_CODE);
    }

    public void setCOSTCENTER_CODE(String value)
    {
        setProperty(ATTR_COSTCENTER_CODE, value, 0);
    }

    public String getSUBJECT_CODE()
    {
        return getStringProperty(ATTR_SUBJECT_CODE);
    }

    public void setSUBJECT_CODE(String value)
    {
        setProperty(ATTR_SUBJECT_CODE, value, 0);
    }

    public String getSUBJECT_NAME()
    {
        return getStringProperty(ATTR_SUBJECT_NAME);
    }

    public void setSUBJECT_NAME(String value)
    {
        setProperty(ATTR_SUBJECT_NAME, value, 0);
    }

    public String getSUBJECT_CODE_SAP()
    {
        return getStringProperty(ATTR_SUBJECT_CODE_SAP);
    }

    public void setSUBJECT_CODE_SAP(String value)
    {
        setProperty(ATTR_SUBJECT_CODE_SAP, value, 0);
    }

    public double getBUDGET_SUM()
    {
        return getDoubleProperty(ATTR_BUDGET_SUM);
    }

    public void setBUDGET_SUM(double value)
    {
        setProperty(ATTR_BUDGET_SUM, value, 0);
    }

    public double getBUDGET_STANDARD()
    {
        return getDoubleProperty(ATTR_BUDGET_STANDARD);
    }

    public void setBUDGET_STANDARD(double value)
    {
        setProperty(ATTR_BUDGET_STANDARD, value, 0);
    }

    public double getBUDGET_USED()
    {
        return getDoubleProperty(ATTR_BUDGET_USED);
    }

    public void setBUDGET_USED(double value)
    {
        setProperty(ATTR_BUDGET_USED, value, 0);
    }

    public double getBUDGET_FREESE()
    {
        return getDoubleProperty(ATTR_BUDGET_FREESE);
    }

    public void setBUDGET_FREESE(double value)
    {
        setProperty(ATTR_BUDGET_FREESE, value, 0);
    }

    public double getBUDGET_SURPLUS()
    {
        return getDoubleProperty(ATTR_BUDGET_SURPLUS);
    }

    public void setBUDGET_SURPLUS(double value)
    {
        setProperty(ATTR_BUDGET_SURPLUS, value, 0);
    }

    public double getBUDGET_RATIO()
    {
        return getDoubleProperty(ATTR_BUDGET_RATIO);
    }

    public void setBUDGET_RATIO(double value)
    {
        setProperty(ATTR_BUDGET_RATIO, value, 0);
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

    public String getEXT3()
    {
        return getStringProperty(ATTR_EXT3);
    }

    public void setEXT3(String value)
    {
        setProperty(ATTR_EXT3, value, 0);
    }





    public static BusObjectIterator<com.laiyifen.bpc.core.BPC_BUDGET_ECC> getBpcBudgetEccObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"BPC_BUDGET_ECC\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(BPC_BUDGET_ECC.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.laiyifen.bpc.core.BPC_BUDGET_ECC> getBpcBudgetEccObjects()
    {
        String queryText = "select * from \"BPC_BUDGET_ECC\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(BPC_BUDGET_ECC.class);
        return query.getObjects();
    }

}
