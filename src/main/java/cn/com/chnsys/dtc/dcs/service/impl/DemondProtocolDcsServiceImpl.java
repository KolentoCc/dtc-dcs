package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.DemondProtocolDcsDao;
import cn.com.chnsys.dtc.dcs.entity.DemondProtocolDcs;
import cn.com.chnsys.dtc.dcs.service.DemondProtocolDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：DemondProtocolServiceImpl
 * @version 1.0.0
 */
public class DemondProtocolDcsServiceImpl extends AbstractService implements DemondProtocolDcsService {
    /**
     * demondProtocolDao
     */	
	private DemondProtocolDcsDao demondProtocolDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DemondProtocolDcs getDemondProtocolByTrialInfoId(String trialInfoId){
		return demondProtocolDcsDao.getRecordById(trialInfoId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalDemondProtocol(DemondProtocolDcs item) {
		return demondProtocolDcsDao.getTotalRecord(item);
	}
	
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<DemondProtocolDcs> getDemondProtocolList(DemondProtocolDcs item, int offset,int limit) {
		return demondProtocolDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertDemondProtocol(DemondProtocolDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return demondProtocolDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateDemondProtocol(DemondProtocolDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return demondProtocolDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteDemondProtocolByTrialInfoId(String trialInfoId) {
		return demondProtocolDcsDao.deleteRecordById(trialInfoId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicDemondProtocolByTrialInfoId(String trialInfoId) {
		DemondProtocolDcs item = new DemondProtocolDcs();
		item.setTrialInfoId(trialInfoId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateDemondProtocol(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<DemondProtocolDcs> getDemondProtocolsByTrialInfoIds(String[] trialInfoIds){
        if(CollectionUtil.isEmpty(trialInfoIds)){
            return Collections.emptyList();
        }
        return demondProtocolDcsDao.getRecordsByIds(trialInfoIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteDemondProtocolsByTrialInfoIds(String[] trialInfoIds){
		if(CollectionUtil.isEmpty(trialInfoIds)){
            return 0;
        }
		return demondProtocolDcsDao.deleteRecordsByIds(trialInfoIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicDemondProtocolsByTrialInfoIds(String[] trialInfoIds){
		if(CollectionUtil.isEmpty(trialInfoIds)){
            return 0;
        }

        int count = 0;
        DemondProtocolDcs item = new DemondProtocolDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String trialInfoId : trialInfoIds) {
            item.setTrialInfoId(trialInfoId);
            count += updateDemondProtocol(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertDemondProtocols(List<DemondProtocolDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return demondProtocolDcsDao.insertRecords(items);
	}
	
	/**
	 * demondProtocolDao setter
	 */
	public void setDemondProtocolDcsDao(DemondProtocolDcsDao demondProtocolDcsDao){
		this.demondProtocolDcsDao = demondProtocolDcsDao;
	}
}