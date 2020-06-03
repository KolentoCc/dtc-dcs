package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.dtc.dcs.dao.CaseCauseDcsDao;
import cn.com.chnsys.dtc.dcs.entity.CaseCauseDcs;
import cn.com.chnsys.dtc.dcs.service.CaseCauseDcsService;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：CaseCauseServiceImpl
 * @version 1.0.0
 */
public class CaseCauseDcsServiceImpl extends AbstractService implements CaseCauseDcsService {
    /**
     * caseCauseDao
     */	
	private CaseCauseDcsDao caseCauseDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CaseCauseDcs getCaseCauseByCaseCauseId(String caseCauseId){
		return caseCauseDcsDao.getRecordById(caseCauseId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalCaseCause(CaseCauseDcs item) {
		return caseCauseDcsDao.getTotalRecord(item);
	}
	
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<CaseCauseDcs> getCaseCauseList(CaseCauseDcs item, int offset,int limit) {
		return caseCauseDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCaseCause(CaseCauseDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return caseCauseDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateCaseCause(CaseCauseDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return caseCauseDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCaseCauseByCaseCauseId(String caseCauseId) {
		return caseCauseDcsDao.deleteRecordById(caseCauseId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCaseCauseByCaseCauseId(String caseCauseId) {
		CaseCauseDcs item = new CaseCauseDcs();
		item.setCaseCauseId(caseCauseId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateCaseCause(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<CaseCauseDcs> getCaseCausesByCaseCauseIds(String[] caseCauseIds){
        if(CollectionUtil.isEmpty(caseCauseIds)){
            return Collections.emptyList();
        }
        return caseCauseDcsDao.getRecordsByIds(caseCauseIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCaseCausesByCaseCauseIds(String[] caseCauseIds){
		if(CollectionUtil.isEmpty(caseCauseIds)){
            return 0;
        }
		return caseCauseDcsDao.deleteRecordsByIds(caseCauseIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCaseCausesByCaseCauseIds(String[] caseCauseIds){
		if(CollectionUtil.isEmpty(caseCauseIds)){
            return 0;
        }

        int count = 0;
        CaseCauseDcs item = new CaseCauseDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String caseCauseId : caseCauseIds) {
            item.setCaseCauseId(caseCauseId);
            count += updateCaseCause(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCaseCauses(List<CaseCauseDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return caseCauseDcsDao.insertRecords(items);
	}
	
	/**
	 * caseCauseDao setter
	 */
	public void setCaseCauseDcsDao(CaseCauseDcsDao caseCauseDcsDao){
		this.caseCauseDcsDao = caseCauseDcsDao;
	}


	@Override
	public List<CaseCauseDcs> getCaseCausesByCaseID(String caseID) {
		return caseCauseDcsDao.selectCaseCausesByCaseID(caseID);
	}
}