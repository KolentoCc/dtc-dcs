package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.TrialTermDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：TrialTermService 
 * @version 1.0.0
 */
public interface TrialTermDcsService extends BaseService {
	
	public TrialTermDcs getTrialTermByCaseId(String caseId);
	

	public List<TrialTermDcs> getTrialTermsByCaseIds(String[] caseIds);

	public Integer getMaxRecord();

	public int getTotalTrialTerm(TrialTermDcs item);
	
	public List<TrialTermDcs> getTrialTermList(TrialTermDcs item,int offset,int limit);
	
	public int insertTrialTerm(TrialTermDcs item);
	
	public int insertTrialTerms(List<TrialTermDcs> items);
	
	public int updateTrialTerm(TrialTermDcs item);
	
	public int deleteTrialTermByCaseId(String caseId);
	
	public int delLogicTrialTermByCaseId(String caseId);
	
	public int deleteTrialTermsByCaseIds(String[] caseIds);
	
	public int delLogicTrialTermsByCaseIds(String[] caseIds);

}