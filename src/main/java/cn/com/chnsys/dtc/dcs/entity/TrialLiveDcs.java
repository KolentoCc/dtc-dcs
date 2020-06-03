package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  TrialLive
 * @version 1.0.0
 */
public class TrialLiveDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String trialLiveId;
    private Integer invokStyle;
    private String liveAddress;
    private Integer pictureType;
    private Integer perspective;
    private String signalName;
    private String openCourtInfoId;
    private Integer protocolType;
    private Integer version;
    
    
    public void setTrialLiveId(String trialLiveId){
        this.trialLiveId=trialLiveId;
    }
    public String getTrialLiveId(){
        return this.trialLiveId;
    }
    public void setInvokStyle(Integer invokStyle){
        this.invokStyle=invokStyle;
    }
    public Integer getInvokStyle(){
        return this.invokStyle;
    }
    public void setLiveAddress(String liveAddress){
        this.liveAddress=liveAddress;
    }
    public String getLiveAddress(){
        return this.liveAddress;
    }
    public void setPictureType(Integer pictureType){
        this.pictureType=pictureType;
    }
    public Integer getPictureType(){
        return this.pictureType;
    }
    public void setPerspective(Integer perspective){
        this.perspective=perspective;
    }
    public Integer getPerspective(){
        return this.perspective;
    }
    public void setSignalName(String signalName){
        this.signalName=signalName;
    }
    public String getSignalName(){
        return this.signalName;
    }
    public void setOpenCourtInfoId(String openCourtInfoId){
        this.openCourtInfoId=openCourtInfoId;
    }
    public String getOpenCourtInfoId(){
        return this.openCourtInfoId;
    }
    public void setProtocolType(Integer protocolType){
        this.protocolType=protocolType;
    }
    public Integer getProtocolType(){
        return this.protocolType;
    }
    public void setVersion(Integer version){
        this.version=version;
    }
    public Integer getVersion(){
        return this.version;
    }
    
    @Override
    public String toString() {
        return "[TrialLive = ]"+" trialLiveId =" +trialLiveId+" invokStyle =" +invokStyle+" liveAddress =" +liveAddress+" pictureType =" +pictureType+" perspective =" +perspective+" signalName =" +signalName+" openCourtInfoId =" +openCourtInfoId+" protocolType =" +protocolType+" version =" +version;
    }
}
