package cn.com.chnsys.dtc.dcs.dao;
import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.dcs.entity.ServerConfigInfo;
/** 
 * @项目名称：chnsys-dtc 
 * @类名称：ServerConfigInfoDao 
 * @version 1.0.0
 */
public interface ServerConfigInfoDao extends BaseDao<ServerConfigInfo> {
	
	public List<ServerConfigInfo> getAllRecords();
}