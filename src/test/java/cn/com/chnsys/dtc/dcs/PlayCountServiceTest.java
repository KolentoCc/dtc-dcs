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
import cn.com.chnsys.dtc.dcs.entity.PlayCountDcs;
import cn.com.chnsys.dtc.dcs.service.PlayCountDcsService;

@ContextConfiguration(locations={
	"classpath:applicationContext.xml",
	"classpath*:spring/**/applicationContext-services.xml"
})
public class PlayCountServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private PlayCountDcsService playCountDcsService;
	
	@Test
	public void testGetPlayCountByOpenCourtInfoId(){
		PlayCountDcs entity = playCountDcsService.getPlayCountByOpenCourtInfoId(RandomGuid.generateGuid());
		Assert.isNull(entity);
	}
	
	
	@Test
	public void testGetTotalPlayCount() {
		PlayCountDcs item = new PlayCountDcs();
		playCountDcsService.getTotalPlayCount(item);
	}
	
	@Test
	public void testGetMaxRecord() {
		playCountDcsService.getMaxRecord();
	}
	
	@Test
	public void testGetPlayCountList() {
		PlayCountDcs item = new PlayCountDcs();
		playCountDcsService.getPlayCountList(item,1,2);
	}
	
	@Test
	public void testInsertPlayCount() {
		PlayCountDcs item = new PlayCountDcs();
		int count = playCountDcsService.insertPlayCount(item);
		Assert.isTrue(count == 1);
	}
	
	@Test
	public void testUpdatePlayCount() {
		PlayCountDcs item = new PlayCountDcs();
		item.setOpenCourtInfoId(RandomGuid.generateGuid());
		item.setTimestamp(System.currentTimeMillis());
		int count = playCountDcsService.updatePlayCount(item);
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testDeletePlayCountByOpenCourtInfoId() {
		 int count = playCountDcsService.deletePlayCountByOpenCourtInfoId(RandomGuid.generateGuid());
		 Assert.isTrue(count == 0);
	}
	
	@Test
	public void testGetPlayCountsByOpenCourtInfoIds(){
		List<PlayCountDcs> list = playCountDcsService.getPlayCountsByOpenCourtInfoIds(new String[]{});
		Assert.isTrue(CollectionUtil.isEmpty(list));
	}
	
	@Test
	public void testDeletePlayCountsByOpenCourtInfoIds(){
		int count = playCountDcsService.deletePlayCountsByOpenCourtInfoIds(new String[]{});
		Assert.isTrue(count == 0);
	}
	
	@Test
	public void testInsertPlayCounts(){
		List<PlayCountDcs> items = new ArrayList<PlayCountDcs>();
		PlayCountDcs item = new PlayCountDcs();
		items.add(item);
		
		int count = playCountDcsService.insertPlayCounts(items);
		Assert.isTrue(count == 1);
	}
}