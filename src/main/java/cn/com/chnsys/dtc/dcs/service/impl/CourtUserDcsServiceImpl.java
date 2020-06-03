package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.dtc.dcs.dao.CourtUserDcsDao;
import cn.com.chnsys.dtc.dcs.entity.CourtUserDcs;
import cn.com.chnsys.dtc.dcs.service.CourtUserDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：CourtUserServiceImpl
 * @version 1.0.0
 */
public class CourtUserDcsServiceImpl implements CourtUserDcsService {
    /**
     * courtUserDao
     */	
	private CourtUserDcsDao courtUserDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CourtUserDcs getCourtUserByUserId(String userId){
		return courtUserDcsDao.getRecordById(userId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CourtUserDcs getCourtUserByInterfaceId(Integer courtCode, String interfaceId) {
		return courtUserDcsDao.getRecordByInterfaceId(courtCode, interfaceId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalCourtUser(CourtUserDcs item) {
		return courtUserDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return courtUserDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtUserDcs> getCourtUserList(CourtUserDcs item, int offset,int limit) {
		return courtUserDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtUser(CourtUserDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return courtUserDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateCourtUser(CourtUserDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return courtUserDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtUserByUserId(String userId) {
		return courtUserDcsDao.deleteRecordById(userId);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtUserByUserId(String userId) {
	    CourtUserDcs item = new CourtUserDcs();
        item.setUserId(userId);
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        return updateCourtUser(item);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtUserDcs> getCourtUsersByUserIds(String[] userIds){
        if(CollectionUtil.isEmpty(userIds))
            return Collections.emptyList();
        return courtUserDcsDao.getRecordsByIds(userIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtUsersByUserIds(String[] userIds){
		if(CollectionUtil.isEmpty(userIds)) {
            return 0;
		}
		return courtUserDcsDao.deleteRecordsByIds(userIds);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtUsersByUserIds(String[] userIds) {
        if (CollectionUtil.isEmpty(userIds)) {
            return 0;
        }

        int count = 0;
        CourtUserDcs item = new CourtUserDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for (String userId : userIds) {
            item.setUserId(userId);
            count += updateCourtUser(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtUsers(List<CourtUserDcs> items){
	    if(CollectionUtil.isEmpty(items))
            return 0;
		return courtUserDcsDao.insertRecords(items);
	}
	
	/**
	 * courtUserDao setter
	 */
	public void setCourtUserDcsDao(CourtUserDcsDao courtUserDcsDao){
		this.courtUserDcsDao = courtUserDcsDao;
	}
}