package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.DemondLogDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：DemondLogService 
 * @version 1.0.0
 */
public interface DemondLogDcsService extends BaseService {
	
	public DemondLogDcs getDemondLogByLogId(String logId);
	

	public List<DemondLogDcs> getDemondLogsByLogIds(String[] logIds);

	public Integer getMaxRecord();

	public int getTotalDemondLog(DemondLogDcs item);
	
	public List<DemondLogDcs> getDemondLogList(DemondLogDcs item,int offset,int limit);
	
	public int insertDemondLog(DemondLogDcs item);
	
	public int insertDemondLogs(List<DemondLogDcs> items);
	
	public int updateDemondLog(DemondLogDcs item);
	
	public int deleteDemondLogByLogId(String logId);
	
	public int delLogicDemondLogByLogId(String logId);
	
	public int deleteDemondLogsByLogIds(String[] logIds);
	
	public int delLogicDemondLogsByLogIds(String[] logIds);

}