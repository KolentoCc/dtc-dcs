package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  ReceiverProtocol
 * @version 1.0.0
 */
public class ReceiverProtocol extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*
	*/
	private String senderIp;
    /**
	*
	*/
	private Long sendTime;
    /**
	*0-待处理/1-成功/2-失败
	*/
	private Integer status;
    /**
	*
	*/
	private String unitCode;
    /**
	*
	*/
	private String type;
    /**
	*
	*/
	private String uuid;
    /**
	*
	*/
	private Long completeTime;
    /**
	*
	*/
	private Long protocolId;
    /**
	*
	*/
	private String content;
    /**
	*
	*/
	private Long receiveTime;
    /**
	*POST /courtCode/100/departments
	*/
	private String uri;
    
    
    public void setSenderIp(String senderIp){
        this.senderIp=senderIp;
    }
    public String getSenderIp(){
        return this.senderIp;
    }
    public void setSendTime(Long sendTime){
        this.sendTime=sendTime;
    }
    public Long getSendTime(){
        return this.sendTime;
    }
    public void setStatus(Integer status){
        this.status=status;
    }
    public Integer getStatus(){
        return this.status;
    }
    public void setUnitCode(String unitCode){
        this.unitCode=unitCode;
    }
    public String getUnitCode(){
        return this.unitCode;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }
    public void setUuid(String uuid){
        this.uuid=uuid;
    }
    public String getUuid(){
        return this.uuid;
    }
    public void setCompleteTime(Long completeTime){
        this.completeTime=completeTime;
    }
    public Long getCompleteTime(){
        return this.completeTime;
    }
    public void setProtocolId(Long protocolId){
        this.protocolId=protocolId;
    }
    public Long getProtocolId(){
        return this.protocolId;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getContent(){
        return this.content;
    }
    public void setReceiveTime(Long receiveTime){
        this.receiveTime=receiveTime;
    }
    public Long getReceiveTime(){
        return this.receiveTime;
    }
    public void setUri(String uri){
        this.uri=uri;
    }
    public String getUri(){
        return this.uri;
    }
    
    @Override
    public String toString() {
        return "[ReceiverProtocol = ]"+" senderIp =" +senderIp+" sendTime =" +sendTime+" status =" +status+" unitCode =" +unitCode+" type =" +type+" uuid =" +uuid+" completeTime =" +completeTime+" protocolId =" +protocolId+" content =" +content+" receiveTime =" +receiveTime+" uri =" +uri;
    }
}
