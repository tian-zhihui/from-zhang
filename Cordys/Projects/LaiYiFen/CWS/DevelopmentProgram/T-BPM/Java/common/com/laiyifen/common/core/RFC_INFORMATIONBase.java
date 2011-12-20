/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.common.core;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class RFC_INFORMATIONBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_RFC_FUNCTION_NAME = "RFC_FUNCTION_NAME";
    public final static String ATTR_OPERATION_CODE = "OPERATION_CODE";
    public final static String ATTR_RFC_INPUT_PARAMETERS = "RFC_INPUT_PARAMETERS";
    public final static String ATTR_RFC_DESCRIPTION = "RFC_DESCRIPTION";
    public final static String ATTR_SYNFLAG = "SYNFLAG";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(RFC_INFORMATION.class);
            s_classInfo.setTableName("RFC_INFORMATION");
            s_classInfo.setUIDElements(new String[]{ATTR_RFC_FUNCTION_NAME});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_RFC_FUNCTION_NAME);
                ai.setJavaName(ATTR_RFC_FUNCTION_NAME);
                ai.setColumnName(ATTR_RFC_FUNCTION_NAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_RFC_FUNCTION_NAME);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_OPERATION_CODE);
                ai.setJavaName(ATTR_OPERATION_CODE);
                ai.setColumnName(ATTR_OPERATION_CODE);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_OPERATION_CODE);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_RFC_INPUT_PARAMETERS);
                ai.setJavaName(ATTR_RFC_INPUT_PARAMETERS);
                ai.setColumnName(ATTR_RFC_INPUT_PARAMETERS);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_RFC_INPUT_PARAMETERS);
                v.setMaxLength(4000);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_RFC_DESCRIPTION);
                ai.setJavaName(ATTR_RFC_DESCRIPTION);
                ai.setColumnName(ATTR_RFC_DESCRIPTION);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_RFC_DESCRIPTION);
                v.setMaxLength(256);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SYNFLAG);
                ai.setJavaName(ATTR_SYNFLAG);
                ai.setColumnName(ATTR_SYNFLAG);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SYNFLAG);
                v.setMaxLength(1);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public RFC_INFORMATIONBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getRFC_FUNCTION_NAME()
    {
        return getStringProperty(ATTR_RFC_FUNCTION_NAME);
    }

    public void setRFC_FUNCTION_NAME(String value)
    {
        setProperty(ATTR_RFC_FUNCTION_NAME, value, 0);
    }

    public String getOPERATION_CODE()
    {
        return getStringProperty(ATTR_OPERATION_CODE);
    }

    public void setOPERATION_CODE(String value)
    {
        setProperty(ATTR_OPERATION_CODE, value, 0);
    }

    public String getRFC_INPUT_PARAMETERS()
    {
        return getStringProperty(ATTR_RFC_INPUT_PARAMETERS);
    }

    public void setRFC_INPUT_PARAMETERS(String value)
    {
        setProperty(ATTR_RFC_INPUT_PARAMETERS, value, 0);
    }

    public String getRFC_DESCRIPTION()
    {
        return getStringProperty(ATTR_RFC_DESCRIPTION);
    }

    public void setRFC_DESCRIPTION(String value)
    {
        setProperty(ATTR_RFC_DESCRIPTION, value, 0);
    }

    public String getSYNFLAG()
    {
        return getStringProperty(ATTR_SYNFLAG);
    }

    public void setSYNFLAG(String value)
    {
        setProperty(ATTR_SYNFLAG, value, 0);
    }

    public static BusObjectIterator<com.laiyifen.common.core.RFC_INFORMATION> getNextRfcInformationObjects(String RFC_FUNCTION_NAME, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"RFC_INFORMATION\" where (\"RFC_FUNCTION_NAME\" > :RFC_FUNCTION_NAME) order by \"RFC_FUNCTION_NAME\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("RFC_FUNCTION_NAME", "RFC_INFORMATION.RFC_FUNCTION_NAME", QueryObject.PARAM_STRING, RFC_FUNCTION_NAME);//NOPMD
        query.setResultClass(RFC_INFORMATION.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.laiyifen.common.core.RFC_INFORMATION> getPreviousRfcInformationObjects(String RFC_FUNCTION_NAME, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"RFC_INFORMATION\" where (\"RFC_FUNCTION_NAME\" < :RFC_FUNCTION_NAME) order by \"RFC_FUNCTION_NAME\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("RFC_FUNCTION_NAME", "RFC_INFORMATION.RFC_FUNCTION_NAME", QueryObject.PARAM_STRING, RFC_FUNCTION_NAME);//NOPMD
        query.setResultClass(RFC_INFORMATION.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.laiyifen.common.core.RFC_INFORMATION getRfcInformationObject(String RFC_FUNCTION_NAME)
    {
        String queryText = "select * from \"RFC_INFORMATION\" where \"RFC_FUNCTION_NAME\" = :RFC_FUNCTION_NAME";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("RFC_FUNCTION_NAME", "RFC_INFORMATION.RFC_FUNCTION_NAME", QueryObject.PARAM_STRING, RFC_FUNCTION_NAME);//NOPMD
        query.setResultClass(RFC_INFORMATION.class);
        return (RFC_INFORMATION)query.getObject();
    }

    public static BusObjectIterator<com.laiyifen.common.core.RFC_INFORMATION> getRfcInformationObjects(String fromRFC_FUNCTION_NAME, String toRFC_FUNCTION_NAME, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"RFC_INFORMATION\" where \"RFC_FUNCTION_NAME\" between :fromRFC_FUNCTION_NAME and :toRFC_FUNCTION_NAME";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromRFC_FUNCTION_NAME", "RFC_INFORMATION.RFC_FUNCTION_NAME", QueryObject.PARAM_STRING, fromRFC_FUNCTION_NAME);
        query.addParameter("toRFC_FUNCTION_NAME", "RFC_INFORMATION.RFC_FUNCTION_NAME", QueryObject.PARAM_STRING, toRFC_FUNCTION_NAME);
        query.setResultClass(RFC_INFORMATION.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.laiyifen.common.core.RFC_INFORMATION> getRfcInformationObjects(String fromRFC_FUNCTION_NAME, String toRFC_FUNCTION_NAME)
    {
        String queryText = "select * from \"RFC_INFORMATION\" where \"RFC_FUNCTION_NAME\" between :fromRFC_FUNCTION_NAME and :toRFC_FUNCTION_NAME";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromRFC_FUNCTION_NAME", "RFC_INFORMATION.RFC_FUNCTION_NAME", QueryObject.PARAM_STRING, fromRFC_FUNCTION_NAME);
        query.addParameter("toRFC_FUNCTION_NAME", "RFC_INFORMATION.RFC_FUNCTION_NAME", QueryObject.PARAM_STRING, toRFC_FUNCTION_NAME);
        query.setResultClass(RFC_INFORMATION.class);
        return query.getObjects();
    }

}