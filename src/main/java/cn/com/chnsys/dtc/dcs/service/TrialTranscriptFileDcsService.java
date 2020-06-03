package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.TrialTranscriptFileDcs;
import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：TrialTranscriptFileDcsService 
 * @version 1.0.0
 */
public interface TrialTranscriptFileDcsService extends BaseService {
	
	public TrialTranscriptFileDcs getTrialTranscriptFileDcsByTrialId(String trialId);
	

	public List<TrialTranscriptFileDcs> getTrialTranscriptFileDcssByTrialIds(String[] trialIds);


	public int getTotalTrialTranscriptFileDcs(TrialTranscriptFileDcs item);
	
	public List<TrialTranscriptFileDcs> getTrialTranscriptFileDcsList(TrialTranscriptFileDcs item,int offset,int limit);
	
	public int insertTrialTranscriptFileDcs(TrialTranscriptFileDcs item);
	
	public int insertTrialTranscriptFileDcss(List<TrialTranscriptFileDcs> items);
	
	public int updateTrialTranscriptFileDcs(TrialTranscriptFileDcs item);
	
	public int deleteTrialTranscriptFileDcsByTrialId(String trialId);
	
	public int delLogicTrialTranscriptFileDcsByTrialId(String trialId);
	
	public int deleteTrialTranscriptFileDcssByTrialIds(String[] trialIds);
	
	public int delLogicTrialTranscriptFileDcssByTrialIds(String[] trialIds);

}