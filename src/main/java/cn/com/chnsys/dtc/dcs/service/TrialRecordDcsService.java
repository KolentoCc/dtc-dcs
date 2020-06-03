package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.TrialRecordDcs;
import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：TrialRecordDcsService 
 * @version 1.0.0
 */
public interface TrialRecordDcsService extends BaseService {
	
	public TrialRecordDcs getTrialRecordDcsByNoteId(String noteId);
	
		
	public List<TrialRecordDcs> getTrialRecordDcssByNoteIds(String[] noteIds);
	
		
	public int getTotalTrialRecordDcs(TrialRecordDcs item);
	
	public List<TrialRecordDcs> getTrialRecordDcsList(TrialRecordDcs item,int offset,int limit);
	
	public int insertTrialRecordDcs(TrialRecordDcs item);
	
	public int insertTrialRecordDcss(List<TrialRecordDcs> items);
	
	public int updateTrialRecordDcs(TrialRecordDcs item);
	
	public int deleteTrialRecordDcsByNoteId(String noteId);
	
	public int deleteTrialRecordDcssByNoteIds(String[] noteIds);
}