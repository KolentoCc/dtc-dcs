package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  DemondLog
 * @version 1.0.0
 */
public class DemondLogDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String caseId;
    private Integer playWay;
    private String openCourtInfoId;
    private String playUserId;
    private String playUserName;
    private String clientIP;
    private String logId;
    private String caseNum;
    private java.util.Date playEndTime;
    private java.util.Date playStartTime;
    
    
    public void setCaseId(String caseId){
        this.caseId=caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }
    public void setPlayWay(Integer playWay){
        this.playWay=playWay;
    }
    public Integer getPlayWay(){
        return this.playWay;
    }
    public void setOpenCourtInfoId(String openCourtInfoId){
        this.openCourtInfoId=openCourtInfoId;
    }
    public String getOpenCourtInfoId(){
        return this.openCourtInfoId;
    }
    public void setPlayUserId(String playUserId){
        this.playUserId=playUserId;
    }
    public String getPlayUserId(){
        return this.playUserId;
    }
    public void setPlayUserName(String playUserName){
        this.playUserName=playUserName;
    }
    public String getPlayUserName(){
        return this.playUserName;
    }
    public void setClientIP(String clientIP){
        this.clientIP=clientIP;
    }
    public String getClientIP(){
        return this.clientIP;
    }
    public void setLogId(String logId){
        this.logId=logId;
    }
    public String getLogId(){
        return this.logId;
    }
    public void setCaseNum(String caseNum){
        this.caseNum=caseNum;
    }
    public String getCaseNum(){
        return this.caseNum;
    }
    public void setPlayEndTime(java.util.Date playEndTime){
        this.playEndTime=playEndTime;
    }
    public java.util.Date getPlayEndTime(){
        return this.playEndTime;
    }
    public void setPlayStartTime(java.util.Date playStartTime){
        this.playStartTime=playStartTime;
    }
    public java.util.Date getPlayStartTime(){
        return this.playStartTime;
    }
    
    @Override
    public String toString() {
        return "[DemondLog = ]"+" caseId =" +caseId+" playWay =" +playWay+" openCourtInfoId =" +openCourtInfoId+" playUserId =" +playUserId+" playUserName =" +playUserName+" clientIP =" +clientIP+" logId =" +logId+" caseNum =" +caseNum+" playEndTime =" +playEndTime+" playStartTime =" +playStartTime;
    }
}
