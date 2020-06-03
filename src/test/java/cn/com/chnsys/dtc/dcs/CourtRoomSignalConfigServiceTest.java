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
import cn.com.chnsys.dtc.dcs.entity.CourtRoomSignalConfigDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomSignalConfigDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class CourtRoomSignalConfigServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private CourtRoomSignalConfigDcsService courtRoomSignalConfigDcsService;
	
	@Test
	public void testGetCourtRoomSignalConfigByChannelId(){
		CourtRoomSignalConfigDcs entity = courtRoomSignalConfigDcsService.getCourtRoomSignalConfigByChannelId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetTotalCourtRoomSignalConfig() {
		CourtRoomSignalConfigDcs item = new CourtRoomSignalConfigDcs();
		courtRoomSignalConfigDcsService.getTotalCourtRoomSignalConfig(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		courtRoomSignalConfigDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetCourtRoomSignalConfigList() {
		CourtRoomSignalConfigDcs item = new CourtRoomSignalConfigDcs();
		courtRoomSignalConfigDcsService.getCourtRoomSignalConfigList(item,1,2);
	}
	
	@Test
	public void testInsertCourtRoomSignalConfig() {
		CourtRoomSignalConfigDcs item = new CourtRoomSignalConfigDcs();
		int count = courtRoomSignalConfigDcsService.insertCourtRoomSignalConfig(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateCourtRoomSignalConfig() {
		CourtRoomSignalConfigDcs item = new CourtRoomSignalConfigDcs();
		item.setChannelId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = courtRoomSignalConfigDcsService.updateCourtRoomSignalConfig(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteCourtRoomSignalConfigByChannelId() {
		 int count = courtRoomSignalConfigDcsService.deleteCourtRoomSignalConfigByChannelId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetCourtRoomSignalConfigsByChannelIds(){
		List<CourtRoomSignalConfigDcs> list = courtRoomSignalConfigDcsService.getCourtRoomSignalConfigsByChannelIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteCourtRoomSignalConfigsByChannelIds(){
		int count = courtRoomSignalConfigDcsService.deleteCourtRoomSignalConfigsByChannelIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertCourtRoomSignalConfigs(){
		List<CourtRoomSignalConfigDcs> items = new ArrayList<CourtRoomSignalConfigDcs>();
		CourtRoomSignalConfigDcs item = new CourtRoomSignalConfigDcs();
		items.add(item);
		
		int count = courtRoomSignalConfigDcsService.insertCourtRoomSignalConfigs(items);
		Assert.isTrue(count == 1);
	}
}