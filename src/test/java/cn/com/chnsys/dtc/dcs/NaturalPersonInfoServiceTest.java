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
import cn.com.chnsys.dtc.dcs.entity.NaturalPersonInfoDcs;
import cn.com.chnsys.dtc.dcs.service.NaturalPersonInfoDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class NaturalPersonInfoServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private NaturalPersonInfoDcsService naturalPersonInfoDcsService;
	
	@Test
	public void testGetNaturalPersonInfoByEntityId(){
		NaturalPersonInfoDcs entity = naturalPersonInfoDcsService.getNaturalPersonInfoByEntityId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalNaturalPersonInfo() {
		NaturalPersonInfoDcs item = new NaturalPersonInfoDcs();
		naturalPersonInfoDcsService.getTotalNaturalPersonInfo(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		naturalPersonInfoDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetNaturalPersonInfoList() {
		NaturalPersonInfoDcs item = new NaturalPersonInfoDcs();
		naturalPersonInfoDcsService.getNaturalPersonInfoList(item,1,2);
	}
	
	@Test
	public void testInsertNaturalPersonInfo() {
		NaturalPersonInfoDcs item = new NaturalPersonInfoDcs();
		int count = naturalPersonInfoDcsService.insertNaturalPersonInfo(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateNaturalPersonInfo() {
		NaturalPersonInfoDcs item = new NaturalPersonInfoDcs();
		item.setEntityId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = naturalPersonInfoDcsService.updateNaturalPersonInfo(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteNaturalPersonInfoByEntityId() {
		 int count = naturalPersonInfoDcsService.deleteNaturalPersonInfoByEntityId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetNaturalPersonInfosByEntityIds(){
		List<NaturalPersonInfoDcs> list = naturalPersonInfoDcsService.getNaturalPersonInfosByEntityIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteNaturalPersonInfosByEntityIds(){
		int count = naturalPersonInfoDcsService.deleteNaturalPersonInfosByEntityIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertNaturalPersonInfos(){
		List<NaturalPersonInfoDcs> items = new ArrayList<NaturalPersonInfoDcs>();
		NaturalPersonInfoDcs item = new NaturalPersonInfoDcs();
		items.add(item);
		
		int count = naturalPersonInfoDcsService.insertNaturalPersonInfos(items);
		Assert.isTrue(count == 1);
	}
}