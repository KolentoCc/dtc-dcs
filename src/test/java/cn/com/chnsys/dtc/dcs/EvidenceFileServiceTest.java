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
import cn.com.chnsys.dtc.dcs.entity.EvidenceFileDcs;
import cn.com.chnsys.dtc.dcs.service.EvidenceFileDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class EvidenceFileServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private EvidenceFileDcsService evidenceFileDcsService;
	
	@Test
	public void testGetEvidenceFileByEvidenceFileId(){
		EvidenceFileDcs entity = evidenceFileDcsService.getEvidenceFileByEvidenceFileId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalEvidenceFile() {
		EvidenceFileDcs item = new EvidenceFileDcs();
		evidenceFileDcsService.getTotalEvidenceFile(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		evidenceFileDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetEvidenceFileList() {
		EvidenceFileDcs item = new EvidenceFileDcs();
		evidenceFileDcsService.getEvidenceFileList(item,1,2);
	}
	
	@Test
	public void testInsertEvidenceFile() {
		EvidenceFileDcs item = new EvidenceFileDcs();
		int count = evidenceFileDcsService.insertEvidenceFile(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateEvidenceFile() {
		EvidenceFileDcs item = new EvidenceFileDcs();
		item.setEvidenceFileId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = evidenceFileDcsService.updateEvidenceFile(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteEvidenceFileByEvidenceFileId() {
		 int count = evidenceFileDcsService.deleteEvidenceFileByEvidenceFileId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetEvidenceFilesByEvidenceFileIds(){
		List<EvidenceFileDcs> list = evidenceFileDcsService.getEvidenceFilesByEvidenceFileIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteEvidenceFilesByEvidenceFileIds(){
		int count = evidenceFileDcsService.deleteEvidenceFilesByEvidenceFileIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertEvidenceFiles(){
		List<EvidenceFileDcs> items = new ArrayList<EvidenceFileDcs>();
		EvidenceFileDcs item = new EvidenceFileDcs();
		items.add(item);
		
		int count = evidenceFileDcsService.insertEvidenceFiles(items);
		Assert.isTrue(count == 1);
	}
}