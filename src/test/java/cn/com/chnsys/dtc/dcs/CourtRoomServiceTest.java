package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomDcsService;
import cn.com.chnsys.cif.base.utils.Assert;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.RandomGuid;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-service.xml"
})
public class CourtRoomServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private CourtRoomDcsService courtRoomService;
	
	@Test
	public void testGetCourtRoomByCourtRoomId(){
		CourtRoomDcs entity = courtRoomService.getCourtRoomByCourtRoomId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetCourtRoomByInterfaceId(){
		CourtRoomDcs entity = courtRoomService.getCourtRoomByInterfaceId(100, RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetTotalCourtRoom() {
		CourtRoomDcs item = new CourtRoomDcs();
		courtRoomService.getTotalCourtRoom(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		courtRoomService.getMaxRecord();
	}
	
	@Test
	public void testGetCourtRoomList() {
		CourtRoomDcs item = new CourtRoomDcs();
		courtRoomService.getCourtRoomList(item,1,2);
	}
	
	@Test
	public void testInsertCourtRoom() {
		CourtRoomDcs item = new CourtRoomDcs();
		int count = courtRoomService.insertCourtRoom(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateCourtRoom() {
		CourtRoomDcs item = new CourtRoomDcs();
		item.setCourtRoomId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = courtRoomService.updateCourtRoom(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteCourtRoomByCourtRoomId() {
		 int count = courtRoomService.deleteCourtRoomByCourtRoomId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetCourtRoomsByCourtRoomIds(){
		List<CourtRoomDcs> list = courtRoomService.getCourtRoomsByCourtRoomIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteCourtRoomsByCourtRoomIds(){
		int count = courtRoomService.deleteCourtRoomsByCourtRoomIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertCourtRooms(){
		List<CourtRoomDcs> items = new ArrayList<CourtRoomDcs>();
		CourtRoomDcs item = new CourtRoomDcs();
		items.add(item);
		
		int count = courtRoomService.insertCourtRooms(items);
		Assert.isTrue(count == 1);
	}
}