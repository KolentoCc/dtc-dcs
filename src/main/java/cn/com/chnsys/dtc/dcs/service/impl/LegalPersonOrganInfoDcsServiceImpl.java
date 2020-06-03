package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.LegalPersonOrganInfoDcsDao;
import cn.com.chnsys.dtc.dcs.entity.LegalPersonOrganInfoDcs;
import cn.com.chnsys.dtc.dcs.service.LegalPersonOrganInfoDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：LegalPersonOrganInfoServiceImpl
 * @version 1.0.0
 */
public class LegalPersonOrganInfoDcsServiceImpl extends AbstractService implements LegalPersonOrganInfoDcsService {
    /**
     * legalPersonOrganInfoDao
     */	
	private LegalPersonOrganInfoDcsDao legalPersonOrganInfoDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LegalPersonOrganInfoDcs getLegalPersonOrganInfoByEntityId(String entityId){
		return legalPersonOrganInfoDcsDao.getRecordById(entityId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalLegalPersonOrganInfo(LegalPersonOrganInfoDcs item) {
		return legalPersonOrganInfoDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return legalPersonOrganInfoDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<LegalPersonOrganInfoDcs> getLegalPersonOrganInfoList(LegalPersonOrganInfoDcs item, int offset,int limit) {
		return legalPersonOrganInfoDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertLegalPersonOrganInfo(LegalPersonOrganInfoDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return legalPersonOrganInfoDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateLegalPersonOrganInfo(LegalPersonOrganInfoDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return legalPersonOrganInfoDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteLegalPersonOrganInfoByEntityId(String entityId) {
		return legalPersonOrganInfoDcsDao.deleteRecordById(entityId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicLegalPersonOrganInfoByEntityId(String entityId) {
		LegalPersonOrganInfoDcs item = new LegalPersonOrganInfoDcs();
		item.setEntityId(entityId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateLegalPersonOrganInfo(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<LegalPersonOrganInfoDcs> getLegalPersonOrganInfosByEntityIds(String[] entityIds){
        if(CollectionUtil.isEmpty(entityIds)){
            return Collections.emptyList();
        }
        return legalPersonOrganInfoDcsDao.getRecordsByIds(entityIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteLegalPersonOrganInfosByEntityIds(String[] entityIds){
		if(CollectionUtil.isEmpty(entityIds)){
            return 0;
        }
		return legalPersonOrganInfoDcsDao.deleteRecordsByIds(entityIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicLegalPersonOrganInfosByEntityIds(String[] entityIds){
		if(CollectionUtil.isEmpty(entityIds)){
            return 0;
        }

        int count = 0;
        LegalPersonOrganInfoDcs item = new LegalPersonOrganInfoDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String entityId : entityIds) {
            item.setEntityId(entityId);
            count += updateLegalPersonOrganInfo(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertLegalPersonOrganInfos(List<LegalPersonOrganInfoDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return legalPersonOrganInfoDcsDao.insertRecords(items);
	}
	
	/**
	 * legalPersonOrganInfoDao setter
	 */
	public void setLegalPersonOrganInfoDcsDao(LegalPersonOrganInfoDcsDao legalPersonOrganInfoDcsDao){
		this.legalPersonOrganInfoDcsDao = legalPersonOrganInfoDcsDao;
	}
}