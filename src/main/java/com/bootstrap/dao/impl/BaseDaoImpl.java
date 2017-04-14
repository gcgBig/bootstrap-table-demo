package com.bootstrap.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * basedaoImpl
 * @author gcg
 * 
 * 2017年4月14日 下午4:16:13
 */
public class BaseDaoImpl<T> extends SqlSessionDaoSupport {
	
	@Resource  
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {  
        super.setSqlSessionFactory(sqlSessionFactory);  
    }  
	
	@Autowired
	protected SqlSessionTemplate sessionTemplate;
	@Autowired
	protected SqlSessionFactory sessionFactory;
	
	//~protected
	protected String getSqlName(String sqlId) {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getClass().getName());
		sb.append(".");
		sb.append(sqlId);
		
		return sb.toString();
	}
	
}
