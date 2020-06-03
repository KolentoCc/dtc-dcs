package cn.com.chnsys.dtc.dcs.service;

import cn.com.chnsys.cif.core.framework.BaseService;
import cn.com.chnsys.dtc.dcs.entity.ReceiverProtocol;
import java.util.List;

/** 
 * @项目名称：chnsys-dtc 
 * @类名称：ReceiverProtocolService 
 * @version 1.0.0
 */
public interface ReceiverProtocolService extends BaseService {
	
	public ReceiverProtocol getReceiverProtocolByProtocolId(String protocolId);
	

	public List<ReceiverProtocol> getReceiverProtocolsByProtocolIds(String[] protocolIds);


	public int getTotalReceiverProtocol(ReceiverProtocol item);
	
	public List<ReceiverProtocol> getReceiverProtocolList(ReceiverProtocol item,int offset,int limit);
	
	public int insertReceiverProtocol(ReceiverProtocol item);
	
	public int insertReceiverProtocols(List<ReceiverProtocol> items);
	
	public int updateReceiverProtocol(ReceiverProtocol item);
	
	public int deleteReceiverProtocolByProtocolId(String protocolId);
	
	public int delLogicReceiverProtocolByProtocolId(String protocolId);
	
	public int deleteReceiverProtocolsByProtocolIds(String[] protocolIds);
	
	public int delLogicReceiverProtocolsByProtocolIds(String[] protocolIds);

}