package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.TrialLiveDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：TrialLiveService 
 * @version 1.0.0
 */
public interface TrialLiveDcsService extends BaseService {
	
	public TrialLiveDcs getTrialLiveByTrialLiveId(String trialLiveId);
	

	public List<TrialLiveDcs> getTrialLivesByTrialLiveIds(String[] trialLiveIds);

	public Integer getMaxRecord();

	public int getTotalTrialLive(TrialLiveDcs item);
	
	public List<TrialLiveDcs> getTrialLiveList(TrialLiveDcs item,int offset,int limit);

	public List<TrialLiveDcs> getTrialLiveListByTrialId(String trialId);
	
	public int insertTrialLive(TrialLiveDcs item);
	
	public int insertTrialLives(List<TrialLiveDcs> items);
	
	public int updateTrialLive(TrialLiveDcs item);
	
	public int deleteTrialLiveByTrialLiveId(String trialLiveId);
	
	public int delLogicTrialLiveByTrialLiveId(String trialLiveId);
	
	public int deleteTrialLivesByTrialLiveIds(String[] trialLiveIds);
	
	public int delLogicTrialLivesByTrialLiveIds(String[] trialLiveIds);

}