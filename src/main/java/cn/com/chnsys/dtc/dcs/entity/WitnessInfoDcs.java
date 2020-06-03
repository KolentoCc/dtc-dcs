package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  WitnessInfo
 * @version 1.0.0
 */
public class WitnessInfoDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*
	*/
	private String caseId;
    /**
	*
	*/
	private Integer protectedState;
    /**
	*
	*/
	private String entityId;
    /**
	*
	*/
	private String evidenceContentId;
    /**
	*
	*/
	private Integer witnessNum;
    
    
    public void setCaseId(String caseId){
        this.caseId=caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }
    public void setProtectedState(Integer protectedState){
        this.protectedState=protectedState;
    }
    public Integer getProtectedState(){
        return this.protectedState;
    }
    public void setEntityId(String entityId){
        this.entityId=entityId;
    }
    public String getEntityId(){
        return this.entityId;
    }
    public void setEvidenceContentId(String evidenceContentId){
        this.evidenceContentId=evidenceContentId;
    }
    public String getEvidenceContentId(){
        return this.evidenceContentId;
    }
    public void setWitnessNum(Integer witnessNum){
        this.witnessNum=witnessNum;
    }
    public Integer getWitnessNum(){
        return this.witnessNum;
    }
    
    @Override
    public String toString() {
        return "[WitnessInfo = ]"+" caseId =" +caseId+" protectedState =" +protectedState+" entityId =" +entityId+" evidenceContentId =" +evidenceContentId+" witnessNum =" +witnessNum;
    }
}
