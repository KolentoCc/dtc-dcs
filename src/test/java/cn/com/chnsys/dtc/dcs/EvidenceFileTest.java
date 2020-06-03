package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.EvidenceFileDcs;
import cn.com.chnsys.dtc.dcs.service.EvidenceFileDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class EvidenceFileTest extends AbstractJUnit4SpringContextTests{
	private EvidenceFileDcsService evidenceFileDcsService;
	
	@Test
	public void testGetEvidenceFileByEvidenceFileId(){
		evidenceFileDcsService.getEvidenceFileByEvidenceFileId("");
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
		evidenceFileDcsService.insertEvidenceFile(item);
	}
	
	@Test
	public void testUpdateEvidenceFile() {
		EvidenceFileDcs item = new EvidenceFileDcs();
		evidenceFileDcsService.updateEvidenceFile(item);
	}
	
	@Test
	public void testDeleteEvidenceFileByEvidenceFileId() {
		evidenceFileDcsService.deleteEvidenceFileByEvidenceFileId("");
	}
	
	@Test
	public void testGetEvidenceFilesByEvidenceFileIds(){
		evidenceFileDcsService.getEvidenceFilesByEvidenceFileIds(new String[]{});
	}
	
	@Test
	public void testDeleteEvidenceFilesByEvidenceFileIds(){
		evidenceFileDcsService.deleteEvidenceFilesByEvidenceFileIds(new String[]{});
	}
	
	@Test
	public void testInsertEvidenceFiles(){
		List<EvidenceFileDcs> items = new ArrayList<EvidenceFileDcs>();
		evidenceFileDcsService.insertEvidenceFiles(items);
	}
}