package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.DeviceAlarmDcsDao;
import cn.com.chnsys.dtc.dcs.entity.DeviceAlarmDcs;
import cn.com.chnsys.dtc.dcs.service.DeviceAlarmDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：DeviceAlarmServiceImpl
 * @version 1.0.0
 */
public class DeviceAlarmDcsServiceImpl extends AbstractService implements DeviceAlarmDcsService {
    /**
     * deviceAlarmDao
     */	
	private DeviceAlarmDcsDao deviceAlarmDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceAlarmDcs getDeviceAlarmByAlarmLogId(String alarmLogId){
		return deviceAlarmDcsDao.getRecordById(alarmLogId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DeviceAlarmDcs getDeviceAlarmByInterfaceId(Integer courtCode, String interfaceId) {
		return deviceAlarmDcsDao.getRecordByInterfaceId(courtCode, interfaceId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalDeviceAlarm(DeviceAlarmDcs item) {
		return deviceAlarmDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return deviceAlarmDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<DeviceAlarmDcs> getDeviceAlarmList(DeviceAlarmDcs item, int offset,int limit) {
		return deviceAlarmDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertDeviceAlarm(DeviceAlarmDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return deviceAlarmDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateDeviceAlarm(DeviceAlarmDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return deviceAlarmDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteDeviceAlarmByAlarmLogId(String alarmLogId) {
		return deviceAlarmDcsDao.deleteRecordById(alarmLogId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicDeviceAlarmByAlarmLogId(String alarmLogId) {
		DeviceAlarmDcs item = new DeviceAlarmDcs();
		item.setId(alarmLogId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateDeviceAlarm(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<DeviceAlarmDcs> getDeviceAlarmsByAlarmLogIds(String[] alarmLogIds){
        if(CollectionUtil.isEmpty(alarmLogIds)){
            return Collections.emptyList();
        }
        return deviceAlarmDcsDao.getRecordsByIds(alarmLogIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteDeviceAlarmsByAlarmLogIds(String[] alarmLogIds){
		if(CollectionUtil.isEmpty(alarmLogIds)){
            return 0;
        }
		return deviceAlarmDcsDao.deleteRecordsByIds(alarmLogIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicDeviceAlarmsByAlarmLogIds(String[] alarmLogIds){
		if(CollectionUtil.isEmpty(alarmLogIds)){
            return 0;
        }

        int count = 0;
        DeviceAlarmDcs item = new DeviceAlarmDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String alarmLogId : alarmLogIds) {
            item.setId(alarmLogId);
            count += updateDeviceAlarm(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertDeviceAlarms(List<DeviceAlarmDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return deviceAlarmDcsDao.insertRecords(items);
	}
	
	/**
	 * deviceAlarmDao setter
	 */
	public void setDeviceAlarmDcsDao(DeviceAlarmDcsDao deviceAlarmDcsDao){
		this.deviceAlarmDcsDao = deviceAlarmDcsDao;
	}
}