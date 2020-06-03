package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.TrialPlayNumDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-rcs 
 * @类名称：TrialPlayNumDcsService 
 * @version 1.0.0
 */
public interface TrialPlayNumDcsService extends BaseService {
	
	public TrialPlayNumDcs getTrialPlayNumDcsByPlayId(String playId);
	
		
	public List<TrialPlayNumDcs> getTrialPlayNumDcssByPlayIds(String[] playIds);
	
		public Integer getMaxRecord();
		
	public int getTotalTrialPlayNumDcs(TrialPlayNumDcs item);
	
	public List<TrialPlayNumDcs> getTrialPlayNumDcsList(TrialPlayNumDcs item,int offset,int limit);
	
	public int insertTrialPlayNumDcs(TrialPlayNumDcs item);
	
	public int insertTrialPlayNumDcss(List<TrialPlayNumDcs> items);
	
	public int updateTrialPlayNumDcs(TrialPlayNumDcs item);
	
	public int deleteTrialPlayNumDcsByPlayId(String playId);
	
	public int deleteTrialPlayNumDcssByPlayIds(String[] playIds);


	/**
	 * @Title: getTrialPlayNumDcsByTrialId
	 * @param trialId
	 * @param trialStatus
	 * @param deleteflagNo
	 * @param day
	 * @return 
	 * @author gengsonglin
	 * @date 2019年4月29日 下午2:04:24
	 */
	public TrialPlayNumDcs getTrialPlayNumDcsByTrialId(String trialId,
			Integer trialStatus, Integer deleteflagNo, String day);
}