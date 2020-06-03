package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  CourtRoomLiveConfig
 * @version 1.0.0
 */
public class CourtRoomLiveConfigDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String otherLiveUrl;
    private String courtRoomId;
    private String clientLiveChannName;
    private Integer valid;
    private String otherLiveChannName;
    private String webLiveChannName;
    private String openOtherLive;
    
    
    public void setOtherLiveUrl(String otherLiveUrl){
        this.otherLiveUrl=otherLiveUrl;
    }
    public String getOtherLiveUrl(){
        return this.otherLiveUrl;
    }
    public void setCourtRoomId(String courtRoomId){
        this.courtRoomId=courtRoomId;
    }
    public String getCourtRoomId(){
        return this.courtRoomId;
    }
    public void setClientLiveChannName(String clientLiveChannName){
        this.clientLiveChannName=clientLiveChannName;
    }
    public String getClientLiveChannName(){
        return this.clientLiveChannName;
    }
    public void setValid(Integer valid){
        this.valid=valid;
    }
    public Integer getValid(){
        return this.valid;
    }
    public void setOtherLiveChannName(String otherLiveChannName){
        this.otherLiveChannName=otherLiveChannName;
    }
    public String getOtherLiveChannName(){
        return this.otherLiveChannName;
    }
    public void setWebLiveChannName(String webLiveChannName){
        this.webLiveChannName=webLiveChannName;
    }
    public String getWebLiveChannName(){
        return this.webLiveChannName;
    }
    public void setOpenOtherLive(String openOtherLive){
        this.openOtherLive=openOtherLive;
    }
    public String getOpenOtherLive(){
        return this.openOtherLive;
    }
    
    @Override
    public String toString() {
        return "[CourtRoomLiveConfig = ]"+" otherLiveUrl =" +otherLiveUrl+" courtRoomId =" +courtRoomId+" clientLiveChannName =" +clientLiveChannName+" valid =" +valid+" otherLiveChannName =" +otherLiveChannName+" webLiveChannName =" +webLiveChannName+" openOtherLive =" +openOtherLive;
    }
}
