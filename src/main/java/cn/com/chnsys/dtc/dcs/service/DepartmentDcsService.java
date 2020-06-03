package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.DepartmentDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：DepartmentService 
 * @version 1.0.0
 * @author yangchao
 * @version 1.0.1 
 *          <p>
 *          add getDepartmentsByUnitCode
 *          <p>
 */
public interface DepartmentDcsService extends BaseService {
	public List<DepartmentDcs> getDepartmentsByUnitCode(Integer unitCode);
	public DepartmentDcs getDepartmentByDepartmentId(String departmentId);
	
	public DepartmentDcs getDepartmentByInterfaceId(Integer courtCode, String interfaceId);

	public List<DepartmentDcs> getDepartmentsByUnitCode(int unitCode);
	
	public List<DepartmentDcs> getDepartmentsByDepartmentIds(String[] departmentIds);

	public Integer getMaxRecord();

	public int getTotalDepartment(DepartmentDcs item);
	
	public List<DepartmentDcs> getDepartmentList(DepartmentDcs item,int offset,int limit);
	
	public int insertDepartment(DepartmentDcs item);
	
	public int insertDepartments(List<DepartmentDcs> items);
	
	public int updateDepartment(DepartmentDcs item);
	
	public int deleteDepartmentByDepartmentId(String departmentId);
	
	public int delLogicDepartmentByDepartmentId(String departmentId);
	
	public int deleteDepartmentsByDepartmentIds(String[] departmentIds);
	
	public int delLogicDepartmentsByDepartmentIds(String[] departmentIds);
	/**
     * 获取所有根部门信息集合
     * @return
     */
	public List<DepartmentDcs> getRootDepartments(DepartmentDcs departmentDcs);
    /**
     * 根据父节点获取所有子部门集合
     * @param parentId
     * @return
     */
    public  List<DepartmentDcs> getChildrenDepartments(String parentId);

}