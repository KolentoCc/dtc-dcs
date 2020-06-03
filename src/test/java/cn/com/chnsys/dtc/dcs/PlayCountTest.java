package cn.com.chnsys.dtc.dcs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.dtc.dcs.entity.PlayCountDcs;
import cn.com.chnsys.dtc.dcs.service.PlayCountDcsService;


@ContextConfiguration(locations={
		"classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml"
	})
public class PlayCountTest extends AbstractJUnit4SpringContextTests{
	private PlayCountDcsService playCountDcsService;
	
	@Test
	public void testGetPlayCountByOpenCourtInfoId(){
		playCountDcsService.getPlayCountByOpenCourtInfoId("");
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
		playCountDcsService.insertPlayCount(item);
	}
	
	@Test
	public void testUpdatePlayCount() {
		PlayCountDcs item = new PlayCountDcs();
		playCountDcsService.updatePlayCount(item);
	}
	
	@Test
	public void testDeletePlayCountByOpenCourtInfoId() {
		playCountDcsService.deletePlayCountByOpenCourtInfoId("");
	}
	
	@Test
	public void testGetPlayCountsByOpenCourtInfoIds(){
		playCountDcsService.getPlayCountsByOpenCourtInfoIds(new String[]{});
	}
	
	@Test
	public void testDeletePlayCountsByOpenCourtInfoIds(){
		playCountDcsService.deletePlayCountsByOpenCourtInfoIds(new String[]{});
	}
	
	@Test
	public void testInsertPlayCounts(){
		List<PlayCountDcs> items = new ArrayList<PlayCountDcs>();
		playCountDcsService.insertPlayCounts(items);
	}
}