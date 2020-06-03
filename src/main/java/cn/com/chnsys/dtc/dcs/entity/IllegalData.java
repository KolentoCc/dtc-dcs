package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/**
 * @项目名称：chnsys-dtc
 * @类名称： IllegalData
 * @version 1.0.0
 */
public class IllegalData extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 数据id
	 */
	private String dataId;
	/**
	 * 数据json
	 */
	private String dataJson;
	/**
	 * 错误描述
	 */
	private String description;
	/**
	 * 数据类型 1:案件 2:排期 3:人员 4:部门 5:法庭 6:sms 7:编解码器 8:监控设备 9:笔录
	 */
	private Integer dataType;
	/**
	*
	*/
	private Integer id;
	/**
	 * 时间戳
	 */
	private Long timeStamp;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataId() {
		return this.dataId;
	}

	public void setDataJson(String dataJson) {
		this.dataJson = dataJson;
	}

	public String getDataJson() {
		return this.dataJson;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}

	public Integer getDataType() {
		return this.dataType;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Long getTimeStamp() {
		return this.timeStamp;
	}

	@Override
	public String toString() {
		return "[IllegalData = ]" + " dataId =" + dataId + " dataJson =" + dataJson + " description =" + description
		        + " dataType =" + dataType + " id =" + id + " timeStamp =" + timeStamp;
	}
}
