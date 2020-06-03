package cn.com.chnsys.dtc.dcs.cache.loadMapper;

import java.util.List;

import cn.com.chnsys.dtc.cache.CacheException;
import cn.com.chnsys.dtc.cache.CacheLoader;
import cn.com.chnsys.dtc.dcs.entity.CourtUserDcs;
import cn.com.chnsys.dtc.dcs.service.CourtUserDcsService;

/**
 * @author CUICHENG 
 * @Description: 法院用户加载器 
 * @date 2016年8月29日 上午11:05:08
 */
public class CourtUserLoader implements CacheLoader{
	private CourtUserDcsService courtUserDcsService;
	/**
	 * 加载法院人员列表
	 */
	@Override
	public List<CourtUserDcs> load(int offset, int limit) throws CacheException {
		return getCourtUserDcsService().getCourtUserList(getSerarchEntity(), offset, limit);
	}
	
	CourtUserDcs getSerarchEntity(){
		return new CourtUserDcs();
	}

	public CourtUserDcsService getCourtUserDcsService() {
		return courtUserDcsService;
	}

	public void setCourtUserDcsService(CourtUserDcsService courtUserDcsService) {
		this.courtUserDcsService = courtUserDcsService;
	}

}
