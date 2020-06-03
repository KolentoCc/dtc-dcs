package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  CourtRoomConfig
 * @version 1.0.0
 */
public class CourtRoomConfigDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String deviceControlFilePath;
    private Integer remoteDefaultDeviceType;
    private Integer cdDriverNum;
    private Integer supportRemote;
    private Integer supportBurn;
    private String burnServerIP;
    private String courtRoomId;
    private Integer valid;
    private Integer deviceTesting;
    private Integer masterServerBackRecord;
    private Integer burnNote;
    private Integer cosShowPlayer;
    private Integer cosBackRecord;
    private Integer burnStyle;
    private Integer clientStreamType;
    
    
    public void setDeviceControlFilePath(String deviceControlFilePath){
        this.deviceControlFilePath=deviceControlFilePath;
    }
    public String getDeviceControlFilePath(){
        return this.deviceControlFilePath;
    }
    public void setRemoteDefaultDeviceType(Integer remoteDefaultDeviceType){
        this.remoteDefaultDeviceType=remoteDefaultDeviceType;
    }
    public Integer getRemoteDefaultDeviceType(){
        return this.remoteDefaultDeviceType;
    }
    public void setCdDriverNum(Integer cdDriverNum){
        this.cdDriverNum=cdDriverNum;
    }
    public Integer getCdDriverNum(){
        return this.cdDriverNum;
    }
    public void setSupportRemote(Integer supportRemote){
        this.supportRemote=supportRemote;
    }
    public Integer getSupportRemote(){
        return this.supportRemote;
    }
    public void setSupportBurn(Integer supportBurn){
        this.supportBurn=supportBurn;
    }
    public Integer getSupportBurn(){
        return this.supportBurn;
    }
    public void setBurnServerIP(String burnServerIP){
        this.burnServerIP=burnServerIP;
    }
    public String getBurnServerIP(){
        return this.burnServerIP;
    }
    public void setCourtRoomId(String courtRoomId){
        this.courtRoomId=courtRoomId;
    }
    public String getCourtRoomId(){
        return this.courtRoomId;
    }
    public void setValid(Integer valid){
        this.valid=valid;
    }
    public Integer getValid(){
        return this.valid;
    }
    public void setDeviceTesting(Integer deviceTesting){
        this.deviceTesting=deviceTesting;
    }
    public Integer getDeviceTesting(){
        return this.deviceTesting;
    }
    public void setMasterServerBackRecord(Integer masterServerBackRecord){
        this.masterServerBackRecord=masterServerBackRecord;
    }
    public Integer getMasterServerBackRecord(){
        return this.masterServerBackRecord;
    }
    public void setBurnNote(Integer burnNote){
        this.burnNote=burnNote;
    }
    public Integer getBurnNote(){
        return this.burnNote;
    }
    public void setCosShowPlayer(Integer cosShowPlayer){
        this.cosShowPlayer=cosShowPlayer;
    }
    public Integer getCosShowPlayer(){
        return this.cosShowPlayer;
    }
    public void setCosBackRecord(Integer cosBackRecord){
        this.cosBackRecord=cosBackRecord;
    }
    public Integer getCosBackRecord(){
        return this.cosBackRecord;
    }
    public void setBurnStyle(Integer burnStyle){
        this.burnStyle=burnStyle;
    }
    public Integer getBurnStyle(){
        return this.burnStyle;
    }
    public void setClientStreamType(Integer clientStreamType){
        this.clientStreamType=clientStreamType;
    }
    public Integer getClientStreamType(){
        return this.clientStreamType;
    }
    
    @Override
    public String toString() {
        return "[CourtRoomConfig = ]"+" deviceControlFilePath =" +deviceControlFilePath+" remoteDefaultDeviceType =" +remoteDefaultDeviceType+" cdDriverNum =" +cdDriverNum+" supportRemote =" +supportRemote+" supportBurn =" +supportBurn+" burnServerIP =" +burnServerIP+" courtRoomId =" +courtRoomId+" valid =" +valid+" deviceTesting =" +deviceTesting+" masterServerBackRecord =" +masterServerBackRecord+" burnNote =" +burnNote+" cosShowPlayer =" +cosShowPlayer+" cosBackRecord =" +cosBackRecord+" burnStyle =" +burnStyle+" clientStreamType =" +clientStreamType;
    }
}
