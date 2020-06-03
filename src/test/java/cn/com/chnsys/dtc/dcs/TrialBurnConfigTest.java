package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.TrialBurnConfigDcs;
import cn.com.chnsys.dtc.dcs.service.TrialBurnConfigDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class TrialBurnConfigTest extends AbstractJUnit4SpringContextTests{
	private TrialBurnConfigDcsService trialBurnConfigDcsService;
	
	@Test
	public void testGetTrialBurnConfigByCourtRoomId(){
		trialBurnConfigDcsService.getTrialBurnConfigByCourtRoomId("");
	}
	
	@Test
	public void testGetMaxRecord() {
		trialBurnConfigDcsService.getMaxRecord();
	}
	
	
	@Test
	public void testGetTrialBurnConfigList() {
		TrialBurnConfigDcs item = new TrialBurnConfigDcs();
		trialBurnConfigDcsService.getTrialBurnConfigList(item,1,2);
	}
	
	@Test
	public void testInsertTrialBurnConfig() {
		TrialBurnConfigDcs item = new TrialBurnConfigDcs();
		trialBurnConfigDcsService.insertTrialBurnConfig(item);
	}
	
	@Test
	public void testUpdateTrialBurnConfig() {
		TrialBurnConfigDcs item = new TrialBurnConfigDcs();
		trialBurnConfigDcsService.updateTrialBurnConfig(item);
	}
	
	@Test
	public void testDeleteTrialBurnConfigByCourtRoomId() {
		trialBurnConfigDcsService.deleteTrialBurnConfigByCourtRoomId("");
	}
	
	@Test
	public void testGetTrialBurnConfigsByCourtRoomIds(){
		trialBurnConfigDcsService.getTrialBurnConfigsByCourtRoomIds(new String[]{});
	}
	
	@Test
	public void testDeleteTrialBurnConfigsByCourtRoomIds(){
		trialBurnConfigDcsService.deleteTrialBurnConfigsByCourtRoomIds(new String[]{});
	}
	
	@Test
	public void testInsertTrialBurnConfigs(){
		List<TrialBurnConfigDcs> items = new ArrayList<TrialBurnConfigDcs>();
		trialBurnConfigDcsService.insertTrialBurnConfigs(items);
	}
}