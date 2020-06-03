package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.NaturalPersonInfoDcsDao;
import cn.com.chnsys.dtc.dcs.entity.NaturalPersonInfoDcs;
import cn.com.chnsys.dtc.dcs.service.NaturalPersonInfoDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：NaturalPersonInfoServiceImpl
 * @version 1.0.0
 */
public class NaturalPersonInfoDcsServiceImpl extends AbstractService implements NaturalPersonInfoDcsService {
    /**
     * naturalPersonInfoDao
     */	
	private NaturalPersonInfoDcsDao naturalPersonInfoDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NaturalPersonInfoDcs getNaturalPersonInfoByEntityId(String entityId){
		return naturalPersonInfoDcsDao.getRecordById(entityId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalNaturalPersonInfo(NaturalPersonInfoDcs item) {
		return naturalPersonInfoDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return naturalPersonInfoDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<NaturalPersonInfoDcs> getNaturalPersonInfoList(NaturalPersonInfoDcs item, int offset,int limit) {
		return naturalPersonInfoDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertNaturalPersonInfo(NaturalPersonInfoDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return naturalPersonInfoDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateNaturalPersonInfo(NaturalPersonInfoDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return naturalPersonInfoDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteNaturalPersonInfoByEntityId(String entityId) {
		return naturalPersonInfoDcsDao.deleteRecordById(entityId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicNaturalPersonInfoByEntityId(String entityId) {
		NaturalPersonInfoDcs item = new NaturalPersonInfoDcs();
		item.setEntityId(entityId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateNaturalPersonInfo(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<NaturalPersonInfoDcs> getNaturalPersonInfosByEntityIds(String[] entityIds){
        if(CollectionUtil.isEmpty(entityIds)){
            return Collections.emptyList();
        }
        return naturalPersonInfoDcsDao.getRecordsByIds(entityIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteNaturalPersonInfosByEntityIds(String[] entityIds){
		if(CollectionUtil.isEmpty(entityIds)){
            return 0;
        }
		return naturalPersonInfoDcsDao.deleteRecordsByIds(entityIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicNaturalPersonInfosByEntityIds(String[] entityIds){
		if(CollectionUtil.isEmpty(entityIds)){
            return 0;
        }

        int count = 0;
        NaturalPersonInfoDcs item = new NaturalPersonInfoDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String entityId : entityIds) {
            item.setEntityId(entityId);
            count += updateNaturalPersonInfo(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertNaturalPersonInfos(List<NaturalPersonInfoDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return naturalPersonInfoDcsDao.insertRecords(items);
	}
	
	/**
	 * naturalPersonInfoDao setter
	 */
	public void setNaturalPersonInfoDcsDao(NaturalPersonInfoDcsDao naturalPersonInfoDcsDao){
		this.naturalPersonInfoDcsDao = naturalPersonInfoDcsDao;
	}
}