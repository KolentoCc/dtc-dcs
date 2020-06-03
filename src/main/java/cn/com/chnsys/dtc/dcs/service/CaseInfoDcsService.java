package cn.com.chnsys.dtc.dcs.service;

import java.util.Date;
import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.CaseInfoDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CaseInfoDcsService 
 * @version 1.0.0
 */
public interface CaseInfoDcsService extends BaseService {
	
	public CaseInfoDcs getCaseInfoDcsByCaseId(String caseId);
	
	public CaseInfoDcs getCaseInfoDcsByInterfaceId(Integer courtCode, String interfaceId);

	public List<CaseInfoDcs> getCaseInfoDcssByCaseIds(String[] caseIds);
	
	public List<CaseInfoDcs> getCaseInfoDcssByInterfaceIds(String[] caseIds);

	public Integer getMaxRecord();

	public int getTotalCaseInfoDcs(CaseInfoDcs item);
	
	public List<CaseInfoDcs> getCaseInfoDcsList(CaseInfoDcs item,int offset,int limit);
	
	public int insertCaseInfoDcs(CaseInfoDcs item);
	
	public int insertCaseInfoDcss(List<CaseInfoDcs> items);
	
	public int updateCaseInfoDcs(CaseInfoDcs item);
	
	public int deleteCaseInfoDcsByCaseId(String caseId);
	
	public int delLogicCaseInfoDcsByCaseId(String caseId);
	
	public int deleteCaseInfoDcssByCaseIds(String[] caseIds);
	
	public int delLogicCaseInfoDcssByCaseIds(String[] caseIds);
	
	public CaseInfoDcs getCaseInfoWithCourtCodeInfoByCaseId(String caseId);
	
    /**
	 * 根据开庭时间获取案件信息数量
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public Long totalCaseInfoByDateRange(String startDate, String endDate);
	/**
	 * 根据法院代码,立案日期获取案件id列表
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public Long totalCaseInfoByDateRangeAndCourtCode(String courtCode, String startDate, String endDate);
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
	public List<String> getCaseIdByStartEndDate(String startDate, String endDate, int offset, int limit);
	/**
	 * 根据法院代码，立案日期获取案件id列表
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<String> getCaseIdByStartEndDateAndCourtCode(String courtCode, String startDate, String endDate, int offset, int limit);
	/**
	 * 根据删除时间和删除标记查询案件信息
	 * @Title: getCaseInfos
	 * @param item
	 * @return 
	 * @author wangxq
	 * @date 2019年3月27日 上午11:42:58
	 */
	public List<CaseInfoDcs> getCaseInfos(String caseNum,Integer caseType,
			Integer deleteFlag,Date deleteTime,List<Integer> unitCodeList,
			int offset,int limit);

}