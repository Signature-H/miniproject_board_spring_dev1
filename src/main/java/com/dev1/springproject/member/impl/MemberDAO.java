package com.dev1.springproject.member.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dev1.springproject.member.MemberVO;
@Repository
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insert(MemberVO vo) {
		System.out.println("멤버삽입");
		mybatis.insert("MemberDAO.insertMember",vo);

	}
	public MemberVO select(MemberVO vo) {
		System.out.println("멤버조회");
		return (MemberVO)mybatis.selectOne("MemberDAO.selectMember",vo);
	}
	public void changeMyInfo(MemberVO vo) {
		System.out.println("내정보변경");
		mybatis.update("MemberDAO.changeMyInfo",vo);
	}
	
}
