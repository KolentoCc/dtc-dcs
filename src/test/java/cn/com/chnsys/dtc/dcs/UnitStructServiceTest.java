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
import cn.com.chnsys.dtc.dcs.entity.UnitStructDcs;
import cn.com.chnsys.dtc.dcs.service.UnitStructDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class UnitStructServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private UnitStructDcsService unitStructDcsService;
	
	@Test
	public void testGetUnitStructByUnitId(){
		UnitStructDcs entity = unitStructDcsService.getUnitStructByUnitId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetUnitStructByInterfaceId(){
		UnitStructDcs entity = unitStructDcsService.getUnitStructByInterfaceId(100, RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetTotalUnitStruct() {
		UnitStructDcs item = new UnitStructDcs();
		unitStructDcsService.getTotalUnitStruct(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		unitStructDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetUnitStructList() {
		UnitStructDcs item = new UnitStructDcs();
		unitStructDcsService.getUnitStructList(item,1,2);
	}
	
	@Test
	public void testInsertUnitStruct() {
		UnitStructDcs item = new UnitStructDcs();
		int count = unitStructDcsService.insertUnitStruct(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateUnitStruct() {
		UnitStructDcs item = new UnitStructDcs();
		item.setUnitId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = unitStructDcsService.updateUnitStruct(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteUnitStructByUnitId() {
		 int count = unitStructDcsService.deleteUnitStructByUnitId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetUnitStructsByUnitIds(){
		List<UnitStructDcs> list = unitStructDcsService.getUnitStructsByUnitIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteUnitStructsByUnitIds(){
		int count = unitStructDcsService.deleteUnitStructsByUnitIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertUnitStructs(){
		List<UnitStructDcs> items = new ArrayList<UnitStructDcs>();
		UnitStructDcs item = new UnitStructDcs();
		items.add(item);
		
		int count = unitStructDcsService.insertUnitStructs(items);
		Assert.isTrue(count == 1);
	}
}