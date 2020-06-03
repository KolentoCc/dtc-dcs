package cn.com.chnsys.dtc.dcs.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.chnsys.cif.core.framework.BaseDao;
import cn.com.chnsys.dtc.dcs.entity.ParticipateCaseEntityListDcs;
/** 
 * @项目名称：chnsys-dtc 
 * @类名称：ParticipateCaseEntityListDcsDao 
 * @version 1.0.0
 */
public interface ParticipateCaseEntityListDcsDao extends BaseDao<ParticipateCaseEntityListDcs> {

	List<ParticipateCaseEntityListDcs> selectParticipateCaseEntityListByCaseID(@Param("caseID") String caseID);
}