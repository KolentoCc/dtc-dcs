package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.CaseCauseDcs;

import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CaseCauseService 
 * @version 1.0.0
 */
public interface CaseCauseDcsService extends BaseService {
	
	public CaseCauseDcs getCaseCauseByCaseCauseId(String caseCauseId);
	

	public List<CaseCauseDcs> getCaseCausesByCaseCauseIds(String[] caseCauseIds);


	public int getTotalCaseCause(CaseCauseDcs item);
	
	public List<CaseCauseDcs> getCaseCauseList(CaseCauseDcs item,int offset,int limit);
	
	public int insertCaseCause(CaseCauseDcs item);
	
	public int insertCaseCauses(List<CaseCauseDcs> items);
	
	public int updateCaseCause(CaseCauseDcs item);
	
	public int deleteCaseCauseByCaseCauseId(String caseCauseId);
	
	public int delLogicCaseCauseByCaseCauseId(String caseCauseId);
	
	public int deleteCaseCausesByCaseCauseIds(String[] caseCauseIds);
	
	public int delLogicCaseCausesByCaseCauseIds(String[] caseCauseIds);
	
	public List<CaseCauseDcs> getCaseCausesByCaseID(String caseID);

}