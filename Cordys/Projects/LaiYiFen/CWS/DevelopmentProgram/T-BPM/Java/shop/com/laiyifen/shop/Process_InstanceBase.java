/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.shop;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class Process_InstanceBase extends com.cordys.cpc.bsf.busobject.CustomBusObject
{
    // tags used in the XML document
    public final static String ATTR_DESCRIPTION = "DESCRIPTION";
    public final static String ATTR_USER_NAME = "USER_NAME";
    public final static String ATTR_STATUS = "STATUS";
    public final static String ATTR_INSTANCE_ID = "INSTANCE_ID";
    public final static String ATTR_ISFLAG = "ISFLAG";
    public final static String ATTR_DEPTNAME = "DEPTNAME";
    public final static String ATTR_EXT1 = "EXT1";
    public final static String ATTR_EXT2 = "EXT2";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(Process_Instance.class);
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DESCRIPTION);
                ai.setJavaName(ATTR_DESCRIPTION);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_DESCRIPTION);
                v.setMaxLength(200);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_USER_NAME);
                ai.setJavaName(ATTR_USER_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_USER_NAME);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_STATUS);
                ai.setJavaName(ATTR_STATUS);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_STATUS);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_INSTANCE_ID);
                ai.setJavaName(ATTR_INSTANCE_ID);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_INSTANCE_ID);
                v.setMaxLength(200);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ISFLAG);
                ai.setJavaName(ATTR_ISFLAG);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ISFLAG);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DEPTNAME);
                ai.setJavaName(ATTR_DEPTNAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_DEPTNAME);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_EXT1);
                ai.setJavaName(ATTR_EXT1);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_EXT1);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_EXT2);
                ai.setJavaName(ATTR_EXT2);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_EXT2);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public Process_InstanceBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getDESCRIPTION()
    {
        return getStringProperty(ATTR_DESCRIPTION);
    }

    public void setDESCRIPTION(String value)
    {
        setProperty(ATTR_DESCRIPTION, value, 0);
    }

    public String getUSER_NAME()
    {
        return getStringProperty(ATTR_USER_NAME);
    }

    public void setUSER_NAME(String value)
    {
        setProperty(ATTR_USER_NAME, value, 0);
    }

    public String getSTATUS()
    {
        return getStringProperty(ATTR_STATUS);
    }

    public void setSTATUS(String value)
    {
        setProperty(ATTR_STATUS, value, 0);
    }

    public String getINSTANCE_ID()
    {
        return getStringProperty(ATTR_INSTANCE_ID);
    }

    public void setINSTANCE_ID(String value)
    {
        setProperty(ATTR_INSTANCE_ID, value, 0);
    }

    public String getISFLAG()
    {
        return getStringProperty(ATTR_ISFLAG);
    }

    public void setISFLAG(String value)
    {
        setProperty(ATTR_ISFLAG, value, 0);
    }

    public String getDEPTNAME()
    {
        return getStringProperty(ATTR_DEPTNAME);
    }

    public void setDEPTNAME(String value)
    {
        setProperty(ATTR_DEPTNAME, value, 0);
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


}