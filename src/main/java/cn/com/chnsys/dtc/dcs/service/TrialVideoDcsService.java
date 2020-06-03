package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.TrialVideoDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：TrialVideoService 
 * @version 1.0.0
 */
public interface TrialVideoDcsService extends BaseService {
	
	public TrialVideoDcs getTrialVideoByVideoId(String videoId);
	
    public List<TrialVideoDcs> getTrialVideoListByTrialId(String trialId);
    
	public List<TrialVideoDcs> getTrialVideosByVideoIds(String[] videoIds);

	public Integer getMaxRecord();

	public int getTotalTrialVideo(TrialVideoDcs item);
	
	public List<TrialVideoDcs> getTrialVideoList(TrialVideoDcs item,int offset,int limit);
	
	public int insertTrialVideo(TrialVideoDcs item);
	
	public int insertTrialVideos(List<TrialVideoDcs> items);
	
	public int updateTrialVideo(TrialVideoDcs item);
	
	public int deleteTrialVideoByVideoId(String videoId);
	
	public int delLogicTrialVideoByVideoId(String videoId);
	
	public int deleteTrialVideosByVideoIds(String[] videoIds);
	
	public int delLogicTrialVideosByVideoIds(String[] videoIds);

}