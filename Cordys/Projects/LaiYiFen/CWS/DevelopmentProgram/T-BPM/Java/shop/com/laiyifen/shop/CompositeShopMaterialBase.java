/*
  This class has been generated by the Code Generator
*/

package com.laiyifen.shop;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.classinfo.RelationInfo_Composite;


public abstract class CompositeShopMaterialBase extends com.cordys.cpc.bsf.busobject.CustomBusObject
{
    // tags used in the XML document
    private final static String REL_SHOP_MATERIAL = "AGGR:SHOP_MATERIAL";
    private final static String REL_SHOP_MATERIAL_DETAIL = "AGGR:SHOP_MATERIAL_DETAIL";
    private final static String REL_SHOP_MASTER = "AGGR:SHOP_MASTER";
    private final static String REL_ATTACHMENT = "AGGR:ATTACHMENT";
    private final static String REL_APPROVAL_HISTORY = "AGGR:APPROVAL_HISTORY";
    private final static String REL_SHOP_MATERIAL_CONFIGURATION = "AGGR:SHOP_MATERIAL_CONFIGURATION";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(CompositeShopMaterial.class);
            s_classInfo.setUIDElements(new String[]{});
            {
                RelationInfo_Composite ri = new RelationInfo_Composite(REL_SHOP_MATERIAL);
                ri.setName("SHOP_MATERIAL");
                ri.setMultiOcc(false);
                ri.setRelatedClass(com.laiyifen.shop.SHOP_MATERIAL.class);
                s_classInfo.addRelationInfo(ri);
            }
            {
                RelationInfo_Composite ri = new RelationInfo_Composite(REL_SHOP_MATERIAL_DETAIL);
                ri.setName("SHOP_MATERIAL_DETAIL");
                ri.setMultiOcc(true);
                ri.setRelatedClass(com.laiyifen.shop.SHOP_MATERIAL_DETAIL.class);
                s_classInfo.addRelationInfo(ri);
            }
            {
                RelationInfo_Composite ri = new RelationInfo_Composite(REL_SHOP_MASTER);
                ri.setName("SHOP_MASTER");
                ri.setMultiOcc(false);
                ri.setRelatedClass(com.laiyifen.shop.SHOP_MASTER.class);
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
                RelationInfo_Composite ri = new RelationInfo_Composite(REL_APPROVAL_HISTORY);
                ri.setName("APPROVAL_HISTORY");
                ri.setMultiOcc(true);
                ri.setRelatedClass(com.laiyifen.common.core.APPROVAL_HISTORY.class);
                s_classInfo.addRelationInfo(ri);
            }
            {
                RelationInfo_Composite ri = new RelationInfo_Composite(REL_SHOP_MATERIAL_CONFIGURATION);
                ri.setName("SHOP_MATERIAL_CONFIGURATION");
                ri.setMultiOcc(true);
                ri.setRelatedClass(com.laiyifen.shop.SHOP_MATERIAL_CONFIGURATION.class);
                s_classInfo.addRelationInfo(ri);
            }
        }
        return s_classInfo;
    }

    public CompositeShopMaterialBase(BusObjectConfig config)
    {
        super(config);
    }

    public SHOP_MATERIAL getSHOP_MATERIALObject()
    {
        return (SHOP_MATERIAL)getSingleRelationObject(REL_SHOP_MATERIAL);
    }

    public SHOP_MATERIAL setSHOP_MATERIALObject(SHOP_MATERIAL a_SHOP_MATERIAL)
    {
        return(SHOP_MATERIAL)_getSingleRelation(REL_SHOP_MATERIAL, true).setLocalObject(a_SHOP_MATERIAL);
    }

    public BusObjectIterator<SHOP_MATERIAL_DETAIL> getSHOP_MATERIAL_DETAILObjects()
    {
        return getMultiRelationObjects(REL_SHOP_MATERIAL_DETAIL);
    }

    public SHOP_MATERIAL_DETAIL addSHOP_MATERIAL_DETAILObject(SHOP_MATERIAL_DETAIL a_SHOP_MATERIAL_DETAIL)
    {
        return (SHOP_MATERIAL_DETAIL)_getMultiRelation(REL_SHOP_MATERIAL_DETAIL, true).addObject(a_SHOP_MATERIAL_DETAIL);
    }

    public void removeSHOP_MATERIAL_DETAILObject(SHOP_MATERIAL_DETAIL a_SHOP_MATERIAL_DETAIL)
    {
        _getMultiRelation(REL_SHOP_MATERIAL_DETAIL, true).removeObject(a_SHOP_MATERIAL_DETAIL);
    }

    public SHOP_MASTER getSHOP_MASTERObject()
    {
        return (SHOP_MASTER)getSingleRelationObject(REL_SHOP_MASTER);
    }

    public SHOP_MASTER setSHOP_MASTERObject(SHOP_MASTER a_SHOP_MASTER)
    {
        return(SHOP_MASTER)_getSingleRelation(REL_SHOP_MASTER, true).setLocalObject(a_SHOP_MASTER);
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

    public BusObjectIterator<com.laiyifen.common.core.APPROVAL_HISTORY> getAPPROVAL_HISTORYObjects()
    {
        return getMultiRelationObjects(REL_APPROVAL_HISTORY);
    }

    public com.laiyifen.common.core.APPROVAL_HISTORY addAPPROVAL_HISTORYObject(com.laiyifen.common.core.APPROVAL_HISTORY a_APPROVAL_HISTORY)
    {
        return (com.laiyifen.common.core.APPROVAL_HISTORY)_getMultiRelation(REL_APPROVAL_HISTORY, true).addObject(a_APPROVAL_HISTORY);
    }

    public void removeAPPROVAL_HISTORYObject(com.laiyifen.common.core.APPROVAL_HISTORY a_APPROVAL_HISTORY)
    {
        _getMultiRelation(REL_APPROVAL_HISTORY, true).removeObject(a_APPROVAL_HISTORY);
    }

    public BusObjectIterator<SHOP_MATERIAL_CONFIGURATION> getSHOP_MATERIAL_CONFIGURATIONObjects()
    {
        return getMultiRelationObjects(REL_SHOP_MATERIAL_CONFIGURATION);
    }

    public SHOP_MATERIAL_CONFIGURATION addSHOP_MATERIAL_CONFIGURATIONObject(SHOP_MATERIAL_CONFIGURATION a_SHOP_MATERIAL_CONFIGURATION)
    {
        return (SHOP_MATERIAL_CONFIGURATION)_getMultiRelation(REL_SHOP_MATERIAL_CONFIGURATION, true).addObject(a_SHOP_MATERIAL_CONFIGURATION);
    }

    public void removeSHOP_MATERIAL_CONFIGURATIONObject(SHOP_MATERIAL_CONFIGURATION a_SHOP_MATERIAL_CONFIGURATION)
    {
        _getMultiRelation(REL_SHOP_MATERIAL_CONFIGURATION, true).removeObject(a_SHOP_MATERIAL_CONFIGURATION);
    }


}