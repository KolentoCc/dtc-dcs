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
import cn.com.chnsys.dtc.dcs.entity.LiveProtocolDcs;
import cn.com.chnsys.dtc.dcs.service.LiveProtocolDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class LiveProtocolServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private LiveProtocolDcsService liveProtocolDcsService;
	
	@Test
	public void testGetLiveProtocolByTrialInfoID(){
		LiveProtocolDcs entity = liveProtocolDcsService.getLiveProtocolByTrialInfoID(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalLiveProtocol() {
		LiveProtocolDcs item = new LiveProtocolDcs();
		liveProtocolDcsService.getTotalLiveProtocol(item);
	}
	
	
	@Test
	public void testGetLiveProtocolList() {
		LiveProtocolDcs item = new LiveProtocolDcs();
		liveProtocolDcsService.getLiveProtocolList(item,1,2);
	}
	
	@Test
	public void testInsertLiveProtocol() {
		LiveProtocolDcs item = new LiveProtocolDcs();
		int count = liveProtocolDcsService.insertLiveProtocol(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateLiveProtocol() {
		LiveProtocolDcs item = new LiveProtocolDcs();
		item.setTrialInfoID(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = liveProtocolDcsService.updateLiveProtocol(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteLiveProtocolByTrialInfoID() {
		 int count = liveProtocolDcsService.deleteLiveProtocolByTrialInfoID(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetLiveProtocolsByTrialInfoIDs(){
		List<LiveProtocolDcs> list = liveProtocolDcsService.getLiveProtocolsByTrialInfoIDs(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteLiveProtocolsByTrialInfoIDs(){
		int count = liveProtocolDcsService.deleteLiveProtocolsByTrialInfoIDs(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertLiveProtocols(){
		List<LiveProtocolDcs> items = new ArrayList<LiveProtocolDcs>();
		LiveProtocolDcs item = new LiveProtocolDcs();
		items.add(item);
		
		int count = liveProtocolDcsService.insertLiveProtocols(items);
		Assert.isTrue(count == 1);
	}
}