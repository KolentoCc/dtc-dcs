package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.CourtRoomBackImageDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomBackImageDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class CourtRoomBackImageTest extends AbstractJUnit4SpringContextTests{
	private CourtRoomBackImageDcsService courtRoomBackImageDcsService;
	
	@Test
	public void testGetCourtRoomBackImageByCourtRoomId(){
		courtRoomBackImageDcsService.getCourtRoomBackImageByCourtRoomId("");
	}
	
	@Test
	public void testGetTotalCourtRoomBackImage() {
		CourtRoomBackImageDcs item = new CourtRoomBackImageDcs();
		courtRoomBackImageDcsService.getTotalCourtRoomBackImage(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		courtRoomBackImageDcsService.getMaxRecord();
	}
	
	
	@Test
	public void testGetCourtRoomBackImageList() {
		CourtRoomBackImageDcs item = new CourtRoomBackImageDcs();
		courtRoomBackImageDcsService.getCourtRoomBackImageList(item,1,2);
	}
	
	@Test
	public void testInsertCourtRoomBackImage() {
		CourtRoomBackImageDcs item = new CourtRoomBackImageDcs();
		courtRoomBackImageDcsService.insertCourtRoomBackImage(item);
	}
	
	@Test
	public void testUpdateCourtRoomBackImage() {
		CourtRoomBackImageDcs item = new CourtRoomBackImageDcs();
		courtRoomBackImageDcsService.updateCourtRoomBackImage(item);
	}
	
	@Test
	public void testDeleteCourtRoomBackImageByCourtRoomId() {
		courtRoomBackImageDcsService.deleteCourtRoomBackImageByCourtRoomId("");
	}
	
	@Test
	public void testGetCourtRoomBackImagesByCourtRoomIds(){
		courtRoomBackImageDcsService.getCourtRoomBackImagesByCourtRoomIds(new String[]{});
	}
	
	@Test
	public void testDeleteCourtRoomBackImagesByCourtRoomIds(){
		courtRoomBackImageDcsService.deleteCourtRoomBackImagesByCourtRoomIds(new String[]{});
	}
	
	@Test
	public void testInsertCourtRoomBackImages(){
		List<CourtRoomBackImageDcs> items = new ArrayList<CourtRoomBackImageDcs>();
		courtRoomBackImageDcsService.insertCourtRoomBackImages(items);
	}
}