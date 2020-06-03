package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  DeviceAlarm
 * @version 1.0.0
 */
public class DeviceAlarmDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private java.util.Date alarmDt;
    private String serverId;
    private String monitorItem;
    private String deviceId;
    private String despription;
    private Integer unitCode;
    private Integer courtStdVersion;
    
    
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return this.id;
    }
    public void setAlarmDt(java.util.Date alarmDt){
        this.alarmDt=alarmDt;
    }
    public java.util.Date getAlarmDt(){
        return this.alarmDt;
    }
    public void setServerId(String serverId){
        this.serverId=serverId;
    }
    public String getServerId(){
        return this.serverId;
    }
    public void setMonitorItem(String monitorItem){
        this.monitorItem=monitorItem;
    }
    public String getMonitorItem(){
        return this.monitorItem;
    }
    public void setDeviceId(String deviceId){
        this.deviceId=deviceId;
    }
    public String getDeviceId(){
        return this.deviceId;
    }
    public void setDespription(String despription){
        this.despription=despription;
    }
    public String getDespription(){
        return this.despription;
    }
    public void setUnitCode(Integer unitCode){
        this.unitCode=unitCode;
    }
    public Integer getUnitCode(){
        return this.unitCode;
    }
    public void setCourtStdVersion(Integer courtStdVersion){
        this.courtStdVersion=courtStdVersion;
    }
    public Integer getCourtStdVersion(){
        return this.courtStdVersion;
    }
    
    @Override
    public String toString() {
        return "[DeviceAlarm = ]"+" id =" +id+" alarmDt =" +alarmDt+" serverId =" +serverId+" monitorItem =" +monitorItem+" deviceId =" +deviceId+" despription =" +despription+" unitCode =" +unitCode+" courtStdVersion =" +courtStdVersion;
    }
}
