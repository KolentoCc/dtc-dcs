package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.TrialScreenshotDcsDao;
import cn.com.chnsys.dtc.dcs.entity.TrialScreenshotDcs;
import cn.com.chnsys.dtc.dcs.service.TrialScreenshotDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：TrialScreenshotServiceImpl
 * @version 1.0.0
 */
public class TrialScreenshotDcsServiceImpl extends AbstractService implements TrialScreenshotDcsService {
    /**
     * trialScreenshotDao
     */	
	private TrialScreenshotDcsDao trialScreenshotDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrialScreenshotDcs getTrialScreenshotByTrialId(String trialId){
		return trialScreenshotDcsDao.getRecordById(trialId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalTrialScreenshot(TrialScreenshotDcs item) {
		return trialScreenshotDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return trialScreenshotDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialScreenshotDcs> getTrialScreenshotList(TrialScreenshotDcs item, int offset,int limit) {
		return trialScreenshotDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialScreenshot(TrialScreenshotDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return trialScreenshotDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateTrialScreenshot(TrialScreenshotDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return trialScreenshotDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialScreenshotByTrialId(String trialId) {
		return trialScreenshotDcsDao.deleteRecordById(trialId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialScreenshotByTrialId(String trialId) {
		TrialScreenshotDcs item = new TrialScreenshotDcs();
		item.setTrialId(trialId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateTrialScreenshot(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialScreenshotDcs> getTrialScreenshotsByTrialIds(String[] trialIds){
        if(CollectionUtil.isEmpty(trialIds)){
            return Collections.emptyList();
        }
        return trialScreenshotDcsDao.getRecordsByIds(trialIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialScreenshotsByTrialIds(String[] trialIds){
		if(CollectionUtil.isEmpty(trialIds)){
            return 0;
        }
		return trialScreenshotDcsDao.deleteRecordsByIds(trialIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialScreenshotsByTrialIds(String[] trialIds){
		if(CollectionUtil.isEmpty(trialIds)){
            return 0;
        }

        int count = 0;
        TrialScreenshotDcs item = new TrialScreenshotDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String trialId : trialIds) {
            item.setTrialId(trialId);
            count += updateTrialScreenshot(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialScreenshots(List<TrialScreenshotDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return trialScreenshotDcsDao.insertRecords(items);
	}
	
	/**
	 * trialScreenshotDao setter
	 */
	public void setTrialScreenshotDcsDao(TrialScreenshotDcsDao trialScreenshotDcsDao){
		this.trialScreenshotDcsDao = trialScreenshotDcsDao;
	}
}