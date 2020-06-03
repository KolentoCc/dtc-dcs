package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.TrialScreenshotDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：TrialScreenshotService 
 * @version 1.0.0
 */
public interface TrialScreenshotDcsService extends BaseService {
	
	public TrialScreenshotDcs getTrialScreenshotByTrialId(String trialId);
	

	public List<TrialScreenshotDcs> getTrialScreenshotsByTrialIds(String[] trialIds);

	public Integer getMaxRecord();

	public int getTotalTrialScreenshot(TrialScreenshotDcs item);
	
	public List<TrialScreenshotDcs> getTrialScreenshotList(TrialScreenshotDcs item,int offset,int limit);
	
	public int insertTrialScreenshot(TrialScreenshotDcs item);
	
	public int insertTrialScreenshots(List<TrialScreenshotDcs> items);
	
	public int updateTrialScreenshot(TrialScreenshotDcs item);
	
	public int deleteTrialScreenshotByTrialId(String trialId);
	
	public int delLogicTrialScreenshotByTrialId(String trialId);
	
	public int deleteTrialScreenshotsByTrialIds(String[] trialIds);
	
	public int delLogicTrialScreenshotsByTrialIds(String[] trialIds);

}