package cn.com.chnsys.dtc.dcs.dao;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.dcs.entity.CaseInfoDcs;
/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CaseInfoDcsDao 
 * @version 1.0.0
 */
public interface CaseInfoDcsDao extends BaseDao<CaseInfoDcs> {
	
	public List<CaseInfoDcs> getRecordsByInterfaceIds(String[] ids);
	
    /**
     * 根据法院代码和接口标识，获取记录信息
     *
     * @param <T> 返回类型泛型
     * @param courtCode 法院代码
     * @param interfaceId 接口标识
     * @return 查询的结果
     *
     */
    public CaseInfoDcs getRecordByInterfaceId(Integer courtCode, String interfaceId);
    /**
     * 根据id查询出案件信息，附带法院名称以及法院级别
     * @param caseId
     * @return
     */
    public CaseInfoDcs getCaseInfoWithCourtCodeInfoByCaseId(String caseId);
    
    
    /**
	 * 根据开庭时间获取案件信息数量
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public Long totalCaseInfoByDateRange(@Param(value="startDate") String startDate, @Param(value="endDate") String endDate);
	/**
	 * 根据开庭时间,法院代码获取案件信息数量
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public Long totalCaseInfoByDateRangeAndCourtCode(@Param(value="courtCode") String courtCode, @Param(value="startDate") String startDate, @Param(value="endDate") String endDate);
	/**
	 * 获取开始时间最早日期那条数据
	 */
	public CaseInfoDcs getEarliestDate();
	/**
	 * 根据立案日期获取案件id列表
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<String> getCaseIdByStartEndDate(@Param(value="startDate") String startDate, @Param(value="endDate") String endDate, RowBounds rowBounds);
	/**
	 * 根据法院代码，立案日期获取案件id列表
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<String> getCaseIdByStartEndDateAndCourtCode(@Param(value="courtCode") String courtCode, @Param(value="startDate") String startDate, @Param(value="endDate") String endDate, RowBounds rowBounds);
	/**
	 * 根据删除时间和删除标记查询案件信息
	 * @Title: getCaseInfos
	 * @param item
	 * @return 
	 * @author wangxq
	 * @date 2019年3月27日 上午11:42:58
	 */
	public List<CaseInfoDcs> getCaseInfos(
			@Param(value="caseNum") String caseNum,
			@Param(value="caseType") Integer caseType,
			@Param(value="deleteFlag") Integer deleteFlag,
			@Param(value="deleteTime") Date deleteTime,
			@Param(value="unitCodeList") List<Integer> unitCodeList,
			@Param(value="offset") int offset,
			@Param(value="limit") int limit);
}