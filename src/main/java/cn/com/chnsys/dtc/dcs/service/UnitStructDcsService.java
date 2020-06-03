package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.UnitStructDcs;

/**
 * @项目名称：chnsys-dtc
 * @类名称：UnitStructService
 * @version 1.0.0
 * @author yangchao
 * @version 1.0.1
 *          <p>
 *          add getUnitStructByUnitCode
 *          <p>
 */
public interface UnitStructDcsService extends BaseService {
    public UnitStructDcs getUnitStructByUnitCode(Integer unitCode);

    public UnitStructDcs getUnitStructByUnitId(String unitId);

    public UnitStructDcs getUnitStructByInterfaceId(Integer courtCode, String interfaceId);

    public List<UnitStructDcs> getUnitStructsByUnitIds(String[] unitIds);

    public Integer getMaxRecord();

    public int getTotalUnitStruct(UnitStructDcs item);

    public List<UnitStructDcs> getUnitStructList(UnitStructDcs item, int offset, int limit);

    public int insertUnitStruct(UnitStructDcs item);

    public int insertUnitStructs(List<UnitStructDcs> items);

    public int updateUnitStruct(UnitStructDcs item);

    public int deleteUnitStructByUnitId(String unitId);

    public int deleteUnitStructsByUnitIds(String[] unitIds);
    /**
     * 删除全部数据
     * @return
     */
    public void deleteAll();
}
