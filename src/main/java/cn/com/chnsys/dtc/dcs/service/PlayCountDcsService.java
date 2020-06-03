package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.PlayCountDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：PlayCountService 
 * @version 1.0.0
 */
public interface PlayCountDcsService extends BaseService {
	
	public PlayCountDcs getPlayCountByOpenCourtInfoId(String openCourtInfoId);
	

	public List<PlayCountDcs> getPlayCountsByOpenCourtInfoIds(String[] openCourtInfoIds);

	public Integer getMaxRecord();

	public int getTotalPlayCount(PlayCountDcs item);
	
	public List<PlayCountDcs> getPlayCountList(PlayCountDcs item,int offset,int limit);
	
	public int insertPlayCount(PlayCountDcs item);
	
	public int insertPlayCounts(List<PlayCountDcs> items);
	
	public int updatePlayCount(PlayCountDcs item);
	
	public int deletePlayCountByOpenCourtInfoId(String openCourtInfoId);
	
	public int delLogicPlayCountByOpenCourtInfoId(String openCourtInfoId);
	
	public int deletePlayCountsByOpenCourtInfoIds(String[] openCourtInfoIds);
	
	public int delLogicPlayCountsByOpenCourtInfoIds(String[] openCourtInfoIds);

}