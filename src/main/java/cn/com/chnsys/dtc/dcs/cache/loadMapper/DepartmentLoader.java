package cn.com.chnsys.dtc.dcs.cache.loadMapper;

import java.util.List;

import cn.com.chnsys.dtc.cache.CacheException;
import cn.com.chnsys.dtc.cache.CacheLoader;
import cn.com.chnsys.dtc.dcs.entity.DepartmentDcs;
import cn.com.chnsys.dtc.dcs.service.DepartmentDcsService;

/**
 * 
 * @author CUICHENG 
 * @Description: 部门数据加载器 
 * @date 2016年8月29日 上午11:19:42
 */
public class DepartmentLoader implements CacheLoader{
	private DepartmentDcsService departmentDcsService;

	@Override
	public List<DepartmentDcs> load(int offset, int limit) throws CacheException {
		return getDepartmentDcsService().getDepartmentList(getSerarchEntity(), offset, limit);
	}
	DepartmentDcs getSerarchEntity(){
		return new DepartmentDcs();
	}
	public DepartmentDcsService getDepartmentDcsService() {
		return departmentDcsService;
	}
	public void setDepartmentDcsService(DepartmentDcsService departmentDcsService) {
		this.departmentDcsService = departmentDcsService;
	}

}
