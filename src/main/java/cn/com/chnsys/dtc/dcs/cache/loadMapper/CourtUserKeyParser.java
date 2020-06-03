package cn.com.chnsys.dtc.dcs.cache.loadMapper;

import java.util.ArrayList;
import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.cache.CacheKeyParser;
import cn.com.chnsys.dtc.dcs.dao.CourtUserDcsDao;
import cn.com.chnsys.dtc.dcs.entity.CourtUserDcs;
/**
 * @author CUICHENG 
 * @Description: 法庭用户key解析器
 * @date 2016年8月29日 上午10:47:35
 */
public class CourtUserKeyParser implements CacheKeyParser{
	private static String TABLE_NAME = "FY_FAYRY:";
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getKey(Object o) {
		List<String> keys = new ArrayList<String>();
		if(o instanceof String){
			keys.add(TABLE_NAME + (String)o);
		}
		if(o instanceof String[]){
			if(((String[])o).length>0){
				for(String item:(String[])o){
					keys.add(TABLE_NAME+item);
				}
			}
		}
		if(o instanceof CourtUserDcs){
			keys.add(TABLE_NAME+((CourtUserDcs)o).getUserId());
		}
		if(o instanceof java.util.List){
			List<Object> list = (List<Object>)o;
			if(!list.isEmpty()){
				for(Object item:list){
					if(item instanceof String){
						keys.add(TABLE_NAME+(String)item);
					}
					if(item instanceof CourtUserDcs){
						keys.add(TABLE_NAME+((CourtUserDcs)item).getUserId());
					}
				}
			}
		}
		return keys;
	}
	
	/**
	 * 获取法院人员dao
	 */
	@Override
	public Class<? extends BaseDao<?>> getDaoType() {
		return CourtUserDcsDao.class;
	}
	
}