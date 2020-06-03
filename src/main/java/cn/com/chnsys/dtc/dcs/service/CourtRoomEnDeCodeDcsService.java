package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomEnDeCodeDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CourtRoomEnDeCodeService 
 * @version 1.0.0
 */
public interface CourtRoomEnDeCodeDcsService extends BaseService {
	
	public CourtRoomEnDeCodeDcs getCourtRoomEnDeCodeById(String id);
	

	public List<CourtRoomEnDeCodeDcs> getCourtRoomEnDeCodesByIds(String[] ids);


	public int getTotalCourtRoomEnDeCode(CourtRoomEnDeCodeDcs item);
	
	public List<CourtRoomEnDeCodeDcs> getCourtRoomEnDeCodeList(CourtRoomEnDeCodeDcs item,int offset,int limit);
	
	public int insertCourtRoomEnDeCode(CourtRoomEnDeCodeDcs item);
	
	public int insertCourtRoomEnDeCodes(List<CourtRoomEnDeCodeDcs> items);
	
	public int updateCourtRoomEnDeCode(CourtRoomEnDeCodeDcs item);
	
	public int deleteCourtRoomEnDeCodeById(String id);
	
	public int delLogicCourtRoomEnDeCodeById(String id);
	
	public int deleteCourtRoomEnDeCodesByIds(String[] ids);
	
	public int delLogicCourtRoomEnDeCodesByIds(String[] ids);

}