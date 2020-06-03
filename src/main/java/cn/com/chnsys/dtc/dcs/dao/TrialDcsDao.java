package cn.com.chnsys.dtc.dcs.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.dcs.dto.ProvinceLivingTrialInfoDto;
import cn.com.chnsys.dtc.dcs.entity.InTimeTrialNumEntity;
import cn.com.chnsys.dtc.dcs.entity.SortRequestEntity;
import cn.com.chnsys.dtc.dcs.entity.TrialDcs;
import cn.com.chnsys.dtc.dcs.vo.ProvinceLivingTrialInfoVo;
/** 
 * @项目名称：chnsys-dtc 
 * @类名称：TrialDao 
 * @version 1.0.0
 */
public interface TrialDcsDao extends BaseDao<TrialDcs> {
    /**
     * 根据法院代码和接口标识，获取记录信息
     *
     * @param <T> 返回类型泛型
     * @param courtCode 法院代码
     * @param interfaceId 接口标识
     * @return 查询的结果
     *
     */
    public TrialDcs getRecordByInterfaceId(Integer courtCode, String interfaceId);
    
    public List<TrialDcs> getCurrentDayTrials(String date);

	public List<TrialDcs> selectTrialsPrepare(
			@Param("scheduledStartTime") String startDate, 
			@Param("scheduledEndTime") String endDate, 
			@Param("unitCode") String courtCode, 
			@Param("caseNum") String caseNum,
			@Param("trialState") Integer trialState, 
			@Param("openCourtStyle") Integer openCourtStyle, 
			@Param("array") SortRequestEntity[] sortobj, 
			@Param("pageIndex") Integer pageIndex,
			@Param("pageSize") Integer pageSize,
			RowBounds rowBounds);
	
	public List<TrialDcs> selectTrialsNow(
			@Param("actualStartTime") String startDate, 
			@Param("scheduledEndTime") String endDate, 
			@Param("unitCode") String courtCode, 
			@Param("caseNum") String caseNum,
			@Param("trialState") Integer trialState, 
			@Param("openCourtStyle") Integer openCourtStyle, 
			@Param("array") SortRequestEntity[] sortobj, 
			@Param("pageIndex") Integer pageIndex,
			@Param("pageSize") Integer pageSize,
			RowBounds rowBounds);
	
	public List<TrialDcs> selectTrialsAdjourn(
			@Param("actualStartTime") String startDate, 
			@Param("scheduledEndTime") String endDate, 
			@Param("unitCode") String courtCode, 
			@Param("caseNum") String caseNum,
			@Param("trialState") Integer trialState, 
			@Param("openCourtStyle") Integer openCourtStyle, 
			@Param("array") SortRequestEntity[] sortobj, 
			@Param("pageIndex") Integer pageIndex,
			@Param("pageSize") Integer pageSize,
			RowBounds rowBounds);
	
	public List<TrialDcs> selectTrialsClose(
			@Param("actualStartTime") String startDate, 
			@Param("actualEndTime") String endDate, 
			@Param("unitCode") String courtCode, 
			@Param("caseNum") String caseNum,
			@Param("trialState") Integer trialState, 
			@Param("openCourtStyle") Integer openCourtStyle, 
			@Param("array") SortRequestEntity[] sortobj, 
			@Param("pageIndex") Integer pageIndex,
			@Param("pageSize") Integer pageSize,
			RowBounds rowBounds);
	
	public List<TrialDcs> selectTrialsOthers(
			@Param("actualStartTime") String startDate, 
			@Param("actualEndTime") String endDate, 
			@Param("unitCode") String courtCode, 
			@Param("caseNum") String caseNum,
			@Param("trialState") Integer trialState, 
			@Param("openCourtStyle") Integer openCourtStyle, 
			@Param("array") SortRequestEntity[] sortobj, 
			@Param("pageIndex") Integer pageIndex,
			@Param("pageSize") Integer pageSize,
			RowBounds rowBounds);
	
	public List<InTimeTrialNumEntity> getInTimeTrialNumByQueryParams(
			@Param("courtCodes") String[] courtCodes,
			@Param("trialType") Integer trialType, @Param("trialState") Integer trialState,
			@Param("openCourtStyle") Integer openCourtStyle, @Param("groupType") Integer groupType,
			@Param("startTime") String startTime, @Param("endTime") String endTime,
			@Param("isMergeByDateRange")Integer isMergeByDateRange,
			@Param("DateRange")String DateRange,
		    @Param("courtRoomType")Integer courtRoomType,
			@Param("isInternetTrial")Integer isInternetTrial,
			@Param("trialStates")Integer[] trialStates,
			@Param("openCourtStyles")Integer[] openCourtStyles);
	
	
	/**
	 * 根据预定开始时间，结束时间，获取总的排期数量
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public Long totalTrialByDateRange(@Param(value="startDate") String startDate, @Param(value="endDate") String endDate);
	/**
	 * 根据法院代码, 预定开始时间，结束时间，获取总的排期数量
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public Long totalTrialByDateRangeAndCourtCode(@Param(value="courtCode") String courtCode, @Param(value="startDate") String startDate, @Param(value="endDate") String endDate);
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
	public List<String> getTrialIdByStartEndDate(@Param(value="startDate") String startDate, @Param(value="endDate") String endDate, RowBounds rowBounds);
	/**
	 * 根据法院代码，预定开始时间，结束时间，分页获取排期id列表
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<String> getTrialIdByStartEndDateAndCourtCode(@Param(value="courtCode")String courtCode, @Param(value="startDate") String startDate, @Param(value="endDate") String endDate, RowBounds rowBounds);
	//20190410
	public List<TrialDcs> getTrials(@Param(value="deleteFlag") int deleteFlag,
			@Param(value="caseNum") String caseNum,
			@Param(value="unitCode") Integer unitCode,
			@Param(value="courtRoomId") String courtRoomId,
			@Param(value="trialState") Integer trialState,
			@Param(value="unitCodeList") List<Integer> unitCodeList,
			@Param(value="offset") int offset,
			@Param(value="limit") int limit);
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