package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.UnitStructDcsDao;
import cn.com.chnsys.dtc.dcs.entity.UnitStructDcs;
import cn.com.chnsys.dtc.dcs.service.UnitStructDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：UnitStructServiceImpl
 * @version 1.0.0
 */
public class UnitStructDcsServiceImpl extends AbstractService implements UnitStructDcsService {
    /**
     * unitStructDao
     */
    private UnitStructDcsDao unitStructDcsDao;

    /**
     * {@inheritDoc}
     */
    @Override
    public UnitStructDcs getUnitStructByUnitId(String unitId) {
        return unitStructDcsDao.getRecordById(unitId);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnitStructDcs getUnitStructByInterfaceId(Integer courtCode, String interfaceId) {
        return unitStructDcsDao.getRecordByInterfaceId(courtCode, interfaceId);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getTotalUnitStruct(UnitStructDcs item) {
        return unitStructDcsDao.getTotalRecord(item);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getMaxRecord() {
        return unitStructDcsDao.getMaxRecord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UnitStructDcs> getUnitStructList(UnitStructDcs item, int offset, int limit) {
        return unitStructDcsDao.getRecords(item, new RowBounds(offset, limit));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int insertUnitStruct(UnitStructDcs item) {
        item.setCreateTime(DateTimeUtil.getNow());
        return unitStructDcsDao.insertRecord(item);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int updateUnitStruct(UnitStructDcs item) {
        item.setTimestamp(System.currentTimeMillis());
        return unitStructDcsDao.updateRecord(item);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int deleteUnitStructByUnitId(String unitId) {
        return unitStructDcsDao.deleteRecordById(unitId);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UnitStructDcs> getUnitStructsByUnitIds(String[] unitIds) {
        if (CollectionUtil.isEmpty(unitIds)) {
            return Collections.emptyList();
        }
        return unitStructDcsDao.getRecordsByIds(unitIds);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int deleteUnitStructsByUnitIds(String[] unitIds) {
        if (CollectionUtil.isEmpty(unitIds)) {
            return 0;
        }
        return unitStructDcsDao.deleteRecordsByIds(unitIds);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int insertUnitStructs(List<UnitStructDcs> items) {
        if (CollectionUtil.isEmpty(items)) {
            return 0;
        }
        return unitStructDcsDao.insertRecords(items);
    }

    /**
     * unitStructDao setter
     */
    public void setUnitStructDcsDao(UnitStructDcsDao unitStructDcsDao) {
        this.unitStructDcsDao = unitStructDcsDao;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * cn.com.chnsys.dtc.dcs.service.UnitStructService#getUnitStructByUnitCode
     * (int)
     */
    @Override
    public UnitStructDcs getUnitStructByUnitCode(Integer unitCode) {
        UnitStructDcs unitStruct = null;
        if (unitCode != null && unitCode > 0) {
            UnitStructDcs searchParam = new UnitStructDcs();
            searchParam.setUnitCode(unitCode);
            List<UnitStructDcs> unitStructList = unitStructDcsDao.getRecords(searchParam, new RowBounds(
                    0, 1));
            if (unitStructList != null && !unitStructList.isEmpty()) {
                unitStruct = unitStructList.get(0);
            }
        }

        return unitStruct;

    }

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
	    unitStructDcsDao.deleteAll();
	}
}
