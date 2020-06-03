package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  EvidenceInfoDcs
 * @version 1.0.0
 */
public class EvidenceInfoDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*
	*/
	private String evidenceName;
    /**
	*
	*/
	private Integer notAttestedReason;
    /**
	*
	*/
	private java.util.Date proofDate;
    /**
	*
	*/
	private Integer attestationResult;
    /**
	*
	*/
	private String getProofPersonName;
    /**
	*
	*/
	private String caseId;
    /**
	*
	*/
	private String evidenceFact;
    /**
	*
	*/
	private Integer evidenceType;
    /**
	*
	*/
	private Integer evidenceNum;
    /**
	*
	*/
	private String proofPurpose;
    /**
	*
	*/
	private Integer attestReason;
    /**
	*
	*/
	private String proofPersonName;
    /**
	*
	*/
	private String obtainEvidenceSite;
    /**
	*
	*/
	private String evidenceId;
    /**
	*
	*/
	private Integer entrustAppraisal;
    /**
	*
	*/
	private String proofPersonId;
    /**
	*
	*/
	private java.util.Date transferDate;
    /**
	*
	*/
	private Integer questionWitnessCourtNum;
    /**
	*
	*/
	private Integer originalEvidence;
    /**
	*
	*/
	private Integer obtainEvidenceChannel;
    /**
	*
	*/
	private Integer courtStdVersion;
    /**
	*
	*/
	private Integer attestedInCourt;
    /**
	*
	*/
	private String getProofPersonID;
    /**
	*
	*/
	private java.util.Date obtainEvidenceTime;
    
    
    public void setEvidenceName(String evidenceName){
        this.evidenceName=evidenceName;
    }
    public String getEvidenceName(){
        return this.evidenceName;
    }
    public void setNotAttestedReason(Integer notAttestedReason){
        this.notAttestedReason=notAttestedReason;
    }
    public Integer getNotAttestedReason(){
        return this.notAttestedReason;
    }
    public void setProofDate(java.util.Date proofDate){
        this.proofDate=proofDate;
    }
    public java.util.Date getProofDate(){
        return this.proofDate;
    }
    public void setAttestationResult(Integer attestationResult){
        this.attestationResult=attestationResult;
    }
    public Integer getAttestationResult(){
        return this.attestationResult;
    }
    public void setGetProofPersonName(String getProofPersonName){
        this.getProofPersonName=getProofPersonName;
    }
    public String getGetProofPersonName(){
        return this.getProofPersonName;
    }
    public void setCaseId(String caseId){
        this.caseId=caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }
    public void setEvidenceFact(String evidenceFact){
        this.evidenceFact=evidenceFact;
    }
    public String getEvidenceFact(){
        return this.evidenceFact;
    }
    public void setEvidenceType(Integer evidenceType){
        this.evidenceType=evidenceType;
    }
    public Integer getEvidenceType(){
        return this.evidenceType;
    }
    public void setEvidenceNum(Integer evidenceNum){
        this.evidenceNum=evidenceNum;
    }
    public Integer getEvidenceNum(){
        return this.evidenceNum;
    }
    public void setProofPurpose(String proofPurpose){
        this.proofPurpose=proofPurpose;
    }
    public String getProofPurpose(){
        return this.proofPurpose;
    }
    public void setAttestReason(Integer attestReason){
        this.attestReason=attestReason;
    }
    public Integer getAttestReason(){
        return this.attestReason;
    }
    public void setProofPersonName(String proofPersonName){
        this.proofPersonName=proofPersonName;
    }
    public String getProofPersonName(){
        return this.proofPersonName;
    }
    public void setObtainEvidenceSite(String obtainEvidenceSite){
        this.obtainEvidenceSite=obtainEvidenceSite;
    }
    public String getObtainEvidenceSite(){
        return this.obtainEvidenceSite;
    }
    public void setEvidenceId(String evidenceId){
        this.evidenceId=evidenceId;
    }
    public String getEvidenceId(){
        return this.evidenceId;
    }
    public void setEntrustAppraisal(Integer entrustAppraisal){
        this.entrustAppraisal=entrustAppraisal;
    }
    public Integer getEntrustAppraisal(){
        return this.entrustAppraisal;
    }
    public void setProofPersonId(String proofPersonId){
        this.proofPersonId=proofPersonId;
    }
    public String getProofPersonId(){
        return this.proofPersonId;
    }
    public void setTransferDate(java.util.Date transferDate){
        this.transferDate=transferDate;
    }
    public java.util.Date getTransferDate(){
        return this.transferDate;
    }
    public void setQuestionWitnessCourtNum(Integer questionWitnessCourtNum){
        this.questionWitnessCourtNum=questionWitnessCourtNum;
    }
    public Integer getQuestionWitnessCourtNum(){
        return this.questionWitnessCourtNum;
    }
    public void setOriginalEvidence(Integer originalEvidence){
        this.originalEvidence=originalEvidence;
    }
    public Integer getOriginalEvidence(){
        return this.originalEvidence;
    }
    public void setObtainEvidenceChannel(Integer obtainEvidenceChannel){
        this.obtainEvidenceChannel=obtainEvidenceChannel;
    }
    public Integer getObtainEvidenceChannel(){
        return this.obtainEvidenceChannel;
    }
    public void setCourtStdVersion(Integer courtStdVersion){
        this.courtStdVersion=courtStdVersion;
    }
    public Integer getCourtStdVersion(){
        return this.courtStdVersion;
    }
    public void setAttestedInCourt(Integer attestedInCourt){
        this.attestedInCourt=attestedInCourt;
    }
    public Integer getAttestedInCourt(){
        return this.attestedInCourt;
    }
    public void setGetProofPersonID(String getProofPersonID){
        this.getProofPersonID=getProofPersonID;
    }
    public String getGetProofPersonID(){
        return this.getProofPersonID;
    }
    public void setObtainEvidenceTime(java.util.Date obtainEvidenceTime){
        this.obtainEvidenceTime=obtainEvidenceTime;
    }
    public java.util.Date getObtainEvidenceTime(){
        return this.obtainEvidenceTime;
    }
    
    @Override
    public String toString() {
        return "[EvidenceInfoDcs = ]"+" evidenceName =" +evidenceName+" notAttestedReason =" +notAttestedReason+" proofDate =" +proofDate+" attestationResult =" +attestationResult+" getProofPersonName =" +getProofPersonName+" caseId =" +caseId+" evidenceFact =" +evidenceFact+" evidenceType =" +evidenceType+" evidenceNum =" +evidenceNum+" proofPurpose =" +proofPurpose+" attestReason =" +attestReason+" proofPersonName =" +proofPersonName+" obtainEvidenceSite =" +obtainEvidenceSite+" evidenceId =" +evidenceId+" entrustAppraisal =" +entrustAppraisal+" proofPersonId =" +proofPersonId+" transferDate =" +transferDate+" questionWitnessCourtNum =" +questionWitnessCourtNum+" originalEvidence =" +originalEvidence+" obtainEvidenceChannel =" +obtainEvidenceChannel+" courtStdVersion =" +courtStdVersion+" attestedInCourt =" +attestedInCourt+" getProofPersonID =" +getProofPersonID+" obtainEvidenceTime =" +obtainEvidenceTime;
    }
}
