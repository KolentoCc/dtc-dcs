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
import cn.com.chnsys.dtc.dcs.entity.TrialScreenshotDcs;
import cn.com.chnsys.dtc.dcs.service.TrialScreenshotDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class TrialScreenshotServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private TrialScreenshotDcsService trialScreenshotDcsService;
	
	@Test
	public void testGetTrialScreenshotByTrialId(){
		TrialScreenshotDcs entity = trialScreenshotDcsService.getTrialScreenshotByTrialId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalTrialScreenshot() {
		TrialScreenshotDcs item = new TrialScreenshotDcs();
		trialScreenshotDcsService.getTotalTrialScreenshot(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		trialScreenshotDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetTrialScreenshotList() {
		TrialScreenshotDcs item = new TrialScreenshotDcs();
		trialScreenshotDcsService.getTrialScreenshotList(item,1,2);
	}
	
	@Test
	public void testInsertTrialScreenshot() {
		TrialScreenshotDcs item = new TrialScreenshotDcs();
		int count = trialScreenshotDcsService.insertTrialScreenshot(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateTrialScreenshot() {
		TrialScreenshotDcs item = new TrialScreenshotDcs();
		item.setTrialId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = trialScreenshotDcsService.updateTrialScreenshot(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteTrialScreenshotByTrialId() {
		 int count = trialScreenshotDcsService.deleteTrialScreenshotByTrialId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetTrialScreenshotsByTrialIds(){
		List<TrialScreenshotDcs> list = trialScreenshotDcsService.getTrialScreenshotsByTrialIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteTrialScreenshotsByTrialIds(){
		int count = trialScreenshotDcsService.deleteTrialScreenshotsByTrialIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertTrialScreenshots(){
		List<TrialScreenshotDcs> items = new ArrayList<TrialScreenshotDcs>();
		TrialScreenshotDcs item = new TrialScreenshotDcs();
		items.add(item);
		
		int count = trialScreenshotDcsService.insertTrialScreenshots(items);
		Assert.isTrue(count == 1);
	}
}