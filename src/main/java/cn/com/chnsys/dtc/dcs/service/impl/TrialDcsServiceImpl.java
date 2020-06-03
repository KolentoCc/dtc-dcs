package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.DcsConstants;
import cn.com.chnsys.dtc.dcs.dao.TrialDcsDao;
import cn.com.chnsys.dtc.dcs.dto.ProvinceLivingTrialInfoDto;
import cn.com.chnsys.dtc.dcs.entity.InTimeTrialNumEntity;
import cn.com.chnsys.dtc.dcs.entity.SortRequestEntity;
import cn.com.chnsys.dtc.dcs.entity.TrialDcs;
import cn.com.chnsys.dtc.dcs.service.TrialDcsService;
import cn.com.chnsys.dtc.dcs.vo.ProvinceLivingTrialInfoVo;

/**
 * @项目名称：chnsys-dtc
 * @类名称：TrialServiceImpl
 * @version 1.0.0
 */
public class TrialDcsServiceImpl extends AbstractService implements TrialDcsService {
	/**
	 * trialDao
	 */
	private TrialDcsDao trialDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrialDcs getTrialByTrialId(String trialId) {
		return trialDcsDao.getRecordById(trialId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrialDcs getTrialByInterfaceId(Integer courtCode, String interfaceId) {
		return trialDcsDao.getRecordByInterfaceId(courtCode, interfaceId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalTrial(TrialDcs item) {
		return trialDcsDao.getTotalRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return trialDcsDao.getMaxRecord();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialDcs> getTrialList(TrialDcs item, int offset, int limit) {
		return trialDcsDao.getRecords(item, new RowBounds(offset, limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrial(TrialDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return trialDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateTrial(TrialDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return trialDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialByTrialId(String trialId) {
		return trialDcsDao.deleteRecordById(trialId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialByTrialId(String trialId) {
		TrialDcs item = new TrialDcs();
		item.setTrialId(trialId);
		item.setDeleteFlag(Constant.BOOLEAN_NO);
		item.setDeleteTime(DateTimeUtil.getNow());
		return updateTrial(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<TrialDcs> getTrialsByTrialIds(String[] trialIds) {
		if (CollectionUtil.isEmpty(trialIds)) {
			return Collections.emptyList();
		}
		return trialDcsDao.getRecordsByIds(trialIds);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteTrialsByTrialIds(String[] trialIds) {
		if (CollectionUtil.isEmpty(trialIds)) {
			return 0;
		}
		return trialDcsDao.deleteRecordsByIds(trialIds);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicTrialsByTrialIds(String[] trialIds) {
		if (CollectionUtil.isEmpty(trialIds)) {
			return 0;
		}

		int count = 0;
		TrialDcs item = new TrialDcs();
		item.setDeleteFlag(Constant.BOOLEAN_NO);
		item.setDeleteTime(DateTimeUtil.getNow());
		for (String trialId : trialIds) {
			item.setTrialId(trialId);
			count += updateTrial(item);
		}
		return count;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertTrials(List<TrialDcs> items) {
		if (CollectionUtil.isEmpty(items)) {
			return 0;
		}
		return trialDcsDao.insertRecords(items);
	}

	@Override
	public List<TrialDcs> getCurrentDayTrials(String date) {
		return trialDcsDao.getCurrentDayTrials(date);
	}

	/**
	 * trialDao setter
	 */
	public void setTrialDcsDao(TrialDcsDao trialDcsDao) {
		this.trialDcsDao = trialDcsDao;
	}

	@Override
	public Map<Integer, TrialDcs> getTrialsByOther(String startDate, String endDate, String courtCode, String caseNum,
			Integer trialState, Integer openCourtStyle, SortRequestEntity[] sortObj, Integer pageIndex,
			Integer pageSize, int offset, int limit) {
		Map<Integer, TrialDcs> trialMap = null;
		List<TrialDcs> trialList = null;
		/*
		 * String[] sortFields = new String[sortObj.length]; String[] sortOrders
		 * = new String[sortObj.length]; for(int i=0;i<sortObj.length;i++) {
		 * sortFields[i] = sortObj[i].getSortField(); sortOrders[i] =
		 * sortObj[i].getSortOrder(); }
		 */
		switch (trialState) {
		case DcsConstants.TRIAL_STATUS_PREPARING:
			trialList = trialDcsDao.selectTrialsPrepare(startDate, endDate, courtCode, caseNum, trialState,
					openCourtStyle, sortObj, pageIndex, pageSize, new RowBounds(offset, limit));
			break;
		case DcsConstants.TRIAL_STATUS_DOING:
			trialList = trialDcsDao.selectTrialsNow(startDate, endDate, courtCode, caseNum, trialState, openCourtStyle,
					sortObj, pageIndex, pageSize, new RowBounds(offset, limit));
			break;
		case DcsConstants.TRIAL_STATUS_PAUSED:
			trialList = trialDcsDao.selectTrialsAdjourn(startDate, endDate, courtCode, caseNum, trialState,
					openCourtStyle, sortObj, pageIndex, pageSize, new RowBounds(offset, limit));
			break;
		case DcsConstants.TRIAL_STATUS_ENDED:
			trialList = trialDcsDao.selectTrialsClose(startDate, endDate, courtCode, caseNum, trialState,
					openCourtStyle, sortObj, pageIndex, pageSize, new RowBounds(offset, limit));
			break;
		case DcsConstants.TRIAL_STATUS_OTHERS:
			trialList = trialDcsDao.selectTrialsOthers(startDate, endDate, courtCode, caseNum, trialState,
					openCourtStyle, sortObj, pageIndex, pageSize, new RowBounds(offset, limit));
			break;
		default:
			break;
		}
		if (!CollectionUtil.isEmpty(trialList)) {
			for (TrialDcs entity : trialList) {
				trialMap = new HashMap<Integer, TrialDcs>();
				trialMap.put(entity.getUnitCode(), entity);
			}
		}
		return trialMap;
	}

	@Override
	public Map<String, Map<String, List<InTimeTrialNumEntity>>> getInTimeTrialNumByQueryParams(String[] courtCodes,
			Integer trialType, Integer trialState, Integer openCourtStyle, Integer groupType, String startTime,
			String endTime, Integer isMergeByDateRange, String DateRange, Integer courtRoomType,
			Integer isInternetTrial, Integer[] trialStates,Integer[] openCourtStyles) {
		Map<String, Map<String, List<InTimeTrialNumEntity>>> dateMap = new HashMap<String, Map<String, List<InTimeTrialNumEntity>>>();
		List<InTimeTrialNumEntity> list = trialDcsDao.getInTimeTrialNumByQueryParams(courtCodes, trialType, trialState,
				openCourtStyle, groupType, startTime, endTime, isMergeByDateRange, DateRange, courtRoomType, isInternetTrial ,trialStates,openCourtStyles);
		if (CollectionUtil.isNotEmpty(list)) {
			Map<String, List<InTimeTrialNumEntity>> courtMap = new HashMap<String, List<InTimeTrialNumEntity>>();
			for (InTimeTrialNumEntity entity : list) {
				if(isMergeByDateRange == 0){
				if(!dateMap.keySet().contains(entity.getTime())){
					courtMap = new HashMap<String, List<InTimeTrialNumEntity>>();
					dateMap.put(entity.getTime(), courtMap);
				}else {
					courtMap = dateMap.get(entity.getTime());
				}	
				if (!courtMap.keySet().contains(entity.getCourtCode())) {
					courtMap.put(entity.getCourtCode(), new ArrayList<InTimeTrialNumEntity>());
				}
				courtMap.get(entity.getCourtCode()).add(entity);
			}else if (isMergeByDateRange == 1){
				if(dateMap.size() == 0){
				//不按时间合并时，默认时间和从bi库插时的结果保持一致
				dateMap.put("20100101", courtMap);
				}
				if (courtMap.get(entity.getCourtCode()) == null) {
					courtMap.put(entity.getCourtCode(), new ArrayList<InTimeTrialNumEntity>());
				}
				List<InTimeTrialNumEntity> a = courtMap.get(entity.getCourtCode());
				a.add(entity);
			}
			} 
		}
		return dateMap;	
	}

	@Override
	public Long totalTrialByDateRange(String startDate, String endDate) {
		
		return trialDcsDao.totalTrialByDateRange(startDate, endDate);
	}
	
	@Override
	public Long totalTrialByDateRangeAndCourtCode(String courtCode, String startDate, String endDate) {
		return trialDcsDao.totalTrialByDateRangeAndCourtCode(courtCode, startDate, endDate);
	}

	@Override
	public TrialDcs getEarliestDate() {
		return trialDcsDao.getEarliestDate();
	}

	@Override
	public List<String> getTrialIdByStartEndDate(String startDate, String endDate, int offset, int limit) {
		return trialDcsDao.getTrialIdByStartEndDate(startDate, endDate, new RowBounds(offset,limit));
	}
	
	@Override
	public List<String> getTrialIdByStartEndDateAndCourtCode(String courtCode, String startDate, String endDate, int offset, int limit) {
		return trialDcsDao.getTrialIdByStartEndDateAndCourtCode(courtCode, startDate, endDate, new RowBounds(offset,limit));
	}

	@Override
	public List<TrialDcs> getTrials(int deleteFlag, String caseNum, Integer unitCode, String courtRoomId,Integer trialState,List<Integer> unitCodeList, int offset,
			int limit) {
		return trialDcsDao.getTrials(deleteFlag, caseNum, unitCode, courtRoomId,trialState,unitCodeList, offset, limit);
	}

	@Override
	public List<ProvinceLivingTrialInfoDto> getProvinceLivingTrialInfo(ProvinceLivingTrialInfoVo provinceLivingTrialInfoVo) {
		return trialDcsDao.getProvinceLivingTrialInfo(provinceLivingTrialInfoVo);
	}

	@Override
	public Integer totalProvinceLivingTrialInfo(ProvinceLivingTrialInfoVo provinceLivingTrialInfoVo) {
		return trialDcsDao.totalProvinceLivingTrialInfo(provinceLivingTrialInfoVo);
	}



	
	
}