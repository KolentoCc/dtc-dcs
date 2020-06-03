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
import cn.com.chnsys.dtc.dcs.entity.TrialTermDcs;
import cn.com.chnsys.dtc.dcs.service.TrialTermDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class TrialTermServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private TrialTermDcsService trialTermDcsService;
	
	@Test
	public void testGetTrialTermByCaseId(){
		TrialTermDcs entity = trialTermDcsService.getTrialTermByCaseId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalTrialTerm() {
		TrialTermDcs item = new TrialTermDcs();
		trialTermDcsService.getTotalTrialTerm(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		trialTermDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetTrialTermList() {
		TrialTermDcs item = new TrialTermDcs();
		trialTermDcsService.getTrialTermList(item,1,2);
	}
	
	@Test
	public void testInsertTrialTerm() {
		TrialTermDcs item = new TrialTermDcs();
		int count = trialTermDcsService.insertTrialTerm(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateTrialTerm() {
		TrialTermDcs item = new TrialTermDcs();
		item.setCaseId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = trialTermDcsService.updateTrialTerm(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteTrialTermByCaseId() {
		 int count = trialTermDcsService.deleteTrialTermByCaseId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetTrialTermsByCaseIds(){
		List<TrialTermDcs> list = trialTermDcsService.getTrialTermsByCaseIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteTrialTermsByCaseIds(){
		int count = trialTermDcsService.deleteTrialTermsByCaseIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertTrialTerms(){
		List<TrialTermDcs> items = new ArrayList<TrialTermDcs>();
		TrialTermDcs item = new TrialTermDcs();
		items.add(item);
		
		int count = trialTermDcsService.insertTrialTerms(items);
		Assert.isTrue(count == 1);
	}
}