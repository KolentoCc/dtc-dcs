package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.LiveLogDcsDao;
import cn.com.chnsys.dtc.dcs.entity.LiveLogDcs;
import cn.com.chnsys.dtc.dcs.service.LiveLogDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：LiveLogServiceImpl
 * @version 1.0.0
 */
public class LiveLogDcsServiceImpl extends AbstractService implements LiveLogDcsService {
    /**
     * liveLogDao
     */	
	private LiveLogDcsDao liveLogDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiveLogDcs getLiveLogByLogId(String logId){
		return liveLogDcsDao.getRecordById(logId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalLiveLog(LiveLogDcs item) {
		return liveLogDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return liveLogDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<LiveLogDcs> getLiveLogList(LiveLogDcs item, int offset,int limit) {
		return liveLogDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertLiveLog(LiveLogDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return liveLogDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateLiveLog(LiveLogDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return liveLogDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteLiveLogByLogId(String logId) {
		return liveLogDcsDao.deleteRecordById(logId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicLiveLogByLogId(String logId) {
		LiveLogDcs item = new LiveLogDcs();
		item.setLogId(logId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateLiveLog(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<LiveLogDcs> getLiveLogsByLogIds(String[] logIds){
        if(CollectionUtil.isEmpty(logIds)){
            return Collections.emptyList();
        }
        return liveLogDcsDao.getRecordsByIds(logIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteLiveLogsByLogIds(String[] logIds){
		if(CollectionUtil.isEmpty(logIds)){
            return 0;
        }
		return liveLogDcsDao.deleteRecordsByIds(logIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicLiveLogsByLogIds(String[] logIds){
		if(CollectionUtil.isEmpty(logIds)){
            return 0;
        }

        int count = 0;
        LiveLogDcs item = new LiveLogDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String logId : logIds) {
            item.setLogId(logId);
            count += updateLiveLog(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertLiveLogs(List<LiveLogDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return liveLogDcsDao.insertRecords(items);
	}
	
	/**
	 * liveLogDao setter
	 */
	public void setLiveLogDcsDao(LiveLogDcsDao liveLogDcsDao){
		this.liveLogDcsDao = liveLogDcsDao;
	}
}