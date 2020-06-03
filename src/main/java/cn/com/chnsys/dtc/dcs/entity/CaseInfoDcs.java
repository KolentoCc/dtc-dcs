package cn.com.chnsys.dtc.dcs.entity;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  CaseInfoDcs
 * @version 1.0.0
 */
public class CaseInfoDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*
	*/
	private String fileCaseNatureList;
    /**
	*
	*/
	private String caseId;
    /**
	*
	*/
	private String undertakerId;
    /**
	*
	*/
	private String undertakeDeptId;
    /**
	*
	*/
	private String caseNum;
    /**
	*
	*/
	private String closedCaseNatureList;
    /**
	*
	*/
	private Integer closeManner;
    /**
	*
	*/
	private java.util.Date registerCaseDate;
    /**
	*
	*/
	private String party;
    /**
	*
	*/
	private String undertakerName;
    /**
	*
	*/
	private String undertakeDeptName;
    /**
	*
	*/
	private Integer unitCode;
    /**
	*
	*/
	private String caseDetail;
    /**
	*
	*/
	private Integer caseType;
    /**
	*
	*/
	private java.util.Date closeData;
    /**
	*
	*/
	private Integer noPublicTrialReason;
    /**
	*
	*/
	private String caseName;
    /**
	*
	*/
	private Integer tourLocalTrial;
    /**
	*
	*/
	private Integer suitableProgram;
    /**
	*
	*/
	private Integer version;
    /**
	*
	*/
	private Integer businessTypeId;
    /**
	*
	*/
	private Integer noPublicTrial;
    
	/**
	 * 法院名称
	 */
	private String unitName;
	/**
	 * 法院级别
	 */
	private Integer courtLevel;
	
	/**
	 * 案件涉及代码
	 */
	private Integer caseInvolveCode;
	
	
	/**
	 * 案件涉及名称
	 */
	private String caseInvolveName;
	/**
	 * 法院代码集合
	 */
    private List<Integer> unitCodelist;
    /**
     * solr同步标记
     */
    private Integer synchronizationSign;
 
	public List<Integer> getUnitCodelist() {
		return unitCodelist;
	}
	public void setUnitCodelist(List<Integer> unitCodelist) {
		this.unitCodelist = unitCodelist;
	}
	public Integer getCourtLevel() {
		return courtLevel;
	}
	public void setCourtLevel(Integer courtLevel) {
		this.courtLevel = courtLevel;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public void setFileCaseNatureList(String fileCaseNatureList){
        this.fileCaseNatureList=fileCaseNatureList;
    }
    public String getFileCaseNatureList(){
        return this.fileCaseNatureList;
    }
    public void setCaseId(String caseId){
        this.caseId=caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }
    public void setUndertakerId(String undertakerId){
        this.undertakerId=undertakerId;
    }
    public String getUndertakerId(){
        return this.undertakerId;
    }
    public void setUndertakeDeptId(String undertakeDeptId){
        this.undertakeDeptId=undertakeDeptId;
    }
    public String getUndertakeDeptId(){
        return this.undertakeDeptId;
    }
    public void setCaseNum(String caseNum){
        this.caseNum=caseNum;
    }
    public String getCaseNum(){
        return this.caseNum;
    }
    public void setClosedCaseNatureList(String closedCaseNatureList){
        this.closedCaseNatureList=closedCaseNatureList;
    }
    public String getClosedCaseNatureList(){
        return this.closedCaseNatureList;
    }
    public void setCloseManner(Integer closeManner){
        this.closeManner=closeManner;
    }
    public Integer getCloseManner(){
        return this.closeManner;
    }
    public void setRegisterCaseDate(java.util.Date registerCaseDate){
        this.registerCaseDate=registerCaseDate;
    }
    public java.util.Date getRegisterCaseDate(){
        return this.registerCaseDate;
    }
    public void setParty(String party){
        this.party=party;
    }
    public String getParty(){
        return this.party;
    }
    public void setUndertakerName(String undertakerName){
        this.undertakerName=undertakerName;
    }
    public String getUndertakerName(){
        return this.undertakerName;
    }
    public void setUndertakeDeptName(String undertakeDeptName){
        this.undertakeDeptName=undertakeDeptName;
    }
    public String getUndertakeDeptName(){
        return this.undertakeDeptName;
    }
    public void setUnitCode(Integer unitCode){
        this.unitCode=unitCode;
    }
    public Integer getUnitCode(){
        return this.unitCode;
    }
    public void setCaseDetail(String caseDetail){
        this.caseDetail=caseDetail;
    }
    public String getCaseDetail(){
        return this.caseDetail;
    }
    public void setCaseType(Integer caseType){
        this.caseType=caseType;
    }
    public Integer getCaseType(){
        return this.caseType;
    }
    public void setCloseData(java.util.Date closeData){
        this.closeData=closeData;
    }
    public java.util.Date getCloseData(){
        return this.closeData;
    }
    public void setNoPublicTrialReason(Integer noPublicTrialReason){
        this.noPublicTrialReason=noPublicTrialReason;
    }
    public Integer getNoPublicTrialReason(){
        return this.noPublicTrialReason;
    }
    public void setCaseName(String caseName){
        this.caseName=caseName;
    }
    public String getCaseName(){
        return this.caseName;
    }
    public void setTourLocalTrial(Integer tourLocalTrial){
        this.tourLocalTrial=tourLocalTrial;
    }
    public Integer getTourLocalTrial(){
        return this.tourLocalTrial;
    }
    public void setSuitableProgram(Integer suitableProgram){
        this.suitableProgram=suitableProgram;
    }
    public Integer getSuitableProgram(){
        return this.suitableProgram;
    }
    public void setVersion(Integer version){
        this.version=version;
    }
    public Integer getVersion(){
        return this.version;
    }
    public void setBusinessTypeId(Integer businessTypeId){
        this.businessTypeId=businessTypeId;
    }
    public Integer getBusinessTypeId(){
        return this.businessTypeId;
    }
    public void setNoPublicTrial(Integer noPublicTrial){
        this.noPublicTrial=noPublicTrial;
    }
    public Integer getNoPublicTrial(){
        return this.noPublicTrial;
    }
    
    @Override
    public String toString() {
        return "[CaseInfoDcs = ]"+" fileCaseNatureList =" +fileCaseNatureList+" caseId =" +caseId+" undertakerId =" +undertakerId+" undertakeDeptId =" +undertakeDeptId+" caseNum =" +caseNum+" closedCaseNatureList =" +closedCaseNatureList+" closeManner =" +closeManner+" registerCaseDate =" +registerCaseDate+" party =" +party+" undertakerName =" +undertakerName+" undertakeDeptName =" +undertakeDeptName+" unitCode =" +unitCode+" caseDetail =" +caseDetail+" caseType =" +caseType+" closeData =" +closeData+" noPublicTrialReason =" +noPublicTrialReason+" caseName =" +caseName+" tourLocalTrial =" +tourLocalTrial+" suitableProgram =" +suitableProgram+" version =" +version+" businessTypeId =" +businessTypeId+" noPublicTrial =" +noPublicTrial;
    }
	public Integer getCaseInvolveCode() {
		return caseInvolveCode;
	}
	public void setCaseInvolveCode(Integer caseInvolveCode) {
		this.caseInvolveCode = caseInvolveCode;
	}
	public String getCaseInvolveName() {
		return caseInvolveName;
	}
	public void setCaseInvolveName(String caseInvolveName) {
		this.caseInvolveName = caseInvolveName;
	}
	public Integer getSynchronizationSign() {
		return synchronizationSign;
	}
	public void setSynchronizationSign(Integer synchronizationSign) {
		this.synchronizationSign = synchronizationSign;
	}
	
}
