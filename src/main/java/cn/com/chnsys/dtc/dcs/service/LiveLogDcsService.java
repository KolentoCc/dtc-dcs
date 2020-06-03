package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.LiveLogDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：LiveLogService 
 * @version 1.0.0
 */
public interface LiveLogDcsService extends BaseService {
	
	public LiveLogDcs getLiveLogByLogId(String logId);
	

	public List<LiveLogDcs> getLiveLogsByLogIds(String[] logIds);

	public Integer getMaxRecord();

	public int getTotalLiveLog(LiveLogDcs item);
	
	public List<LiveLogDcs> getLiveLogList(LiveLogDcs item,int offset,int limit);
	
	public int insertLiveLog(LiveLogDcs item);
	
	public int insertLiveLogs(List<LiveLogDcs> items);
	
	public int updateLiveLog(LiveLogDcs item);
	
	public int deleteLiveLogByLogId(String logId);
	
	public int delLogicLiveLogByLogId(String logId);
	
	public int deleteLiveLogsByLogIds(String[] logIds);
	
	public int delLogicLiveLogsByLogIds(String[] logIds);

}