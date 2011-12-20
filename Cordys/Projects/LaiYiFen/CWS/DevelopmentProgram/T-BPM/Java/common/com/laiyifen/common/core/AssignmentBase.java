/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.common.core;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;


public abstract class AssignmentBase extends com.cordys.cpc.bsf.busobject.CustomBusObject
{
    // tags used in the XML document
    public final static String ATTR_AssignmentType = "AssignmentType";
    public final static String ATTR_DepartmentDN = "DepartmentDN";
    public final static String ATTR_ManagerDN = "ManagerDN";
    public final static String ATTR_NextActivityUserList = "NextActivityUserList";
    public final static String ATTR_UserDN = "UserDN";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(Assignment.class);
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_AssignmentType);
                ai.setJavaName(ATTR_AssignmentType);
                ai.setAttributeClass(String.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DepartmentDN);
                ai.setJavaName(ATTR_DepartmentDN);
                ai.setAttributeClass(String.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ManagerDN);
                ai.setJavaName(ATTR_ManagerDN);
                ai.setAttributeClass(String.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_NextActivityUserList);
                ai.setJavaName(ATTR_NextActivityUserList);
                ai.setAttributeClass(String.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_UserDN);
                ai.setJavaName(ATTR_UserDN);
                ai.setAttributeClass(String.class);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public AssignmentBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getAssignmentType()
    {
        return getStringProperty(ATTR_AssignmentType);
    }

    public void setAssignmentType(String value)
    {
        setProperty(ATTR_AssignmentType, value, 0);
    }

    public String getDepartmentDN()
    {
        return getStringProperty(ATTR_DepartmentDN);
    }

    public void setDepartmentDN(String value)
    {
        setProperty(ATTR_DepartmentDN, value, 0);
    }

    public String getManagerDN()
    {
        return getStringProperty(ATTR_ManagerDN);
    }

    public void setManagerDN(String value)
    {
        setProperty(ATTR_ManagerDN, value, 0);
    }

    public String getNextActivityUserList()
    {
        return getStringProperty(ATTR_NextActivityUserList);
    }

    public void setNextActivityUserList(String value)
    {
        setProperty(ATTR_NextActivityUserList, value, 0);
    }

    public String getUserDN()
    {
        return getStringProperty(ATTR_UserDN);
    }

    public void setUserDN(String value)
    {
        setProperty(ATTR_UserDN, value, 0);
    }



}