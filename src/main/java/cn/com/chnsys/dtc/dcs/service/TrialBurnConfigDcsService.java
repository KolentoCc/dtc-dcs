package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.TrialBurnConfigDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：TrialBurnConfigService 
 * @version 1.0.0
 */
public interface TrialBurnConfigDcsService extends BaseService {
	
	public TrialBurnConfigDcs getTrialBurnConfigByCourtRoomId(String courtRoomId);
	

	public List<TrialBurnConfigDcs> getTrialBurnConfigsByCourtRoomIds(String[] courtRoomIds);

	public Integer getMaxRecord();

	public int getTotalTrialBurnConfig(TrialBurnConfigDcs item);
	
	public List<TrialBurnConfigDcs> getTrialBurnConfigList(TrialBurnConfigDcs item,int offset,int limit);
	
	public int insertTrialBurnConfig(TrialBurnConfigDcs item);
	
	public int insertTrialBurnConfigs(List<TrialBurnConfigDcs> items);
	
	public int updateTrialBurnConfig(TrialBurnConfigDcs item);
	
	public int deleteTrialBurnConfigByCourtRoomId(String courtRoomId);
	
	public int delLogicTrialBurnConfigByCourtRoomId(String courtRoomId);
	
	public int deleteTrialBurnConfigsByCourtRoomIds(String[] courtRoomIds);
	
	public int delLogicTrialBurnConfigsByCourtRoomIds(String[] courtRoomIds);

}