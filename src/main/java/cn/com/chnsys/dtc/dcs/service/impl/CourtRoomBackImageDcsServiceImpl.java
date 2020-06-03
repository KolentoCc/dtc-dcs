package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.CourtRoomBackImageDcsDao;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomBackImageDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomBackImageDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：CourtRoomBackImageServiceImpl
 * @version 1.0.0
 */
public class CourtRoomBackImageDcsServiceImpl extends AbstractService implements CourtRoomBackImageDcsService {
    /**
     * courtRoomBackImageDao
     */	
	private CourtRoomBackImageDcsDao courtRoomBackImageDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CourtRoomBackImageDcs getCourtRoomBackImageByCourtRoomId(String courtRoomId){
		return courtRoomBackImageDcsDao.getRecordById(courtRoomId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalCourtRoomBackImage(CourtRoomBackImageDcs item) {
		return courtRoomBackImageDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return courtRoomBackImageDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomBackImageDcs> getCourtRoomBackImageList(CourtRoomBackImageDcs item, int offset,int limit) {
		return courtRoomBackImageDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRoomBackImage(CourtRoomBackImageDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return courtRoomBackImageDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateCourtRoomBackImage(CourtRoomBackImageDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return courtRoomBackImageDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomBackImageByCourtRoomId(String courtRoomId) {
		return courtRoomBackImageDcsDao.deleteRecordById(courtRoomId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomBackImageByCourtRoomId(String courtRoomId) {
		CourtRoomBackImageDcs item = new CourtRoomBackImageDcs();
		item.setCourtRoomId(courtRoomId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateCourtRoomBackImage(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomBackImageDcs> getCourtRoomBackImagesByCourtRoomIds(String[] courtRoomIds){
        if(CollectionUtil.isEmpty(courtRoomIds)){
            return Collections.emptyList();
        }
        return courtRoomBackImageDcsDao.getRecordsByIds(courtRoomIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomBackImagesByCourtRoomIds(String[] courtRoomIds){
		if(CollectionUtil.isEmpty(courtRoomIds)){
            return 0;
        }
		return courtRoomBackImageDcsDao.deleteRecordsByIds(courtRoomIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomBackImagesByCourtRoomIds(String[] courtRoomIds){
		if(CollectionUtil.isEmpty(courtRoomIds)){
            return 0;
        }

        int count = 0;
        CourtRoomBackImageDcs item = new CourtRoomBackImageDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String courtRoomId : courtRoomIds) {
            item.setCourtRoomId(courtRoomId);
            count += updateCourtRoomBackImage(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRoomBackImages(List<CourtRoomBackImageDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return courtRoomBackImageDcsDao.insertRecords(items);
	}
	
	/**
	 * courtRoomBackImageDao setter
	 */
	public void setCourtRoomBackImageDcsDao(CourtRoomBackImageDcsDao courtRoomBackImageDcsDao){
		this.courtRoomBackImageDcsDao = courtRoomBackImageDcsDao;
	}
}