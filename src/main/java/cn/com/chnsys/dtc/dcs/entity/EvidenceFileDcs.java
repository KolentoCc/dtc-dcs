package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  EvidenceFile
 * @version 1.0.0
 */
public class EvidenceFileDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String evidenceFileId;
    private String fileName;
    private Integer fileType;
    private Integer fileSource;
    private String description;
    private String contentAbstract;
    private Long fileSize;
    private String evidenceInfoId;
    private Integer isTemporaryUpload;
    private String storageName;
    
    
    public void setEvidenceFileId(String evidenceFileId){
        this.evidenceFileId=evidenceFileId;
    }
    public String getEvidenceFileId(){
        return this.evidenceFileId;
    }
    public void setFileName(String fileName){
        this.fileName=fileName;
    }
    public String getFileName(){
        return this.fileName;
    }
    public void setFileType(Integer fileType){
        this.fileType=fileType;
    }
    public Integer getFileType(){
        return this.fileType;
    }
    public void setFileSource(Integer fileSource){
        this.fileSource=fileSource;
    }
    public Integer getFileSource(){
        return this.fileSource;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setContentAbstract(String contentAbstract){
        this.contentAbstract=contentAbstract;
    }
    public String getContentAbstract(){
        return this.contentAbstract;
    }
    public void setFileSize(Long fileSize){
        this.fileSize=fileSize;
    }
    public Long getFileSize(){
        return this.fileSize;
    }
    public void setEvidenceInfoId(String evidenceInfoId){
        this.evidenceInfoId=evidenceInfoId;
    }
    public String getEvidenceInfoId(){
        return this.evidenceInfoId;
    }
    public void setIsTemporaryUpload(Integer isTemporaryUpload){
        this.isTemporaryUpload=isTemporaryUpload;
    }
    public Integer getIsTemporaryUpload(){
        return this.isTemporaryUpload;
    }
    public void setStorageName(String storageName){
        this.storageName=storageName;
    }
    public String getStorageName(){
        return this.storageName;
    }
    
    @Override
    public String toString() {
        return "[EvidenceFile = ]"+" evidenceFileId =" +evidenceFileId+" fileName =" +fileName+" fileType =" +fileType+" fileSource =" +fileSource+" description =" +description+" contentAbstract =" +contentAbstract+" fileSize =" +fileSize+" evidenceInfoId =" +evidenceInfoId+" isTemporaryUpload =" +isTemporaryUpload+" storageName =" +storageName;
    }
}
