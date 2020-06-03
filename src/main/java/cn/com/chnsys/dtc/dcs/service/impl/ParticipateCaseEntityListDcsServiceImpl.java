package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import cn.com.chnsys.dtc.dcs.dao.ParticipateCaseEntityListDcsDao;
import cn.com.chnsys.dtc.dcs.service.ParticipateCaseEntityListDcsService;
import cn.com.chnsys.dtc.dcs.entity.ParticipateCaseEntityListDcs;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：ParticipateCaseEntityListDcsServiceImpl
 * @version 1.0.0
 */
public class ParticipateCaseEntityListDcsServiceImpl extends AbstractService implements ParticipateCaseEntityListDcsService {
    /**
     * participateCaseEntityListDcsDao
     */	
	private ParticipateCaseEntityListDcsDao participateCaseEntityListDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParticipateCaseEntityListDcs getParticipateCaseEntityListDcsByParticipateCaseEntityListID(String participateCaseEntityListID){
		return participateCaseEntityListDcsDao.getRecordById(participateCaseEntityListID);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalParticipateCaseEntityListDcs(ParticipateCaseEntityListDcs item) {
		return participateCaseEntityListDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return participateCaseEntityListDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<ParticipateCaseEntityListDcs> getParticipateCaseEntityListDcsList(ParticipateCaseEntityListDcs item, int offset,int limit) {
		return participateCaseEntityListDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertParticipateCaseEntityListDcs(ParticipateCaseEntityListDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return participateCaseEntityListDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateParticipateCaseEntityListDcs(ParticipateCaseEntityListDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return participateCaseEntityListDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteParticipateCaseEntityListDcsByParticipateCaseEntityListID(String participateCaseEntityListID) {
		return participateCaseEntityListDcsDao.deleteRecordById(participateCaseEntityListID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicParticipateCaseEntityListDcsByParticipateCaseEntityListID(String participateCaseEntityListID) {
		ParticipateCaseEntityListDcs item = new ParticipateCaseEntityListDcs();
		item.setParticipateCaseEntityListID(participateCaseEntityListID);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateParticipateCaseEntityListDcs(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ParticipateCaseEntityListDcs> getParticipateCaseEntityListDcssByParticipateCaseEntityListIDs(String[] participateCaseEntityListIDs){
        if(CollectionUtil.isEmpty(participateCaseEntityListIDs)){
            return Collections.emptyList();
        }
        return participateCaseEntityListDcsDao.getRecordsByIds(participateCaseEntityListIDs);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteParticipateCaseEntityListDcssByParticipateCaseEntityListIDs(String[] participateCaseEntityListIDs){
		if(CollectionUtil.isEmpty(participateCaseEntityListIDs)){
            return 0;
        }
		return participateCaseEntityListDcsDao.deleteRecordsByIds(participateCaseEntityListIDs);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicParticipateCaseEntityListDcssByParticipateCaseEntityListIDs(String[] participateCaseEntityListIDs){
		if(CollectionUtil.isEmpty(participateCaseEntityListIDs)){
            return 0;
        }

        int count = 0;
        ParticipateCaseEntityListDcs item = new ParticipateCaseEntityListDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String participateCaseEntityListID : participateCaseEntityListIDs) {
            item.setParticipateCaseEntityListID(participateCaseEntityListID);
            count += updateParticipateCaseEntityListDcs(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertParticipateCaseEntityListDcss(List<ParticipateCaseEntityListDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return participateCaseEntityListDcsDao.insertRecords(items);
	}
	
	/**
	 * participateCaseEntityListDcsDao setter
	 */
	public void setParticipateCaseEntityListDcsDao(ParticipateCaseEntityListDcsDao participateCaseEntityListDcsDao){
		this.participateCaseEntityListDcsDao = participateCaseEntityListDcsDao;
	}


	@Override
	public List<ParticipateCaseEntityListDcs> getParticipateCaseEntityListByCaseID(String caseID) {
		return participateCaseEntityListDcsDao.selectParticipateCaseEntityListByCaseID(caseID);
	}
}