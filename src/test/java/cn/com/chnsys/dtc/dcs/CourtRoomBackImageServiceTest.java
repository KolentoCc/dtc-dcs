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
import cn.com.chnsys.dtc.dcs.entity.CourtRoomBackImageDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomBackImageDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class CourtRoomBackImageServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private CourtRoomBackImageDcsService courtRoomBackImageDcsService;
	
	@Test
	public void testGetCourtRoomBackImageByCourtRoomId(){
		CourtRoomBackImageDcs entity = courtRoomBackImageDcsService.getCourtRoomBackImageByCourtRoomId(RandomGuid.generateGuid());
		Assert.isNull(entity);
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
		int count = courtRoomBackImageDcsService.insertCourtRoomBackImage(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateCourtRoomBackImage() {
		CourtRoomBackImageDcs item = new CourtRoomBackImageDcs();
		item.setCourtRoomId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = courtRoomBackImageDcsService.updateCourtRoomBackImage(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteCourtRoomBackImageByCourtRoomId() {
		 int count = courtRoomBackImageDcsService.deleteCourtRoomBackImageByCourtRoomId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetCourtRoomBackImagesByCourtRoomIds(){
		List<CourtRoomBackImageDcs> list = courtRoomBackImageDcsService.getCourtRoomBackImagesByCourtRoomIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteCourtRoomBackImagesByCourtRoomIds(){
		int count = courtRoomBackImageDcsService.deleteCourtRoomBackImagesByCourtRoomIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertCourtRoomBackImages(){
		List<CourtRoomBackImageDcs> items = new ArrayList<CourtRoomBackImageDcs>();
		CourtRoomBackImageDcs item = new CourtRoomBackImageDcs();
		items.add(item);
		
		int count = courtRoomBackImageDcsService.insertCourtRoomBackImages(items);
		Assert.isTrue(count == 1);
	}
}