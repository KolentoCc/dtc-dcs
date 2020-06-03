package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomConfigDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CourtRoomConfigService 
 * @version 1.0.0
 */
public interface CourtRoomConfigDcsService extends BaseService {
	
	public CourtRoomConfigDcs getCourtRoomConfigByCourtRoomId(String courtRoomId);
	

	public List<CourtRoomConfigDcs> getCourtRoomConfigsByCourtRoomIds(String[] courtRoomIds);

	public Integer getMaxRecord();

	public int getTotalCourtRoomConfig(CourtRoomConfigDcs item);
	
	public List<CourtRoomConfigDcs> getCourtRoomConfigList(CourtRoomConfigDcs item,int offset,int limit);
	
	public int insertCourtRoomConfig(CourtRoomConfigDcs item);
	
	public int insertCourtRoomConfigs(List<CourtRoomConfigDcs> items);
	
	public int updateCourtRoomConfig(CourtRoomConfigDcs item);
	
	public int deleteCourtRoomConfigByCourtRoomId(String courtRoomId);
	
	public int delLogicCourtRoomConfigByCourtRoomId(String courtRoomId);
	
	public int deleteCourtRoomConfigsByCourtRoomIds(String[] courtRoomIds);
	
	public int delLogicCourtRoomConfigsByCourtRoomIds(String[] courtRoomIds);

}