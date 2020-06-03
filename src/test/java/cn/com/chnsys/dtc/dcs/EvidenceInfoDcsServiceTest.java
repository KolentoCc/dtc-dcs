package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import cn.com.chnsys.dtc.dcs.entity.EvidenceInfoDcs;
import cn.com.chnsys.dtc.dcs.service.EvidenceInfoDcsService;
import cn.com.chnsys.cif.base.utils.Assert;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.RandomGuid;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-service.xml"
})
public class EvidenceInfoDcsServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private EvidenceInfoDcsService evidenceInfoDcsService;
	
	@Test
	public void testGetEvidenceInfoDcsByEvidenceId(){
		EvidenceInfoDcs entity = evidenceInfoDcsService.getEvidenceInfoDcsByEvidenceId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalEvidenceInfoDcs() {
		EvidenceInfoDcs item = new EvidenceInfoDcs();
		evidenceInfoDcsService.getTotalEvidenceInfoDcs(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		evidenceInfoDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetEvidenceInfoDcsList() {
		EvidenceInfoDcs item = new EvidenceInfoDcs();
		evidenceInfoDcsService.getEvidenceInfoDcsList(item,1,2);
	}
	
	@Test
	public void testInsertEvidenceInfoDcs() {
		EvidenceInfoDcs item = new EvidenceInfoDcs();
		int count = evidenceInfoDcsService.insertEvidenceInfoDcs(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateEvidenceInfoDcs() {
		EvidenceInfoDcs item = new EvidenceInfoDcs();
		item.setEvidenceId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = evidenceInfoDcsService.updateEvidenceInfoDcs(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteEvidenceInfoDcsByEvidenceId() {
		 int count = evidenceInfoDcsService.deleteEvidenceInfoDcsByEvidenceId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetEvidenceInfoDcssByEvidenceIds(){
		List<EvidenceInfoDcs> list = evidenceInfoDcsService.getEvidenceInfoDcssByEvidenceIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteEvidenceInfoDcssByEvidenceIds(){
		int count = evidenceInfoDcsService.deleteEvidenceInfoDcssByEvidenceIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertEvidenceInfoDcss(){
		List<EvidenceInfoDcs> items = new ArrayList<EvidenceInfoDcs>();
		EvidenceInfoDcs item = new EvidenceInfoDcs();
		items.add(item);
		
		int count = evidenceInfoDcsService.insertEvidenceInfoDcss(items);
		Assert.isTrue(count == 1);
	}
}