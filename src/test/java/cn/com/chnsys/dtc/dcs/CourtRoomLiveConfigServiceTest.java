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
import cn.com.chnsys.dtc.dcs.entity.CourtRoomLiveConfigDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomLiveConfigDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class CourtRoomLiveConfigServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private CourtRoomLiveConfigDcsService courtRoomLiveConfigDcsService;
	
	@Test
	public void testGetCourtRoomLiveConfigByCourtRoomId(){
		CourtRoomLiveConfigDcs entity = courtRoomLiveConfigDcsService.getCourtRoomLiveConfigByCourtRoomId(RandomGuid.generateGuid());
		Assert.isNull(entity);
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
		int count = courtRoomLiveConfigDcsService.insertCourtRoomLiveConfig(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateCourtRoomLiveConfig() {
		CourtRoomLiveConfigDcs item = new CourtRoomLiveConfigDcs();
		item.setCourtRoomId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = courtRoomLiveConfigDcsService.updateCourtRoomLiveConfig(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteCourtRoomLiveConfigByCourtRoomId() {
		 int count = courtRoomLiveConfigDcsService.deleteCourtRoomLiveConfigByCourtRoomId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetCourtRoomLiveConfigsByCourtRoomIds(){
		List<CourtRoomLiveConfigDcs> list = courtRoomLiveConfigDcsService.getCourtRoomLiveConfigsByCourtRoomIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteCourtRoomLiveConfigsByCourtRoomIds(){
		int count = courtRoomLiveConfigDcsService.deleteCourtRoomLiveConfigsByCourtRoomIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertCourtRoomLiveConfigs(){
		List<CourtRoomLiveConfigDcs> items = new ArrayList<CourtRoomLiveConfigDcs>();
		CourtRoomLiveConfigDcs item = new CourtRoomLiveConfigDcs();
		items.add(item);
		
		int count = courtRoomLiveConfigDcsService.insertCourtRoomLiveConfigs(items);
		Assert.isTrue(count == 1);
	}
}