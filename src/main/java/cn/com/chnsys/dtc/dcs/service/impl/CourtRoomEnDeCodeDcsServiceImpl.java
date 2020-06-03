package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.CourtRoomEnDeCodeDcsDao;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomEnDeCodeDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomEnDeCodeDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：CourtRoomEnDeCodeServiceImpl
 * @version 1.0.0
 */
public class CourtRoomEnDeCodeDcsServiceImpl extends AbstractService implements CourtRoomEnDeCodeDcsService {
    /**
     * courtRoomEnDeCodeDao
     */	
	private CourtRoomEnDeCodeDcsDao courtRoomEnDeCodeDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CourtRoomEnDeCodeDcs getCourtRoomEnDeCodeById(String id){
		return courtRoomEnDeCodeDcsDao.getRecordById(id);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalCourtRoomEnDeCode(CourtRoomEnDeCodeDcs item) {
		return courtRoomEnDeCodeDcsDao.getTotalRecord(item);
	}
	
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomEnDeCodeDcs> getCourtRoomEnDeCodeList(CourtRoomEnDeCodeDcs item, int offset,int limit) {
		return courtRoomEnDeCodeDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRoomEnDeCode(CourtRoomEnDeCodeDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return courtRoomEnDeCodeDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateCourtRoomEnDeCode(CourtRoomEnDeCodeDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return courtRoomEnDeCodeDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomEnDeCodeById(String id) {
		return courtRoomEnDeCodeDcsDao.deleteRecordById(id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomEnDeCodeById(String id) {
		CourtRoomEnDeCodeDcs item = new CourtRoomEnDeCodeDcs();
		item.setId(id);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateCourtRoomEnDeCode(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomEnDeCodeDcs> getCourtRoomEnDeCodesByIds(String[] ids){
        if(CollectionUtil.isEmpty(ids)){
            return Collections.emptyList();
        }
        return courtRoomEnDeCodeDcsDao.getRecordsByIds(ids);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomEnDeCodesByIds(String[] ids){
		if(CollectionUtil.isEmpty(ids)){
            return 0;
        }
		return courtRoomEnDeCodeDcsDao.deleteRecordsByIds(ids);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomEnDeCodesByIds(String[] ids){
		if(CollectionUtil.isEmpty(ids)){
            return 0;
        }

        int count = 0;
        CourtRoomEnDeCodeDcs item = new CourtRoomEnDeCodeDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String id : ids) {
            item.setId(id);
            count += updateCourtRoomEnDeCode(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRoomEnDeCodes(List<CourtRoomEnDeCodeDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return courtRoomEnDeCodeDcsDao.insertRecords(items);
	}
	
	/**
	 * courtRoomEnDeCodeDao setter
	 */
	public void setCourtRoomEnDeCodeDcsDao(CourtRoomEnDeCodeDcsDao courtRoomEnDeCodeDcsDao){
		this.courtRoomEnDeCodeDcsDao = courtRoomEnDeCodeDcsDao;
	}
}