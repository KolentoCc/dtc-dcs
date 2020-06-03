package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.ServerConfigInfo;
import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：ServerConfigInfoService 
 * @version 1.0.0
 */
public interface ServerConfigInfoService extends BaseService {
	
	public ServerConfigInfo getServerConfigInfoByConfigId(String configId);
	
		
	public List<ServerConfigInfo> getServerConfigInfosByConfigIds(String[] configIds);
	
		
	public int getTotalServerConfigInfo(ServerConfigInfo item);
	
	public List<ServerConfigInfo> getServerConfigInfoList(ServerConfigInfo item,int offset,int limit);
	
	public int insertServerConfigInfo(ServerConfigInfo item);
	
	public int insertServerConfigInfos(List<ServerConfigInfo> items);
	
	public int updateServerConfigInfo(ServerConfigInfo item);
	
	public int deleteServerConfigInfoByConfigId(String configId);
	
	public int deleteServerConfigInfosByConfigIds(String[] configIds);
	
	public List<ServerConfigInfo> getAllServerConfigInfo();
}