package com.dev1.springproject.member;

import javax.servlet.http.HttpSession;

public interface MemberService {
	public void insert(MemberVO vo);
	public MemberVO select(MemberVO vo);
	public void logout(HttpSession session);

}
