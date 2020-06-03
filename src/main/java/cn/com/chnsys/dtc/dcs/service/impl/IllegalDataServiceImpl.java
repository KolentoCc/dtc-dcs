package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;
import org.apache.ibatis.session.RowBounds;
import cn.com.chnsys.dtc.dcs.dao.IllegalDataDao;
import cn.com.chnsys.dtc.dcs.service.IllegalDataService;
import cn.com.chnsys.dtc.dcs.entity.IllegalData;
import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.framework.AbstractService;

/**
 * @项目名称：chnsys-dtc
 * @类名称：IllegalDataServiceImpl
 * @version 1.0.0
 */
public class IllegalDataServiceImpl extends AbstractService implements IllegalDataService {
    /**
     * illegalDataDao
     */	
	private IllegalDataDao illegalDataDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IllegalData getIllegalDataById(String id){
		return illegalDataDao.getRecordById(id);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalIllegalData(IllegalData item) {
		return illegalDataDao.getTotalRecord(item);
	}
	
	
    /**
	 * {@inheritDoc}
	 */
	@Override
	public List<IllegalData> getIllegalDataList(IllegalData item, int offset,int limit) {
		return illegalDataDao.getRecords(item,new RowBounds(offset,limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertIllegalData(IllegalData item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return illegalDataDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateIllegalData(IllegalData item) {
		item.setTimestamp(System.currentTimeMillis());
		return illegalDataDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteIllegalDataById(String id) {
		return illegalDataDao.deleteRecordById(id);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<IllegalData> getIllegalDatasByIds(String[] ids){
        if(CollectionUtil.isEmpty(ids)){
            return Collections.emptyList();
        }
        return illegalDataDao.getRecordsByIds(ids);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteIllegalDatasByIds(String[] ids){
		if(CollectionUtil.isEmpty(ids)){
            return 0;
        }
		return illegalDataDao.deleteRecordsByIds(ids);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertIllegalDatas(List<IllegalData> items){
	    if(CollectionUtil.isEmpty(items)){
            return 0;
         }
		return illegalDataDao.insertRecords(items);
	}
	
	/**
	 * illegalDataDao setter
	 */
	public void setIllegalDataDao(IllegalDataDao illegalDataDao){
		this.illegalDataDao = illegalDataDao;
	}
}