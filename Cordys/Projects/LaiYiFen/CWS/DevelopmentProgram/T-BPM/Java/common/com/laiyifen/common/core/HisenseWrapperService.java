/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.common.core;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.laiyifen.hisense.HisenseWrapper;


public class HisenseWrapperService extends HisenseWrapperServiceBase
{
    public HisenseWrapperService()
    {
        this((BusObjectConfig)null);
    }

    public HisenseWrapperService(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.laiyifen.common.core.HisenseWrapperService> getHisenseWrapperServiceObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        // TODO implement body
        return null;
    }

    public static boolean setCardTypeOrg(String shop_ID) throws Exception
    {
        // TODO implement body
        return  HisenseWrapper.setCardTypeOrg(shop_ID);
    }

    public static int setTradeClient(String shop_ID) throws Exception
    {
        // TODO implement body
        return HisenseWrapper.setTradeClient(shop_ID);
    }

    public void onInsert()
    {
    }

    public void onUpdate()
    {
    }

    public void onDelete()
    {
    }

}