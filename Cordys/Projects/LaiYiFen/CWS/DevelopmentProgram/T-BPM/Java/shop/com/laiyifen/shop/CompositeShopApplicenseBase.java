/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.shop;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.classinfo.RelationInfo_Composite;


public abstract class CompositeShopApplicenseBase extends com.cordys.cpc.bsf.busobject.CustomBusObject
{
    // tags used in the XML document
    private final static String REL_SHOP_APPLICENSE = "AGGR:SHOP_APPLICENSE";
    private final static String REL_ATTACHMENT = "AGGR:ATTACHMENT";
    private final static String REL_SHOP_MASTER = "AGGR:SHOP_MASTER";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(CompositeShopApplicense.class);
            s_classInfo.setUIDElements(new String[]{});
            {
                RelationInfo_Composite ri = new RelationInfo_Composite(REL_SHOP_APPLICENSE);
                ri.setName("SHOP_APPLICENSE");
                ri.setMultiOcc(false);
                ri.setRelatedClass(com.laiyifen.shop.SHOP_APPLICENSE.class);
                s_classInfo.addRelationInfo(ri);
            }
            {
                RelationInfo_Composite ri = new RelationInfo_Composite(REL_ATTACHMENT);
                ri.setName("ATTACHMENT");
                ri.setMultiOcc(true);
                ri.setRelatedClass(com.laiyifen.common.core.ATTACHMENT.class);
                s_classInfo.addRelationInfo(ri);
            }
            {
                RelationInfo_Composite ri = new RelationInfo_Composite(REL_SHOP_MASTER);
                ri.setName("SHOP_MASTER");
                ri.setMultiOcc(false);
                ri.setRelatedClass(com.laiyifen.shop.SHOP_MASTER.class);
                s_classInfo.addRelationInfo(ri);
            }
        }
        return s_classInfo;
    }

    public CompositeShopApplicenseBase(BusObjectConfig config)
    {
        super(config);
    }

    public SHOP_APPLICENSE getSHOP_APPLICENSEObject()
    {
        return (SHOP_APPLICENSE)getSingleRelationObject(REL_SHOP_APPLICENSE);
    }

    public SHOP_APPLICENSE setSHOP_APPLICENSEObject(SHOP_APPLICENSE a_SHOP_APPLICENSE)
    {
        return(SHOP_APPLICENSE)_getSingleRelation(REL_SHOP_APPLICENSE, true).setLocalObject(a_SHOP_APPLICENSE);
    }

    public BusObjectIterator<com.laiyifen.common.core.ATTACHMENT> getATTACHMENTObjects()
    {
        return getMultiRelationObjects(REL_ATTACHMENT);
    }

    public com.laiyifen.common.core.ATTACHMENT addATTACHMENTObject(com.laiyifen.common.core.ATTACHMENT a_ATTACHMENT)
    {
        return (com.laiyifen.common.core.ATTACHMENT)_getMultiRelation(REL_ATTACHMENT, true).addObject(a_ATTACHMENT);
    }

    public void removeATTACHMENTObject(com.laiyifen.common.core.ATTACHMENT a_ATTACHMENT)
    {
        _getMultiRelation(REL_ATTACHMENT, true).removeObject(a_ATTACHMENT);
    }

    public SHOP_MASTER getSHOP_MASTERObject()
    {
        return (SHOP_MASTER)getSingleRelationObject(REL_SHOP_MASTER);
    }

    public SHOP_MASTER setSHOP_MASTERObject(SHOP_MASTER a_SHOP_MASTER)
    {
        return(SHOP_MASTER)_getSingleRelation(REL_SHOP_MASTER, true).setLocalObject(a_SHOP_MASTER);
    }



}
