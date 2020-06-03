package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import cn.com.chnsys.dtc.dcs.dao.EvidenceInfoDcsDao;
import cn.com.chnsys.dtc.dcs.service.EvidenceInfoDcsService;
import cn.com.chnsys.dtc.dcs.entity.EvidenceInfoDcs;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：EvidenceInfoDcsServiceImpl
 * @version 1.0.0
 */
public class EvidenceInfoDcsServiceImpl extends AbstractService implements EvidenceInfoDcsService {
    /**
     * evidenceInfoDcsDao
     */	
	private EvidenceInfoDcsDao evidenceInfoDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EvidenceInfoDcs getEvidenceInfoDcsByEvidenceId(String evidenceId){
		return evidenceInfoDcsDao.getRecordById(evidenceId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalEvidenceInfoDcs(EvidenceInfoDcs item) {
		return evidenceInfoDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return evidenceInfoDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<EvidenceInfoDcs> getEvidenceInfoDcsList(EvidenceInfoDcs item, int offset,int limit) {
		return evidenceInfoDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertEvidenceInfoDcs(EvidenceInfoDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return evidenceInfoDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateEvidenceInfoDcs(EvidenceInfoDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return evidenceInfoDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteEvidenceInfoDcsByEvidenceId(String evidenceId) {
		return evidenceInfoDcsDao.deleteRecordById(evidenceId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicEvidenceInfoDcsByEvidenceId(String evidenceId) {
		EvidenceInfoDcs item = new EvidenceInfoDcs();
		item.setEvidenceId(evidenceId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateEvidenceInfoDcs(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<EvidenceInfoDcs> getEvidenceInfoDcssByEvidenceIds(String[] evidenceIds){
        if(CollectionUtil.isEmpty(evidenceIds)){
            return Collections.emptyList();
        }
        return evidenceInfoDcsDao.getRecordsByIds(evidenceIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteEvidenceInfoDcssByEvidenceIds(String[] evidenceIds){
		if(CollectionUtil.isEmpty(evidenceIds)){
            return 0;
        }
		return evidenceInfoDcsDao.deleteRecordsByIds(evidenceIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicEvidenceInfoDcssByEvidenceIds(String[] evidenceIds){
		if(CollectionUtil.isEmpty(evidenceIds)){
            return 0;
        }

        int count = 0;
        EvidenceInfoDcs item = new EvidenceInfoDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String evidenceId : evidenceIds) {
            item.setEvidenceId(evidenceId);
            count += updateEvidenceInfoDcs(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertEvidenceInfoDcss(List<EvidenceInfoDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return evidenceInfoDcsDao.insertRecords(items);
	}
	
	/**
	 * evidenceInfoDcsDao setter
	 */
	public void setEvidenceInfoDcsDao(EvidenceInfoDcsDao evidenceInfoDcsDao){
		this.evidenceInfoDcsDao = evidenceInfoDcsDao;
	}
}