package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  ParticipateCaseEntityListDcs
 * @version 1.0.0
 */
public class ParticipateCaseEntityListDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*
	*/
	private Integer partyType;
    /**
	*
	*/
	private String participateCaseEntityListID;
    /**
	*
	*/
	private String societyUnificationCreditCode;
    /**
	*
	*/
	private String elitigation;
    /**
	*
	*/
	private String caseId;
    /**
	*
	*/
	private Integer courtStdVersion;
    /**
	*
	*/
	private Integer num;
    /**
	*
	*/
	private String name;
    /**
	*
	*/
	private String entityId;
    /**
	*
	*/
	private Integer litigationParticipantType;
    
	/**
	 * 序号 20190705增加
	 */
	private Integer sortOrder;
    
    public void setPartyType(Integer partyType){
        this.partyType=partyType;
    }
    public Integer getPartyType(){
        return this.partyType;
    }
    public void setParticipateCaseEntityListID(String participateCaseEntityListID){
        this.participateCaseEntityListID=participateCaseEntityListID;
    }
    public String getParticipateCaseEntityListID(){
        return this.participateCaseEntityListID;
    }
    public void setSocietyUnificationCreditCode(String societyUnificationCreditCode){
        this.societyUnificationCreditCode=societyUnificationCreditCode;
    }
    public String getSocietyUnificationCreditCode(){
        return this.societyUnificationCreditCode;
    }
    public void setElitigation(String elitigation){
        this.elitigation=elitigation;
    }
    public String getElitigation(){
        return this.elitigation;
    }
    public void setCaseId(String caseId){
        this.caseId=caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }
    public void setCourtStdVersion(Integer courtStdVersion){
        this.courtStdVersion=courtStdVersion;
    }
    public Integer getCourtStdVersion(){
        return this.courtStdVersion;
    }
    public void setNum(Integer num){
        this.num=num;
    }
    public Integer getNum(){
        return this.num;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setEntityId(String entityId){
        this.entityId=entityId;
    }
    public String getEntityId(){
        return this.entityId;
    }
    public void setLitigationParticipantType(Integer litigationParticipantType){
        this.litigationParticipantType=litigationParticipantType;
    }
    public Integer getLitigationParticipantType(){
        return this.litigationParticipantType;
    }
    
    @Override
    public String toString() {
        return "[ParticipateCaseEntityListDcs = ]"+" partyType =" +partyType+" participateCaseEntityListID =" +participateCaseEntityListID+" societyUnificationCreditCode =" +societyUnificationCreditCode+" elitigation =" +elitigation+" caseId =" +caseId+" courtStdVersion =" +courtStdVersion+" num =" +num+" name =" +name+" entityId =" +entityId+" litigationParticipantType =" +litigationParticipantType;
    }
	public Integer getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
}
