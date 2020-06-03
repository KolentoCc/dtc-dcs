package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  PlayCount
 * @version 1.0.0
 */
public class PlayCountDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String caseId;
    private Integer demandCount;
    private String openCourtInfoId;
    private Integer liveCount;
    
    
    public void setCaseId(String caseId){
        this.caseId=caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }
    public void setDemandCount(Integer demandCount){
        this.demandCount=demandCount;
    }
    public Integer getDemandCount(){
        return this.demandCount;
    }
    public void setOpenCourtInfoId(String openCourtInfoId){
        this.openCourtInfoId=openCourtInfoId;
    }
    public String getOpenCourtInfoId(){
        return this.openCourtInfoId;
    }
    public void setLiveCount(Integer liveCount){
        this.liveCount=liveCount;
    }
    public Integer getLiveCount(){
        return this.liveCount;
    }
    
    @Override
    public String toString() {
        return "[PlayCount = ]"+" caseId =" +caseId+" demandCount =" +demandCount+" openCourtInfoId =" +openCourtInfoId+" liveCount =" +liveCount;
    }
}
