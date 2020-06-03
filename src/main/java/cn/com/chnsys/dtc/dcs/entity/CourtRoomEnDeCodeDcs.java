package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  CourtRoomEnDeCode
 * @version 1.0.0
 */
public class CourtRoomEnDeCodeDcs extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String courtRoomId;
    private String serverId;
    
    
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return this.id;
    }
    public void setCourtRoomId(String courtRoomId){
        this.courtRoomId=courtRoomId;
    }
    public String getCourtRoomId(){
        return this.courtRoomId;
    }
    public void setServerId(String serverId){
        this.serverId=serverId;
    }
    public String getServerId(){
        return this.serverId;
    }
    
    @Override
    public String toString() {
        return "[CourtRoomEnDeCode = ]"+" id =" +id+" courtRoomId =" +courtRoomId+" serverId =" +serverId;
    }
}
