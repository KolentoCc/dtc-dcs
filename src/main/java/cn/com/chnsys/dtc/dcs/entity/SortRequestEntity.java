package cn.com.chnsys.dtc.dcs.entity;

public class SortRequestEntity {

	/**
	 * 排序字段
	 */
	String sortField;
	
	/**
	 * 排序方式
	 */
	String sortOrder;

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Override
	public String toString() {
		return "SortRequestEntity [sortField=" + sortField + ", sortOrder=" + sortOrder + "]";
	}
	
}
