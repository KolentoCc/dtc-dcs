package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import cn.com.chnsys.dtc.dcs.dao.ReceiverProtocolDao;
import cn.com.chnsys.dtc.dcs.service.ReceiverProtocolService;
import cn.com.chnsys.dtc.dcs.entity.ReceiverProtocol;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：ReceiverProtocolServiceImpl
 * @version 1.0.0
 */
public class ReceiverProtocolServiceImpl extends AbstractService implements ReceiverProtocolService {
    /**
     * receiverProtocolDao
     */	
	private ReceiverProtocolDao receiverProtocolDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReceiverProtocol getReceiverProtocolByProtocolId(String protocolId){
		return receiverProtocolDao.getRecordById(protocolId);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalReceiverProtocol(ReceiverProtocol item) {
		return receiverProtocolDao.getTotalRecord(item);
	}
	
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<ReceiverProtocol> getReceiverProtocolList(ReceiverProtocol item, int offset,int limit) {
		return receiverProtocolDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertReceiverProtocol(ReceiverProtocol item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return receiverProtocolDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateReceiverProtocol(ReceiverProtocol item) {
		item.setTimestamp(System.currentTimeMillis());
		return receiverProtocolDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteReceiverProtocolByProtocolId(String protocolId) {
		return receiverProtocolDao.deleteRecordById(protocolId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicReceiverProtocolByProtocolId(String protocolId) {
		ReceiverProtocol item = new ReceiverProtocol();
		item.setProtocolId(Long.parseLong(protocolId));
	    item.setDeleteFlag(Constant.BOOLEAN_NO);
	    item.setDeleteTime(DateTimeUtil.getNow());
	    return updateReceiverProtocol(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ReceiverProtocol> getReceiverProtocolsByProtocolIds(String[] protocolIds){
        if(CollectionUtil.isEmpty(protocolIds)){
            return Collections.emptyList();
        }
        return receiverProtocolDao.getRecordsByIds(protocolIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteReceiverProtocolsByProtocolIds(String[] protocolIds){
		if(CollectionUtil.isEmpty(protocolIds)){
            return 0;
        }
		return receiverProtocolDao.deleteRecordsByIds(protocolIds);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicReceiverProtocolsByProtocolIds(String[] protocolIds){
		if(CollectionUtil.isEmpty(protocolIds)){
            return 0;
        }

        int count = 0;
        ReceiverProtocol item = new ReceiverProtocol();
        item.setDeleteFlag(Constant.BOOLEAN_NO);
        item.setDeleteTime(DateTimeUtil.getNow());
        for(String protocolId : protocolIds) {
            item.setProtocolId(Long.parseLong(protocolId));
            count += updateReceiverProtocol(item);
        }
        return count;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertReceiverProtocols(List<ReceiverProtocol> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return receiverProtocolDao.insertRecords(items);
	}
	
	/**
	 * receiverProtocolDao setter
	 */
	public void setReceiverProtocolDao(ReceiverProtocolDao receiverProtocolDao){
		this.receiverProtocolDao = receiverProtocolDao;
	}
}