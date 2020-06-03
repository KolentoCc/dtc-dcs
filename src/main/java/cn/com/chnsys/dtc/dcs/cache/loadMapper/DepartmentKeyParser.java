package cn.com.chnsys.dtc.dcs.cache.loadMapper;

import java.util.ArrayList;
import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.cache.CacheKeyParser;
import cn.com.chnsys.dtc.dcs.dao.DepartmentDcsDao;
import cn.com.chnsys.dtc.dcs.entity.DepartmentDcs;

public class DepartmentKeyParser implements CacheKeyParser{
    private static String TABLE_NAME = "FY_BUM:";
    
    @SuppressWarnings("unchecked")
	@Override
	public List<String> getKey(Object o) {
		List<String> keys = new ArrayList<String>();
		if (o instanceof String) {
		    keys.add(TABLE_NAME + (String) o);
		}
		
		if (o instanceof String[]) {
		    if(((String[]) o).length > 0){
		    	for(String item:(String[])o){
		    		keys.add(TABLE_NAME+item);
		    	}
		    }
		}
		
		if (o instanceof DepartmentDcs) {
		    keys.add(TABLE_NAME + ((DepartmentDcs) o).getDepartmentId());
		}
		
		if (o instanceof java.util.List) {
		    List<Object> list = (List<Object>) o;
		    if (!list.isEmpty()) {
			for (Object o1 : list) {
			    if (o1 instanceof String) {
				keys.add(TABLE_NAME + (String) o1);
			    }
			    if (o1 instanceof DepartmentDcs) {
				keys.add(TABLE_NAME
					+ ((DepartmentDcs) o1).getDepartmentId());
			    }
			}
		    }
		}
		return keys;
	}

    /**
     * 获取部门dao
     */
	@Override
	public Class<? extends BaseDao<?>> getDaoType() {
		return DepartmentDcsDao.class;
	}
}
