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
import cn.com.chnsys.dtc.dcs.entity.TrialLiveDcs;
import cn.com.chnsys.dtc.dcs.service.TrialLiveDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class TrialLiveServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private TrialLiveDcsService trialLiveDcsService;
	
	@Test
	public void testGetTrialLiveByTrialLiveId(){
		TrialLiveDcs entity = trialLiveDcsService.getTrialLiveByTrialLiveId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalTrialLive() {
		TrialLiveDcs item = new TrialLiveDcs();
		trialLiveDcsService.getTotalTrialLive(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		trialLiveDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetTrialLiveList() {
		TrialLiveDcs item = new TrialLiveDcs();
		trialLiveDcsService.getTrialLiveList(item,1,2);
	}
	
	@Test
	public void testInsertTrialLive() {
		TrialLiveDcs item = new TrialLiveDcs();
		int count = trialLiveDcsService.insertTrialLive(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateTrialLive() {
		TrialLiveDcs item = new TrialLiveDcs();
		item.setTrialLiveId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = trialLiveDcsService.updateTrialLive(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteTrialLiveByTrialLiveId() {
		 int count = trialLiveDcsService.deleteTrialLiveByTrialLiveId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetTrialLivesByTrialLiveIds(){
		List<TrialLiveDcs> list = trialLiveDcsService.getTrialLivesByTrialLiveIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteTrialLivesByTrialLiveIds(){
		int count = trialLiveDcsService.deleteTrialLivesByTrialLiveIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertTrialLives(){
		List<TrialLiveDcs> items = new ArrayList<TrialLiveDcs>();
		TrialLiveDcs item = new TrialLiveDcs();
		items.add(item);
		
		int count = trialLiveDcsService.insertTrialLives(items);
		Assert.isTrue(count == 1);
	}
}