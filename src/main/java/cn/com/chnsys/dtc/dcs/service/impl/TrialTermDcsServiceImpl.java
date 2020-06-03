package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.TrialTermDcsDao;
import cn.com.chnsys.dtc.dcs.entity.TrialTermDcs;
import cn.com.chnsys.dtc.dcs.service.TrialTermDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：TrialTermServiceImpl
 * @version 1.0.0
 */
public class TrialTermDcsServiceImpl extends AbstractService implements TrialTermDcsService {
    /**
     * trialTermDao
     */	
	private TrialTermDcsDao trialTermDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrialTermDcs getTrialTermByCaseId(String caseId){
		return trialTermDcsDao.getRecordById(caseId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalTrialTerm(TrialTermDcs item) {
		return trialTermDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return trialTermDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialTermDcs> getTrialTermList(TrialTermDcs item, int offset,int limit) {
		return trialTermDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialTerm(TrialTermDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return trialTermDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateTrialTerm(TrialTermDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return trialTermDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialTermByCaseId(String caseId) {
		return trialTermDcsDao.deleteRecordById(caseId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialTermByCaseId(String caseId) {
		TrialTermDcs item = new TrialTermDcs();
		item.setCaseId(caseId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateTrialTerm(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialTermDcs> getTrialTermsByCaseIds(String[] caseIds){
        if(CollectionUtil.isEmpty(caseIds)){
            return Collections.emptyList();
        }
        return trialTermDcsDao.getRecordsByIds(caseIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialTermsByCaseIds(String[] caseIds){
		if(CollectionUtil.isEmpty(caseIds)){
            return 0;
        }
		return trialTermDcsDao.deleteRecordsByIds(caseIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialTermsByCaseIds(String[] caseIds){
		if(CollectionUtil.isEmpty(caseIds)){
            return 0;
        }

        int count = 0;
        TrialTermDcs item = new TrialTermDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String caseId : caseIds) {
            item.setCaseId(caseId);
            count += updateTrialTerm(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrialTerms(List<TrialTermDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return trialTermDcsDao.insertRecords(items);
	}
	
	/**
	 * trialTermDao setter
	 */
	public void setTrialTermDcsDao(TrialTermDcsDao trialTermDcsDao){
		this.trialTermDcsDao = trialTermDcsDao;
	}
}