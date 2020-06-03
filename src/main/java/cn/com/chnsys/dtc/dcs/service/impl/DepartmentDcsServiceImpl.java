package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.DcsConstants;
import cn.com.chnsys.dtc.dcs.dao.DepartmentDcsDao;
import cn.com.chnsys.dtc.dcs.entity.DepartmentDcs;
import cn.com.chnsys.dtc.dcs.service.DepartmentDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：DepartmentServiceImpl
 * @version 1.0.0
 */
public class DepartmentDcsServiceImpl extends AbstractService implements DepartmentDcsService {
    /**
     * departmentDao
     */	
	private DepartmentDcsDao departmentDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentDcs getDepartmentByDepartmentId(String departmentId){
		return departmentDcsDao.getRecordById(departmentId);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<DepartmentDcs> getDepartmentsByUnitCode(int unitCode) {
		DepartmentDcs param = new DepartmentDcs();
		param.setUnitCode(unitCode);
		List<DepartmentDcs> results = departmentDcsDao.getRecords(param, new RowBounds(DcsConstants.OFFSET, 
				DcsConstants.LIMITE));
		if(results != null && !results.isEmpty()) {
			return results;
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public DepartmentDcs getDepartmentByInterfaceId(Integer courtCode, String interfaceId) {
		return departmentDcsDao.getRecordByInterfaceId(courtCode, interfaceId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalDepartment(DepartmentDcs item) {
		return departmentDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return departmentDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<DepartmentDcs> getDepartmentList(DepartmentDcs item, int offset,int limit) {
		return departmentDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertDepartment(DepartmentDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return departmentDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateDepartment(DepartmentDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return departmentDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteDepartmentByDepartmentId(String departmentId) {
		return departmentDcsDao.deleteRecordById(departmentId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicDepartmentByDepartmentId(String departmentId) {
		DepartmentDcs item = new DepartmentDcs();
		item.setDepartmentId(departmentId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateDepartment(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<DepartmentDcs> getDepartmentsByDepartmentIds(String[] departmentIds){
        if(CollectionUtil.isEmpty(departmentIds)){
            return Collections.emptyList();
        }
        return departmentDcsDao.getRecordsByIds(departmentIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteDepartmentsByDepartmentIds(String[] departmentIds){
		if(CollectionUtil.isEmpty(departmentIds)){
            return 0;
        }
		return departmentDcsDao.deleteRecordsByIds(departmentIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicDepartmentsByDepartmentIds(String[] departmentIds){
		if(CollectionUtil.isEmpty(departmentIds)){
            return 0;
        }

        int count = 0;
        DepartmentDcs item = new DepartmentDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String departmentId : departmentIds) {
            item.setDepartmentId(departmentId);
            count += updateDepartment(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertDepartments(List<DepartmentDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return departmentDcsDao.insertRecords(items);
	}
	
	/**
	 * departmentDao setter
	 */
	public void setDepartmentDcsDao(DepartmentDcsDao departmentDcsDao){
		this.departmentDcsDao = departmentDcsDao;
	}

    /* (non-Javadoc)
     * @see cn.com.chnsys.dtc.dcs.service.DepartmentService#getDepartmentsByUnitCode(int)
     */
    @Override
    public List<DepartmentDcs> getDepartmentsByUnitCode(Integer unitCode) {
        List<DepartmentDcs> departmentList = null;
        if(unitCode != null && unitCode > 0) {
            DepartmentDcs dept = new DepartmentDcs();
            dept.setUnitCode(unitCode);
            departmentList = departmentDcsDao.getRecords(dept,
                  new RowBounds(0, DEFAULT_PAGE_COUNT));
        }
        return departmentList;
    }
	@Override
	public List<DepartmentDcs> getRootDepartments(DepartmentDcs departmentDcs) {
		// TODO Auto-generated method stub
		return departmentDcsDao.getRootDepartments(departmentDcs);
	}
	@Override
	public List<DepartmentDcs> getChildrenDepartments(String parentId) {
		// TODO Auto-generated method stub
		return departmentDcsDao.getChildrenDepartments(parentId);
	}
}