package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import cn.com.chnsys.dtc.dcs.dao.ServerConfigInfoDao;
import cn.com.chnsys.dtc.dcs.service.ServerConfigInfoService;
import cn.com.chnsys.dtc.dcs.entity.ServerConfigInfo;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.framework.AbstractService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：ServerConfigInfoServiceImpl
 * @version 1.0.0
 */
public class ServerConfigInfoServiceImpl extends AbstractService implements ServerConfigInfoService {
    /**
     * serverConfigInfoDao
     */	
	private ServerConfigInfoDao serverConfigInfoDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ServerConfigInfo getServerConfigInfoByConfigId(String configId){
		return serverConfigInfoDao.getRecordById(configId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalServerConfigInfo(ServerConfigInfo item) {
		return serverConfigInfoDao.getTotalRecord(item);
	}
	
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<ServerConfigInfo> getServerConfigInfoList(ServerConfigInfo item, int offset,int limit) {
		return serverConfigInfoDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertServerConfigInfo(ServerConfigInfo item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return serverConfigInfoDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateServerConfigInfo(ServerConfigInfo item) {
		item.setTimestamp(System.currentTimeMillis());
		return serverConfigInfoDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteServerConfigInfoByConfigId(String configId) {
		return serverConfigInfoDao.deleteRecordById(configId);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ServerConfigInfo> getServerConfigInfosByConfigIds(String[] configIds){
        if(CollectionUtil.isEmpty(configIds))
            return Collections.emptyList();
        return serverConfigInfoDao.getRecordsByIds(configIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteServerConfigInfosByConfigIds(String[] configIds){
		if(CollectionUtil.isEmpty(configIds))
            return 0;
		return serverConfigInfoDao.deleteRecordsByIds(configIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertServerConfigInfos(List<ServerConfigInfo> items){
	    if(CollectionUtil.isEmpty(items))
            return 0;
		return serverConfigInfoDao.insertRecords(items);
	}
	
	@Override
	public List<ServerConfigInfo> getAllServerConfigInfo() {
		return serverConfigInfoDao.getAllRecords();
	}

	/**
	 * serverConfigInfoDao setter
	 */
	public void setServerConfigInfoDao(ServerConfigInfoDao serverConfigInfoDao){
		this.serverConfigInfoDao = serverConfigInfoDao;
	}
}