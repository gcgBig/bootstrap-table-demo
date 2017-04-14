package com.bootstrap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootstrap.dao.StaffDao;
import com.bootstrap.service.StaffService;
import com.bootstrap.util.Page;
import com.bootstrap.util.PageParam;

/**
 * serviceImpl
 * @author gcg
 * 
 * 2017年4月14日 下午4:15:27
 */
@Service("staffService")
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffDao staffDao;

	@Override
	public Page find(PageParam pageParam) {
		return this.staffDao.find(pageParam);
	}

}