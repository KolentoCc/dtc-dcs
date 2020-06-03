package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.WitnessInfoDcsDao;
import cn.com.chnsys.dtc.dcs.entity.WitnessInfoDcs;
import cn.com.chnsys.dtc.dcs.service.WitnessInfoDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：WitnessInfoServiceImpl
 * @version 1.0.0
 */
public class WitnessInfoDcsServiceImpl extends AbstractService implements WitnessInfoDcsService {
    /**
     * witnessInfoDao
     */	
	private WitnessInfoDcsDao witnessInfoDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WitnessInfoDcs getWitnessInfoByEvidenceContentId(String evidenceContentId){
		return witnessInfoDcsDao.getRecordById(evidenceContentId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalWitnessInfo(WitnessInfoDcs item) {
		return witnessInfoDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return witnessInfoDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<WitnessInfoDcs> getWitnessInfoList(WitnessInfoDcs item, int offset,int limit) {
		return witnessInfoDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertWitnessInfo(WitnessInfoDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return witnessInfoDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateWitnessInfo(WitnessInfoDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return witnessInfoDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteWitnessInfoByEvidenceContentId(String evidenceContentId) {
		return witnessInfoDcsDao.deleteRecordById(evidenceContentId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicWitnessInfoByEvidenceContentId(String evidenceContentId) {
		WitnessInfoDcs item = new WitnessInfoDcs();
		item.setEvidenceContentId(evidenceContentId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateWitnessInfo(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<WitnessInfoDcs> getWitnessInfosByEvidenceContentIds(String[] evidenceContentIds){
        if(CollectionUtil.isEmpty(evidenceContentIds)){
            return Collections.emptyList();
        }
        return witnessInfoDcsDao.getRecordsByIds(evidenceContentIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteWitnessInfosByEvidenceContentIds(String[] evidenceContentIds){
		if(CollectionUtil.isEmpty(evidenceContentIds)){
            return 0;
        }
		return witnessInfoDcsDao.deleteRecordsByIds(evidenceContentIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicWitnessInfosByEvidenceContentIds(String[] evidenceContentIds){
		if(CollectionUtil.isEmpty(evidenceContentIds)){
            return 0;
        }

        int count = 0;
        WitnessInfoDcs item = new WitnessInfoDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String evidenceContentId : evidenceContentIds) {
            item.setEvidenceContentId(evidenceContentId);
            count += updateWitnessInfo(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertWitnessInfos(List<WitnessInfoDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return witnessInfoDcsDao.insertRecords(items);
	}
	
	/**
	 * witnessInfoDao setter
	 */
	public void setWitnessInfoDcsDao(WitnessInfoDcsDao witnessInfoDcsDao){
		this.witnessInfoDcsDao = witnessInfoDcsDao;
	}
}