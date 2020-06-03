package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomBackImageDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CourtRoomBackImageService 
 * @version 1.0.0
 */
public interface CourtRoomBackImageDcsService extends BaseService {
	
	public CourtRoomBackImageDcs getCourtRoomBackImageByCourtRoomId(String courtRoomId);
	

	public List<CourtRoomBackImageDcs> getCourtRoomBackImagesByCourtRoomIds(String[] courtRoomIds);

	public Integer getMaxRecord();

	public int getTotalCourtRoomBackImage(CourtRoomBackImageDcs item);
	
	public List<CourtRoomBackImageDcs> getCourtRoomBackImageList(CourtRoomBackImageDcs item,int offset,int limit);
	
	public int insertCourtRoomBackImage(CourtRoomBackImageDcs item);
	
	public int insertCourtRoomBackImages(List<CourtRoomBackImageDcs> items);
	
	public int updateCourtRoomBackImage(CourtRoomBackImageDcs item);
	
	public int deleteCourtRoomBackImageByCourtRoomId(String courtRoomId);
	
	public int delLogicCourtRoomBackImageByCourtRoomId(String courtRoomId);
	
	public int deleteCourtRoomBackImagesByCourtRoomIds(String[] courtRoomIds);
	
	public int delLogicCourtRoomBackImagesByCourtRoomIds(String[] courtRoomIds);

}