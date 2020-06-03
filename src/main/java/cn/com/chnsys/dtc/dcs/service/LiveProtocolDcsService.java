package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.LiveProtocolDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：LiveProtocolService 
 * @version 1.0.0
 */
public interface LiveProtocolDcsService extends BaseService {
	
	public LiveProtocolDcs getLiveProtocolByTrialInfoID(String trialInfoID);
	

	public List<LiveProtocolDcs> getLiveProtocolsByTrialInfoIDs(String[] trialInfoIDs);


	public int getTotalLiveProtocol(LiveProtocolDcs item);
	
	public List<LiveProtocolDcs> getLiveProtocolList(LiveProtocolDcs item,int offset,int limit);
	
	public int insertLiveProtocol(LiveProtocolDcs item);
	
	public int insertLiveProtocols(List<LiveProtocolDcs> items);
	
	public int updateLiveProtocol(LiveProtocolDcs item);
	
	public int deleteLiveProtocolByTrialInfoID(String trialInfoID);
	
	public int delLogicLiveProtocolByTrialInfoID(String trialInfoID);
	
	public int deleteLiveProtocolsByTrialInfoIDs(String[] trialInfoIDs);
	
	public int delLogicLiveProtocolsByTrialInfoIDs(String[] trialInfoIDs);

}