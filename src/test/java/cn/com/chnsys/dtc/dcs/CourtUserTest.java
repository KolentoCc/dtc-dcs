package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.CourtUserDcs;
import cn.com.chnsys.dtc.dcs.service.CourtUserDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class CourtUserTest extends AbstractJUnit4SpringContextTests{
	private CourtUserDcsService courtUserDcsService;
	
	@Test
	public void testGetCourtUserByUserId(){
		courtUserDcsService.getCourtUserByUserId("");
	}
	
	@Test
	public void testGetTotalCourtUser() {
		CourtUserDcs item = new CourtUserDcs();
		courtUserDcsService.getTotalCourtUser(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		courtUserDcsService.getMaxRecord();
	}
	
	
	@Test
	public void testGetCourtUserList() {
		CourtUserDcs item = new CourtUserDcs();
		courtUserDcsService.getCourtUserList(item,1,2);
	}
	
	@Test
	public void testInsertCourtUser() {
		CourtUserDcs item = new CourtUserDcs();
		courtUserDcsService.insertCourtUser(item);
	}
	
	@Test
	public void testUpdateCourtUser() {
		CourtUserDcs item = new CourtUserDcs();
		courtUserDcsService.updateCourtUser(item);
	}
	
	@Test
	public void testDeleteCourtUserByUserId() {
		courtUserDcsService.deleteCourtUserByUserId("");
	}
	
	@Test
	public void testGetCourtUsersByUserIds(){
		courtUserDcsService.getCourtUsersByUserIds(new String[]{});
	}
	
	@Test
	public void testDeleteCourtUsersByUserIds(){
		courtUserDcsService.deleteCourtUsersByUserIds(new String[]{});
	}
	
	@Test
	public void testInsertCourtUsers(){
		List<CourtUserDcs> items = new ArrayList<CourtUserDcs>();
		courtUserDcsService.insertCourtUsers(items);
	}
}