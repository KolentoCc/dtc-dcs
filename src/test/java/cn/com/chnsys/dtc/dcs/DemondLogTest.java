package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.DemondLogDcs;
import cn.com.chnsys.dtc.dcs.service.DemondLogDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class DemondLogTest extends AbstractJUnit4SpringContextTests{
	private DemondLogDcsService demondLogDcsService;
	
	@Test
	public void testGetDemondLogByLogId(){
		demondLogDcsService.getDemondLogByLogId("");
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
		demondLogDcsService.insertDemondLog(item);
	}
	
	@Test
	public void testUpdateDemondLog() {
		DemondLogDcs item = new DemondLogDcs();
		demondLogDcsService.updateDemondLog(item);
	}
	
	@Test
	public void testDeleteDemondLogByLogId() {
		demondLogDcsService.deleteDemondLogByLogId("");
	}
	
	@Test
	public void testGetDemondLogsByLogIds(){
		demondLogDcsService.getDemondLogsByLogIds(new String[]{});
	}
	
	@Test
	public void testDeleteDemondLogsByLogIds(){
		demondLogDcsService.deleteDemondLogsByLogIds(new String[]{});
	}
	
	@Test
	public void testInsertDemondLogs(){
		List<DemondLogDcs> items = new ArrayList<DemondLogDcs>();
		demondLogDcsService.insertDemondLogs(items);
	}
}