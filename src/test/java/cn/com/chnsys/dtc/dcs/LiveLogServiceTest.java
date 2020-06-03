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
import cn.com.chnsys.dtc.dcs.entity.LiveLogDcs;
import cn.com.chnsys.dtc.dcs.service.LiveLogDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class LiveLogServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private LiveLogDcsService liveLogDcsService;
	
	@Test
	public void testGetLiveLogByLogId(){
		LiveLogDcs entity = liveLogDcsService.getLiveLogByLogId(RandomGuid.generateGuid());
		Assert.isNull(entity);
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
		int count = liveLogDcsService.insertLiveLog(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateLiveLog() {
		LiveLogDcs item = new LiveLogDcs();
		item.setLogId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = liveLogDcsService.updateLiveLog(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteLiveLogByLogId() {
		 int count = liveLogDcsService.deleteLiveLogByLogId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetLiveLogsByLogIds(){
		List<LiveLogDcs> list = liveLogDcsService.getLiveLogsByLogIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteLiveLogsByLogIds(){
		int count = liveLogDcsService.deleteLiveLogsByLogIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertLiveLogs(){
		List<LiveLogDcs> items = new ArrayList<LiveLogDcs>();
		LiveLogDcs item = new LiveLogDcs();
		items.add(item);
		
		int count = liveLogDcsService.insertLiveLogs(items);
		Assert.isTrue(count == 1);
	}
}