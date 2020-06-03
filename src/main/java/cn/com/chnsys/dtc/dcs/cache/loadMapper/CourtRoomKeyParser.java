package cn.com.chnsys.dtc.dcs.cache.loadMapper;

import java.util.ArrayList;
import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.cache.CacheKeyParser;
import cn.com.chnsys.dtc.dcs.dao.CourtRoomDcsDao;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomDcs;
/**
 * 
 * @author CUICHENG 
 * @Description: 法庭key解析器 
 * @date 2016年8月29日 下午2:03:50
 */
@SuppressWarnings("unchecked")
public class CourtRoomKeyParser implements CacheKeyParser{
	private static String TABLE_NAME = "FY_FAT:";
	@Override
	public List<String> getKey(Object o) {
		List<String> keys = new ArrayList<String>();
		if(o instanceof String){
			keys.add(TABLE_NAME+(String)o);
		}
		if(o instanceof String[]){
			if(((String[])o).length>0){
				for(String item:(String[])o){
					keys.add(TABLE_NAME+item);
				}
			}
		}
		if(o instanceof CourtRoomDcs){
			keys.add(TABLE_NAME+((CourtRoomDcs)o).getCourtRoomId());
		}
		if(o instanceof java.util.List){
			List<Object> list = (List<Object>)o;
			if(!list.isEmpty()){
				for(Object item:list){
					if(item instanceof String){
						keys.add(TABLE_NAME+(String)item);
					}
					if(item instanceof CourtRoomDcs){
						keys.add(TABLE_NAME+((CourtRoomDcs)item).getCourtRoomId());
					}
				}
			}
		}
		return keys;
	}

	/**
	 * 获取法庭dao
	 */
	@Override
	public Class<? extends BaseDao<?>> getDaoType() {
		return CourtRoomDcsDao.class;
	}
}
