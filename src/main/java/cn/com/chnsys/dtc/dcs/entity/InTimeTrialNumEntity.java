package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  ScheduleDayEntity
 * @version 1.0.0
 */
public class InTimeTrialNumEntity extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*排期数量
	*/
	private Integer scheduleNum;
    /**
	*时期 YYYYMMDD
	*/
	private String time;
    /**
	*开庭状态
	*/
	private Integer courtState;
    /**
	*法院
	*/
	private String courtCode;
    /**
	*开庭方式
	*/
	private Integer courtMeans;
	/**
	 * 法院名称
	 */
    private String courtName;
    /**
     * 法院简称
     */
    private String courtShortName;
	/**
	 * 排期类型 PAIQLX
	 */
	private Integer trialType;
    
    public Integer getTrialType() {
		return trialType;
	}
	public void setTrialType(Integer trialType) {
		this.trialType = trialType;
	}
    public String getCourtName() {
		return courtName;
	}
	public String getCourtShortName() {
		return courtShortName;
	}
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
	public void setCourtShortName(String courtShortName) {
		this.courtShortName = courtShortName;
	}
	public void setScheduleNum(Integer scheduleNum){
        this.scheduleNum=scheduleNum;
    }
    public Integer getScheduleNum(){
        return this.scheduleNum;
    }
    public void setTime(String time){
        this.time=time;
    }
    public String getTime(){
        return this.time;
    }
    public void setCourtState(Integer courtState){
        this.courtState=courtState;
    }
    public Integer getCourtState(){
        return this.courtState;
    }
    public void setCourtCode(String courtCode){
        this.courtCode=courtCode;
    }
    public String getCourtCode(){
        return this.courtCode;
    }
    public void setCourtMeans(Integer courtMeans){
        this.courtMeans=courtMeans;
    }
    public Integer getCourtMeans(){
        return this.courtMeans;
    }
    
    @Override
    public String toString() {
        return "[ScheduleDayEntity = ]"+" scheduleNum =" +scheduleNum+" time =" +time+" courtState =" +courtState+" courtCode =" +courtCode+" courtMeans =" +courtMeans;
    }
}
