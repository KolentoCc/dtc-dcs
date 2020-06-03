package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.LegalPersonOrganInfoDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：LegalPersonOrganInfoService 
 * @version 1.0.0
 */
public interface LegalPersonOrganInfoDcsService extends BaseService {
	
	public LegalPersonOrganInfoDcs getLegalPersonOrganInfoByEntityId(String entityId);
	

	public List<LegalPersonOrganInfoDcs> getLegalPersonOrganInfosByEntityIds(String[] entityIds);

	public Integer getMaxRecord();

	public int getTotalLegalPersonOrganInfo(LegalPersonOrganInfoDcs item);
	
	public List<LegalPersonOrganInfoDcs> getLegalPersonOrganInfoList(LegalPersonOrganInfoDcs item,int offset,int limit);
	
	public int insertLegalPersonOrganInfo(LegalPersonOrganInfoDcs item);
	
	public int insertLegalPersonOrganInfos(List<LegalPersonOrganInfoDcs> items);
	
	public int updateLegalPersonOrganInfo(LegalPersonOrganInfoDcs item);
	
	public int deleteLegalPersonOrganInfoByEntityId(String entityId);
	
	public int delLogicLegalPersonOrganInfoByEntityId(String entityId);
	
	public int deleteLegalPersonOrganInfosByEntityIds(String[] entityIds);
	
	public int delLogicLegalPersonOrganInfosByEntityIds(String[] entityIds);

}