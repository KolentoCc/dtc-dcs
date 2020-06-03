package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.TrialBurnConfigDcsDao;
import cn.com.chnsys.dtc.dcs.entity.TrialBurnConfigDcs;
import cn.com.chnsys.dtc.dcs.service.TrialBurnConfigDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：TrialBurnConfigServiceImpl
 * @version 1.0.0
 */
public class TrialBurnConfigDcsServiceImpl extends AbstractService implements TrialBurnConfigDcsService {
    /**
     * trialBurnConfigDao
     */	
	private TrialBurnConfigDcsDao trialBurnConfigDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrialBurnConfigDcs getTrialBurnConfigByCourtRoomId(String courtRoomId){
		return trialBurnConfigDcsDao.getRecordById(courtRoomId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalTrialBurnConfig(TrialBurnConfigDcs item) {
		return trialBurnConfigDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return trialBurnConfigDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialBurnConfigDcs> getTrialBurnConfigList(TrialBurnConfigDcs item, int offset,int limit) {
		return trialBurnConfigDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialBurnConfig(TrialBurnConfigDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return trialBurnConfigDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateTrialBurnConfig(TrialBurnConfigDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return trialBurnConfigDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialBurnConfigByCourtRoomId(String courtRoomId) {
		return trialBurnConfigDcsDao.deleteRecordById(courtRoomId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialBurnConfigByCourtRoomId(String courtRoomId) {
		TrialBurnConfigDcs item = new TrialBurnConfigDcs();
		item.setCourtRoomId(courtRoomId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateTrialBurnConfig(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialBurnConfigDcs> getTrialBurnConfigsByCourtRoomIds(String[] courtRoomIds){
        if(CollectionUtil.isEmpty(courtRoomIds)){
            return Collections.emptyList();
        }
        return trialBurnConfigDcsDao.getRecordsByIds(courtRoomIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialBurnConfigsByCourtRoomIds(String[] courtRoomIds){
		if(CollectionUtil.isEmpty(courtRoomIds)){
            return 0;
        }
		return trialBurnConfigDcsDao.deleteRecordsByIds(courtRoomIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialBurnConfigsByCourtRoomIds(String[] courtRoomIds){
		if(CollectionUtil.isEmpty(courtRoomIds)){
            return 0;
        }

        int count = 0;
        TrialBurnConfigDcs item = new TrialBurnConfigDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String courtRoomId : courtRoomIds) {
            item.setCourtRoomId(courtRoomId);
            count += updateTrialBurnConfig(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialBurnConfigs(List<TrialBurnConfigDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return trialBurnConfigDcsDao.insertRecords(items);
	}
	
	/**
	 * trialBurnConfigDao setter
	 */
	public void setTrialBurnConfigDcsDao(TrialBurnConfigDcsDao trialBurnConfigDcsDao){
		this.trialBurnConfigDcsDao = trialBurnConfigDcsDao;
	}
}