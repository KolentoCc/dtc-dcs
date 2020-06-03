package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  TrialTranscriptFileDcs
 * @version 1.0.0
 */
public class TrialTranscriptFileDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*
	*/
	private java.util.Date dataDeleteTimestamp;
    /**
	*
	*/
	private String storageBasePath;
    /**
	*
	*/
	private Long timestamp;
    /**
	*
	*/
	private String interfaceId;
    /**
	*
	*/
	private Integer deleteTag;
    /**
	*
	*/
	private String storagePathId;
    /**
	*
	*/
	private String trialId;
    /**
	*
	*/
	private Integer version;
    /**
	*
	*/
	private java.util.Date dataCreateTimestamp;
    /**
	*文件大小（单位：KB）
	*/
	private Long fileSize;
    /**
	*
	*/
	private String fileName;
    /**
	*笔录格式，0-TEXT/1-XML/2-HTML/3-WORD/4-EXCEL
	*/
	private Integer format;
    
    
    public void setDataDeleteTimestamp(java.util.Date dataDeleteTimestamp){
        this.dataDeleteTimestamp=dataDeleteTimestamp;
    }
    public java.util.Date getDataDeleteTimestamp(){
        return this.dataDeleteTimestamp;
    }
    public void setStorageBasePath(String storageBasePath){
        this.storageBasePath=storageBasePath;
    }
    public String getStorageBasePath(){
        return this.storageBasePath;
    }
    public void setTimestamp(Long timestamp){
        this.timestamp=timestamp;
    }
    public Long getTimestamp(){
        return this.timestamp;
    }
    public void setInterfaceId(String interfaceId){
        this.interfaceId=interfaceId;
    }
    public String getInterfaceId(){
        return this.interfaceId;
    }
    public void setDeleteTag(Integer deleteTag){
        this.deleteTag=deleteTag;
    }
    public Integer getDeleteTag(){
        return this.deleteTag;
    }
    public void setStoragePathId(String storagePathId){
        this.storagePathId=storagePathId;
    }
    public String getStoragePathId(){
        return this.storagePathId;
    }
    public void setTrialId(String trialId){
        this.trialId=trialId;
    }
    public String getTrialId(){
        return this.trialId;
    }
    public void setVersion(Integer version){
        this.version=version;
    }
    public Integer getVersion(){
        return this.version;
    }
    public void setDataCreateTimestamp(java.util.Date dataCreateTimestamp){
        this.dataCreateTimestamp=dataCreateTimestamp;
    }
    public java.util.Date getDataCreateTimestamp(){
        return this.dataCreateTimestamp;
    }
    public void setFileSize(Long fileSize){
        this.fileSize=fileSize;
    }
    public Long getFileSize(){
        return this.fileSize;
    }
    public void setFileName(String fileName){
        this.fileName=fileName;
    }
    public String getFileName(){
        return this.fileName;
    }
    public void setFormat(Integer format){
        this.format=format;
    }
    public Integer getFormat(){
        return this.format;
    }
    
    @Override
    public String toString() {
        return "[TrialTranscriptFileDcs = ]"+" dataDeleteTimestamp =" +dataDeleteTimestamp+" storageBasePath =" +storageBasePath+" timestamp =" +timestamp+" interfaceId =" +interfaceId+" deleteTag =" +deleteTag+" storagePathId =" +storagePathId+" trialId =" +trialId+" version =" +version+" dataCreateTimestamp =" +dataCreateTimestamp+" fileSize =" +fileSize+" fileName =" +fileName+" format =" +format;
    }
}
