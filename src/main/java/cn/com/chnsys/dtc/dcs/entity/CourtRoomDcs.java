package cn.com.chnsys.dtc.dcs.entity;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  CourtRoom
 * @version 1.0.0
 */
public class CourtRoomDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*
	*/
	private String splitMode;
    /**
	*
	*/
	private Integer signalType;
    /**
	*
	*/
	private String judgeIP;
    /**
	*
	*/
	private String courtRoomCode;
    /**
	*
	*/
	private String resolution;
    /**
	*
	*/
	private Integer unitCode;
    /**
	*
	*/
	private String gateWayIdentity;
    /**
	*
	*/
	private java.util.Date constructionDate;
    /**
	*
	*/
	private Integer courtRoomType;
    /**
	*
	*/
	private String masterServerIp;
    /**
	*
	*/
	private Integer firm;
    /**
	*
	*/
	private Integer courtState;
    /**
	*
	*/
	private String courtRoomId;
    /**
	*
	*/
	private Integer valid;
    /**
	*
	*/
	private String courtRoomName;
	
	
	
	/**
	 * 法庭用途 FATYT
	 */
	private Integer purposeOfCourt;
	
	
    /**
     * 获取法院代码集合
     */
	private List<Integer> unitCodeList;
    
    public List<Integer> getUnitCodeList() {
		return unitCodeList;
	}
	public void setUnitCodeList(List<Integer> unitCodeList) {
		this.unitCodeList = unitCodeList;
	}
	public Integer getPurposeOfCourt() {
		return purposeOfCourt;
	}
	public void setPurposeOfCourt(Integer purposeOfCourt) {
		this.purposeOfCourt = purposeOfCourt;
	}
	public void setSplitMode(String splitMode){
        this.splitMode=splitMode;
    }
    public String getSplitMode(){
        return this.splitMode;
    }
    public void setSignalType(Integer signalType){
        this.signalType=signalType;
    }
    public Integer getSignalType(){
        return this.signalType;
    }
    public void setJudgeIP(String judgeIP){
        this.judgeIP=judgeIP;
    }
    public String getJudgeIP(){
        return this.judgeIP;
    }
    public void setCourtRoomCode(String courtRoomCode){
        this.courtRoomCode=courtRoomCode;
    }
    public String getCourtRoomCode(){
        return this.courtRoomCode;
    }
    public void setResolution(String resolution){
        this.resolution=resolution;
    }
    public String getResolution(){
        return this.resolution;
    }
    public void setUnitCode(Integer unitCode){
        this.unitCode=unitCode;
    }
    public Integer getUnitCode(){
        return this.unitCode;
    }
    public void setGateWayIdentity(String gateWayIdentity){
        this.gateWayIdentity=gateWayIdentity;
    }
    public String getGateWayIdentity(){
        return this.gateWayIdentity;
    }
    public void setConstructionDate(java.util.Date constructionDate){
        this.constructionDate=constructionDate;
    }
    public java.util.Date getConstructionDate(){
        return this.constructionDate;
    }
    public void setCourtRoomType(Integer courtRoomType){
        this.courtRoomType=courtRoomType;
    }
    public Integer getCourtRoomType(){
        return this.courtRoomType;
    }
    public void setMasterServerIp(String masterServerIp){
        this.masterServerIp=masterServerIp;
    }
    public String getMasterServerIp(){
        return this.masterServerIp;
    }
    public void setFirm(Integer firm){
        this.firm=firm;
    }
    public Integer getFirm(){
        return this.firm;
    }
    public void setCourtState(Integer courtState){
        this.courtState=courtState;
    }
    public Integer getCourtState(){
        return this.courtState;
    }
    public void setCourtRoomId(String courtRoomId){
        this.courtRoomId=courtRoomId;
    }
    public String getCourtRoomId(){
        return this.courtRoomId;
    }
    public void setValid(Integer valid){
        this.valid=valid;
    }
    public Integer getValid(){
        return this.valid;
    }
    public void setCourtRoomName(String courtRoomName){
        this.courtRoomName=courtRoomName;
    }
    public String getCourtRoomName(){
        return this.courtRoomName;
    }
    
    @Override
    public String toString() {
        return "[CourtRoom = ]"+" splitMode =" +splitMode+" signalType =" +signalType+" judgeIP =" +judgeIP+" courtRoomCode =" +courtRoomCode+" resolution =" +resolution+" unitCode =" +unitCode+" gateWayIdentity =" +gateWayIdentity+" constructionDate =" +constructionDate+" courtRoomType =" +courtRoomType+" masterServerIp =" +masterServerIp+" firm =" +firm+" courtState =" +courtState+" courtRoomId =" +courtRoomId+" valid =" +valid+" courtRoomName =" +courtRoomName;
    }
}
