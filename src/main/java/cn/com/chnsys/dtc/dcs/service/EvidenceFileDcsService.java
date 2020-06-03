package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.EvidenceFileDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：EvidenceFileService 
 * @version 1.0.0
 */
public interface EvidenceFileDcsService extends BaseService {
	
	public EvidenceFileDcs getEvidenceFileByEvidenceFileId(String evidenceFileId);
	

	public List<EvidenceFileDcs> getEvidenceFilesByEvidenceFileIds(String[] evidenceFileIds);

	public Integer getMaxRecord();

	public int getTotalEvidenceFile(EvidenceFileDcs item);
	
	public List<EvidenceFileDcs> getEvidenceFileList(EvidenceFileDcs item,int offset,int limit);
	
	public int insertEvidenceFile(EvidenceFileDcs item);
	
	public int insertEvidenceFiles(List<EvidenceFileDcs> items);
	
	public int updateEvidenceFile(EvidenceFileDcs item);
	
	public int deleteEvidenceFileByEvidenceFileId(String evidenceFileId);
	
	public int delLogicEvidenceFileByEvidenceFileId(String evidenceFileId);
	
	public int deleteEvidenceFilesByEvidenceFileIds(String[] evidenceFileIds);
	
	public int delLogicEvidenceFilesByEvidenceFileIds(String[] evidenceFileIds);

}