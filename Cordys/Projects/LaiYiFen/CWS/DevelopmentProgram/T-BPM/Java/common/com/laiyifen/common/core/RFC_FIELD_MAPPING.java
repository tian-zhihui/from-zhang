/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.common.core;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;


public class RFC_FIELD_MAPPING extends RFC_FIELD_MAPPINGBase
{
    public RFC_FIELD_MAPPING()
    {
        this((BusObjectConfig)null);
    }

    public RFC_FIELD_MAPPING(BusObjectConfig config)
    {
        super(config);
    }
    
    public static BusObjectIterator<com.laiyifen.common.core.RFC_FIELD_MAPPING> getRfcFieldMappingObjects(String RFC_FUNCTION_NAME)
    {
        String queryText = "select * from \"RFC_FIELD_MAPPING\" where \"RFC_FUNCTION_NAME\" = :RFC_FUNCTION_NAME";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("RFC_FUNCTION_NAME", "RFC_FIELD_MAPPING.RFC_FUNCTION_NAME", QueryObject.PARAM_STRING, RFC_FUNCTION_NAME);
        query.setResultClass(RFC_FIELD_MAPPING.class);
        return query.getObjects();
    }
    
    public static BusObjectIterator<com.laiyifen.common.core.RFC_FIELD_MAPPING> getTableMappings(String RFC_FUNCTION_NAME)
    {
        String queryText = "SELECT SELECT_TABLE, COUNT(RFC_FUNCTION_NAME) \"MAPPINGS\" FROM \"RFC_FIELD_MAPPING\" " +
        				   "GROUP BY SELECT_TABLE, RFC_FUNCTION_NAME HAVING \"RFC_FUNCTION_NAME\" =:RFC_FUNCTION_NAME";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("RFC_FUNCTION_NAME", "RFC_FIELD_MAPPING.RFC_FUNCTION_NAME", QueryObject.PARAM_STRING, RFC_FUNCTION_NAME);
        query.setResultClass(RFC_FIELD_MAPPING.class);
        return query.getObjects();
    } 

    public static BusObjectIterator<com.laiyifen.common.core.RFC_FIELD_MAPPING> getFieldsForTable(String FIELD_TO_SELECT, String RFC_FUNCTION_NAME, String RFC_SELECT_TABLE)
    {
        String queryText = "SELECT " + FIELD_TO_SELECT + " FROM \"RFC_FIELD_MAPPING\" WHERE \"RFC_FUNCTION_NAME\" =:RFC_FUNCTION_NAME AND \"SELECT_TABLE\" =:SELECT_TABLE";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("RFC_FUNCTION_NAME", "RFC_FIELD_MAPPING.RFC_FUNCTION_NAME", QueryObject.PARAM_STRING, RFC_FUNCTION_NAME);
        query.addParameter("SELECT_TABLE", "RFC_FIELD_MAPPING.SELECT_TABLE", QueryObject.PARAM_STRING, RFC_SELECT_TABLE);
        query.setResultClass(RFC_FIELD_MAPPING.class);
        return query.getObjects();
    }
    
    public static BusObjectIterator<com.laiyifen.common.core.RFC_FIELD_MAPPING> getFieldMappingsForTable(String RFC_FUNCTION_NAME, String RFC_SELECT_TABLE)
    {
        String queryText = "SELECT * FROM \"RFC_FIELD_MAPPING\" WHERE \"RFC_FUNCTION_NAME\" =:RFC_FUNCTION_NAME AND \"SELECT_TABLE\" =:SELECT_TABLE";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("RFC_FUNCTION_NAME", "RFC_FIELD_MAPPING.RFC_FUNCTION_NAME", QueryObject.PARAM_STRING, RFC_FUNCTION_NAME);
        query.addParameter("SELECT_TABLE", "RFC_FIELD_MAPPING.SELECT_TABLE", QueryObject.PARAM_STRING, RFC_SELECT_TABLE);
        query.setResultClass(RFC_FIELD_MAPPING.class);
        return query.getObjects();
    }     
    
}
