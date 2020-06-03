package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.LiveLogDcs;
import cn.com.chnsys.dtc.dcs.service.LiveLogDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class LiveLogTest extends AbstractJUnit4SpringContextTests{
	private LiveLogDcsService liveLogDcsService;
	
	@Test
	public void testGetLiveLogByLogId(){
		liveLogDcsService.getLiveLogByLogId("");
	}
	
	@Test
	public void testGetTotalLiveLog() {
		LiveLogDcs item = new LiveLogDcs();
		liveLogDcsService.getTotalLiveLog(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		liveLogDcsService.getMaxRecord();
	}
	
	
	@Test
	public void testGetLiveLogList() {
		LiveLogDcs item = new LiveLogDcs();
		liveLogDcsService.getLiveLogList(item,1,2);
	}
	
	@Test
	public void testInsertLiveLog() {
		LiveLogDcs item = new LiveLogDcs();
		liveLogDcsService.insertLiveLog(item);
	}
	
	@Test
	public void testUpdateLiveLog() {
		LiveLogDcs item = new LiveLogDcs();
		liveLogDcsService.updateLiveLog(item);
	}
	
	@Test
	public void testDeleteLiveLogByLogId() {
		liveLogDcsService.deleteLiveLogByLogId("");
	}
	
	@Test
	public void testGetLiveLogsByLogIds(){
		liveLogDcsService.getLiveLogsByLogIds(new String[]{});
	}
	
	@Test
	public void testDeleteLiveLogsByLogIds(){
		liveLogDcsService.deleteLiveLogsByLogIds(new String[]{});
	}
	
	@Test
	public void testInsertLiveLogs(){
		List<LiveLogDcs> items = new ArrayList<LiveLogDcs>();
		liveLogDcsService.insertLiveLogs(items);
	}
}