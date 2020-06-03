package cn.com.chnsys.dtc.dcs.dto;
/** 
* @项目名称：dtc-dcs 
* @类名称：ProvinceLivingTrialInfoDto 
* @类描述： 
* @创建人：liyujiie
* @创建时间：2019年7月18日 上午10:21:11 
* @version 1.0.0
*/
public class ProvinceLivingTrialInfoDto {

	/////////FY_KAITXX表内字段
    /**
	*庭次
	*/
	private Integer courtOrder;
    /**
	*预计开始时间
	*/
	private java.util.Date scheduledStartTime;
    /**
	*开庭信息ID
	*/
	private String trialId;
    /**
	*法院代码
	*/
	private Integer unitCode;
    /**
	*开庭地点
	*/
	private String openCourtLocation;
	////////////////fy_anjxx表内字段
    /**
	*案件id
	*/
	private String caseId;
    /**
	*案号
	*/
	private String caseNum;
    /**
	*案件类型
	*/
	private Integer caseType;
	//////////////fy_kaitzbxx表内字段
	/**
	 * 开庭直播信息ID
	 */
	private String trialLiveId;
	/**
	 * 直播协议地址
	 */
	private String liveAddress;
	/**
	 * 画面类型
	 */
	private Integer pictureType;
	/////////////fy_anay表内字段
	/**
	*案由id
	*/
	private String caseCauseId;
    /**
	*案由名称
	*/
	private String causeName;
	////////////fy_yuastml表内字段
    /**
	*与案实体名录id
	*/
	private String participateCaseEntityListID;
    /**
	*诉讼地位名称
	*/
	private String elitigation;
    /**
	*当事人名称
	*/
	private String name;
	public Integer getCourtOrder() {
		return courtOrder;
	}
	public void setCourtOrder(Integer courtOrder) {
		this.courtOrder = courtOrder;
	}
	public java.util.Date getScheduledStartTime() {
		return scheduledStartTime;
	}
	public void setScheduledStartTime(java.util.Date scheduledStartTime) {
		this.scheduledStartTime = scheduledStartTime;
	}
	public String getTrialId() {
		return trialId;
	}
	public void setTrialId(String trialId) {
		this.trialId = trialId;
	}
	public Integer getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(Integer unitCode) {
		this.unitCode = unitCode;
	}
	public String getOpenCourtLocation() {
		return openCourtLocation;
	}
	public void setOpenCourtLocation(String openCourtLocation) {
		this.openCourtLocation = openCourtLocation;
	}
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getCaseNum() {
		return caseNum;
	}
	public void setCaseNum(String caseNum) {
		this.caseNum = caseNum;
	}
	public Integer getCaseType() {
		return caseType;
	}
	public void setCaseType(Integer caseType) {
		this.caseType = caseType;
	}
	public String getTrialLiveId() {
		return trialLiveId;
	}
	public void setTrialLiveId(String trialLiveId) {
		this.trialLiveId = trialLiveId;
	}
	public String getLiveAddress() {
		return liveAddress;
	}
	public void setLiveAddress(String liveAddress) {
		this.liveAddress = liveAddress;
	}
	public Integer getPictureType() {
		return pictureType;
	}
	public void setPictureType(Integer pictureType) {
		this.pictureType = pictureType;
	}
	public String getCaseCauseId() {
		return caseCauseId;
	}
	public void setCaseCauseId(String caseCauseId) {
		this.caseCauseId = caseCauseId;
	}
	public String getCauseName() {
		return causeName;
	}
	public void setCauseName(String causeName) {
		this.causeName = causeName;
	}
	public String getParticipateCaseEntityListID() {
		return participateCaseEntityListID;
	}
	public void setParticipateCaseEntityListID(String participateCaseEntityListID) {
		this.participateCaseEntityListID = participateCaseEntityListID;
	}
	public String getElitigation() {
		return elitigation;
	}
	public void setElitigation(String elitigation) {
		this.elitigation = elitigation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

