package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.ParticipateCaseEntityListDcs;
import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：ParticipateCaseEntityListDcsService 
 * @version 1.0.0
 */
public interface ParticipateCaseEntityListDcsService extends BaseService {
	
	public ParticipateCaseEntityListDcs getParticipateCaseEntityListDcsByParticipateCaseEntityListID(String participateCaseEntityListID);
	

	public List<ParticipateCaseEntityListDcs> getParticipateCaseEntityListDcssByParticipateCaseEntityListIDs(String[] participateCaseEntityListIDs);

	public Integer getMaxRecord();

	public int getTotalParticipateCaseEntityListDcs(ParticipateCaseEntityListDcs item);
	
	public List<ParticipateCaseEntityListDcs> getParticipateCaseEntityListDcsList(ParticipateCaseEntityListDcs item,int offset,int limit);
	
	public int insertParticipateCaseEntityListDcs(ParticipateCaseEntityListDcs item);
	
	public int insertParticipateCaseEntityListDcss(List<ParticipateCaseEntityListDcs> items);
	
	public int updateParticipateCaseEntityListDcs(ParticipateCaseEntityListDcs item);
	
	public int deleteParticipateCaseEntityListDcsByParticipateCaseEntityListID(String participateCaseEntityListID);
	
	public int delLogicParticipateCaseEntityListDcsByParticipateCaseEntityListID(String participateCaseEntityListID);
	
	public int deleteParticipateCaseEntityListDcssByParticipateCaseEntityListIDs(String[] participateCaseEntityListIDs);
	
	public int delLogicParticipateCaseEntityListDcssByParticipateCaseEntityListIDs(String[] participateCaseEntityListIDs);
	
	public List<ParticipateCaseEntityListDcs> getParticipateCaseEntityListByCaseID(String caseID);

}