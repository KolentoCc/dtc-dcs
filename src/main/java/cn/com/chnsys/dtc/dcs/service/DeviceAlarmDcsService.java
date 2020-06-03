package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.DeviceAlarmDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：DeviceAlarmService 
 * @version 1.0.0
 */
public interface DeviceAlarmDcsService extends BaseService {
	
	public DeviceAlarmDcs getDeviceAlarmByAlarmLogId(String alarmLogId);
	
	public DeviceAlarmDcs getDeviceAlarmByInterfaceId(Integer courtCode, String interfaceId);

	public List<DeviceAlarmDcs> getDeviceAlarmsByAlarmLogIds(String[] alarmLogIds);

	public Integer getMaxRecord();

	public int getTotalDeviceAlarm(DeviceAlarmDcs item);
	
	public List<DeviceAlarmDcs> getDeviceAlarmList(DeviceAlarmDcs item,int offset,int limit);
	
	public int insertDeviceAlarm(DeviceAlarmDcs item);
	
	public int insertDeviceAlarms(List<DeviceAlarmDcs> items);
	
	public int updateDeviceAlarm(DeviceAlarmDcs item);
	
	public int deleteDeviceAlarmByAlarmLogId(String alarmLogId);
	
	public int delLogicDeviceAlarmByAlarmLogId(String alarmLogId);
	
	public int deleteDeviceAlarmsByAlarmLogIds(String[] alarmLogIds);
	
	public int delLogicDeviceAlarmsByAlarmLogIds(String[] alarmLogIds);

}