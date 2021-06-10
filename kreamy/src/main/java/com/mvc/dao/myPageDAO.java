package com.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;

public class myPageDAO {
	private SqlSessionTemplate sessionTemplate;

	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}
}
