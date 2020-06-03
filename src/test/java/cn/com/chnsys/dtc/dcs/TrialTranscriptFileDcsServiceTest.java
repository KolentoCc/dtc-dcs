package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import cn.com.chnsys.dtc.dcs.entity.TrialTranscriptFileDcs;
import cn.com.chnsys.dtc.dcs.service.TrialTranscriptFileDcsService;
import cn.com.chnsys.cif.base.utils.Assert;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.RandomGuid;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-service.xml"
})
public class TrialTranscriptFileDcsServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private TrialTranscriptFileDcsService trialTranscriptFileDcsService;
	
	@Test
	public void testGetTrialTranscriptFileDcsByTrialId(){
		TrialTranscriptFileDcs entity = trialTranscriptFileDcsService.getTrialTranscriptFileDcsByTrialId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalTrialTranscriptFileDcs() {
		TrialTranscriptFileDcs item = new TrialTranscriptFileDcs();
		trialTranscriptFileDcsService.getTotalTrialTranscriptFileDcs(item);
	}
	
	
	@Test
	public void testGetTrialTranscriptFileDcsList() {
		TrialTranscriptFileDcs item = new TrialTranscriptFileDcs();
		trialTranscriptFileDcsService.getTrialTranscriptFileDcsList(item,1,2);
	}
	
	@Test
	public void testInsertTrialTranscriptFileDcs() {
		TrialTranscriptFileDcs item = new TrialTranscriptFileDcs();
		int count = trialTranscriptFileDcsService.insertTrialTranscriptFileDcs(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateTrialTranscriptFileDcs() {
		TrialTranscriptFileDcs item = new TrialTranscriptFileDcs();
		item.setTrialId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = trialTranscriptFileDcsService.updateTrialTranscriptFileDcs(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteTrialTranscriptFileDcsByTrialId() {
		 int count = trialTranscriptFileDcsService.deleteTrialTranscriptFileDcsByTrialId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetTrialTranscriptFileDcssByTrialIds(){
		List<TrialTranscriptFileDcs> list = trialTranscriptFileDcsService.getTrialTranscriptFileDcssByTrialIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteTrialTranscriptFileDcssByTrialIds(){
		int count = trialTranscriptFileDcsService.deleteTrialTranscriptFileDcssByTrialIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertTrialTranscriptFileDcss(){
		List<TrialTranscriptFileDcs> items = new ArrayList<TrialTranscriptFileDcs>();
		TrialTranscriptFileDcs item = new TrialTranscriptFileDcs();
		items.add(item);
		
		int count = trialTranscriptFileDcsService.insertTrialTranscriptFileDcss(items);
		Assert.isTrue(count == 1);
	}
}