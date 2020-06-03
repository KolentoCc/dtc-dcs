package cn.com.chnsys.dtc.dcs.service;

import java.util.List;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.JudicialOrganMemberDcs;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：JudicialOrganMemberService 
 * @version 1.0.0
 */
public interface JudicialOrganMemberDcsService extends BaseService {
	
	public JudicialOrganMemberDcs getJudicialOrganMemberByMemberId(String memberId);
	

	public List<JudicialOrganMemberDcs> getJudicialOrganMembersByMemberIds(String[] memberIds);

	public Integer getMaxRecord();

	public int getTotalJudicialOrganMember(JudicialOrganMemberDcs item);
	
	public List<JudicialOrganMemberDcs> getJudicialOrganMemberList(JudicialOrganMemberDcs item,int offset,int limit);
	
	public int insertJudicialOrganMember(JudicialOrganMemberDcs item);
	
	public int insertJudicialOrganMembers(List<JudicialOrganMemberDcs> items);
	
	public int updateJudicialOrganMember(JudicialOrganMemberDcs item);
	
	public int deleteJudicialOrganMemberByMemberId(String memberId);
	
	public int delLogicJudicialOrganMemberByMemberId(String memberId);
	
	public int deleteJudicialOrganMembersByMemberIds(String[] memberIds);
	
	public int delLogicJudicialOrganMembersByMemberIds(String[] memberIds);

    /**
     * @param caseId
     * @return
     */
    public List<JudicialOrganMemberDcs> getJudicialOrganMembersByCaseId(
            String caseId);
    
    public List<JudicialOrganMemberDcs> getJudicialOrganMembersByTrailId(
            String trailId);

}