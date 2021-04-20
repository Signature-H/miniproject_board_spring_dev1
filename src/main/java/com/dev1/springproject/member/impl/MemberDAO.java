package com.dev1.springproject.member.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dev1.springproject.member.MemberVO;

public class MemberDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insert(MemberVO vo) {
		System.out.println("memberinsert");
		mybatis.insert("MemberDAO.insertUser",vo);

	}
}
