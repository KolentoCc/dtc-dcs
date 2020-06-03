package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.NaturalPersonInfoDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：NaturalPersonInfoService 
 * @version 1.0.0
 */
public interface NaturalPersonInfoDcsService extends BaseService {
	
	public NaturalPersonInfoDcs getNaturalPersonInfoByEntityId(String entityId);
	

	public List<NaturalPersonInfoDcs> getNaturalPersonInfosByEntityIds(String[] entityIds);

	public Integer getMaxRecord();

	public int getTotalNaturalPersonInfo(NaturalPersonInfoDcs item);
	
	public List<NaturalPersonInfoDcs> getNaturalPersonInfoList(NaturalPersonInfoDcs item,int offset,int limit);
	
	public int insertNaturalPersonInfo(NaturalPersonInfoDcs item);
	
	public int insertNaturalPersonInfos(List<NaturalPersonInfoDcs> items);
	
	public int updateNaturalPersonInfo(NaturalPersonInfoDcs item);
	
	public int deleteNaturalPersonInfoByEntityId(String entityId);
	
	public int delLogicNaturalPersonInfoByEntityId(String entityId);
	
	public int deleteNaturalPersonInfosByEntityIds(String[] entityIds);
	
	public int delLogicNaturalPersonInfosByEntityIds(String[] entityIds);

}