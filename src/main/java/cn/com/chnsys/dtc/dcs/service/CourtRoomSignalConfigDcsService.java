package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomSignalConfigDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CourtRoomSignalConfigService 
 * @version 1.0.0
 */
public interface CourtRoomSignalConfigDcsService extends BaseService {
	
	public CourtRoomSignalConfigDcs getCourtRoomSignalConfigByChannelId(String channelId);
	

	public List<CourtRoomSignalConfigDcs> getCourtRoomSignalConfigsByChannelIds(String[] channelIds);

	public Integer getMaxRecord();

	public int getTotalCourtRoomSignalConfig(CourtRoomSignalConfigDcs item);
	
	public List<CourtRoomSignalConfigDcs> getCourtRoomSignalConfigList(CourtRoomSignalConfigDcs item,int offset,int limit);
	
	public int insertCourtRoomSignalConfig(CourtRoomSignalConfigDcs item);
	
	public int insertCourtRoomSignalConfigs(List<CourtRoomSignalConfigDcs> items);
	
	public int updateCourtRoomSignalConfig(CourtRoomSignalConfigDcs item);
	
	public int deleteCourtRoomSignalConfigByChannelId(String channelId);
	
	public int delLogicCourtRoomSignalConfigByChannelId(String channelId);
	
	public int deleteCourtRoomSignalConfigsByChannelIds(String[] channelIds);
	
	public int delLogicCourtRoomSignalConfigsByChannelIds(String[] channelIds);

}