package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomDcs;
import cn.com.chnsys.dtc.dcs.vo.CourtNumVo;


/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CourtRoomService 
 * @version 1.0.0
 */
public interface CourtRoomDcsService extends BaseService {
	
	public CourtRoomDcs getCourtRoomByCourtRoomId(String courtRoomId);
	
	public CourtRoomDcs getCourtRoomByInterfaceId(Integer courtCode, String interfaceId);

	public List<CourtRoomDcs> getCourtRoomsByCourtRoomIds(String[] courtRoomIds);

	public Integer getMaxRecord();

	public int getTotalCourtRoom(CourtRoomDcs item);
	
	public List<CourtRoomDcs> getCourtRoomList(CourtRoomDcs item,int offset,int limit);
	
	public int insertCourtRoom(CourtRoomDcs item);
	
	public int insertCourtRooms(List<CourtRoomDcs> items);
	
	public int updateCourtRoom(CourtRoomDcs item);
	
	public int deleteCourtRoomByCourtRoomId(String courtRoomId);
	
	public int delLogicCourtRoomByCourtRoomId(String courtRoomId);
	
	public int deleteCourtRoomsByCourtRoomIds(String[] courtRoomIds);
	
	public int delLogicCourtRoomsByCourtRoomIds(String[] courtRoomIds);
	
	public List<CourtRoomDcs> getCourtRoomEntityLists(String[] courts, Integer signalType, Integer courtRoomType, Integer firm, int offset,int limit);

	public int getTotalLists(String[] courts, Integer signalType, Integer courtRoomType, Integer firm);

	 /**
     * 根据删除标记以及删除时间查询法庭信息
     * @Title: getCourtRooms
     * @param item
     * @param rowBounds
     * @return 
     * @author wangxq
     * @date 2019年3月27日 下午2:49:52
     */
    public List<CourtRoomDcs> getCourtRooms(CourtRoomDcs item,int offset,int limit);

	
	/**
    *
    * 获取指定法院更新时间后的法庭信息
    * 
    * @param courtCode 法院代码
    * @param udpateTime 更新时间
    * @return List<CourtRoomDcs>
    */ 
    public List<CourtRoomDcs> getUpdateCourtRoomDcsList(Integer courtCode, Long updateTime, int offset,int limit);
    /**
     * 模糊搜索法庭名称
     * @Title: selectCourtRoom
     * @param unitCode
     * @param courtName
     * @return 
     * @author wangxq
     * @date 2019年3月28日 上午9:19:18
     */
	public List<CourtRoomDcs> selectCourtRoom(String unitCode, String courtName, int offset, int limit);

	/**
	 * @Title: deletCourtRoomByCourtIds
	 * @param unitIds
	 * @return  删除所选法庭集合（逻辑删除）
	 * @author gengsonglin
	 * @date 2019年4月1日 下午5:25:07
	 */
	public int deletCourtRoomByCourtIds(String[] unitIds);

	/**
	 * @Title: getCourtRoomData
	 * @param unitCode
	 * @param courtName
	 * @return 
	 * @author gengsonglin
	 * @date 2019年4月8日 上午11:06:56
	 */
	public int getCourtRoomData(String unitCode, String courtName);

	/**
	 * @Title: getListOrderByState
	 * @param unitCodeList
	 * @param offset
	 * @param limit
	 * @return 
	 * @author gengsonglin
	 * @date 2019年4月11日 下午7:33:05
	 */
	public List<CourtRoomDcs> getListOrderByState(List<String> unitCodeList,
			int offset, int limit);

	/**
	 * @Title: getCourtNumGroupByState
	 * @param unitCodeList
	 * @param deleteFlag 
	 * @author gengsonglin
	 * @date 2019年4月26日 下午4:21:35
	 */
	public List<CourtNumVo> getCourtNumGroupByState(List<Integer> unitCodeList,
			int deleteFlag);


}