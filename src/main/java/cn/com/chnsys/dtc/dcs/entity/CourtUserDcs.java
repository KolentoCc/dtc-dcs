package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  CourtUser
 * @version 1.0.0
 */
public class CourtUserDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String loginName;
    private Integer politicStatus;
    private String userId;
    private Integer judgeLevel;
    private Integer bailiffLevel;
    private Integer formalEstablishment;
    private Integer educationLevel;
    private Integer valid;
    private String photoURL;
    private String userName;
    private String phoneNum;
    private Integer version;
    private String jobName;
    private String loginPwd;
    private Integer sex;
    private String departmentId;
    private String extension;
    private Integer maritalStatus;
    private java.util.Date birthday;
    private String email;
    private String departmentName;
    private Integer nation;
    private String identificationNum;
    private Integer unitCode;
    private String imAccount;
    
    
    public void setLoginName(String loginName){
        this.loginName=loginName;
    }
    public String getLoginName(){
        return this.loginName;
    }
    public void setPoliticStatus(Integer politicStatus){
        this.politicStatus=politicStatus;
    }
    public Integer getPoliticStatus(){
        return this.politicStatus;
    }
    public void setUserId(String userId){
        this.userId=userId;
    }
    public String getUserId(){
        return this.userId;
    }
    public void setJudgeLevel(Integer judgeLevel){
        this.judgeLevel=judgeLevel;
    }
    public Integer getJudgeLevel(){
        return this.judgeLevel;
    }
    public void setBailiffLevel(Integer bailiffLevel){
        this.bailiffLevel=bailiffLevel;
    }
    public Integer getBailiffLevel(){
        return this.bailiffLevel;
    }
    public void setFormalEstablishment(Integer formalEstablishment){
        this.formalEstablishment=formalEstablishment;
    }
    public Integer getFormalEstablishment(){
        return this.formalEstablishment;
    }
    public void setEducationLevel(Integer educationLevel){
        this.educationLevel=educationLevel;
    }
    public Integer getEducationLevel(){
        return this.educationLevel;
    }
    public void setValid(Integer valid){
        this.valid=valid;
    }
    public Integer getValid(){
        return this.valid;
    }
    public void setPhotoURL(String photoURL){
        this.photoURL=photoURL;
    }
    public String getPhotoURL(){
        return this.photoURL;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum=phoneNum;
    }
    public String getPhoneNum(){
        return this.phoneNum;
    }
    public void setVersion(Integer version){
        this.version=version;
    }
    public Integer getVersion(){
        return this.version;
    }
    public void setJobName(String jobName){
        this.jobName=jobName;
    }
    public String getJobName(){
        return this.jobName;
    }
    public void setLoginPwd(String loginPwd){
        this.loginPwd=loginPwd;
    }
    public String getLoginPwd(){
        return this.loginPwd;
    }
    public void setSex(Integer sex){
        this.sex=sex;
    }
    public Integer getSex(){
        return this.sex;
    }
    public void setDepartmentId(String departmentId){
        this.departmentId=departmentId;
    }
    public String getDepartmentId(){
        return this.departmentId;
    }
    public void setExtension(String extension){
        this.extension=extension;
    }
    public String getExtension(){
        return this.extension;
    }
    public void setMaritalStatus(Integer maritalStatus){
        this.maritalStatus=maritalStatus;
    }
    public Integer getMaritalStatus(){
        return this.maritalStatus;
    }
    public void setBirthday(java.util.Date birthday){
        this.birthday=birthday;
    }
    public java.util.Date getBirthday(){
        return this.birthday;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
    }
    public String getDepartmentName(){
        return this.departmentName;
    }
    public void setNation(Integer nation){
        this.nation=nation;
    }
    public Integer getNation(){
        return this.nation;
    }
    public void setIdentificationNum(String identificationNum){
        this.identificationNum=identificationNum;
    }
    public String getIdentificationNum(){
        return this.identificationNum;
    }
    public void setUnitCode(Integer unitCode){
        this.unitCode=unitCode;
    }
    public Integer getUnitCode(){
        return this.unitCode;
    }
    public void setImAccount(String imAccount){
        this.imAccount=imAccount;
    }
    public String getImAccount(){
        return this.imAccount;
    }
    
    @Override
    public String toString() {
        return "[CourtUser = ]"+" loginName =" +loginName+" politicStatus =" +politicStatus+" userId =" +userId+" judgeLevel =" +judgeLevel+" bailiffLevel =" +bailiffLevel+" formalEstablishment =" +formalEstablishment+" educationLevel =" +educationLevel+" valid =" +valid+" photoURL =" +photoURL+" userName =" +userName+" phoneNum =" +phoneNum+" version =" +version+" jobName =" +jobName+" loginPwd =" +loginPwd+" sex =" +sex+" departmentId =" +departmentId+" extension =" +extension+" maritalStatus =" +maritalStatus+" birthday =" +birthday+" email =" +email+" departmentName =" +departmentName+" nation =" +nation+" identificationNum =" +identificationNum+" unitCode =" +unitCode+" imAccount =" +imAccount;
    }
}
