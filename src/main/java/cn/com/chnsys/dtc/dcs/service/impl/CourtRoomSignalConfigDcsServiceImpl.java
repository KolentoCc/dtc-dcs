package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.CourtRoomSignalConfigDcsDao;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomSignalConfigDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomSignalConfigDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：CourtRoomSignalConfigServiceImpl
 * @version 1.0.0
 */
public class CourtRoomSignalConfigDcsServiceImpl extends AbstractService implements CourtRoomSignalConfigDcsService {
    /**
     * courtRoomSignalConfigDao
     */	
	private CourtRoomSignalConfigDcsDao courtRoomSignalConfigDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CourtRoomSignalConfigDcs getCourtRoomSignalConfigByChannelId(String channelId){
		return courtRoomSignalConfigDcsDao.getRecordById(channelId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalCourtRoomSignalConfig(CourtRoomSignalConfigDcs item) {
		return courtRoomSignalConfigDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return courtRoomSignalConfigDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomSignalConfigDcs> getCourtRoomSignalConfigList(CourtRoomSignalConfigDcs item, int offset,int limit) {
		return courtRoomSignalConfigDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRoomSignalConfig(CourtRoomSignalConfigDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return courtRoomSignalConfigDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateCourtRoomSignalConfig(CourtRoomSignalConfigDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return courtRoomSignalConfigDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomSignalConfigByChannelId(String channelId) {
		return courtRoomSignalConfigDcsDao.deleteRecordById(channelId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomSignalConfigByChannelId(String channelId) {
		CourtRoomSignalConfigDcs item = new CourtRoomSignalConfigDcs();
		item.setChannelId(channelId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateCourtRoomSignalConfig(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomSignalConfigDcs> getCourtRoomSignalConfigsByChannelIds(String[] channelIds){
        if(CollectionUtil.isEmpty(channelIds)){
            return Collections.emptyList();
        }
        return courtRoomSignalConfigDcsDao.getRecordsByIds(channelIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomSignalConfigsByChannelIds(String[] channelIds){
		if(CollectionUtil.isEmpty(channelIds)){
            return 0;
        }
		return courtRoomSignalConfigDcsDao.deleteRecordsByIds(channelIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomSignalConfigsByChannelIds(String[] channelIds){
		if(CollectionUtil.isEmpty(channelIds)){
            return 0;
        }

        int count = 0;
        CourtRoomSignalConfigDcs item = new CourtRoomSignalConfigDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String channelId : channelIds) {
            item.setChannelId(channelId);
            count += updateCourtRoomSignalConfig(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRoomSignalConfigs(List<CourtRoomSignalConfigDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return courtRoomSignalConfigDcsDao.insertRecords(items);
	}
	
	/**
	 * courtRoomSignalConfigDao setter
	 */
	public void setCourtRoomSignalConfigDcsDao(CourtRoomSignalConfigDcsDao courtRoomSignalConfigDcsDao){
		this.courtRoomSignalConfigDcsDao = courtRoomSignalConfigDcsDao;
	}
}