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
import cn.com.chnsys.dtc.dcs.entity.DemondProtocolDcs;
import cn.com.chnsys.dtc.dcs.service.DemondProtocolDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class DemondProtocolServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private DemondProtocolDcsService demondProtocolDcsService;
	
	@Test
	public void testGetDemondProtocolByTrialInfoId(){
		DemondProtocolDcs entity = demondProtocolDcsService.getDemondProtocolByTrialInfoId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalDemondProtocol() {
		DemondProtocolDcs item = new DemondProtocolDcs();
		demondProtocolDcsService.getTotalDemondProtocol(item);
	}
	
	
	@Test
	public void testGetDemondProtocolList() {
		DemondProtocolDcs item = new DemondProtocolDcs();
		demondProtocolDcsService.getDemondProtocolList(item,1,2);
	}
	
	@Test
	public void testInsertDemondProtocol() {
		DemondProtocolDcs item = new DemondProtocolDcs();
		int count = demondProtocolDcsService.insertDemondProtocol(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateDemondProtocol() {
		DemondProtocolDcs item = new DemondProtocolDcs();
		item.setTrialInfoId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = demondProtocolDcsService.updateDemondProtocol(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteDemondProtocolByTrialInfoId() {
		 int count = demondProtocolDcsService.deleteDemondProtocolByTrialInfoId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetDemondProtocolsByTrialInfoIds(){
		List<DemondProtocolDcs> list = demondProtocolDcsService.getDemondProtocolsByTrialInfoIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteDemondProtocolsByTrialInfoIds(){
		int count = demondProtocolDcsService.deleteDemondProtocolsByTrialInfoIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertDemondProtocols(){
		List<DemondProtocolDcs> items = new ArrayList<DemondProtocolDcs>();
		DemondProtocolDcs item = new DemondProtocolDcs();
		items.add(item);
		
		int count = demondProtocolDcsService.insertDemondProtocols(items);
		Assert.isTrue(count == 1);
	}
}