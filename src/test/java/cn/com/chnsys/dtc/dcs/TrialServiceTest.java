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
import cn.com.chnsys.dtc.dcs.entity.TrialDcs;
import cn.com.chnsys.dtc.dcs.service.TrialDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class TrialServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private TrialDcsService trialDcsService;
	
	@Test
	public void testGetTrialByTrialId(){
		TrialDcs entity = trialDcsService.getTrialByTrialId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetTrialByInterfaceId(){
		TrialDcs entity = trialDcsService.getTrialByInterfaceId(100, RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	@Test
	public void testGetTotalTrial() {
		TrialDcs item = new TrialDcs();
		trialDcsService.getTotalTrial(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		trialDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetTrialList() {
		TrialDcs item = new TrialDcs();
		trialDcsService.getTrialList(item,1,2);
	}
	
	@Test
	public void testInsertTrial() {
		TrialDcs item = new TrialDcs();
		int count = trialDcsService.insertTrial(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateTrial() {
		TrialDcs item = new TrialDcs();
		item.setTrialId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = trialDcsService.updateTrial(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteTrialByTrialId() {
		 int count = trialDcsService.deleteTrialByTrialId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetTrialsByTrialIds(){
		List<TrialDcs> list = trialDcsService.getTrialsByTrialIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteTrialsByTrialIds(){
		int count = trialDcsService.deleteTrialsByTrialIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertTrials(){
		List<TrialDcs> items = new ArrayList<TrialDcs>();
		TrialDcs item = new TrialDcs();
		items.add(item);
		
		int count = trialDcsService.insertTrials(items);
		Assert.isTrue(count == 1);
	}
}