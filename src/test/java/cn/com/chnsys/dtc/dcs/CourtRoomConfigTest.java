package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.CourtRoomConfigDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomConfigDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class CourtRoomConfigTest extends AbstractJUnit4SpringContextTests{
	private CourtRoomConfigDcsService courtRoomConfigDcsService;
	
	@Test
	public void testGetCourtRoomConfigByCourtRoomId(){
		courtRoomConfigDcsService.getCourtRoomConfigByCourtRoomId("");
	}
	
	@Test
	public void testGetTotalCourtRoomConfig() {
		CourtRoomConfigDcs item = new CourtRoomConfigDcs();
		courtRoomConfigDcsService.getTotalCourtRoomConfig(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		courtRoomConfigDcsService.getMaxRecord();
	}
	
	
	@Test
	public void testGetCourtRoomConfigList() {
		CourtRoomConfigDcs item = new CourtRoomConfigDcs();
		courtRoomConfigDcsService.getCourtRoomConfigList(item,1,2);
	}
	
	@Test
	public void testInsertCourtRoomConfig() {
		CourtRoomConfigDcs item = new CourtRoomConfigDcs();
		courtRoomConfigDcsService.insertCourtRoomConfig(item);
	}
	
	@Test
	public void testUpdateCourtRoomConfig() {
		CourtRoomConfigDcs item = new CourtRoomConfigDcs();
		courtRoomConfigDcsService.updateCourtRoomConfig(item);
	}
	
	@Test
	public void testDeleteCourtRoomConfigByCourtRoomId() {
		courtRoomConfigDcsService.deleteCourtRoomConfigByCourtRoomId("");
	}
	
	@Test
	public void testGetCourtRoomConfigsByCourtRoomIds(){
		courtRoomConfigDcsService.getCourtRoomConfigsByCourtRoomIds(new String[]{});
	}
	
	@Test
	public void testDeleteCourtRoomConfigsByCourtRoomIds(){
		courtRoomConfigDcsService.deleteCourtRoomConfigsByCourtRoomIds(new String[]{});
	}
	
	@Test
	public void testInsertCourtRoomConfigs(){
		List<CourtRoomConfigDcs> items = new ArrayList<CourtRoomConfigDcs>();
		courtRoomConfigDcsService.insertCourtRoomConfigs(items);
	}
}