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
import cn.com.chnsys.dtc.dcs.entity.TrialVideoDcs;
import cn.com.chnsys.dtc.dcs.service.TrialVideoDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class TrialVideoServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private TrialVideoDcsService trialVideoDcsService;
	
	@Test
	public void testGetTrialVideoByVideoId(){
		TrialVideoDcs entity = trialVideoDcsService.getTrialVideoByVideoId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalTrialVideo() {
		TrialVideoDcs item = new TrialVideoDcs();
		trialVideoDcsService.getTotalTrialVideo(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		trialVideoDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetTrialVideoList() {
		TrialVideoDcs item = new TrialVideoDcs();
		trialVideoDcsService.getTrialVideoList(item,1,2);
	}
	
	@Test
	public void testInsertTrialVideo() {
		TrialVideoDcs item = new TrialVideoDcs();
		int count = trialVideoDcsService.insertTrialVideo(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateTrialVideo() {
		TrialVideoDcs item = new TrialVideoDcs();
		item.setVideoId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = trialVideoDcsService.updateTrialVideo(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteTrialVideoByVideoId() {
		 int count = trialVideoDcsService.deleteTrialVideoByVideoId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetTrialVideosByVideoIds(){
		List<TrialVideoDcs> list = trialVideoDcsService.getTrialVideosByVideoIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteTrialVideosByVideoIds(){
		int count = trialVideoDcsService.deleteTrialVideosByVideoIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertTrialVideos(){
		List<TrialVideoDcs> items = new ArrayList<TrialVideoDcs>();
		TrialVideoDcs item = new TrialVideoDcs();
		items.add(item);
		
		int count = trialVideoDcsService.insertTrialVideos(items);
		Assert.isTrue(count == 1);
	}
}