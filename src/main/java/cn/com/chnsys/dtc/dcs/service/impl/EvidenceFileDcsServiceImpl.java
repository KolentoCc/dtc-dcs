package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.EvidenceFileDcsDao;
import cn.com.chnsys.dtc.dcs.entity.EvidenceFileDcs;
import cn.com.chnsys.dtc.dcs.service.EvidenceFileDcsService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：EvidenceFileServiceImpl
 * @version 1.0.0
 */
public class EvidenceFileDcsServiceImpl extends AbstractService implements EvidenceFileDcsService {
    /**
     * evidenceFileDao
     */	
	private EvidenceFileDcsDao evidenceFileDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EvidenceFileDcs getEvidenceFileByEvidenceFileId(String evidenceFileId){
		return evidenceFileDcsDao.getRecordById(evidenceFileId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalEvidenceFile(EvidenceFileDcs item) {
		return evidenceFileDcsDao.getTotalRecord(item);
	}
	
		/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return evidenceFileDcsDao.getMaxRecord();
	}
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<EvidenceFileDcs> getEvidenceFileList(EvidenceFileDcs item, int offset,int limit) {
		return evidenceFileDcsDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertEvidenceFile(EvidenceFileDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return evidenceFileDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateEvidenceFile(EvidenceFileDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return evidenceFileDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteEvidenceFileByEvidenceFileId(String evidenceFileId) {
		return evidenceFileDcsDao.deleteRecordById(evidenceFileId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicEvidenceFileByEvidenceFileId(String evidenceFileId) {
		EvidenceFileDcs item = new EvidenceFileDcs();
		item.setEvidenceFileId(evidenceFileId);
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateEvidenceFile(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<EvidenceFileDcs> getEvidenceFilesByEvidenceFileIds(String[] evidenceFileIds){
        if(CollectionUtil.isEmpty(evidenceFileIds)){
            return Collections.emptyList();
        }
        return evidenceFileDcsDao.getRecordsByIds(evidenceFileIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteEvidenceFilesByEvidenceFileIds(String[] evidenceFileIds){
		if(CollectionUtil.isEmpty(evidenceFileIds)){
            return 0;
        }
		return evidenceFileDcsDao.deleteRecordsByIds(evidenceFileIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicEvidenceFilesByEvidenceFileIds(String[] evidenceFileIds){
		if(CollectionUtil.isEmpty(evidenceFileIds)){
            return 0;
        }

        int count = 0;
        EvidenceFileDcs item = new EvidenceFileDcs();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String evidenceFileId : evidenceFileIds) {
            item.setEvidenceFileId(evidenceFileId);
            count += updateEvidenceFile(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertEvidenceFiles(List<EvidenceFileDcs> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return evidenceFileDcsDao.insertRecords(items);
	}
	
	/**
	 * evidenceFileDao setter
	 */
	public void setEvidenceFileDcsDao(EvidenceFileDcsDao evidenceFileDcsDao){
		this.evidenceFileDcsDao = evidenceFileDcsDao;
	}
}