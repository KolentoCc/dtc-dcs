package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import cn.com.chnsys.dtc.dcs.entity.CaseInfoDcs;
import cn.com.chnsys.dtc.dcs.service.CaseInfoDcsService;
import cn.com.chnsys.cif.base.utils.Assert;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.RandomGuid;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath:spring/**/applicationContext-service*.xml"
})
public class CaseInfoDcsServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private CaseInfoDcsService caseInfoDcsService;
	
	@Test
	public void testGetCaseInfoDcsByCaseId(){
		CaseInfoDcs entity1 = caseInfoDcsService.getCaseInfoDcsByCaseId("005CC4B2-4EDE-3522-812C-84F0DE656E05");
		System.out.println(entity1);
		CaseInfoDcs entity = caseInfoDcsService.getCaseInfoWithCourtCodeInfoByCaseId("005CC4B2-4EDE-3522-812C-84F0DE656E05");
		System.out.println("*************************************************************");
		System.out.println(entity.getUnitCode());
		System.out.println(entity.getUnitName());
		System.out.println(entity.getCourtLevel());
		System.out.println("*************************************************************");
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetCaseInfoDcsByInterfaceId(){
		CaseInfoDcs entity = caseInfoDcsService.getCaseInfoDcsByInterfaceId(100, RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetTotalCaseInfoDcs() {
		CaseInfoDcs item = new CaseInfoDcs();
		caseInfoDcsService.getTotalCaseInfoDcs(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		caseInfoDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetCaseInfoDcsList() {
		CaseInfoDcs item = new CaseInfoDcs();
		caseInfoDcsService.getCaseInfoDcsList(item,1,2);
	}
	
	@Test
	public void testInsertCaseInfoDcs() {
		CaseInfoDcs item = new CaseInfoDcs();
		int count = caseInfoDcsService.insertCaseInfoDcs(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateCaseInfoDcs() {
		CaseInfoDcs item = new CaseInfoDcs();
		item.setCaseId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = caseInfoDcsService.updateCaseInfoDcs(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteCaseInfoDcsByCaseId() {
		 int count = caseInfoDcsService.deleteCaseInfoDcsByCaseId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetCaseInfoDcssByCaseIds(){
		List<CaseInfoDcs> list = caseInfoDcsService.getCaseInfoDcssByCaseIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteCaseInfoDcssByCaseIds(){
		int count = caseInfoDcsService.deleteCaseInfoDcssByCaseIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertCaseInfoDcss(){
		List<CaseInfoDcs> items = new ArrayList<CaseInfoDcs>();
		CaseInfoDcs item = new CaseInfoDcs();
		items.add(item);
		
		int count = caseInfoDcsService.insertCaseInfoDcss(items);
		Assert.isTrue(count == 1);
	}
}