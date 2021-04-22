package com.dev1.springproject.member.impl;

<<<<<<< HEAD
public class MemberDAO {

=======
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dev1.springproject.member.MemberVO;

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
>>>>>>> SMJ
}
