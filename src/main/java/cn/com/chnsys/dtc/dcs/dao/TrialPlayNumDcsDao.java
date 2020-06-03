package cn.com.chnsys.dtc.dcs.dao;
import org.apache.ibatis.annotations.Param;

import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.dcs.entity.TrialPlayNumDcs;
/** 
 * @项目名称：chnsys-rcs 
 * @类名称：TrialPlayNumDcsDao 
 * @version 1.0.0
 */
public interface TrialPlayNumDcsDao extends BaseDao<TrialPlayNumDcs> {

	/**
	 * @Title: getTrialPlayNumDcsByTrialId
	 * @param trialId
	 * @param trialStatus
	 * @param deleteflagNo
	 * @param day
	 * @return 
	 * @author gengsonglin
	 * @date 2019年4月29日 下午2:05:26
	 */
	TrialPlayNumDcs getTrialPlayNumDcsByTrialId(@Param("trialId")String trialId,
			@Param("trialStatus")Integer trialStatus, @Param("deleteflag")Integer deleteflagNo, @Param("day")String day);
}