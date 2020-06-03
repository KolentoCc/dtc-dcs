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
import cn.com.chnsys.dtc.dcs.entity.CourtUserDcs;
import cn.com.chnsys.dtc.dcs.service.CourtUserDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class CourtUserServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private CourtUserDcsService courtUserDcsService;
	
	@Test
	public void testGetCourtUserByUserId(){
		CourtUserDcs entity = courtUserDcsService.getCourtUserByUserId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetCourtUserByInterfaceId(){
		CourtUserDcs entity = courtUserDcsService.getCourtUserByInterfaceId(100, RandomGuid.generateGuid());
		Assert.isNull(entity);
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
		int count = courtUserDcsService.insertCourtUser(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateCourtUser() {
		CourtUserDcs item = new CourtUserDcs();
		item.setUserId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = courtUserDcsService.updateCourtUser(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteCourtUserByUserId() {
		 int count = courtUserDcsService.deleteCourtUserByUserId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetCourtUsersByUserIds(){
		List<CourtUserDcs> list = courtUserDcsService.getCourtUsersByUserIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteCourtUsersByUserIds(){
		int count = courtUserDcsService.deleteCourtUsersByUserIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertCourtUsers(){
		List<CourtUserDcs> items = new ArrayList<CourtUserDcs>();
		CourtUserDcs item = new CourtUserDcs();
		items.add(item);
		
		int count = courtUserDcsService.insertCourtUsers(items);
		Assert.isTrue(count == 1);
	}
}