package cn.com.chnsys.dtc.dcs.dao;
import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.dcs.entity.UnitStructDcs;
/** 
 * @项目名称：chnsys-dtc 
 * @类名称：UnitStructDao 
 * @version 1.0.0
 */
public interface UnitStructDcsDao extends BaseDao<UnitStructDcs> {
    /**
     * 根据法院代码和接口标识，获取记录信息
     *
     * @param <T> 返回类型泛型
     * @param courtCode 法院代码
     * @param interfaceId 接口标识
     * @return 查询的结果
     *
     */
    public UnitStructDcs getRecordByInterfaceId(Integer courtCode, String interfaceId);
    /**
     * 删除全部数据
     * @return
     */
    public void deleteAll();
}