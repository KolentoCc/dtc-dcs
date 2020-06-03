package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.DemondLogDcsDao;
import cn.com.chnsys.dtc.dcs.entity.DemondLogDcs;
import cn.com.chnsys.dtc.dcs.service.DemondLogDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：DemondLogServiceImpl
 * @version 1.0.0
 */
public class DemondLogDcsServiceImpl extends AbstractService implements DemondLogDcsService {
    /**
     * demondLogDao
     */	
	private DemondLogDcsDao demondLogDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DemondLogDcs getDemondLogByLogId(String logId){
		return demondLogDcsDao.getRecordById(logId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalDemondLog(DemondLogDcs item) {
		return demondLogDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return demondLogDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<DemondLogDcs> getDemondLogList(DemondLogDcs item, int offset,int limit) {
		return demondLogDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertDemondLog(DemondLogDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return demondLogDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateDemondLog(DemondLogDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return demondLogDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteDemondLogByLogId(String logId) {
		return demondLogDcsDao.deleteRecordById(logId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicDemondLogByLogId(String logId) {
		DemondLogDcs item = new DemondLogDcs();
		item.setLogId(logId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateDemondLog(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<DemondLogDcs> getDemondLogsByLogIds(String[] logIds){
        if(CollectionUtil.isEmpty(logIds)){
            return Collections.emptyList();
        }
        return demondLogDcsDao.getRecordsByIds(logIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteDemondLogsByLogIds(String[] logIds){
		if(CollectionUtil.isEmpty(logIds)){
            return 0;
        }
		return demondLogDcsDao.deleteRecordsByIds(logIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicDemondLogsByLogIds(String[] logIds){
		if(CollectionUtil.isEmpty(logIds)){
            return 0;
        }

        int count = 0;
        DemondLogDcs item = new DemondLogDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String logId : logIds) {
            item.setLogId(logId);
            count += updateDemondLog(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertDemondLogs(List<DemondLogDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return demondLogDcsDao.insertRecords(items);
	}
	
	/**
	 * demondLogDao setter
	 */
	public void setDemondLogDcsDao(DemondLogDcsDao demondLogDcsDao){
		this.demondLogDcsDao = demondLogDcsDao;
	}
}