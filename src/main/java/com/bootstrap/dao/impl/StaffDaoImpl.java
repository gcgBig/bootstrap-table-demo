package com.bootstrap.dao.impl;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import com.bootstrap.dao.StaffDao;
import com.bootstrap.entity.Staff;
import com.bootstrap.util.Page;
import com.bootstrap.util.PageParam;

/**
 * daoImpl
 * @author gcg
 * 
 * 2017年4月14日 下午4:16:03
 */
@Repository("staffDao")
public class StaffDaoImpl extends BaseDaoImpl<Staff> implements StaffDao {

	@Override
	public Page find(PageParam pageParam) {
		Page page = new Page();
		page.setRows(this.getSqlSession().selectList(this.getSqlName("selectPage"), pageParam, new RowBounds(pageParam.getOffset(), pageParam.getPageSize())));
		Integer count = this.getSqlSession().selectOne(this.getSqlName("getCount"), pageParam);
		if (count == null) count = 0;
		page.setTotal(count);
		return page;
	}
	
}