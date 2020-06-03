package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.dtc.dcs.dao.CaseInfoDcsDao;
import cn.com.chnsys.dtc.dcs.service.CaseInfoDcsService;
import cn.com.chnsys.dtc.dcs.entity.CaseInfoDcs;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：CaseInfoDcsServiceImpl
 * @version 1.0.0
 */
public class CaseInfoDcsServiceImpl extends AbstractService implements CaseInfoDcsService {
    /**
     * caseInfoDcsDao
     */	
	private CaseInfoDcsDao caseInfoDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CaseInfoDcs getCaseInfoDcsByCaseId(String caseId){
		return caseInfoDcsDao.getRecordById(caseId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CaseInfoDcs getCaseInfoDcsByInterfaceId(Integer courtCode, String interfaceId) {
		return caseInfoDcsDao.getRecordByInterfaceId(courtCode, interfaceId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalCaseInfoDcs(CaseInfoDcs item) {
		return caseInfoDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return caseInfoDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<CaseInfoDcs> getCaseInfoDcsList(CaseInfoDcs item, int offset,int limit) {
		return caseInfoDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCaseInfoDcs(CaseInfoDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return caseInfoDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateCaseInfoDcs(CaseInfoDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return caseInfoDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCaseInfoDcsByCaseId(String caseId) {
		return caseInfoDcsDao.deleteRecordById(caseId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCaseInfoDcsByCaseId(String caseId) {
		CaseInfoDcs item = new CaseInfoDcs();
		item.setCaseId(caseId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateCaseInfoDcs(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<CaseInfoDcs> getCaseInfoDcssByCaseIds(String[] caseIds){
        if(CollectionUtil.isEmpty(caseIds)){
            return Collections.emptyList();
        }
        return caseInfoDcsDao.getRecordsByIds(caseIds);
	}
	
	@Override
	public List<CaseInfoDcs> getCaseInfoDcssByInterfaceIds(String[] caseIds) {
		 if(CollectionUtil.isEmpty(caseIds)){
	            return Collections.emptyList();
	        }
	        return caseInfoDcsDao.getRecordsByInterfaceIds(caseIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCaseInfoDcssByCaseIds(String[] caseIds){
		if(CollectionUtil.isEmpty(caseIds)){
            return 0;
        }
		return caseInfoDcsDao.deleteRecordsByIds(caseIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCaseInfoDcssByCaseIds(String[] caseIds){
		if(CollectionUtil.isEmpty(caseIds)){
            return 0;
        }

        int count = 0;
        CaseInfoDcs item = new CaseInfoDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String caseId : caseIds) {
            item.setCaseId(caseId);
            count += updateCaseInfoDcs(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCaseInfoDcss(List<CaseInfoDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return caseInfoDcsDao.insertRecords(items);
	}
	
	/**
	 * caseInfoDcsDao setter
	 */
	public void setCaseInfoDcsDao(CaseInfoDcsDao caseInfoDcsDao){
		this.caseInfoDcsDao = caseInfoDcsDao;
	}

	@Override
	public CaseInfoDcs getCaseInfoWithCourtCodeInfoByCaseId(String caseId) {
		return caseInfoDcsDao.getCaseInfoWithCourtCodeInfoByCaseId(caseId);
	}

	@Override
	public CaseInfoDcs getEarliestDate() {
		return this.caseInfoDcsDao.getEarliestDate();
	}

	@Override
	public List<String> getCaseIdByStartEndDate(String startDate, String endDate, int offset, int limit) {
		return this.caseInfoDcsDao.getCaseIdByStartEndDate(startDate, endDate, new RowBounds(offset,limit));
	}
	
	/**
	 * 根据法院代码，立案日期获取案件id列表
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	@Override
	public List<String> getCaseIdByStartEndDateAndCourtCode(String courtCode, String startDate, String endDate, int offset, int limit){
		return this.caseInfoDcsDao.getCaseIdByStartEndDateAndCourtCode(courtCode, startDate, endDate, new RowBounds(offset, limit));
	}

	@Override
	public List<CaseInfoDcs> getCaseInfos(String caseNum, Integer caseType, Integer deleteFlag, Date deleteTime,
			List<Integer> unitCodeList, int offset, int limit) {
		return caseInfoDcsDao.getCaseInfos(caseNum, caseType, deleteFlag, deleteTime, unitCodeList, offset, limit);
	}

	@Override
	public Long totalCaseInfoByDateRange(String startDate, String endDate) {
		return this.caseInfoDcsDao.totalCaseInfoByDateRange(startDate, endDate);
	}

	@Override
	public Long totalCaseInfoByDateRangeAndCourtCode(String courtCode, String startDate, String endDate) {
		return this.caseInfoDcsDao.totalCaseInfoByDateRangeAndCourtCode(courtCode, startDate, endDate);
	}
}
