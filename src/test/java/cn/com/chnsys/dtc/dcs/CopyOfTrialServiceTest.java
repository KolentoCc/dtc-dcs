package cn.com.chnsys.dtc.dcs;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.com.chnsys.cif.base.utils.JSONUtil;
import cn.com.chnsys.dtc.dcs.entity.TrialDcs;
import cn.com.chnsys.dtc.dcs.service.TrialDcsService;

@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"classpath*:spring/**/applicationContext-services.xml" })
public class CopyOfTrialServiceTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private TrialDcsService trialDcsService;


	@Test
	public void testGetCurrentDayTrials() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<TrialDcs> list = trialDcsService.getCurrentDayTrials(sdf.format(getDayBegin())); 
		for (TrialDcs item : list) {
			String str = JSONUtil.extractJson(item);
			System.out.println("\n*************" + str);
		}
	}

	public static java.util.Date getDayBegin() {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 5);
		cal.set(Calendar.DAY_OF_MONTH, 27);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	// 获取当天的结束时间
	public static Date getDayEnd() {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		return new Date(cal.getTime().getTime());
	}
	
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdf.format(getDayBegin()));
	}
}