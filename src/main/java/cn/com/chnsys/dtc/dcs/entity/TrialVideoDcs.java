package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  TrialVideo
 * @version 1.0.0
 */
public class TrialVideoDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private Integer invokStyle;
    private java.util.Date startTime;
    private String fileName;
    private Integer pictureType;
    private String storageId;
    private java.util.Date endTime;
    private Integer perspective;
    private String signalName;
    private String openCourtInfoId;
    private String playBasePath;
    private Integer videoDuration;
    private Long fileSize;
    private String storageBasePath;
    private Integer protocolType;
    private String videoId;
    private Integer version;
    /**
     * 云地址 YUNURL
     */
    private String cloudUrl;
    
    public String getCloudUrl() {
		return cloudUrl;
	}
	public void setCloudUrl(String cloudUrl) {
		this.cloudUrl = cloudUrl;
	}

	/**
     *绝对路径 JUEDLJ
     */
    private String absolutePath;
    
    public String getAbsolutePath() {
		return absolutePath;
	}
	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}
	public void setInvokStyle(Integer invokStyle){
        this.invokStyle=invokStyle;
    }
    public Integer getInvokStyle(){
        return this.invokStyle;
    }
    public void setStartTime(java.util.Date startTime){
        this.startTime=startTime;
    }
    public java.util.Date getStartTime(){
        return this.startTime;
    }
    public void setFileName(String fileName){
        this.fileName=fileName;
    }
    public String getFileName(){
        return this.fileName;
    }
    public void setPictureType(Integer pictureType){
        this.pictureType=pictureType;
    }
    public Integer getPictureType(){
        return this.pictureType;
    }
    public void setStorageId(String storageId){
        this.storageId=storageId;
    }
    public String getStorageId(){
        return this.storageId;
    }
    public void setEndTime(java.util.Date endTime){
        this.endTime=endTime;
    }
    public java.util.Date getEndTime(){
        return this.endTime;
    }
    public void setPerspective(Integer perspective){
        this.perspective=perspective;
    }
    public Integer getPerspective(){
        return this.perspective;
    }
    public void setSignalName(String signalName){
        this.signalName=signalName;
    }
    public String getSignalName(){
        return this.signalName;
    }
    public void setOpenCourtInfoId(String openCourtInfoId){
        this.openCourtInfoId=openCourtInfoId;
    }
    public String getOpenCourtInfoId(){
        return this.openCourtInfoId;
    }
    public void setPlayBasePath(String playBasePath){
        this.playBasePath=playBasePath;
    }
    public String getPlayBasePath(){
        return this.playBasePath;
    }
    
    public Integer getVideoDuration() {
		return videoDuration;
	}
	public void setVideoDuration(Integer videoDuration) {
		this.videoDuration = videoDuration;
	}
	public void setFileSize(Long fileSize){
        this.fileSize=fileSize;
    }
    public Long getFileSize(){
        return this.fileSize;
    }
    public void setStorageBasePath(String storageBasePath){
        this.storageBasePath=storageBasePath;
    }
    public String getStorageBasePath(){
        return this.storageBasePath;
    }
    public void setProtocolType(Integer protocolType){
        this.protocolType=protocolType;
    }
    public Integer getProtocolType(){
        return this.protocolType;
    }
    public void setVideoId(String videoId){
        this.videoId=videoId;
    }
    public String getVideoId(){
        return this.videoId;
    }
    public void setVersion(Integer version){
        this.version=version;
    }
    public Integer getVersion(){
        return this.version;
    }
    
    @Override
    public String toString() {
        return "[TrialVideo = ]"+" invokStyle =" +invokStyle+" startTime =" +startTime+" fileName =" +fileName+" pictureType =" +pictureType+" storageId =" +storageId+" endTime =" +endTime+" perspective =" +perspective+" signalName =" +signalName+" openCourtInfoId =" +openCourtInfoId+" playBasePath =" +playBasePath+" videoDuration =" +videoDuration+" fileSize =" +fileSize+" storageBasePath =" +storageBasePath+" protocolType =" +protocolType+" videoId =" +videoId+" version =" +version;
    }
}
