package cn.com.chnsys.dtc.dcs.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomDcs;
import cn.com.chnsys.dtc.dcs.vo.CourtNumVo;
/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CourtRoomDao 
 * @version 1.0.0
 */
public interface CourtRoomDcsDao extends BaseDao<CourtRoomDcs> {
    /**
     * 根据法院代码和接口标识，获取记录信息
     *
     * @param <T> 返回类型泛型
     * @param courtCode 法院代码
     * @param interfaceId 接口标识
     * @return 查询的结果
     *
     */
    public CourtRoomDcs getRecordByInterfaceId(Integer courtCode, String interfaceId);
    
    public List<CourtRoomDcs> getCourtRoomEntityLists(@Param("courts") String[] courts,
			@Param("signalType") Integer signalType, @Param("courtRoomType") Integer courtRoomType, @Param("firm") Integer firm,RowBounds rowBounds);
    
    public int getTotalLists(@Param("courts") String[] courts,
			@Param("signalType") Integer signalType, @Param("courtRoomType") Integer courtRoomType, @Param("firm") Integer firm);

    /**
     * 根据删除标记以及删除时间查询法庭信息
     * @Title: getCourtRooms
     * @param item
     * @param rowBounds
     * @return 
     * @author wangxq
     * @date 2019年3月27日 下午2:49:52
     */
    public List<CourtRoomDcs> getCourtRooms(CourtRoomDcs item,RowBounds rowBounds);

    
    /**
    *
    * 获取指定法院更新时间后的法庭信息
    * 
    * @param courtCode 法院代码
    * @param udpateTime 更新时间
    * @return List<CourtRoomDcs>
    */ 
    public List<CourtRoomDcs> getUpdateCourtRoomDcsList(@Param("courtCode") Integer courtCode, @Param("updateTime") Long updateTime, RowBounds row);

	public List<CourtRoomDcs> selectCourtRoom(@Param("unitCode")String unitCode, @Param("courtName")String courtName,RowBounds rowBounds);

	/**
	 * @Title: deletCourtRoomByCourtIds
	 * @param unitIds
	 * @return 
	 * @author gengsonglin
	 * @date 2019年4月1日 下午5:26:20
	 */
	public int deletCourtRoomByCourtIds(String[] unitIds);

	/**
	 * @Title: getCourtRoomData
	 * @param unitCode
	 * @param courtName
	 * @return 
	 * @author gengsonglin
	 * @date 2019年4月8日 上午11:07:41
	 */
	public int getCourtRoomData(@Param("unitCode")String unitCode, @Param("courtName")String courtName);

	/**
	 * @Title: getListOrderByState
	 * @param unitCodeList
	 * @param rowBounds
	 * @return 
	 * @author gengsonglin
	 * @date 2019年4月11日 下午7:34:26
	 */
	public List<CourtRoomDcs> getListOrderByState(@Param("unitCodeList")List<String> unitCodeList,
			RowBounds rowBounds);

	/**
	 * @Title: getCourtNumGroupByState
	 * @param unitCodeList
	 * @param deleteFlag
	 * @return 
	 * @author gengsonglin
	 * @date 2019年4月26日 下午4:27:28
	 */
	public List<CourtNumVo> getCourtNumGroupByState(@Param("unitCodeList")List<Integer> unitCodeList,
			@Param("deleteFlag")int deleteFlag);

}