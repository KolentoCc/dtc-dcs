package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/** 
 * @项目名称：chnsys-dtc
 * @类名称：  ServerConfigInfo
 * @version 1.0.0
 */
public class ServerConfigInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;
    
    /**
	*配置ID
	*/
	private String configId;
    /**
	*单位ID
	*/
	private String unitId;
    /**
	*服务器IP
	*/
	private String serverIp;
    /**
	*服务器端口
	*/
	private Integer serverPort;
    /**
	*显示顺序
	*/
	private Integer sortOrder;
    /**
	*服务器类型
	*/
	private Integer serverType;
    
    
    public void setConfigId(String configId){
        this.configId=configId;
    }
    public String getConfigId(){
        return this.configId;
    }
    public void setUnitId(String unitId){
        this.unitId=unitId;
    }
    public String getUnitId(){
        return this.unitId;
    }
    public void setServerIp(String serverIp){
        this.serverIp=serverIp;
    }
    public String getServerIp(){
        return this.serverIp;
    }
    public void setServerPort(Integer serverPort){
        this.serverPort=serverPort;
    }
    public Integer getServerPort(){
        return this.serverPort;
    }
    public void setSortOrder(Integer sortOrder){
        this.sortOrder=sortOrder;
    }
    public Integer getSortOrder(){
        return this.sortOrder;
    }
    public void setServerType(Integer serverType){
        this.serverType=serverType;
    }
    public Integer getServerType(){
        return this.serverType;
    }
    
    @Override
    public String toString() {
        return "[ServerConfigInfo = ]"+" configId =" +configId+" unitId =" +unitId+" serverIp =" +serverIp+" serverPort =" +serverPort+" sortOrder =" +sortOrder+" serverType =" +serverType;
    }
}
