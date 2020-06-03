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
import cn.com.chnsys.dtc.dcs.entity.CourtRoomConfigDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomConfigDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class CourtRoomConfigServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private CourtRoomConfigDcsService courtRoomConfigDcsService;
	
	@Test
	public void testGetCourtRoomConfigByCourtRoomId(){
		CourtRoomConfigDcs entity = courtRoomConfigDcsService.getCourtRoomConfigByCourtRoomId(RandomGuid.generateGuid());
		Assert.isNull(entity);
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
		int count = courtRoomConfigDcsService.insertCourtRoomConfig(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateCourtRoomConfig() {
		CourtRoomConfigDcs item = new CourtRoomConfigDcs();
		item.setCourtRoomId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = courtRoomConfigDcsService.updateCourtRoomConfig(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteCourtRoomConfigByCourtRoomId() {
		 int count = courtRoomConfigDcsService.deleteCourtRoomConfigByCourtRoomId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetCourtRoomConfigsByCourtRoomIds(){
		List<CourtRoomConfigDcs> list = courtRoomConfigDcsService.getCourtRoomConfigsByCourtRoomIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteCourtRoomConfigsByCourtRoomIds(){
		int count = courtRoomConfigDcsService.deleteCourtRoomConfigsByCourtRoomIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertCourtRoomConfigs(){
		List<CourtRoomConfigDcs> items = new ArrayList<CourtRoomConfigDcs>();
		CourtRoomConfigDcs item = new CourtRoomConfigDcs();
		items.add(item);
		
		int count = courtRoomConfigDcsService.insertCourtRoomConfigs(items);
		Assert.isTrue(count == 1);
	}
}