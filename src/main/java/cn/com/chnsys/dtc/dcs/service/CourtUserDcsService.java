package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.CourtUserDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CourtUserService 
 * @version 1.0.0
 */
public interface CourtUserDcsService extends BaseService {
	
	public CourtUserDcs getCourtUserByUserId(String userId);
	
	public CourtUserDcs getCourtUserByInterfaceId(Integer courtCode, String interfaceId);
		
	public List<CourtUserDcs> getCourtUsersByUserIds(String[] userIds);
	
	public Integer getMaxRecord();
		
	public int getTotalCourtUser(CourtUserDcs item);
	
	public List<CourtUserDcs> getCourtUserList(CourtUserDcs item,int offset,int limit);
	
	public int insertCourtUser(CourtUserDcs item);

	public int insertCourtUsers(List<CourtUserDcs> items);
	
	public int updateCourtUser(CourtUserDcs item);
	
	public int deleteCourtUserByUserId(String userId);
	
	public int delLogicCourtUserByUserId(String userId);
	
	public int deleteCourtUsersByUserIds(String[] userIds);
	
	public int delLogicCourtUsersByUserIds(String[] userIds);

}