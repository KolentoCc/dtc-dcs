package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  CourtRoomBackImage
 * @version 1.0.0
 */
public class CourtRoomBackImageDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private Integer displaySetting;
    private String pictureLocation;
    private java.util.Date pictureUpdateTime;
    private String courtRoomId;
    
    
    public void setDisplaySetting(Integer displaySetting){
        this.displaySetting=displaySetting;
    }
    public Integer getDisplaySetting(){
        return this.displaySetting;
    }
    public void setPictureLocation(String pictureLocation){
        this.pictureLocation=pictureLocation;
    }
    public String getPictureLocation(){
        return this.pictureLocation;
    }
    public void setPictureUpdateTime(java.util.Date pictureUpdateTime){
        this.pictureUpdateTime=pictureUpdateTime;
    }
    public java.util.Date getPictureUpdateTime(){
        return this.pictureUpdateTime;
    }
    public void setCourtRoomId(String courtRoomId){
        this.courtRoomId=courtRoomId;
    }
    public String getCourtRoomId(){
        return this.courtRoomId;
    }
    
    @Override
    public String toString() {
        return "[CourtRoomBackImage = ]"+" displaySetting =" +displaySetting+" pictureLocation =" +pictureLocation+" pictureUpdateTime =" +pictureUpdateTime+" courtRoomId =" +courtRoomId;
    }
}
