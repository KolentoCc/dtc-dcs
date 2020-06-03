package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.TrialVideoDcsDao;
import cn.com.chnsys.dtc.dcs.entity.TrialVideoDcs;
import cn.com.chnsys.dtc.dcs.service.TrialVideoDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：TrialVideoServiceImpl
 * @version 1.0.0
 */
public class TrialVideoDcsServiceImpl extends AbstractService implements TrialVideoDcsService {
    /**
     * trialVideoDao
     */	
	private TrialVideoDcsDao trialVideoDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrialVideoDcs getTrialVideoByVideoId(String videoId){
		return trialVideoDcsDao.getRecordById(videoId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalTrialVideo(TrialVideoDcs item) {
		return trialVideoDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return trialVideoDcsDao.getMaxRecord();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialVideoDcs> getTrialVideoListByTrialId(String trialId) {
	    TrialVideoDcs item = new TrialVideoDcs();
	    item.setOpenCourtInfoId(trialId);
	    return getTrialVideoList(item, 0, DEFAULT_PAGE_COUNT);
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialVideoDcs> getTrialVideoList(TrialVideoDcs item, int offset,int limit) {
		return trialVideoDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialVideo(TrialVideoDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return trialVideoDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateTrialVideo(TrialVideoDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return trialVideoDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialVideoByVideoId(String videoId) {
		return trialVideoDcsDao.deleteRecordById(videoId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialVideoByVideoId(String videoId) {
		TrialVideoDcs item = new TrialVideoDcs();
		item.setVideoId(videoId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateTrialVideo(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialVideoDcs> getTrialVideosByVideoIds(String[] videoIds){
        if(CollectionUtil.isEmpty(videoIds)){
            return Collections.emptyList();
        }
        return trialVideoDcsDao.getRecordsByIds(videoIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialVideosByVideoIds(String[] videoIds){
		if(CollectionUtil.isEmpty(videoIds)){
            return 0;
        }
		return trialVideoDcsDao.deleteRecordsByIds(videoIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialVideosByVideoIds(String[] videoIds){
		if(CollectionUtil.isEmpty(videoIds)){
            return 0;
        }

        int count = 0;
        TrialVideoDcs item = new TrialVideoDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String videoId : videoIds) {
            item.setVideoId(videoId);
            count += updateTrialVideo(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialVideos(List<TrialVideoDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return trialVideoDcsDao.insertRecords(items);
	}
	
	/**
	 * trialVideoDao setter
	 */
	public void setTrialVideoDcsDao(TrialVideoDcsDao trialVideoDcsDao){
		this.trialVideoDcsDao = trialVideoDcsDao;
	}
}