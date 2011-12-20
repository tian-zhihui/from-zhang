/*
  This class has been generated by the Code Generator
 */

package com.laiyifen.common.core;

import java.util.Date;
import java.util.UUID;
import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;

public class COMMON_LOGGER extends COMMON_LOGGERBase {
	public COMMON_LOGGER() {
		this((BusObjectConfig) null);
	}

	public COMMON_LOGGER(BusObjectConfig config) {
		super(config);
	}

	public static void log(String LOG_LEVEL, String CATEGORY,
			String PATTERN_CATEGORY, String APPLICATION_USER,
			String SENDER_APPLICATION, String SENDER_COMPONENT, String REQUEST,
			String RESPONSE, String KEY_NO, String MESSAGE) {
		COMMON_LOGGER common_logger = new COMMON_LOGGER();
		common_logger.setLOG_ID(UUID.randomUUID().toString());
		common_logger.setLOG_LEVEL(LOG_LEVEL);
		common_logger.setCATEGORY(CATEGORY);
		common_logger.setPATTERN_CATEGORY(PATTERN_CATEGORY);
		common_logger.setAPPLICATION_USER(APPLICATION_USER);
		common_logger.setSENDER_APPLICATION(SENDER_APPLICATION);
		common_logger.setSENDER_COMPONENT(SENDER_COMPONENT);
		common_logger.setREQUEST(REQUEST);
		common_logger.setRESPONSE(RESPONSE);
		common_logger.setKEY_NO(KEY_NO);
		common_logger.setMESSAGE(MESSAGE);
		common_logger.setLOG_TIME(new Date());
		common_logger.insert();
	}

	public static com.laiyifen.common.core.COMMON_LOGGER getCommonLoggerObjectByKeyNo(
			String KEY_NO) {
		String queryText = "select * from \"COMMON_LOGGER\" where \"KEY_NO\" = :KEY_NO";
		QueryObject query = new QueryObject(queryText);
		query.addParameter("KEY_NO", "COMMON_LOGGER.KEY_NO",
				QueryObject.PARAM_STRING, KEY_NO);
		query.setResultClass(COMMON_LOGGER.class);
		return (COMMON_LOGGER) query.getObject();
	}

	public static BusObjectIterator<com.laiyifen.common.core.COMMON_LOGGER> getLoggerByFilter(
			String logLevel, String shopId, String operationCode,
			String batchNumber, String beginDate, String endDate) {

		if (logLevel == null)
			logLevel = "";
		if (shopId == null)
			shopId = "";
		if (operationCode == null)
			operationCode = "";
		if (batchNumber == null)
			batchNumber = "";
		if (beginDate == null)
			beginDate = "";
		if (endDate == null)
			endDate = "";
		String queryText = "select * from COMMON_LOGGER where 1=1";
		if (!"".equals(logLevel))
			queryText = queryText + " and LOG_LEVEL='" + logLevel + "'";
		if (!"".equals(shopId)) {
			queryText = queryText + " and SENDER_APPLICATION='" + shopId + "'";
		}
		if (!"".equals(operationCode)) {
			queryText = queryText + " and SENDER_COMPONENT='" + operationCode + "'";
		}
		if (!"".equals(batchNumber)) {
			queryText = queryText + " and KEY_NO='" + batchNumber + "'";
		}
		if (!"".equals(beginDate)) {
			queryText = queryText + " and LOG_TIME>=TO_DATE('" + beginDate
					+ "','yyyy-MM-dd')";
		}
		if (!"".equals(endDate)) {
			queryText = queryText + " and LOG_TIME<=TO_DATE('" + endDate
					+ "','yyyy-MM-dd')";
		}
		QueryObject query = new QueryObject(queryText);
		query.setResultClass(COMMON_LOGGER.class);
		return query.getObjects();
	}

}