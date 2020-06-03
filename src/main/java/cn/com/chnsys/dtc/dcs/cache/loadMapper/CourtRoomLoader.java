package cn.com.chnsys.dtc.dcs.cache.loadMapper;

import java.util.List;

import cn.com.chnsys.dtc.cache.CacheException;
import cn.com.chnsys.dtc.cache.CacheLoader;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomDcsService;
/**
 * @author CUICHENG 
 * @Description: 法庭数据加载器 
 * @date 2016年8月29日 下午2:04:28
 */
public class CourtRoomLoader implements CacheLoader{
	private CourtRoomDcsService courtRoomDcsService;
	
	@Override
	public List<CourtRoomDcs> load(int offset, int limit) throws CacheException{
		List<CourtRoomDcs> list = getCourtRoomDcsService().getCourtRoomList(getEntitySearch(), offset, limit);
		return list;
	}

	private CourtRoomDcs getEntitySearch(){
		return new CourtRoomDcs();
	}

	public CourtRoomDcsService getCourtRoomDcsService() {
		return courtRoomDcsService;
	}

	public void setCourtRoomDcsService(CourtRoomDcsService courtRoomDcsService) {
		this.courtRoomDcsService = courtRoomDcsService;
	}

}
