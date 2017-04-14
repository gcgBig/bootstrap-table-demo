package com.bootstrap.dao;

import com.bootstrap.util.Page;
import com.bootstrap.util.PageParam;

/**
 * dao
 * @author gcg
 * 
 * 2017年4月14日 下午4:16:31
 */
public interface StaffDao {

	Page find(PageParam pageParam);
	
}