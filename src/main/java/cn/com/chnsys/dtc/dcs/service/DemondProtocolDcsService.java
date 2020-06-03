package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.DemondProtocolDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：DemondProtocolService 
 * @version 1.0.0
 */
public interface DemondProtocolDcsService extends BaseService {
	
	public DemondProtocolDcs getDemondProtocolByTrialInfoId(String trialInfoId);
	

	public List<DemondProtocolDcs> getDemondProtocolsByTrialInfoIds(String[] trialInfoIds);


	public int getTotalDemondProtocol(DemondProtocolDcs item);
	
	public List<DemondProtocolDcs> getDemondProtocolList(DemondProtocolDcs item,int offset,int limit);
	
	public int insertDemondProtocol(DemondProtocolDcs item);
	
	public int insertDemondProtocols(List<DemondProtocolDcs> items);
	
	public int updateDemondProtocol(DemondProtocolDcs item);
	
	public int deleteDemondProtocolByTrialInfoId(String trialInfoId);
	
	public int delLogicDemondProtocolByTrialInfoId(String trialInfoId);
	
	public int deleteDemondProtocolsByTrialInfoIds(String[] trialInfoIds);
	
	public int delLogicDemondProtocolsByTrialInfoIds(String[] trialInfoIds);

}