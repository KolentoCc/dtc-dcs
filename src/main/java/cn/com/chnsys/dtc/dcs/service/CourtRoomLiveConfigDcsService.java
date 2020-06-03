package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomLiveConfigDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CourtRoomLiveConfigService 
 * @version 1.0.0
 */
public interface CourtRoomLiveConfigDcsService extends BaseService {
	
	public CourtRoomLiveConfigDcs getCourtRoomLiveConfigByCourtRoomId(String courtRoomId);
	

	public List<CourtRoomLiveConfigDcs> getCourtRoomLiveConfigsByCourtRoomIds(String[] courtRoomIds);

	public Integer getMaxRecord();

	public int getTotalCourtRoomLiveConfig(CourtRoomLiveConfigDcs item);
	
	public List<CourtRoomLiveConfigDcs> getCourtRoomLiveConfigList(CourtRoomLiveConfigDcs item,int offset,int limit);
	
	public int insertCourtRoomLiveConfig(CourtRoomLiveConfigDcs item);
	
	public int insertCourtRoomLiveConfigs(List<CourtRoomLiveConfigDcs> items);
	
	public int updateCourtRoomLiveConfig(CourtRoomLiveConfigDcs item);
	
	public int deleteCourtRoomLiveConfigByCourtRoomId(String courtRoomId);
	
	public int delLogicCourtRoomLiveConfigByCourtRoomId(String courtRoomId);
	
	public int deleteCourtRoomLiveConfigsByCourtRoomIds(String[] courtRoomIds);
	
	public int delLogicCourtRoomLiveConfigsByCourtRoomIds(String[] courtRoomIds);

}