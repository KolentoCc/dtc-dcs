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
import cn.com.chnsys.dtc.dcs.entity.TrialBurnConfigDcs;
import cn.com.chnsys.dtc.dcs.service.TrialBurnConfigDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class TrialBurnConfigServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private TrialBurnConfigDcsService trialBurnConfigDcsService;
	
	@Test
	public void testGetTrialBurnConfigByCourtRoomId(){
		TrialBurnConfigDcs entity = trialBurnConfigDcsService.getTrialBurnConfigByCourtRoomId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalTrialBurnConfig() {
		TrialBurnConfigDcs item = new TrialBurnConfigDcs();
		trialBurnConfigDcsService.getTotalTrialBurnConfig(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		trialBurnConfigDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetTrialBurnConfigList() {
		TrialBurnConfigDcs item = new TrialBurnConfigDcs();
		trialBurnConfigDcsService.getTrialBurnConfigList(item,1,2);
	}
	
	@Test
	public void testInsertTrialBurnConfig() {
		TrialBurnConfigDcs item = new TrialBurnConfigDcs();
		int count = trialBurnConfigDcsService.insertTrialBurnConfig(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateTrialBurnConfig() {
		TrialBurnConfigDcs item = new TrialBurnConfigDcs();
		item.setCourtRoomId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = trialBurnConfigDcsService.updateTrialBurnConfig(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteTrialBurnConfigByCourtRoomId() {
		 int count = trialBurnConfigDcsService.deleteTrialBurnConfigByCourtRoomId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetTrialBurnConfigsByCourtRoomIds(){
		List<TrialBurnConfigDcs> list = trialBurnConfigDcsService.getTrialBurnConfigsByCourtRoomIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteTrialBurnConfigsByCourtRoomIds(){
		int count = trialBurnConfigDcsService.deleteTrialBurnConfigsByCourtRoomIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertTrialBurnConfigs(){
		List<TrialBurnConfigDcs> items = new ArrayList<TrialBurnConfigDcs>();
		TrialBurnConfigDcs item = new TrialBurnConfigDcs();
		items.add(item);
		
		int count = trialBurnConfigDcsService.insertTrialBurnConfigs(items);
		Assert.isTrue(count == 1);
	}
}