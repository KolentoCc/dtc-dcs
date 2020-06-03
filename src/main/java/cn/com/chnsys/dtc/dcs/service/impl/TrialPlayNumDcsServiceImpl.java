package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.TrialPlayNumDcsDao;
import cn.com.chnsys.dtc.dcs.entity.TrialPlayNumDcs;
import cn.com.chnsys.dtc.dcs.service.TrialPlayNumDcsService;

/**
 * @项目名称：chnsys-rcs
 * @类名称：TrialPlayNumDcsServiceImpl
 * @version 1.0.0
 */
public class TrialPlayNumDcsServiceImpl extends AbstractService implements TrialPlayNumDcsService {
    /**
     * trialPlayNumDcsDao
     */	
	private TrialPlayNumDcsDao trialPlayNumDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrialPlayNumDcs getTrialPlayNumDcsByPlayId(String playId){
		return trialPlayNumDcsDao.getRecordById(playId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalTrialPlayNumDcs(TrialPlayNumDcs item) {
		return trialPlayNumDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return trialPlayNumDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialPlayNumDcs> getTrialPlayNumDcsList(TrialPlayNumDcs item, int offset,int limit) {
		return trialPlayNumDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialPlayNumDcs(TrialPlayNumDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return trialPlayNumDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateTrialPlayNumDcs(TrialPlayNumDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return trialPlayNumDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialPlayNumDcsByPlayId(String playId) {
		return trialPlayNumDcsDao.deleteRecordById(playId);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialPlayNumDcs> getTrialPlayNumDcssByPlayIds(String[] playIds){
        if(CollectionUtil.isEmpty(playIds))
            return Collections.emptyList();
        return trialPlayNumDcsDao.getRecordsByIds(playIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialPlayNumDcssByPlayIds(String[] playIds){
		if(CollectionUtil.isEmpty(playIds))
            return 0;
		return trialPlayNumDcsDao.deleteRecordsByIds(playIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialPlayNumDcss(List<TrialPlayNumDcs> items){
	    if(CollectionUtil.isEmpty(items))
            return 0;
		return trialPlayNumDcsDao.insertRecords(items);
	}
	
	/**
	 * trialPlayNumDcsDao setter
	 */
	public void setTrialPlayNumDcsDao(TrialPlayNumDcsDao trialPlayNumDcsDao){
		this.trialPlayNumDcsDao = trialPlayNumDcsDao;
	}


	@Override
	public TrialPlayNumDcs getTrialPlayNumDcsByTrialId(String trialId,
			Integer trialStatus, Integer deleteflagNo, String day) {
		return trialPlayNumDcsDao.getTrialPlayNumDcsByTrialId(trialId, trialStatus, deleteflagNo, day);
	}
}