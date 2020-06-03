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
import cn.com.chnsys.dtc.dcs.entity.JudicialOrganMemberDcs;
import cn.com.chnsys.dtc.dcs.service.JudicialOrganMemberDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class JudicialOrganMemberServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private JudicialOrganMemberDcsService judicialOrganMemberDcsService;
	
	@Test
	public void testGetJudicialOrganMemberByMemberId(){
		JudicialOrganMemberDcs entity = judicialOrganMemberDcsService.getJudicialOrganMemberByMemberId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalJudicialOrganMember() {
		JudicialOrganMemberDcs item = new JudicialOrganMemberDcs();
		judicialOrganMemberDcsService.getTotalJudicialOrganMember(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		judicialOrganMemberDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetJudicialOrganMemberList() {
		JudicialOrganMemberDcs item = new JudicialOrganMemberDcs();
		judicialOrganMemberDcsService.getJudicialOrganMemberList(item,1,2);
	}
	
	@Test
	public void testInsertJudicialOrganMember() {
		JudicialOrganMemberDcs item = new JudicialOrganMemberDcs();
		int count = judicialOrganMemberDcsService.insertJudicialOrganMember(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateJudicialOrganMember() {
		JudicialOrganMemberDcs item = new JudicialOrganMemberDcs();
		item.setMemberId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = judicialOrganMemberDcsService.updateJudicialOrganMember(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteJudicialOrganMemberByMemberId() {
		 int count = judicialOrganMemberDcsService.deleteJudicialOrganMemberByMemberId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetJudicialOrganMembersByMemberIds(){
		List<JudicialOrganMemberDcs> list = judicialOrganMemberDcsService.getJudicialOrganMembersByMemberIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteJudicialOrganMembersByMemberIds(){
		int count = judicialOrganMemberDcsService.deleteJudicialOrganMembersByMemberIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertJudicialOrganMembers(){
		List<JudicialOrganMemberDcs> items = new ArrayList<JudicialOrganMemberDcs>();
		JudicialOrganMemberDcs item = new JudicialOrganMemberDcs();
		items.add(item);
		
		int count = judicialOrganMemberDcsService.insertJudicialOrganMembers(items);
		Assert.isTrue(count == 1);
	}
}