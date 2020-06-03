package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.TrialLiveDcsDao;
import cn.com.chnsys.dtc.dcs.entity.TrialLiveDcs;
import cn.com.chnsys.dtc.dcs.service.TrialLiveDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：TrialLiveServiceImpl
 * @version 1.0.0
 */
public class TrialLiveDcsServiceImpl extends AbstractService implements TrialLiveDcsService {
    /**
     * trialLiveDao
     */	
	private TrialLiveDcsDao trialLiveDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrialLiveDcs getTrialLiveByTrialLiveId(String trialLiveId){
		return trialLiveDcsDao.getRecordById(trialLiveId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalTrialLive(TrialLiveDcs item) {
		return trialLiveDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return trialLiveDcsDao.getMaxRecord();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialLiveDcs> getTrialLiveListByTrialId(String trialId) {
	    TrialLiveDcs item = new TrialLiveDcs();
	    item.setOpenCourtInfoId(trialId);
	    return getTrialLiveList(item, 0, DEFAULT_PAGE_COUNT);
	}

    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialLiveDcs> getTrialLiveList(TrialLiveDcs item, int offset,int limit) {
		return trialLiveDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialLive(TrialLiveDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return trialLiveDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateTrialLive(TrialLiveDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return trialLiveDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialLiveByTrialLiveId(String trialLiveId) {
		return trialLiveDcsDao.deleteRecordById(trialLiveId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialLiveByTrialLiveId(String trialLiveId) {
		TrialLiveDcs item = new TrialLiveDcs();
		item.setTrialLiveId(trialLiveId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateTrialLive(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialLiveDcs> getTrialLivesByTrialLiveIds(String[] trialLiveIds){
        if(CollectionUtil.isEmpty(trialLiveIds)){
            return Collections.emptyList();
        }
        return trialLiveDcsDao.getRecordsByIds(trialLiveIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialLivesByTrialLiveIds(String[] trialLiveIds){
		if(CollectionUtil.isEmpty(trialLiveIds)){
            return 0;
        }
		return trialLiveDcsDao.deleteRecordsByIds(trialLiveIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialLivesByTrialLiveIds(String[] trialLiveIds){
		if(CollectionUtil.isEmpty(trialLiveIds)){
            return 0;
        }

        int count = 0;
        TrialLiveDcs item = new TrialLiveDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String trialLiveId : trialLiveIds) {
            item.setTrialLiveId(trialLiveId);
            count += updateTrialLive(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialLives(List<TrialLiveDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return trialLiveDcsDao.insertRecords(items);
	}
	
	/**
	 * trialLiveDao setter
	 */
	public void setTrialLiveDcsDao(TrialLiveDcsDao trialLiveDcsDao){
		this.trialLiveDcsDao = trialLiveDcsDao;
	}
}