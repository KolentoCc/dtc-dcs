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
import cn.com.chnsys.dtc.dcs.entity.CaseCauseDcs;
import cn.com.chnsys.dtc.dcs.service.CaseCauseDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class CaseCauseServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private CaseCauseDcsService caseCauseDcsService;
	
	@Test
	public void testGetCaseCauseByCaseCauseId(){
		CaseCauseDcs entity = caseCauseDcsService.getCaseCauseByCaseCauseId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalCaseCause() {
		CaseCauseDcs item = new CaseCauseDcs();
		caseCauseDcsService.getTotalCaseCause(item);
	}
	
	
	@Test
	public void testGetCaseCauseList() {
		CaseCauseDcs item = new CaseCauseDcs();
		caseCauseDcsService.getCaseCauseList(item,1,2);
	}
	
	@Test
	public void testInsertCaseCause() {
		CaseCauseDcs item = new CaseCauseDcs();
		int count = caseCauseDcsService.insertCaseCause(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateCaseCause() {
		CaseCauseDcs item = new CaseCauseDcs();
		item.setCaseCauseId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = caseCauseDcsService.updateCaseCause(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteCaseCauseByCaseCauseId() {
		 int count = caseCauseDcsService.deleteCaseCauseByCaseCauseId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetCaseCausesByCaseCauseIds(){
		List<CaseCauseDcs> list = caseCauseDcsService.getCaseCausesByCaseCauseIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteCaseCausesByCaseCauseIds(){
		int count = caseCauseDcsService.deleteCaseCausesByCaseCauseIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertCaseCauses(){
		List<CaseCauseDcs> items = new ArrayList<CaseCauseDcs>();
		CaseCauseDcs item = new CaseCauseDcs();
		items.add(item);
		
		int count = caseCauseDcsService.insertCaseCauses(items);
		Assert.isTrue(count == 1);
	}
}