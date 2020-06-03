package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  DemondProtocol
 * @version 1.0.0
 */
public class DemondProtocolDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String demondProtocol;
    private String trialInfoId;
    
    
    public void setDemondProtocol(String demondProtocol){
        this.demondProtocol=demondProtocol;
    }
    public String getDemondProtocol(){
        return this.demondProtocol;
    }
    public void setTrialInfoId(String trialInfoId){
        this.trialInfoId=trialInfoId;
    }
    public String getTrialInfoId(){
        return this.trialInfoId;
    }
    
    @Override
    public String toString() {
        return "[DemondProtocol = ]"+" demondProtocol =" +demondProtocol+" trialInfoId =" +trialInfoId;
    }
}
