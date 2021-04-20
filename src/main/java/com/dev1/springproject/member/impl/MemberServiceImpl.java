package com.dev1.springproject.member.impl;

import org.springframework.stereotype.Service;

import com.dev1.springproject.member.MemberService;
import com.dev1.springproject.member.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;
	@Override
	public void insert(MemberVO vo) {
		memberDAO.insert(vo);
	}

}
