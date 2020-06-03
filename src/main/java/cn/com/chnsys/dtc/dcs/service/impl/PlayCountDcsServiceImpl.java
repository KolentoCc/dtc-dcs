package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.PlayCountDcsDao;
import cn.com.chnsys.dtc.dcs.entity.PlayCountDcs;
import cn.com.chnsys.dtc.dcs.service.PlayCountDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：PlayCountServiceImpl
 * @version 1.0.0
 */
public class PlayCountDcsServiceImpl extends AbstractService implements PlayCountDcsService {
    /**
     * playCountDao
     */	
	private PlayCountDcsDao playCountDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayCountDcs getPlayCountByOpenCourtInfoId(String openCourtInfoId){
		return playCountDcsDao.getRecordById(openCourtInfoId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalPlayCount(PlayCountDcs item) {
		return playCountDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return playCountDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<PlayCountDcs> getPlayCountList(PlayCountDcs item, int offset,int limit) {
		return playCountDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertPlayCount(PlayCountDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return playCountDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updatePlayCount(PlayCountDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return playCountDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deletePlayCountByOpenCourtInfoId(String openCourtInfoId) {
		return playCountDcsDao.deleteRecordById(openCourtInfoId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicPlayCountByOpenCourtInfoId(String openCourtInfoId) {
		PlayCountDcs item = new PlayCountDcs();
		item.setOpenCourtInfoId(openCourtInfoId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updatePlayCount(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<PlayCountDcs> getPlayCountsByOpenCourtInfoIds(String[] openCourtInfoIds){
        if(CollectionUtil.isEmpty(openCourtInfoIds)){
            return Collections.emptyList();
        }
        return playCountDcsDao.getRecordsByIds(openCourtInfoIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deletePlayCountsByOpenCourtInfoIds(String[] openCourtInfoIds){
		if(CollectionUtil.isEmpty(openCourtInfoIds)){
            return 0;
        }
		return playCountDcsDao.deleteRecordsByIds(openCourtInfoIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicPlayCountsByOpenCourtInfoIds(String[] openCourtInfoIds){
		if(CollectionUtil.isEmpty(openCourtInfoIds)){
            return 0;
        }

        int count = 0;
        PlayCountDcs item = new PlayCountDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String openCourtInfoId : openCourtInfoIds) {
            item.setOpenCourtInfoId(openCourtInfoId);
            count += updatePlayCount(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertPlayCounts(List<PlayCountDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return playCountDcsDao.insertRecords(items);
	}
	
	/**
	 * playCountDao setter
	 */
	public void setPlayCountDcsDao(PlayCountDcsDao playCountDcsDao){
		this.playCountDcsDao = playCountDcsDao;
	}
}