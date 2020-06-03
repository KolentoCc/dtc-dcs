package cn.com.chnsys.dtc.dcs.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.com.chnsys.cif.base.utils.CollectionUtil;
import cn.com.chnsys.cif.base.utils.DateTimeUtil;
import cn.com.chnsys.cif.core.Constant;
import cn.com.chnsys.cif.core.framework.AbstractService;
import cn.com.chnsys.dtc.dcs.dao.CourtRoomDcsDao;
import cn.com.chnsys.dtc.dcs.entity.CourtRoomDcs;
import cn.com.chnsys.dtc.dcs.service.CourtRoomDcsService;
import cn.com.chnsys.dtc.dcs.vo.CourtNumVo;

/**
 * @项目名称：chnsys-dtc
 * @类名称：CourtRoomServiceImpl
 * @version 1.0.0
 */
public class CourtRoomDcsServiceImpl extends AbstractService implements CourtRoomDcsService {
	/**
	 * courtRoomDao
	 */
	private CourtRoomDcsDao courtRoomDcsDao;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CourtRoomDcs getCourtRoomByCourtRoomId(String courtRoomId) {
		return courtRoomDcsDao.getRecordById(courtRoomId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CourtRoomDcs getCourtRoomByInterfaceId(Integer courtCode, String interfaceId) {
		return courtRoomDcsDao.getRecordByInterfaceId(courtCode, interfaceId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTotalCourtRoom(CourtRoomDcs item) {
		return courtRoomDcsDao.getTotalRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getMaxRecord() {
		return courtRoomDcsDao.getMaxRecord();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomDcs> getCourtRoomList(CourtRoomDcs item, int offset, int limit) {
		return courtRoomDcsDao.getRecords(item, new RowBounds(offset, limit));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRoom(CourtRoomDcs item) {
		item.setCreateTime(DateTimeUtil.getNow());
		return courtRoomDcsDao.insertRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateCourtRoom(CourtRoomDcs item) {
		item.setTimestamp(System.currentTimeMillis());
		return courtRoomDcsDao.updateRecord(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomByCourtRoomId(String courtRoomId) {
		return courtRoomDcsDao.deleteRecordById(courtRoomId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomByCourtRoomId(String courtRoomId) {
		CourtRoomDcs item = new CourtRoomDcs();
		item.setCourtRoomId(courtRoomId);
		item.setDeleteFlag(Constant.BOOLEAN_NO);
		item.setDeleteTime(DateTimeUtil.getNow());
		return updateCourtRoom(item);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<CourtRoomDcs> getCourtRoomsByCourtRoomIds(String[] courtRoomIds) {
		if (CollectionUtil.isEmpty(courtRoomIds)) {
			return Collections.emptyList();
		}
		return courtRoomDcsDao.getRecordsByIds(courtRoomIds);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteCourtRoomsByCourtRoomIds(String[] courtRoomIds) {
		if (CollectionUtil.isEmpty(courtRoomIds)) {
			return 0;
		}
		return courtRoomDcsDao.deleteRecordsByIds(courtRoomIds);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int delLogicCourtRoomsByCourtRoomIds(String[] courtRoomIds) {
		if (CollectionUtil.isEmpty(courtRoomIds)) {
			return 0;
		}

		int count = 0;
		CourtRoomDcs item = new CourtRoomDcs();
		item.setDeleteFlag(Constant.BOOLEAN_NO);
		item.setDeleteTime(DateTimeUtil.getNow());
		for (String courtRoomId : courtRoomIds) {
			item.setCourtRoomId(courtRoomId);
			count += updateCourtRoom(item);
		}
		return count;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int insertCourtRooms(List<CourtRoomDcs> items) {
		if (CollectionUtil.isEmpty(items)) {
			return 0;
		}
		return courtRoomDcsDao.insertRecords(items);
	}

	/**
	 * courtRoomDao setter
	 */
	public void setCourtRoomDcsDao(CourtRoomDcsDao courtRoomDao) {
		this.courtRoomDcsDao = courtRoomDao;
	}

	@Override
	public List<CourtRoomDcs> getCourtRoomEntityLists(String[] courts, Integer signalType, Integer courtRoomType,
			Integer firm, int offset, int limit) {
		return courtRoomDcsDao.getCourtRoomEntityLists(courts, signalType, courtRoomType, firm, new RowBounds(offset,
				limit));
	}

	@Override
	public int getTotalLists(String[] courts, Integer signalType, Integer courtRoomType, Integer firm) {
		return courtRoomDcsDao.getTotalLists(courts, signalType, courtRoomType, firm);
	}

	@Override
	public List<CourtRoomDcs> getCourtRooms(CourtRoomDcs item, int offset, int limit) {
		return courtRoomDcsDao.getCourtRooms(item, new RowBounds(offset, limit));
	}

	@Override
	public List<CourtRoomDcs> getUpdateCourtRoomDcsList(Integer courtCode, Long updateTime, int offset, int limit) {
		return courtRoomDcsDao.getUpdateCourtRoomDcsList(courtCode, updateTime, new RowBounds(offset, limit));
	}

	@Override
	public List<CourtRoomDcs> selectCourtRoom(String unitCode, String courtName,int offset,int limit) {
		return courtRoomDcsDao.selectCourtRoom(unitCode, courtName, new RowBounds(offset, limit));
	}

	@Override
	public int deletCourtRoomByCourtIds(String[] unitIds) {
		return courtRoomDcsDao.deletCourtRoomByCourtIds(unitIds);
	}

	@Override
	public int getCourtRoomData(String unitCode, String courtName) {
		return courtRoomDcsDao.getCourtRoomData(unitCode, courtName);
	}

	@Override
	public List<CourtRoomDcs> getListOrderByState(List<String> unitCodeList,
			int offset, int limit) {
		return courtRoomDcsDao.getListOrderByState(unitCodeList, new RowBounds(offset, limit));
	}

	@Override
	public List<CourtNumVo> getCourtNumGroupByState(List<Integer> unitCodeList,
			int deleteFlag) {
		return courtRoomDcsDao.getCourtNumGroupByState(unitCodeList, deleteFlag);
	}
}