package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.TrialVideoDcs;
import cn.com.chnsys.dtc.dcs.service.TrialVideoDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class TrialVideoTest extends AbstractJUnit4SpringContextTests{
	private TrialVideoDcsService trialVideoDcsService;
	
	@Test
	public void testGetTrialVideoByVideoId(){
		trialVideoDcsService.getTrialVideoByVideoId("");
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
		trialVideoDcsService.insertTrialVideo(item);
	}
	
	@Test
	public void testUpdateTrialVideo() {
		TrialVideoDcs item = new TrialVideoDcs();
		trialVideoDcsService.updateTrialVideo(item);
	}
	
	@Test
	public void testDeleteTrialVideoByVideoId() {
		trialVideoDcsService.deleteTrialVideoByVideoId("");
	}
	
	@Test
	public void testGetTrialVideosByVideoIds(){
		trialVideoDcsService.getTrialVideosByVideoIds(new String[]{});
	}
	
	@Test
	public void testDeleteTrialVideosByVideoIds(){
		trialVideoDcsService.deleteTrialVideosByVideoIds(new String[]{});
	}
	
	@Test
	public void testInsertTrialVideos(){
		List<TrialVideoDcs> items = new ArrayList<TrialVideoDcs>();
		trialVideoDcsService.insertTrialVideos(items);
	}
}