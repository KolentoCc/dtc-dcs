package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.CourtRoomLiveConfigDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomLiveConfigDcsService;


@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class CourtRoomLiveConfigTest extends AbstractJUnit4SpringContextTests{
	private CourtRoomLiveConfigDcsService courtRoomLiveConfigDcsService;
	
	@Test
	public void testGetCourtRoomLiveConfigByCourtRoomId(){
		courtRoomLiveConfigDcsService.getCourtRoomLiveConfigByCourtRoomId("");
	}
	
	@Test
	public void testGetTotalCourtRoomLiveConfig() {
		CourtRoomLiveConfigDcs item = new CourtRoomLiveConfigDcs();
		courtRoomLiveConfigDcsService.getTotalCourtRoomLiveConfig(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		courtRoomLiveConfigDcsService.getMaxRecord();
	}
	
	
	@Test
	public void testGetCourtRoomLiveConfigList() {
		CourtRoomLiveConfigDcs item = new CourtRoomLiveConfigDcs();
		courtRoomLiveConfigDcsService.getCourtRoomLiveConfigList(item,1,2);
	}
	
	@Test
	public void testInsertCourtRoomLiveConfig() {
		CourtRoomLiveConfigDcs item = new CourtRoomLiveConfigDcs();
		courtRoomLiveConfigDcsService.insertCourtRoomLiveConfig(item);
	}
	
	@Test
	public void testUpdateCourtRoomLiveConfig() {
		CourtRoomLiveConfigDcs item = new CourtRoomLiveConfigDcs();
		courtRoomLiveConfigDcsService.updateCourtRoomLiveConfig(item);
	}
	
	@Test
	public void testDeleteCourtRoomLiveConfigByCourtRoomId() {
		courtRoomLiveConfigDcsService.deleteCourtRoomLiveConfigByCourtRoomId("");
	}
	
	@Test
	public void testGetCourtRoomLiveConfigsByCourtRoomIds(){
		courtRoomLiveConfigDcsService.getCourtRoomLiveConfigsByCourtRoomIds(new String[]{});
	}
	
	@Test
	public void testDeleteCourtRoomLiveConfigsByCourtRoomIds(){
		courtRoomLiveConfigDcsService.deleteCourtRoomLiveConfigsByCourtRoomIds(new String[]{});
	}
	
	@Test
	public void testInsertCourtRoomLiveConfigs(){
		List<CourtRoomLiveConfigDcs> items = new ArrayList<CourtRoomLiveConfigDcs>();
		courtRoomLiveConfigDcsService.insertCourtRoomLiveConfigs(items);
	}
}