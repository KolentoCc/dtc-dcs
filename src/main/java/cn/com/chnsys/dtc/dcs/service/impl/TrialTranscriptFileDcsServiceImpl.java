package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import cn.com.chnsys.dtc.dcs.dao.TrialTranscriptFileDcsDao;
import cn.com.chnsys.dtc.dcs.service.TrialTranscriptFileDcsService;
import cn.com.chnsys.dtc.dcs.entity.TrialTranscriptFileDcs;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：TrialTranscriptFileDcsServiceImpl
 * @version 1.0.0
 */
public class TrialTranscriptFileDcsServiceImpl extends AbstractService implements TrialTranscriptFileDcsService {
    /**
     * trialTranscriptFileDcsDao
     */	
	private TrialTranscriptFileDcsDao trialTranscriptFileDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrialTranscriptFileDcs getTrialTranscriptFileDcsByTrialId(String trialId){
		return trialTranscriptFileDcsDao.getRecordById(trialId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalTrialTranscriptFileDcs(TrialTranscriptFileDcs item) {
		return trialTranscriptFileDcsDao.getTotalRecord(item);
	}
	
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialTranscriptFileDcs> getTrialTranscriptFileDcsList(TrialTranscriptFileDcs item, int offset,int limit) {
		return trialTranscriptFileDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialTranscriptFileDcs(TrialTranscriptFileDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return trialTranscriptFileDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateTrialTranscriptFileDcs(TrialTranscriptFileDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return trialTranscriptFileDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialTranscriptFileDcsByTrialId(String trialId) {
		return trialTranscriptFileDcsDao.deleteRecordById(trialId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialTranscriptFileDcsByTrialId(String trialId) {
		TrialTranscriptFileDcs item = new TrialTranscriptFileDcs();
		item.setTrialId(trialId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateTrialTranscriptFileDcs(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialTranscriptFileDcs> getTrialTranscriptFileDcssByTrialIds(String[] trialIds){
        if(CollectionUtil.isEmpty(trialIds)){
            return Collections.emptyList();
        }
        return trialTranscriptFileDcsDao.getRecordsByIds(trialIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialTranscriptFileDcssByTrialIds(String[] trialIds){
		if(CollectionUtil.isEmpty(trialIds)){
            return 0;
        }
		return trialTranscriptFileDcsDao.deleteRecordsByIds(trialIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialTranscriptFileDcssByTrialIds(String[] trialIds){
		if(CollectionUtil.isEmpty(trialIds)){
            return 0;
        }

        int count = 0;
        TrialTranscriptFileDcs item = new TrialTranscriptFileDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String trialId : trialIds) {
            item.setTrialId(trialId);
            count += updateTrialTranscriptFileDcs(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialTranscriptFileDcss(List<TrialTranscriptFileDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return trialTranscriptFileDcsDao.insertRecords(items);
	}
	
	/**
	 * trialTranscriptFileDcsDao setter
	 */
	public void setTrialTranscriptFileDcsDao(TrialTranscriptFileDcsDao trialTranscriptFileDcsDao){
		this.trialTranscriptFileDcsDao = trialTranscriptFileDcsDao;
	}
}