package cn.com.chnsys.dtc.dcs.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.dcs.entity.CaseCauseDcs;
/** 
 * @项目名称：chnsys-dtc 
 * @类名称：CaseCauseDao 
 * @version 1.0.0
 */
public interface CaseCauseDcsDao extends BaseDao<CaseCauseDcs> {

	List<CaseCauseDcs> selectCaseCausesByCaseID(@Param("caseID") String caseID);
}