package cn.com.chnsys.dtc.dcs.vo;
/** 
* @项目名称：dtc-dcs 
* @类名称：ProvinceLivingTrialInfoVo 
* @类描述： 
* @创建人：liyujiie
* @创建时间：2019年7月18日 下午3:36:40 
* @version 1.0.0
*/
public class ProvinceLivingTrialInfoVo {

	private Integer offset;
	
	private Integer limit;
	/**
	 * 开庭状态：2或者5的情况下，有直播
	 */
	private Integer trialState;
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getTrialState() {
		return trialState;
	}
	public void setTrialState(Integer trialState) {
		this.trialState = trialState;
	}
	
	
	
}
