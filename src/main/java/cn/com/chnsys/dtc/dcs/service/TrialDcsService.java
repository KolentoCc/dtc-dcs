package cn.com.chnsys.dtc.dcs.service;

import java.util.List;
import java.util.Map;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.dto.ProvinceLivingTrialInfoDto;
import cn.com.chnsys.dtc.dcs.entity.InTimeTrialNumEntity;
import cn.com.chnsys.dtc.dcs.entity.SortRequestEntity;
import cn.com.chnsys.dtc.dcs.entity.TrialDcs;
import cn.com.chnsys.dtc.dcs.vo.ProvinceLivingTrialInfoVo;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：TrialService 
 * @version 1.0.0
 */
public interface TrialDcsService extends BaseService {
	
	public TrialDcs getTrialByTrialId(String trialId);
	
	public TrialDcs getTrialByInterfaceId(Integer courtCode, String interfaceId);

 	public List<TrialDcs> getTrialsByTrialIds(String[] trialIds);
 	
 	public List<TrialDcs> getCurrentDayTrials(String date);

	public Integer getMaxRecord();

	public int getTotalTrial(TrialDcs item);
	
	public List<TrialDcs> getTrialList(TrialDcs item,int offset,int limit);
	
	public int insertTrial(TrialDcs item);
	
	public int insertTrials(List<TrialDcs> items);
	
	public int updateTrial(TrialDcs item);
	
	public int deleteTrialByTrialId(String trialId);
	
	public int delLogicTrialByTrialId(String trialId);
	
	public int deleteTrialsByTrialIds(String[] trialIds);
	
	public int delLogicTrialsByTrialIds(String[] trialIds);
	
	public Map<Integer, TrialDcs> getTrialsByOther(String startDate, String endDate, String courtCode, 
			String caseNum, Integer trialState, Integer openCourtStyle,SortRequestEntity[] sortObj, 
			Integer pageIndex, Integer pageSize, int offset, int limit);
	
	public Map<String, Map<String, List<InTimeTrialNumEntity>>> getInTimeTrialNumByQueryParams(String[] courtCodes,Integer trialType, Integer trialState,
			Integer openCourtStyle, Integer groupType, String startTime, String endTime, Integer isMergeByDateRange, String DateRange, Integer courtRoomType,
			Integer isInternetTrial, Integer[] trialStateList, Integer[] openCourtStyles);
	
	
	/**
	 * 根据预定开始时间，结束时间，获取总的排期数量
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public Long totalTrialByDateRange(String startDate, String endDate);
	
	
	/**
	 * 根据法院代码，预定开始时间，结束时间，获取总的排期数量
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public Long totalTrialByDateRangeAndCourtCode(String courtCode, String startDate, String endDate);
	/**
	 * 获取开始时间最早日期那条数据
	 */
	public TrialDcs getEarliestDate();
	/**
	 * 根据预定开始时间，结束时间，分页获取排期id列表
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<String> getTrialIdByStartEndDate(String startDate,String endDate, int offset, int limit);
	
	/**
	 * 根据法院代码，预定开始时间，结束时间，分页获取排期id列表
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<String> getTrialIdByStartEndDateAndCourtCode(String courtCode, String startDate, String endDate, int offset, int limit);
	
	public List<TrialDcs> getTrials(int deleteFlag,String caseNum,Integer unitCode,
			String courtRoomId,Integer trialState,List<Integer> unitCodeList,int offset,int limit);
	/**
	 * 获取全省的正在直播的排期的相关信息
	 * @Title: getProvinceLivingTrialInfo
	 * @param provinceLivingTrialInfoVo
	 * @return 
	 * @author liyujie
	 * @date 2019年7月18日 下午4:01:29
	 */
	public List<ProvinceLivingTrialInfoDto> getProvinceLivingTrialInfo(ProvinceLivingTrialInfoVo provinceLivingTrialInfoVo);
	/**
	 * 获取全省的正在直播的排期的总数
	 * @Title: totalProvinceLivingTrialInfo
	 * @param provinceLivingTrialInfoVo
	 * @return 
	 * @author liyujie
	 * @date 2019年7月18日 下午4:03:17
	 */
	public Integer totalProvinceLivingTrialInfo(ProvinceLivingTrialInfoVo provinceLivingTrialInfoVo);
}