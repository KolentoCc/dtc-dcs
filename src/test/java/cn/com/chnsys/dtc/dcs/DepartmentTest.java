package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.DepartmentDcs;
import cn.com.chnsys.dtc.dcs.service.DepartmentDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class DepartmentTest extends AbstractJUnit4SpringContextTests{
	private DepartmentDcsService departmentDcsService;
	
	@Test
	public void testGetDepartmentByDepartmentId(){
		departmentDcsService.getDepartmentByDepartmentId("");
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
		departmentDcsService.insertDepartment(item);
	}
	
	@Test
	public void testUpdateDepartment() {
		DepartmentDcs item = new DepartmentDcs();
		departmentDcsService.updateDepartment(item);
	}
	
	@Test
	public void testDeleteDepartmentByDepartmentId() {
		departmentDcsService.deleteDepartmentByDepartmentId("");
	}
	
	@Test
	public void testGetDepartmentsByDepartmentIds(){
		departmentDcsService.getDepartmentsByDepartmentIds(new String[]{});
	}
	
	@Test
	public void testDeleteDepartmentsByDepartmentIds(){
		departmentDcsService.deleteDepartmentsByDepartmentIds(new String[]{});
	}
	
	@Test
	public void testInsertDepartments(){
		List<DepartmentDcs> items = new ArrayList<DepartmentDcs>();
		departmentDcsService.insertDepartments(items);
	}
}