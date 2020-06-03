package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  CaseCause
 * @version 1.0.0
 */
public class CaseCauseDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*
	*/
	private String causeName;
    /**
	*
	*/
	private String caseId;
    /**
	*
	*/
	private String caseCauseId;
    /**
	*
	*/
	private Integer causeCode;
    /**
	*
	*/
	private Integer causeType;
    
    
    public void setCauseName(String causeName){
        this.causeName=causeName;
    }
    public String getCauseName(){
        return this.causeName;
    }
    public void setCaseId(String caseId){
        this.caseId=caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }
    public void setCaseCauseId(String caseCauseId){
        this.caseCauseId=caseCauseId;
    }
    public String getCaseCauseId(){
        return this.caseCauseId;
    }
    public void setCauseCode(Integer causeCode){
        this.causeCode=causeCode;
    }
    public Integer getCauseCode(){
        return this.causeCode;
    }
    public void setCauseType(Integer causeType){
        this.causeType=causeType;
    }
    public Integer getCauseType(){
        return this.causeType;
    }
    
    @Override
    public String toString() {
        return "[CaseCause = ]"+" causeName =" +causeName+" caseId =" +caseId+" caseCauseId =" +caseCauseId+" causeCode =" +causeCode+" causeType =" +causeType;
    }
}
