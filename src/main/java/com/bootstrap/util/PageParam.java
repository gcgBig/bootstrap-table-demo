package com.bootstrap.util;

import java.io.Serializable;

/**
 * 分页参数
 * @author gcg
 * 
 * 2017年4月14日 下午4:15:04
 */
public class PageParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1734516368014351348L;
	public static final String FIELD_SORT_NAME = "sort";
	public static final String FIELD_ORDERBY_NAME="orderBy";
	
	// 指定分页参数
	private int pageNo; // 当前页码
	private int pageSize; // 页大小
	private int offset; //分页记录偏移量
	private String sort;//排序字段
	private String orderBy;//升序、降序
	
	public PageParam() {
		super();
	}

	public PageParam(int offset, int pageSize,String sort ,String orderBy) {
		super();
		this.pageSize = pageSize;
		this.sort = sort;
		this.orderBy = orderBy;
		this.offset = offset;
		this.pageNo = offset / pageSize + 1;
	}

	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
}
