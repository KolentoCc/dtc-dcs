package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  LiveProtocol
 * @version 1.0.0
 */
public class LiveProtocolDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String trialInfoID;
    private String liveLog;
    
    
    public void setTrialInfoID(String trialInfoID){
        this.trialInfoID=trialInfoID;
    }
    public String getTrialInfoID(){
        return this.trialInfoID;
    }
    public void setLiveLog(String liveLog){
        this.liveLog=liveLog;
    }
    public String getLiveLog(){
        return this.liveLog;
    }
    
    @Override
    public String toString() {
        return "[LiveProtocol = ]"+" trialInfoID =" +trialInfoID+" liveLog =" +liveLog;
    }
}
