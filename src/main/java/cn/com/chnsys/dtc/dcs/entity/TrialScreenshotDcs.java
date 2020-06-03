package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  TrialScreenshot
 * @version 1.0.0
 */
public class TrialScreenshotDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String pictureLocation;
    private String trialId;
    
    
    public void setPictureLocation(String pictureLocation){
        this.pictureLocation=pictureLocation;
    }
    public String getPictureLocation(){
        return this.pictureLocation;
    }
    public void setTrialId(String trialId){
        this.trialId=trialId;
    }
    public String getTrialId(){
        return this.trialId;
    }
    
    @Override
    public String toString() {
        return "[TrialScreenshot = ]"+" pictureLocation =" +pictureLocation+" trialId =" +trialId;
    }
}
