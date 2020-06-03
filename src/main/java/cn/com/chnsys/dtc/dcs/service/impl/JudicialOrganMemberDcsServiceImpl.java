package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.JudicialOrganMemberDcsDao;
import cn.com.chnsys.dtc.dcs.entity.JudicialOrganMemberDcs;
import cn.com.chnsys.dtc.dcs.service.JudicialOrganMemberDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：JudicialOrganMemberServiceImpl
 * @version 1.0.0
 */
public class JudicialOrganMemberDcsServiceImpl extends AbstractService implements JudicialOrganMemberDcsService {
    /**
     * judicialOrganMemberDao
     */	
	private JudicialOrganMemberDcsDao judicialOrganMemberDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<JudicialOrganMemberDcs> getJudicialOrganMembersByCaseId(
	        String caseId) {
	    JudicialOrganMemberDcs item = new JudicialOrganMemberDcs();
	    item.setCaseId(caseId);
	    return getJudicialOrganMemberList(item, 0, DEFAULT_PAGE_COUNT);
	}
	
	@Override
	public List<JudicialOrganMemberDcs> getJudicialOrganMembersByTrailId(String trailId) {
		 JudicialOrganMemberDcs item = new JudicialOrganMemberDcs();
		    item.setTrailId(trailId);
		    return getJudicialOrganMemberList(item, 0, DEFAULT_PAGE_COUNT);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public JudicialOrganMemberDcs getJudicialOrganMemberByMemberId(String memberId){
		return judicialOrganMemberDcsDao.getRecordById(memberId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalJudicialOrganMember(JudicialOrganMemberDcs item) {
		return judicialOrganMemberDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return judicialOrganMemberDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<JudicialOrganMemberDcs> getJudicialOrganMemberList(JudicialOrganMemberDcs item, int offset,int limit) {
		return judicialOrganMemberDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertJudicialOrganMember(JudicialOrganMemberDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return judicialOrganMemberDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateJudicialOrganMember(JudicialOrganMemberDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return judicialOrganMemberDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteJudicialOrganMemberByMemberId(String memberId) {
		return judicialOrganMemberDcsDao.deleteRecordById(memberId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicJudicialOrganMemberByMemberId(String memberId) {
		JudicialOrganMemberDcs item = new JudicialOrganMemberDcs();
		item.setMemberId(memberId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateJudicialOrganMember(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<JudicialOrganMemberDcs> getJudicialOrganMembersByMemberIds(String[] memberIds){
        if(CollectionUtil.isEmpty(memberIds)){
            return Collections.emptyList();
        }
        return judicialOrganMemberDcsDao.getRecordsByIds(memberIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteJudicialOrganMembersByMemberIds(String[] memberIds){
		if(CollectionUtil.isEmpty(memberIds)){
            return 0;
        }
		return judicialOrganMemberDcsDao.deleteRecordsByIds(memberIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicJudicialOrganMembersByMemberIds(String[] memberIds){
		if(CollectionUtil.isEmpty(memberIds)){
            return 0;
        }

        int count = 0;
        JudicialOrganMemberDcs item = new JudicialOrganMemberDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String memberId : memberIds) {
            item.setMemberId(memberId);
            count += updateJudicialOrganMember(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertJudicialOrganMembers(List<JudicialOrganMemberDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return judicialOrganMemberDcsDao.insertRecords(items);
	}
	
	/**
	 * judicialOrganMemberDao setter
	 */
	public void setJudicialOrganMemberDcsDao(JudicialOrganMemberDcsDao judicialOrganMemberDcsDao){
		this.judicialOrganMemberDcsDao = judicialOrganMemberDcsDao;
	}
}