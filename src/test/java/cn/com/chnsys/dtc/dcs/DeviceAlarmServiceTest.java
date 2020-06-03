package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.cif.base.utils.Assert;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.RandomGuid;
import cn.com.chnsys.dtc.dcs.entity.DeviceAlarmDcs;
import cn.com.chnsys.dtc.dcs.service.DeviceAlarmDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class DeviceAlarmServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private DeviceAlarmDcsService deviceAlarmDcsService;
	
	@Test
	public void testGetDeviceAlarmById(){
		DeviceAlarmDcs entity = deviceAlarmDcsService.getDeviceAlarmByAlarmLogId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetDeviceAlarmByInterfaceId(){
		DeviceAlarmDcs entity = deviceAlarmDcsService.getDeviceAlarmByInterfaceId(100, RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetTotalDeviceAlarm() {
		DeviceAlarmDcs item = new DeviceAlarmDcs();
		deviceAlarmDcsService.getTotalDeviceAlarm(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		deviceAlarmDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetDeviceAlarmList() {
		DeviceAlarmDcs item = new DeviceAlarmDcs();
		deviceAlarmDcsService.getDeviceAlarmList(item,1,2);
	}
	
	@Test
	public void testInsertDeviceAlarm() {
		DeviceAlarmDcs item = new DeviceAlarmDcs();
		int count = deviceAlarmDcsService.insertDeviceAlarm(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateDeviceAlarm() {
		DeviceAlarmDcs item = new DeviceAlarmDcs();
		item.setId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = deviceAlarmDcsService.updateDeviceAlarm(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteDeviceAlarmById() {
		 int count = deviceAlarmDcsService.deleteDeviceAlarmByAlarmLogId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetDeviceAlarmsByIds(){
		List<DeviceAlarmDcs> list = deviceAlarmDcsService.getDeviceAlarmsByAlarmLogIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteDeviceAlarmsByIds(){
		int count = deviceAlarmDcsService.deleteDeviceAlarmsByAlarmLogIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertDeviceAlarms(){
		List<DeviceAlarmDcs> items = new ArrayList<DeviceAlarmDcs>();
		DeviceAlarmDcs item = new DeviceAlarmDcs();
		items.add(item);
		
		int count = deviceAlarmDcsService.insertDeviceAlarms(items);
		Assert.isTrue(count == 1);
	}
}