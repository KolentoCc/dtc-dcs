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
import cn.com.chnsys.dtc.dcs.entity.DemondLogDcs;
import cn.com.chnsys.dtc.dcs.service.DemondLogDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class DemondLogServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private DemondLogDcsService demondLogDcsService;
	
	@Test
	public void testGetDemondLogByLogId(){
		DemondLogDcs entity = demondLogDcsService.getDemondLogByLogId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalDemondLog() {
		DemondLogDcs item = new DemondLogDcs();
		demondLogDcsService.getTotalDemondLog(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		demondLogDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetDemondLogList() {
		DemondLogDcs item = new DemondLogDcs();
		demondLogDcsService.getDemondLogList(item,1,2);
	}
	
	@Test
	public void testInsertDemondLog() {
		DemondLogDcs item = new DemondLogDcs();
		int count = demondLogDcsService.insertDemondLog(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateDemondLog() {
		DemondLogDcs item = new DemondLogDcs();
		item.setLogId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = demondLogDcsService.updateDemondLog(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteDemondLogByLogId() {
		 int count = demondLogDcsService.deleteDemondLogByLogId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetDemondLogsByLogIds(){
		List<DemondLogDcs> list = demondLogDcsService.getDemondLogsByLogIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteDemondLogsByLogIds(){
		int count = demondLogDcsService.deleteDemondLogsByLogIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertDemondLogs(){
		List<DemondLogDcs> items = new ArrayList<DemondLogDcs>();
		DemondLogDcs item = new DemondLogDcs();
		items.add(item);
		
		int count = demondLogDcsService.insertDemondLogs(items);
		Assert.isTrue(count == 1);
	}
}