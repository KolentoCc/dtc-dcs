package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.LiveProtocolDcsDao;
import cn.com.chnsys.dtc.dcs.entity.LiveProtocolDcs;
import cn.com.chnsys.dtc.dcs.service.LiveProtocolDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：LiveProtocolServiceImpl
 * @version 1.0.0
 */
public class LiveProtocolDcsServiceImpl extends AbstractService implements LiveProtocolDcsService {
    /**
     * liveProtocolDao
     */	
	private LiveProtocolDcsDao liveProtocolDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LiveProtocolDcs getLiveProtocolByTrialInfoID(String trialInfoID){
		return liveProtocolDcsDao.getRecordById(trialInfoID);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalLiveProtocol(LiveProtocolDcs item) {
		return liveProtocolDcsDao.getTotalRecord(item);
	}
	
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<LiveProtocolDcs> getLiveProtocolList(LiveProtocolDcs item, int offset,int limit) {
		return liveProtocolDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertLiveProtocol(LiveProtocolDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return liveProtocolDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateLiveProtocol(LiveProtocolDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return liveProtocolDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteLiveProtocolByTrialInfoID(String trialInfoID) {
		return liveProtocolDcsDao.deleteRecordById(trialInfoID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicLiveProtocolByTrialInfoID(String trialInfoID) {
		LiveProtocolDcs item = new LiveProtocolDcs();
		item.setTrialInfoID(trialInfoID);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateLiveProtocol(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<LiveProtocolDcs> getLiveProtocolsByTrialInfoIDs(String[] trialInfoIDs){
        if(CollectionUtil.isEmpty(trialInfoIDs)){
            return Collections.emptyList();
        }
        return liveProtocolDcsDao.getRecordsByIds(trialInfoIDs);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteLiveProtocolsByTrialInfoIDs(String[] trialInfoIDs){
		if(CollectionUtil.isEmpty(trialInfoIDs)){
            return 0;
        }
		return liveProtocolDcsDao.deleteRecordsByIds(trialInfoIDs);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicLiveProtocolsByTrialInfoIDs(String[] trialInfoIDs){
		if(CollectionUtil.isEmpty(trialInfoIDs)){
            return 0;
        }

        int count = 0;
        LiveProtocolDcs item = new LiveProtocolDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String trialInfoID : trialInfoIDs) {
            item.setTrialInfoID(trialInfoID);
            count += updateLiveProtocol(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertLiveProtocols(List<LiveProtocolDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return liveProtocolDcsDao.insertRecords(items);
	}
	
	/**
	 * liveProtocolDao setter
	 */
	public void setLiveProtocolDcsDao(LiveProtocolDcsDao liveProtocolDcsDao){
		this.liveProtocolDcsDao = liveProtocolDcsDao;
	}
}