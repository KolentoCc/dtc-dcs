package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.TrialLiveDcs;
import cn.com.chnsys.dtc.dcs.service.TrialLiveDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class TrialLiveTest extends AbstractJUnit4SpringContextTests{
	private TrialLiveDcsService trialLiveDcsService;
	
	@Test
	public void testGetTrialLiveByTrialLiveId(){
		trialLiveDcsService.getTrialLiveByTrialLiveId("");
	}
	
	@Test
	public void testGetTotalTrialLive() {
		TrialLiveDcs item = new TrialLiveDcs();
		trialLiveDcsService.getTotalTrialLive(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		trialLiveDcsService.getMaxRecord();
	}
	
	
	@Test
	public void testGetTrialLiveList() {
		TrialLiveDcs item = new TrialLiveDcs();
		trialLiveDcsService.getTrialLiveList(item,1,2);
	}
	
	@Test
	public void testInsertTrialLive() {
		TrialLiveDcs item = new TrialLiveDcs();
		trialLiveDcsService.insertTrialLive(item);
	}
	
	@Test
	public void testUpdateTrialLive() {
		TrialLiveDcs item = new TrialLiveDcs();
		trialLiveDcsService.updateTrialLive(item);
	}
	
	@Test
	public void testDeleteTrialLiveByTrialLiveId() {
		trialLiveDcsService.deleteTrialLiveByTrialLiveId("");
	}
	
	@Test
	public void testGetTrialLivesByTrialLiveIds(){
		trialLiveDcsService.getTrialLivesByTrialLiveIds(new String[]{});
	}
	
	@Test
	public void testDeleteTrialLivesByTrialLiveIds(){
		trialLiveDcsService.deleteTrialLivesByTrialLiveIds(new String[]{});
	}
	
	@Test
	public void testInsertTrialLives(){
		List<TrialLiveDcs> items = new ArrayList<TrialLiveDcs>();
		trialLiveDcsService.insertTrialLives(items);
	}
}