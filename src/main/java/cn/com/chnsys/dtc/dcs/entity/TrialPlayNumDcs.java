package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-rcs
 * @类名称：  TrialPlayNumDcs
 * @version 1.0.0
 */
public class TrialPlayNumDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*主键id
	*/
	private String playId;
    /**
	*案件id
	*/
	private String caseId;
    /**
	*排期状态
	*/
	private Integer trialState;
    /**
	*是否有效
	*/
	private Integer whetherValid;
    /**
	*播放次数统计
	*/
	private Integer playNum;
    /**
	*排期标识
	*/
	private String trialId;
    /**
	*播放时间
	*/
	private java.util.Date playTime;
    
    
    public void setPlayId(String playId){
        this.playId=playId;
    }
    public String getPlayId(){
        return this.playId;
    }
    public void setCaseId(String caseId){
        this.caseId=caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }
    public void setTrialState(Integer trialState){
        this.trialState=trialState;
    }
    public Integer getTrialState(){
        return this.trialState;
    }
    public void setWhetherValid(Integer whetherValid){
        this.whetherValid=whetherValid;
    }
    public Integer getWhetherValid(){
        return this.whetherValid;
    }
    public void setPlayNum(Integer playNum){
        this.playNum=playNum;
    }
    public Integer getPlayNum(){
        return this.playNum;
    }
    public void setTrialId(String trialId){
        this.trialId=trialId;
    }
    public String getTrialId(){
        return this.trialId;
    }
    public void setPlayTime(java.util.Date playTime){
        this.playTime=playTime;
    }
    public java.util.Date getPlayTime(){
        return this.playTime;
    }
    
    @Override
    public String toString() {
        return "[TrialPlayNumDcs = ]"+" playId =" +playId+" caseId =" +caseId+" trialState =" +trialState+" whetherValid =" +whetherValid+" playNum =" +playNum+" trialId =" +trialId+" playTime =" +playTime;
    }
}
