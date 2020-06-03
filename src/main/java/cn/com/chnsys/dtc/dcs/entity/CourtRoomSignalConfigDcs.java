package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  CourtRoomSignalConfig
 * @version 1.0.0
 */
public class CourtRoomSignalConfigDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private Integer subtitleContentLocation;
    private Integer subtitleContentDisplayTime;
    private Integer pictureType;
    private String courtRoomId;
    private String channelId;
    private String customCaption;
    private Integer perspective;
    private Integer valid;
    private Integer timeSubtitleColor;
    private String subtitleContent;
    private String signalName;
    private Integer subtitleContentColor;
    private Integer timeSubtitleDisplayPeriod;
    private Integer isRecord;
    private Integer showTimeSubtitle;
    private Integer timeSubtitleLocation;
    
    
    public void setSubtitleContentLocation(Integer subtitleContentLocation){
        this.subtitleContentLocation=subtitleContentLocation;
    }
    public Integer getSubtitleContentLocation(){
        return this.subtitleContentLocation;
    }
    public void setSubtitleContentDisplayTime(Integer subtitleContentDisplayTime){
        this.subtitleContentDisplayTime=subtitleContentDisplayTime;
    }
    public Integer getSubtitleContentDisplayTime(){
        return this.subtitleContentDisplayTime;
    }
    public void setPictureType(Integer pictureType){
        this.pictureType=pictureType;
    }
    public Integer getPictureType(){
        return this.pictureType;
    }
    public void setCourtRoomId(String courtRoomId){
        this.courtRoomId=courtRoomId;
    }
    public String getCourtRoomId(){
        return this.courtRoomId;
    }
    public void setChannelId(String channelId){
        this.channelId=channelId;
    }
    public String getChannelId(){
        return this.channelId;
    }
    public void setCustomCaption(String customCaption){
        this.customCaption=customCaption;
    }
    public String getCustomCaption(){
        return this.customCaption;
    }
    public void setPerspective(Integer perspective){
        this.perspective=perspective;
    }
    public Integer getPerspective(){
        return this.perspective;
    }
    public void setValid(Integer valid){
        this.valid=valid;
    }
    public Integer getValid(){
        return this.valid;
    }
    public void setTimeSubtitleColor(Integer timeSubtitleColor){
        this.timeSubtitleColor=timeSubtitleColor;
    }
    public Integer getTimeSubtitleColor(){
        return this.timeSubtitleColor;
    }
    public void setSubtitleContent(String subtitleContent){
        this.subtitleContent=subtitleContent;
    }
    public String getSubtitleContent(){
        return this.subtitleContent;
    }
    public void setSignalName(String signalName){
        this.signalName=signalName;
    }
    public String getSignalName(){
        return this.signalName;
    }
    public void setSubtitleContentColor(Integer subtitleContentColor){
        this.subtitleContentColor=subtitleContentColor;
    }
    public Integer getSubtitleContentColor(){
        return this.subtitleContentColor;
    }
    public void setTimeSubtitleDisplayPeriod(Integer timeSubtitleDisplayPeriod){
        this.timeSubtitleDisplayPeriod=timeSubtitleDisplayPeriod;
    }
    public Integer getTimeSubtitleDisplayPeriod(){
        return this.timeSubtitleDisplayPeriod;
    }
    public void setIsRecord(Integer isRecord){
        this.isRecord=isRecord;
    }
    public Integer getIsRecord(){
        return this.isRecord;
    }
    public void setShowTimeSubtitle(Integer showTimeSubtitle){
        this.showTimeSubtitle=showTimeSubtitle;
    }
    public Integer getShowTimeSubtitle(){
        return this.showTimeSubtitle;
    }
    public void setTimeSubtitleLocation(Integer timeSubtitleLocation){
        this.timeSubtitleLocation=timeSubtitleLocation;
    }
    public Integer getTimeSubtitleLocation(){
        return this.timeSubtitleLocation;
    }
    
    @Override
    public String toString() {
        return "[CourtRoomSignalConfig = ]"+" subtitleContentLocation =" +subtitleContentLocation+" subtitleContentDisplayTime =" +subtitleContentDisplayTime+" pictureType =" +pictureType+" courtRoomId =" +courtRoomId+" channelId =" +channelId+" customCaption =" +customCaption+" perspective =" +perspective+" valid =" +valid+" timeSubtitleColor =" +timeSubtitleColor+" subtitleContent =" +subtitleContent+" signalName =" +signalName+" subtitleContentColor =" +subtitleContentColor+" timeSubtitleDisplayPeriod =" +timeSubtitleDisplayPeriod+" isRecord =" +isRecord+" showTimeSubtitle =" +showTimeSubtitle+" timeSubtitleLocation =" +timeSubtitleLocation;
    }
}
