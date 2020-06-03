package cn.com.chnsys.dtc.dcs.entity;

import cn.com.chnsys.cif.core.framework.BaseEntity;

/**
 * @项目名称：chnsys-dtc @类名称： UnitStruct
 * @version 1.0.0
 */
public class UnitStructDcs extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	*
	*/
	private Integer isLeaf;
	/**
	*
	*/
	private String shortName;
	/**
	*
	*/
	private Integer isLiveAgent;
	/**
	*
	*/
	private Integer platformPort;
	/**
	*
	*/
	private Integer unitCode;
	/**
	*
	*/
	private String platformIp;
	/**
	*
	*/
	private String parentUnitId;
	/**
	*
	*/
	private Integer hasPlatform;
	/**
	*
	*/
	private String unitName;
	/**
	*
	*/
	private String unitAlias;
	/**
	*
	*/
	private String unitId;
	/**
	*
	*/
	private String rmsIp;
	/**
	*
	*/
	private String describe;

	/**
	 * 分级码
	 */
	private String classificationCode;

	/**
	 * 是否有效 1有效 2无效
	 */
	private Integer valid;

	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}

	public Integer getIsLeaf() {
		return this.isLeaf;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setIsLiveAgent(Integer isLiveAgent) {
		this.isLiveAgent = isLiveAgent;
	}

	public Integer getIsLiveAgent() {
		return this.isLiveAgent;
	}

	public void setPlatformPort(Integer platformPort) {
		this.platformPort = platformPort;
	}

	public Integer getPlatformPort() {
		return this.platformPort;
	}

	public void setUnitCode(Integer unitCode) {
		this.unitCode = unitCode;
	}

	public Integer getUnitCode() {
		return this.unitCode;
	}

	public void setPlatformIp(String platformIp) {
		this.platformIp = platformIp;
	}

	public String getPlatformIp() {
		return this.platformIp;
	}

	public void setParentUnitId(String parentUnitId) {
		this.parentUnitId = parentUnitId;
	}

	public String getParentUnitId() {
		return this.parentUnitId;
	}

	public void setHasPlatform(Integer hasPlatform) {
		this.hasPlatform = hasPlatform;
	}

	public Integer getHasPlatform() {
		return this.hasPlatform;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitAlias(String unitAlias) {
		this.unitAlias = unitAlias;
	}

	public String getUnitAlias() {
		return this.unitAlias;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getUnitId() {
		return this.unitId;
	}

	public void setRmsIp(String rmsIp) {
		this.rmsIp = rmsIp;
	}

	public String getRmsIp() {
		return this.rmsIp;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getDescribe() {
		return this.describe;
	}

	public String getClassificationCode() {
		return classificationCode;
	}

	public void setClassificationCode(String classificationCode) {
		this.classificationCode = classificationCode;
	}

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "[UnitStruct = ]" + " isLeaf =" + isLeaf + " shortName =" + shortName + " isLiveAgent =" + isLiveAgent
				+ " platformPort =" + platformPort + " unitCode =" + unitCode + " platformIp =" + platformIp
				+ " parentUnitId =" + parentUnitId + " hasPlatform =" + hasPlatform + " unitName =" + unitName
				+ " unitAlias =" + unitAlias + " unitId =" + unitId + " rmsIp =" + rmsIp + " describe =" + describe
				+ " classificationCode =" + classificationCode + " valid =" + valid;
	}

}
