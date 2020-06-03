package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import cn.com.chnsys.dtc.dcs.entity.ParticipateCaseEntityListDcs;
import cn.com.chnsys.dtc.dcs.service.ParticipateCaseEntityListDcsService;
import cn.com.chnsys.cif.base.utils.Assert;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.RandomGuid;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-service.xml"
})
public class ParticipateCaseEntityListDcsServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private ParticipateCaseEntityListDcsService participateCaseEntityListDcsService;
	
	@Test
	public void testGetParticipateCaseEntityListDcsByParticipateCaseEntityListID(){
		ParticipateCaseEntityListDcs entity = participateCaseEntityListDcsService.getParticipateCaseEntityListDcsByParticipateCaseEntityListID(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalParticipateCaseEntityListDcs() {
		ParticipateCaseEntityListDcs item = new ParticipateCaseEntityListDcs();
		participateCaseEntityListDcsService.getTotalParticipateCaseEntityListDcs(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		participateCaseEntityListDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetParticipateCaseEntityListDcsList() {
		ParticipateCaseEntityListDcs item = new ParticipateCaseEntityListDcs();
		participateCaseEntityListDcsService.getParticipateCaseEntityListDcsList(item,1,2);
	}
	
	@Test
	public void testInsertParticipateCaseEntityListDcs() {
		ParticipateCaseEntityListDcs item = new ParticipateCaseEntityListDcs();
		int count = participateCaseEntityListDcsService.insertParticipateCaseEntityListDcs(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateParticipateCaseEntityListDcs() {
		ParticipateCaseEntityListDcs item = new ParticipateCaseEntityListDcs();
		item.setParticipateCaseEntityListID(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = participateCaseEntityListDcsService.updateParticipateCaseEntityListDcs(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteParticipateCaseEntityListDcsByParticipateCaseEntityListID() {
		 int count = participateCaseEntityListDcsService.deleteParticipateCaseEntityListDcsByParticipateCaseEntityListID(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetParticipateCaseEntityListDcssByParticipateCaseEntityListIDs(){
		List<ParticipateCaseEntityListDcs> list = participateCaseEntityListDcsService.getParticipateCaseEntityListDcssByParticipateCaseEntityListIDs(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteParticipateCaseEntityListDcssByParticipateCaseEntityListIDs(){
		int count = participateCaseEntityListDcsService.deleteParticipateCaseEntityListDcssByParticipateCaseEntityListIDs(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertParticipateCaseEntityListDcss(){
		List<ParticipateCaseEntityListDcs> items = new ArrayList<ParticipateCaseEntityListDcs>();
		ParticipateCaseEntityListDcs item = new ParticipateCaseEntityListDcs();
		items.add(item);
		
		int count = participateCaseEntityListDcsService.insertParticipateCaseEntityListDcss(items);
		Assert.isTrue(count == 1);
	}
}