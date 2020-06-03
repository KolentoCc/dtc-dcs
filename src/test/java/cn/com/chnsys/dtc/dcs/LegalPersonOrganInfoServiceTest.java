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
import cn.com.chnsys.dtc.dcs.entity.LegalPersonOrganInfoDcs;
import cn.com.chnsys.dtc.dcs.service.LegalPersonOrganInfoDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class LegalPersonOrganInfoServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private LegalPersonOrganInfoDcsService legalPersonOrganInfoDcsService;
	
	@Test
	public void testGetLegalPersonOrganInfoByEntityId(){
		LegalPersonOrganInfoDcs entity = legalPersonOrganInfoDcsService.getLegalPersonOrganInfoByEntityId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalLegalPersonOrganInfo() {
		LegalPersonOrganInfoDcs item = new LegalPersonOrganInfoDcs();
		legalPersonOrganInfoDcsService.getTotalLegalPersonOrganInfo(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		legalPersonOrganInfoDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetLegalPersonOrganInfoList() {
		LegalPersonOrganInfoDcs item = new LegalPersonOrganInfoDcs();
		legalPersonOrganInfoDcsService.getLegalPersonOrganInfoList(item,1,2);
	}
	
	@Test
	public void testInsertLegalPersonOrganInfo() {
		LegalPersonOrganInfoDcs item = new LegalPersonOrganInfoDcs();
		int count = legalPersonOrganInfoDcsService.insertLegalPersonOrganInfo(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateLegalPersonOrganInfo() {
		LegalPersonOrganInfoDcs item = new LegalPersonOrganInfoDcs();
		item.setEntityId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = legalPersonOrganInfoDcsService.updateLegalPersonOrganInfo(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteLegalPersonOrganInfoByEntityId() {
		 int count = legalPersonOrganInfoDcsService.deleteLegalPersonOrganInfoByEntityId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetLegalPersonOrganInfosByEntityIds(){
		List<LegalPersonOrganInfoDcs> list = legalPersonOrganInfoDcsService.getLegalPersonOrganInfosByEntityIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteLegalPersonOrganInfosByEntityIds(){
		int count = legalPersonOrganInfoDcsService.deleteLegalPersonOrganInfosByEntityIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertLegalPersonOrganInfos(){
		List<LegalPersonOrganInfoDcs> items = new ArrayList<LegalPersonOrganInfoDcs>();
		LegalPersonOrganInfoDcs item = new LegalPersonOrganInfoDcs();
		items.add(item);
		
		int count = legalPersonOrganInfoDcsService.insertLegalPersonOrganInfos(items);
		Assert.isTrue(count == 1);
	}
}