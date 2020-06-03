package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.EvidenceInfoDcs;
import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：EvidenceInfoDcsService 
 * @version 1.0.0
 */
public interface EvidenceInfoDcsService extends BaseService {
	
	public EvidenceInfoDcs getEvidenceInfoDcsByEvidenceId(String evidenceId);
	

	public List<EvidenceInfoDcs> getEvidenceInfoDcssByEvidenceIds(String[] evidenceIds);

	public Integer getMaxRecord();

	public int getTotalEvidenceInfoDcs(EvidenceInfoDcs item);
	
	public List<EvidenceInfoDcs> getEvidenceInfoDcsList(EvidenceInfoDcs item,int offset,int limit);
	
	public int insertEvidenceInfoDcs(EvidenceInfoDcs item);
	
	public int insertEvidenceInfoDcss(List<EvidenceInfoDcs> items);
	
	public int updateEvidenceInfoDcs(EvidenceInfoDcs item);
	
	public int deleteEvidenceInfoDcsByEvidenceId(String evidenceId);
	
	public int delLogicEvidenceInfoDcsByEvidenceId(String evidenceId);
	
	public int deleteEvidenceInfoDcssByEvidenceIds(String[] evidenceIds);
	
	public int delLogicEvidenceInfoDcssByEvidenceIds(String[] evidenceIds);

}