package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  LegalPersonOrganInfo
 * @version 1.0.0
 */
public class LegalPersonOrganInfoDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private Integer certificateType;
    private String serveAddress;
    private Integer organizationProperty;
    private Integer countryRegion;
    private String fax;
    private Integer representativeCertificateType;
    private Integer certificateState;
    private Integer specialIndustry;
    private String organizationalInstitutionNum;
    private String certificateNum;
    private Integer mainOfficeAddress;
    private String registerPlace;
    private String otherContactPhone;
    private String otherContactMethod;
    private String postcode;
    private String legalRepresentative;
    private String entityId;
    private Integer corporateOrganization;
    private String address;
    private String email;
    private String phoneNum;
    private String representativeCertificateNum;
    
    
    public void setCertificateType(Integer certificateType){
        this.certificateType=certificateType;
    }
    public Integer getCertificateType(){
        return this.certificateType;
    }
    public void setServeAddress(String serveAddress){
        this.serveAddress=serveAddress;
    }
    public String getServeAddress(){
        return this.serveAddress;
    }
    public void setOrganizationProperty(Integer organizationProperty){
        this.organizationProperty=organizationProperty;
    }
    public Integer getOrganizationProperty(){
        return this.organizationProperty;
    }
    public void setCountryRegion(Integer countryRegion){
        this.countryRegion=countryRegion;
    }
    public Integer getCountryRegion(){
        return this.countryRegion;
    }
    public void setFax(String fax){
        this.fax=fax;
    }
    public String getFax(){
        return this.fax;
    }
    public void setRepresentativeCertificateType(Integer representativeCertificateType){
        this.representativeCertificateType=representativeCertificateType;
    }
    public Integer getRepresentativeCertificateType(){
        return this.representativeCertificateType;
    }
    public void setCertificateState(Integer certificateState){
        this.certificateState=certificateState;
    }
    public Integer getCertificateState(){
        return this.certificateState;
    }
    public void setSpecialIndustry(Integer specialIndustry){
        this.specialIndustry=specialIndustry;
    }
    public Integer getSpecialIndustry(){
        return this.specialIndustry;
    }
    public void setOrganizationalInstitutionNum(String organizationalInstitutionNum){
        this.organizationalInstitutionNum=organizationalInstitutionNum;
    }
    public String getOrganizationalInstitutionNum(){
        return this.organizationalInstitutionNum;
    }
    public void setCertificateNum(String certificateNum){
        this.certificateNum=certificateNum;
    }
    public String getCertificateNum(){
        return this.certificateNum;
    }
    public void setMainOfficeAddress(Integer mainOfficeAddress){
        this.mainOfficeAddress=mainOfficeAddress;
    }
    public Integer getMainOfficeAddress(){
        return this.mainOfficeAddress;
    }
    public void setRegisterPlace(String registerPlace){
        this.registerPlace=registerPlace;
    }
    public String getRegisterPlace(){
        return this.registerPlace;
    }
    public void setOtherContactPhone(String otherContactPhone){
        this.otherContactPhone=otherContactPhone;
    }
    public String getOtherContactPhone(){
        return this.otherContactPhone;
    }
    public void setOtherContactMethod(String otherContactMethod){
        this.otherContactMethod=otherContactMethod;
    }
    public String getOtherContactMethod(){
        return this.otherContactMethod;
    }
    public void setPostcode(String postcode){
        this.postcode=postcode;
    }
    public String getPostcode(){
        return this.postcode;
    }
    public void setLegalRepresentative(String legalRepresentative){
        this.legalRepresentative=legalRepresentative;
    }
    public String getLegalRepresentative(){
        return this.legalRepresentative;
    }
    public void setEntityId(String entityId){
        this.entityId=entityId;
    }
    public String getEntityId(){
        return this.entityId;
    }
    public void setCorporateOrganization(Integer corporateOrganization){
        this.corporateOrganization=corporateOrganization;
    }
    public Integer getCorporateOrganization(){
        return this.corporateOrganization;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum=phoneNum;
    }
    public String getPhoneNum(){
        return this.phoneNum;
    }
    public void setRepresentativeCertificateNum(String representativeCertificateNum){
        this.representativeCertificateNum=representativeCertificateNum;
    }
    public String getRepresentativeCertificateNum(){
        return this.representativeCertificateNum;
    }
    
    @Override
    public String toString() {
        return "[LegalPersonOrganInfo = ]"+" certificateType =" +certificateType+" serveAddress =" +serveAddress+" organizationProperty =" +organizationProperty+" countryRegion =" +countryRegion+" fax =" +fax+" representativeCertificateType =" +representativeCertificateType+" certificateState =" +certificateState+" specialIndustry =" +specialIndustry+" organizationalInstitutionNum =" +organizationalInstitutionNum+" certificateNum =" +certificateNum+" mainOfficeAddress =" +mainOfficeAddress+" registerPlace =" +registerPlace+" otherContactPhone =" +otherContactPhone+" otherContactMethod =" +otherContactMethod+" postcode =" +postcode+" legalRepresentative =" +legalRepresentative+" entityId =" +entityId+" corporateOrganization =" +corporateOrganization+" address =" +address+" email =" +email+" phoneNum =" +phoneNum+" representativeCertificateNum =" +representativeCertificateNum;
    }
}
