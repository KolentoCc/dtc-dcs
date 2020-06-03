package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import cn.com.chnsys.dtc.dcs.entity.IllegalData;
import cn.com.chnsys.dtc.dcs.service.IllegalDataService;
import cn.com.chnsys.cif.base.utils.Assert;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.RandomGuid;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-service.xml"
})
public class IllegalDataServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private IllegalDataService illegalDataService;
	
	@Test
	public void testGetIllegalDataById(){
		IllegalData entity = illegalDataService.getIllegalDataById(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalIllegalData() {
		IllegalData item = new IllegalData();
		illegalDataService.getTotalIllegalData(item);
	}
	
	
	@Test
	public void testGetIllegalDataList() {
		IllegalData item = new IllegalData();
		illegalDataService.getIllegalDataList(item,1,2);
	}
	
	@Test
	public void testInsertIllegalData() {
		IllegalData item = new IllegalData();
		int count = illegalDataService.insertIllegalData(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateIllegalData() {
		IllegalData item = new IllegalData();
		item.setTimestamp(System.currentTimeMillis());
		int count = illegalDataService.updateIllegalData(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteIllegalDataById() {
		 int count = illegalDataService.deleteIllegalDataById(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetIllegalDatasByIds(){
		List<IllegalData> list = illegalDataService.getIllegalDatasByIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteIllegalDatasByIds(){
		int count = illegalDataService.deleteIllegalDatasByIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertIllegalDatas(){
		List<IllegalData> items = new ArrayList<IllegalData>();
		IllegalData item = new IllegalData();
		items.add(item);
		
		int count = illegalDataService.insertIllegalDatas(items);
		Assert.isTrue(count == 1);
	}
}