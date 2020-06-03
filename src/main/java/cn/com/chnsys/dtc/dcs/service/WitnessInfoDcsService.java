package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.WitnessInfoDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：WitnessInfoService 
 * @version 1.0.0
 */
public interface WitnessInfoDcsService extends BaseService {
	
	public WitnessInfoDcs getWitnessInfoByEvidenceContentId(String evidenceContentId);
	

	public List<WitnessInfoDcs> getWitnessInfosByEvidenceContentIds(String[] evidenceContentIds);

	public Integer getMaxRecord();

	public int getTotalWitnessInfo(WitnessInfoDcs item);
	
	public List<WitnessInfoDcs> getWitnessInfoList(WitnessInfoDcs item,int offset,int limit);
	
	public int insertWitnessInfo(WitnessInfoDcs item);
	
	public int insertWitnessInfos(List<WitnessInfoDcs> items);
	
	public int updateWitnessInfo(WitnessInfoDcs item);
	
	public int deleteWitnessInfoByEvidenceContentId(String evidenceContentId);
	
	public int delLogicWitnessInfoByEvidenceContentId(String evidenceContentId);
	
	public int deleteWitnessInfosByEvidenceContentIds(String[] evidenceContentIds);
	
	public int delLogicWitnessInfosByEvidenceContentIds(String[] evidenceContentIds);

}