package cn.com.chnsys.dtc.dcs.entity;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  Trial
 * @version 1.0.0
 */
public class TrialDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*已公开视频
	*/
	private Integer publicVideo;
    /**
	*审判组织成员
	*/
	private String judicialOrganMember;
    /**
	*预计结束时间
	*/
	private java.util.Date scheduledEndTime;
    /**
	*书记员ID
	*/
	private String clerkId;
    /**
	*案件ID
	*/
	private String caseId;
    /**
	*直播状态
	*/
	private Integer liveState;
    /**
	*视频文件已归档
	*/
	private Integer videoArchived;
    /**
	*开庭场所
	*/
	private Integer courtPremises;
    /**
	*实际结束时间
	*/
	private java.util.Date actualEndTime;
    /**
	*实际开始时间
	*/
	private java.util.Date actualStartTime;
    /**
	*案号
	*/
	private String caseNum;
    /**
	*提讯室名称
	*/
	private String arraignmentRoom;
    /**
	*有效
	*/
	private Integer valid;
    /**
	*法庭标识
	*/
	private String courtRoomId;
    /**
	*不公开开庭
	*/
	private Integer notPublicOpenCourt;
    /**
	*书记员
	*/
	private String clerk;
    /**
	*开庭方式
	*/
	private Integer openCourtStyle;
    /**
	*开庭地点
	*/
	private String openCourtLocation;
    /**
	*法院代码
	*/
	private Integer unitCode;
    /**
	*庭次
	*/
	private Integer courtOrder;
    /**
	*庭审状态
	*/
	private Integer trialState;
    /**
	*预计开始时间
	*/
	private java.util.Date scheduledStartTime;
    /**
	*庭审模式
	*/
	private Integer trialModel;
    /**
	*法标版本
	*/
	private Integer version;
    /**
	*独任审判
	*/
	private Integer soleTrial;
    /**
	*开庭信息ID
	*/
	private String trialId;
    /**
	*法庭用途
	*/
	private Integer purposeOfCourt;
	
	/** 
	 * 对外点播协议
	 */
	private String thirdDemandPlayProtocol;
	
	/**
	 * 对外直播协议 
	 */
    private String thirdLivePlayProtocol;
    
    /**
     * 排期类型PAIQLX
     */
    private Integer trialType;

    /**
     * 是否互联网开庭
     */
    private Integer isInternetTrial;
    
    /**
     * 法院代码集合
     */
    private List<Integer> unitCodeList;
    /**
     * 平台厂商
     */
    private Integer platformVendor;
    /**
     * solr同步标记
     */
    private Integer synchronizationSign;
    
    
    public Integer getPlatformVendor() {
		return platformVendor;
	}
	public void setPlatformVendor(Integer platformVendor) {
		this.platformVendor = platformVendor;
	}
	public List<Integer> getUnitCodeList() {
		return unitCodeList;
	}
	public void setUnitCodeList(List<Integer> unitCodeList) {
		this.unitCodeList = unitCodeList;
	}
	public Integer getTrialType() {
		return trialType;
	}
	public void setTrialType(Integer trialType) {
		this.trialType = trialType;
	}
	public String getThirdDemandPlayProtocol() {
		return thirdDemandPlayProtocol;
	}
	public void setThirdDemandPlayProtocol(String thirdDemandPlayProtocol) {
		this.thirdDemandPlayProtocol = thirdDemandPlayProtocol;
	}
	public String getThirdLivePlayProtocol() {
		return thirdLivePlayProtocol;
	}
	public void setThirdLivePlayProtocol(String thirdLivePlayProtocol) {
		this.thirdLivePlayProtocol = thirdLivePlayProtocol;
	}
	public void setPublicVideo(Integer publicVideo){
        this.publicVideo=publicVideo;
    }
    public Integer getPublicVideo(){
        return this.publicVideo;
    }
    public void setJudicialOrganMember(String judicialOrganMember){
        this.judicialOrganMember=judicialOrganMember;
    }
    public String getJudicialOrganMember(){
        return this.judicialOrganMember;
    }
    public void setScheduledEndTime(java.util.Date scheduledEndTime){
        this.scheduledEndTime=scheduledEndTime;
    }
    public java.util.Date getScheduledEndTime(){
        return this.scheduledEndTime;
    }
    public void setClerkId(String clerkId){
        this.clerkId=clerkId;
    }
    public String getClerkId(){
        return this.clerkId;
    }
    public void setCaseId(String caseId){
        this.caseId=caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }
    public void setLiveState(Integer liveState){
        this.liveState=liveState;
    }
    public Integer getLiveState(){
        return this.liveState;
    }
    public void setVideoArchived(Integer videoArchived){
        this.videoArchived=videoArchived;
    }
    public Integer getVideoArchived(){
        return this.videoArchived;
    }
    public void setCourtPremises(Integer courtPremises){
        this.courtPremises=courtPremises;
    }
    public Integer getCourtPremises(){
        return this.courtPremises;
    }
    public void setActualEndTime(java.util.Date actualEndTime){
        this.actualEndTime=actualEndTime;
    }
    public java.util.Date getActualEndTime(){
        return this.actualEndTime;
    }
    public void setActualStartTime(java.util.Date actualStartTime){
        this.actualStartTime=actualStartTime;
    }
    public java.util.Date getActualStartTime(){
        return this.actualStartTime;
    }
    public void setCaseNum(String caseNum){
        this.caseNum=caseNum;
    }
    public String getCaseNum(){
        return this.caseNum;
    }
    public void setArraignmentRoom(String arraignmentRoom){
        this.arraignmentRoom=arraignmentRoom;
    }
    public String getArraignmentRoom(){
        return this.arraignmentRoom;
    }
    public void setValid(Integer valid){
        this.valid=valid;
    }
    public Integer getValid(){
        return this.valid;
    }
    public void setCourtRoomId(String courtRoomId){
        this.courtRoomId=courtRoomId;
    }
    public String getCourtRoomId(){
        return this.courtRoomId;
    }
    public void setNotPublicOpenCourt(Integer notPublicOpenCourt){
        this.notPublicOpenCourt=notPublicOpenCourt;
    }
    public Integer getNotPublicOpenCourt(){
        return this.notPublicOpenCourt;
    }
    public void setClerk(String clerk){
        this.clerk=clerk;
    }
    public String getClerk(){
        return this.clerk;
    }
    public void setOpenCourtStyle(Integer openCourtStyle){
        this.openCourtStyle=openCourtStyle;
    }
    public Integer getOpenCourtStyle(){
        return this.openCourtStyle;
    }
    public void setOpenCourtLocation(String openCourtLocation){
        this.openCourtLocation=openCourtLocation;
    }
    public String getOpenCourtLocation(){
        return this.openCourtLocation;
    }
    public void setUnitCode(Integer unitCode){
        this.unitCode=unitCode;
    }
    public Integer getUnitCode(){
        return this.unitCode;
    }
    public void setCourtOrder(Integer courtOrder){
        this.courtOrder=courtOrder;
    }
    public Integer getCourtOrder(){
        return this.courtOrder;
    }
    public void setTrialState(Integer trialState){
        this.trialState=trialState;
    }
    public Integer getTrialState(){
        return this.trialState;
    }
    public void setScheduledStartTime(java.util.Date scheduledStartTime){
        this.scheduledStartTime=scheduledStartTime;
    }
    public java.util.Date getScheduledStartTime(){
        return this.scheduledStartTime;
    }
    public void setTrialModel(Integer trialModel){
        this.trialModel=trialModel;
    }
    public Integer getTrialModel(){
        return this.trialModel;
    }
    public void setVersion(Integer version){
        this.version=version;
    }
    public Integer getVersion(){
        return this.version;
    }
    public void setSoleTrial(Integer soleTrial){
        this.soleTrial=soleTrial;
    }
    public Integer getSoleTrial(){
        return this.soleTrial;
    }
    public void setTrialId(String trialId){
        this.trialId=trialId;
    }
    public String getTrialId(){
        return this.trialId;
    }
    public void setPurposeOfCourt(Integer purposeOfCourt){
        this.purposeOfCourt=purposeOfCourt;
    }
    public Integer getPurposeOfCourt(){
        return this.purposeOfCourt;
    }
    
    @Override
    public String toString() {
        return "[Trial = ]"+" publicVideo =" +publicVideo+" judicialOrganMember =" +judicialOrganMember+" scheduledEndTime =" +scheduledEndTime+" clerkId =" +clerkId+" caseId =" +caseId+" liveState =" +liveState+" videoArchived =" +videoArchived+" courtPremises =" +courtPremises+" actualEndTime =" +actualEndTime+" actualStartTime =" +actualStartTime+" caseNum =" +caseNum+" arraignmentRoom =" +arraignmentRoom+" valid =" +valid+" courtRoomId =" +courtRoomId+" notPublicOpenCourt =" +notPublicOpenCourt+" clerk =" +clerk+" openCourtStyle =" +openCourtStyle+" openCourtLocation =" +openCourtLocation+" unitCode =" +unitCode+" courtOrder =" +courtOrder+" trialState =" +trialState+" scheduledStartTime =" +scheduledStartTime+" trialModel =" +trialModel+" version =" +version+" soleTrial =" +soleTrial+" trialId =" +trialId+" purposeOfCourt =" +purposeOfCourt;
    }
	public Integer getIsInternetTrial() {
		return isInternetTrial;
	}
	public void setIsInternetTrial(Integer isInternetTrial) {
		this.isInternetTrial = isInternetTrial;
	}
	public Integer getSynchronizationSign() {
		return synchronizationSign;
	}
	public void setSynchronizationSign(Integer synchronizationSign) {
		this.synchronizationSign = synchronizationSign;
	}
}
