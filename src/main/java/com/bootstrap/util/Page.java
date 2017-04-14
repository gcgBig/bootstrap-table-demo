package com.bootstrap.util;

import java.io.Serializable;
import java.util.List;

/**
 * 分页对象
 * @author gcg
 * 
 * 2017年4月14日 下午4:15:17
 */
public class Page implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int total; //总记录数
	private List<Object> rows; //当前页结果集
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Object> getRows() {
		return rows;
	}
	public void setRows(List<Object> list) {
		this.rows = list;
	}

}
