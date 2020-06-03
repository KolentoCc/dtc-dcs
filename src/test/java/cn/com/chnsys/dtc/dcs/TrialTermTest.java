package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.TrialTermDcs;
import cn.com.chnsys.dtc.dcs.service.TrialTermDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class TrialTermTest extends AbstractJUnit4SpringContextTests{
	private TrialTermDcsService trialTermDcsService;
	
	@Test
	public void testGetTrialTermByCaseId(){
		trialTermDcsService.getTrialTermByCaseId("");
	}
	
	@Test
	public void testGetTotalTrialTerm() {
		TrialTermDcs item = new TrialTermDcs();
		trialTermDcsService.getTotalTrialTerm(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		trialTermDcsService.getMaxRecord();
	}
	
	
	@Test
	public void testGetTrialTermList() {
		TrialTermDcs item = new TrialTermDcs();
		trialTermDcsService.getTrialTermList(item,1,2);
	}
	
	@Test
	public void testInsertTrialTerm() {
		TrialTermDcs item = new TrialTermDcs();
		trialTermDcsService.insertTrialTerm(item);
	}
	
	@Test
	public void testUpdateTrialTerm() {
		TrialTermDcs item = new TrialTermDcs();
		trialTermDcsService.updateTrialTerm(item);
	}
	
	@Test
	public void testDeleteTrialTermByCaseId() {
		trialTermDcsService.deleteTrialTermByCaseId("");
	}
	
	@Test
	public void testGetTrialTermsByCaseIds(){
		trialTermDcsService.getTrialTermsByCaseIds(new String[]{});
	}
	
	@Test
	public void testDeleteTrialTermsByCaseIds(){
		trialTermDcsService.deleteTrialTermsByCaseIds(new String[]{});
	}
	
	@Test
	public void testInsertTrialTerms(){
		List<TrialTermDcs> items = new ArrayList<TrialTermDcs>();
		trialTermDcsService.insertTrialTerms(items);
	}
}