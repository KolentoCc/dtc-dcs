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
import cn.com.chnsys.dtc.dcs.entity.WitnessInfoDcs;
import cn.com.chnsys.dtc.dcs.service.WitnessInfoDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class WitnessInfoServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private WitnessInfoDcsService witnessInfoDcsService;
	
	@Test
	public void testGetWitnessInfoByEvidenceContentId(){
		WitnessInfoDcs entity = witnessInfoDcsService.getWitnessInfoByEvidenceContentId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalWitnessInfo() {
		WitnessInfoDcs item = new WitnessInfoDcs();
		witnessInfoDcsService.getTotalWitnessInfo(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		witnessInfoDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetWitnessInfoList() {
		WitnessInfoDcs item = new WitnessInfoDcs();
		witnessInfoDcsService.getWitnessInfoList(item,1,2);
	}
	
	@Test
	public void testInsertWitnessInfo() {
		WitnessInfoDcs item = new WitnessInfoDcs();
		int count = witnessInfoDcsService.insertWitnessInfo(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdateWitnessInfo() {
		WitnessInfoDcs item = new WitnessInfoDcs();
		item.setEvidenceContentId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = witnessInfoDcsService.updateWitnessInfo(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeleteWitnessInfoByEvidenceContentId() {
		 int count = witnessInfoDcsService.deleteWitnessInfoByEvidenceContentId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetWitnessInfosByEvidenceContentIds(){
		List<WitnessInfoDcs> list = witnessInfoDcsService.getWitnessInfosByEvidenceContentIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeleteWitnessInfosByEvidenceContentIds(){
		int count = witnessInfoDcsService.deleteWitnessInfosByEvidenceContentIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertWitnessInfos(){
		List<WitnessInfoDcs> items = new ArrayList<WitnessInfoDcs>();
		WitnessInfoDcs item = new WitnessInfoDcs();
		items.add(item);
		
		int count = witnessInfoDcsService.insertWitnessInfos(items);
		Assert.isTrue(count == 1);
	}
}