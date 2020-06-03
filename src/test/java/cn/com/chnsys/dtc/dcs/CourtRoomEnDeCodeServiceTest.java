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
import cn.com.chnsys.dtc.dcs.entity.CourtRoomEnDeCodeDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomEnDeCodeDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class CourtRoomEnDeCodeServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private CourtRoomEnDeCodeDcsService courtRoomEnDeCodeDcsService;
	
	@Test
	public void testGetCourtRoomEnDeCodeById(){
		CourtRoomEnDeCodeDcs entity = courtRoomEnDeCodeDcsService.getCourtRoomEnDeCodeById(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalCourtRoomEnDeCode() {
		CourtRoomEnDeCodeDcs item = new CourtRoomEnDeCodeDcs();
		courtRoomEnDeCodeDcsService.getTotalCourtRoomEnDeCode(item);
	}
	
	
	@Test
	public void testGetCourtRoomEnDeCodeList() {
		CourtRoomEnDeCodeDcs item = new CourtRoomEnDeCodeDcs();
		courtRoomEnDeCodeDcsService.getCourtRoomEnDeCodeList(item,1,2);
	}
	
	@Test
	public void testInsertCourtRoomEnDeCode() {
		CourtRoomEnDeCodeDcs item = new CourtRoomEnDeCodeDcs();
		int count = courtRoomEnDeCodeDcsService.insertCourtRoomEnDeCode(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateCourtRoomEnDeCode() {
		CourtRoomEnDeCodeDcs item = new CourtRoomEnDeCodeDcs();
		item.setId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = courtRoomEnDeCodeDcsService.updateCourtRoomEnDeCode(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteCourtRoomEnDeCodeById() {
		 int count = courtRoomEnDeCodeDcsService.deleteCourtRoomEnDeCodeById(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetCourtRoomEnDeCodesByIds(){
		List<CourtRoomEnDeCodeDcs> list = courtRoomEnDeCodeDcsService.getCourtRoomEnDeCodesByIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteCourtRoomEnDeCodesByIds(){
		int count = courtRoomEnDeCodeDcsService.deleteCourtRoomEnDeCodesByIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertCourtRoomEnDeCodes(){
		List<CourtRoomEnDeCodeDcs> items = new ArrayList<CourtRoomEnDeCodeDcs>();
		CourtRoomEnDeCodeDcs item = new CourtRoomEnDeCodeDcs();
		items.add(item);
		
		int count = courtRoomEnDeCodeDcsService.insertCourtRoomEnDeCodes(items);
		Assert.isTrue(count == 1);
	}
}