package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import cn.com.chnsys.dtc.dcs.dao.TrialRecordDcsDao;
import cn.com.chnsys.dtc.dcs.service.TrialRecordDcsService;
import cn.com.chnsys.dtc.dcs.entity.TrialRecordDcs;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.framework.AbstractService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：TrialRecordDcsServiceImpl
 * @version 1.0.0
 */
public class TrialRecordDcsServiceImpl extends AbstractService implements TrialRecordDcsService {
    /**
     * trialRecordDcsDao
     */	
	private TrialRecordDcsDao trialRecordDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrialRecordDcs getTrialRecordDcsByNoteId(String noteId){
		return trialRecordDcsDao.getRecordById(noteId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalTrialRecordDcs(TrialRecordDcs item) {
		return trialRecordDcsDao.getTotalRecord(item);
	}
	
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialRecordDcs> getTrialRecordDcsList(TrialRecordDcs item, int offset,int limit) {
		return trialRecordDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialRecordDcs(TrialRecordDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return trialRecordDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateTrialRecordDcs(TrialRecordDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return trialRecordDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialRecordDcsByNoteId(String noteId) {
		return trialRecordDcsDao.deleteRecordById(noteId);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialRecordDcs> getTrialRecordDcssByNoteIds(String[] noteIds){
        if(CollectionUtil.isEmpty(noteIds))
            return Collections.emptyList();
        return trialRecordDcsDao.getRecordsByIds(noteIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialRecordDcssByNoteIds(String[] noteIds){
		if(CollectionUtil.isEmpty(noteIds))
            return 0;
		return trialRecordDcsDao.deleteRecordsByIds(noteIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialRecordDcss(List<TrialRecordDcs> items){
	    if(CollectionUtil.isEmpty(items))
            return 0;
		return trialRecordDcsDao.insertRecords(items);
	}
	
	/**
	 * trialRecordDcsDao setter
	 */
	public void setTrialRecordDcsDao(TrialRecordDcsDao trialRecordDcsDao){
		this.trialRecordDcsDao = trialRecordDcsDao;
	}
}