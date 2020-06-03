package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.CourtRoomConfigDcsDao;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomConfigDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomConfigDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：CourtRoomConfigServiceImpl
 * @version 1.0.0
 */
public class CourtRoomConfigDcsServiceImpl extends AbstractService implements CourtRoomConfigDcsService {
    /**
     * courtRoomConfigDao
     */	
	private CourtRoomConfigDcsDao courtRoomConfigDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CourtRoomConfigDcs getCourtRoomConfigByCourtRoomId(String courtRoomId){
		return courtRoomConfigDcsDao.getRecordById(courtRoomId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalCourtRoomConfig(CourtRoomConfigDcs item) {
		return courtRoomConfigDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return courtRoomConfigDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomConfigDcs> getCourtRoomConfigList(CourtRoomConfigDcs item, int offset,int limit) {
		return courtRoomConfigDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRoomConfig(CourtRoomConfigDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return courtRoomConfigDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateCourtRoomConfig(CourtRoomConfigDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return courtRoomConfigDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomConfigByCourtRoomId(String courtRoomId) {
		return courtRoomConfigDcsDao.deleteRecordById(courtRoomId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomConfigByCourtRoomId(String courtRoomId) {
		CourtRoomConfigDcs item = new CourtRoomConfigDcs();
		item.setCourtRoomId(courtRoomId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateCourtRoomConfig(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomConfigDcs> getCourtRoomConfigsByCourtRoomIds(String[] courtRoomIds){
        if(CollectionUtil.isEmpty(courtRoomIds)){
            return Collections.emptyList();
        }
        return courtRoomConfigDcsDao.getRecordsByIds(courtRoomIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomConfigsByCourtRoomIds(String[] courtRoomIds){
		if(CollectionUtil.isEmpty(courtRoomIds)){
            return 0;
        }
		return courtRoomConfigDcsDao.deleteRecordsByIds(courtRoomIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomConfigsByCourtRoomIds(String[] courtRoomIds){
		if(CollectionUtil.isEmpty(courtRoomIds)){
            return 0;
        }

        int count = 0;
        CourtRoomConfigDcs item = new CourtRoomConfigDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String courtRoomId : courtRoomIds) {
            item.setCourtRoomId(courtRoomId);
            count += updateCourtRoomConfig(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRoomConfigs(List<CourtRoomConfigDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return courtRoomConfigDcsDao.insertRecords(items);
	}
	
	/**
	 * courtRoomConfigDao setter
	 */
	public void setCourtRoomConfigDcsDao(CourtRoomConfigDcsDao courtRoomConfigDcsDao){
		this.courtRoomConfigDcsDao = courtRoomConfigDcsDao;
	}
}