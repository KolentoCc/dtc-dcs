package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  TrialBurnConfig
 * @version 1.0.0
 */
public class TrialBurnConfigDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private Integer valid;
    private String courtRoomId;
    private String storageId;
    
    
    public void setValid(Integer valid){
        this.valid=valid;
    }
    public Integer getValid(){
        return this.valid;
    }
    public void setCourtRoomId(String courtRoomId){
        this.courtRoomId=courtRoomId;
    }
    public String getCourtRoomId(){
        return this.courtRoomId;
    }
    public void setStorageId(String storageId){
        this.storageId=storageId;
    }
    public String getStorageId(){
        return this.storageId;
    }
    
    @Override
    public String toString() {
        return "[TrialBurnConfig = ]"+" valid =" +valid+" courtRoomId =" +courtRoomId+" storageId =" +storageId;
    }
}
