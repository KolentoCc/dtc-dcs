package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  TrialTerm
 * @version 1.0.0
 */
public class TrialTermDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String caseId;
    private Integer overTrialTermReason;
    private Integer actualTryingDays;
    private Integer legalTrialTermDays;
    private Integer overTrialTermDays;
    private java.util.Date trialTermStartDate;
    private Integer overTrialTermMultiple;
    private java.util.Date trialTermExpiryDate;
    private Integer version;
    
    
    public void setCaseId(String caseId){
        this.caseId=caseId;
    }
    public String getCaseId(){
        return this.caseId;
    }
    public void setOverTrialTermReason(Integer overTrialTermReason){
        this.overTrialTermReason=overTrialTermReason;
    }
    public Integer getOverTrialTermReason(){
        return this.overTrialTermReason;
    }
    public void setActualTryingDays(Integer actualTryingDays){
        this.actualTryingDays=actualTryingDays;
    }
    public Integer getActualTryingDays(){
        return this.actualTryingDays;
    }
    public void setLegalTrialTermDays(Integer legalTrialTermDays){
        this.legalTrialTermDays=legalTrialTermDays;
    }
    public Integer getLegalTrialTermDays(){
        return this.legalTrialTermDays;
    }
    public void setOverTrialTermDays(Integer overTrialTermDays){
        this.overTrialTermDays=overTrialTermDays;
    }
    public Integer getOverTrialTermDays(){
        return this.overTrialTermDays;
    }
    public void setTrialTermStartDate(java.util.Date trialTermStartDate){
        this.trialTermStartDate=trialTermStartDate;
    }
    public java.util.Date getTrialTermStartDate(){
        return this.trialTermStartDate;
    }
    public void setOverTrialTermMultiple(Integer overTrialTermMultiple){
        this.overTrialTermMultiple=overTrialTermMultiple;
    }
    public Integer getOverTrialTermMultiple(){
        return this.overTrialTermMultiple;
    }
    public void setTrialTermExpiryDate(java.util.Date trialTermExpiryDate){
        this.trialTermExpiryDate=trialTermExpiryDate;
    }
    public java.util.Date getTrialTermExpiryDate(){
        return this.trialTermExpiryDate;
    }
    public void setVersion(Integer version){
        this.version=version;
    }
    public Integer getVersion(){
        return this.version;
    }
    
    @Override
    public String toString() {
        return "[TrialTerm = ]"+" caseId =" +caseId+" overTrialTermReason =" +overTrialTermReason+" actualTryingDays =" +actualTryingDays+" legalTrialTermDays =" +legalTrialTermDays+" overTrialTermDays =" +overTrialTermDays+" trialTermStartDate =" +trialTermStartDate+" overTrialTermMultiple =" +overTrialTermMultiple+" trialTermExpiryDate =" +trialTermExpiryDate+" version =" +version;
    }
}
