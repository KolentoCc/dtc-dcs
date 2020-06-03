package cn.com.chnsys.dtc.dcs.dao;
import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.dcs.entity.DepartmentDcs;
/** 
 * @项目名称：chnsys-dtc 
 * @类名称：DepartmentDao 
 * @version 1.0.0
 */
public interface DepartmentDcsDao extends BaseDao<DepartmentDcs> {
    /**
     * 根据法院代码和接口标识，获取记录信息
     *
     * @param <T> 返回类型泛型
     * @param courtCode 法院代码
     * @param interfaceId 接口标识
     * @return 查询的结果
     *
     */
    public DepartmentDcs getRecordByInterfaceId(Integer courtCode, String interfaceId);
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