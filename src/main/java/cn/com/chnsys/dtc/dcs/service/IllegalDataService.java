package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.IllegalData;
import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：IllegalDataService 
 * @version 1.0.0
 */
public interface IllegalDataService extends BaseService {
	
	public IllegalData getIllegalDataById(String id);
	
		
	public List<IllegalData> getIllegalDatasByIds(String[] ids);
	
		
	public int getTotalIllegalData(IllegalData item);
	
	public List<IllegalData> getIllegalDataList(IllegalData item,int offset,int limit);
	
	public int insertIllegalData(IllegalData item);
	
	public int insertIllegalDatas(List<IllegalData> items);
	
	public int updateIllegalData(IllegalData item);
	
	public int deleteIllegalDataById(String id);
	
	public int deleteIllegalDatasByIds(String[] ids);
}