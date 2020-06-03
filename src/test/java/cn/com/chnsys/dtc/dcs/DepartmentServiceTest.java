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
import cn.com.chnsys.dtc.dcs.entity.DepartmentDcs;
import cn.com.chnsys.dtc.dcs.service.DepartmentDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class DepartmentServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private DepartmentDcsService departmentDcsService;
	
	@Test
	public void testGetDepartmentByDepartmentId(){
		DepartmentDcs entity = departmentDcsService.getDepartmentByDepartmentId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetDepartmentByInterfaceId(){
		DepartmentDcs entity = departmentDcsService.getDepartmentByInterfaceId(100, RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetTotalDepartment() {
		DepartmentDcs item = new DepartmentDcs();
		departmentDcsService.getTotalDepartment(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		departmentDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetDepartmentList() {
		DepartmentDcs item = new DepartmentDcs();
		departmentDcsService.getDepartmentList(item,1,2);
	}
	
	@Test
	public void testInsertDepartment() {
		DepartmentDcs item = new DepartmentDcs();
		int count = departmentDcsService.insertDepartment(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateDepartment() {
		DepartmentDcs item = new DepartmentDcs();
		item.setDepartmentId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = departmentDcsService.updateDepartment(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteDepartmentByDepartmentId() {
		 int count = departmentDcsService.deleteDepartmentByDepartmentId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetDepartmentsByDepartmentIds(){
		List<DepartmentDcs> list = departmentDcsService.getDepartmentsByDepartmentIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteDepartmentsByDepartmentIds(){
		int count = departmentDcsService.deleteDepartmentsByDepartmentIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertDepartments(){
		List<DepartmentDcs> items = new ArrayList<DepartmentDcs>();
		DepartmentDcs item = new DepartmentDcs();
		items.add(item);
		
		int count = departmentDcsService.insertDepartments(items);
		Assert.isTrue(count == 1);
	}
}