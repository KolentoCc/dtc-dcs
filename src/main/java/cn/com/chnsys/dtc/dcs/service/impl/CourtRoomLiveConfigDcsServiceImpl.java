package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.CourtRoomLiveConfigDcsDao;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomLiveConfigDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomLiveConfigDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：CourtRoomLiveConfigServiceImpl
 * @version 1.0.0
 */
public class CourtRoomLiveConfigDcsServiceImpl extends AbstractService implements CourtRoomLiveConfigDcsService {
    /**
     * courtRoomLiveConfigDao
     */	
	private CourtRoomLiveConfigDcsDao courtRoomLiveConfigDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CourtRoomLiveConfigDcs getCourtRoomLiveConfigByCourtRoomId(String courtRoomId){
		return courtRoomLiveConfigDcsDao.getRecordById(courtRoomId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalCourtRoomLiveConfig(CourtRoomLiveConfigDcs item) {
		return courtRoomLiveConfigDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return courtRoomLiveConfigDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomLiveConfigDcs> getCourtRoomLiveConfigList(CourtRoomLiveConfigDcs item, int offset,int limit) {
		return courtRoomLiveConfigDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRoomLiveConfig(CourtRoomLiveConfigDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return courtRoomLiveConfigDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateCourtRoomLiveConfig(CourtRoomLiveConfigDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return courtRoomLiveConfigDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomLiveConfigByCourtRoomId(String courtRoomId) {
		return courtRoomLiveConfigDcsDao.deleteRecordById(courtRoomId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomLiveConfigByCourtRoomId(String courtRoomId) {
		CourtRoomLiveConfigDcs item = new CourtRoomLiveConfigDcs();
		item.setCourtRoomId(courtRoomId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateCourtRoomLiveConfig(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomLiveConfigDcs> getCourtRoomLiveConfigsByCourtRoomIds(String[] courtRoomIds){
        if(CollectionUtil.isEmpty(courtRoomIds)){
            return Collections.emptyList();
        }
        return courtRoomLiveConfigDcsDao.getRecordsByIds(courtRoomIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomLiveConfigsByCourtRoomIds(String[] courtRoomIds){
		if(CollectionUtil.isEmpty(courtRoomIds)){
            return 0;
        }
		return courtRoomLiveConfigDcsDao.deleteRecordsByIds(courtRoomIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomLiveConfigsByCourtRoomIds(String[] courtRoomIds){
		if(CollectionUtil.isEmpty(courtRoomIds)){
            return 0;
        }

        int count = 0;
        CourtRoomLiveConfigDcs item = new CourtRoomLiveConfigDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String courtRoomId : courtRoomIds) {
            item.setCourtRoomId(courtRoomId);
            count += updateCourtRoomLiveConfig(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRoomLiveConfigs(List<CourtRoomLiveConfigDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return courtRoomLiveConfigDcsDao.insertRecords(items);
	}
	
	/**
	 * courtRoomLiveConfigDao setter
	 */
	public void setCourtRoomLiveConfigDcsDao(CourtRoomLiveConfigDcsDao courtRoomLiveConfigDcsDao){
		this.courtRoomLiveConfigDcsDao = courtRoomLiveConfigDcsDao;
	}
}