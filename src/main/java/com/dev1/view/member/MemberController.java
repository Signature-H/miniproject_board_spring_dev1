package com.dev1.view.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dev1.springproject.member.MemberService;
import com.dev1.springproject.member.MemberVO;
import com.dev1.springproject.member.impl.MemberDAO;

@Controller
@SessionAttributes("member")
public class MemberController {
	@Autowired
	private MemberService memberservice;
	
	@RequestMapping("/joinMember.do")
	public String join(MemberVO vo) {
	memberservice.insert(vo);
	return "login.do";
	}
	
//	@RequestMapping(value="/login.do", method=RequestMethod.GET)
//	public String loginView(MemberVO vo) {
//		System.out.println("로그인 화면으로 이동");
//		memberservice.select(vo);
//		return "login.jsp";
//	}
//	
//	@RequestMapping(value="/login.do", method=RequestMethod.GET)
//	public String login(MemberVO vo, MemberDAO memberDAO) {
//		System.out.println("로그인 인증 처리");
//		if(memberDAO.select(vo); != null) return "getBoardList.do";
//		else return "login.jsp";
//	}
}
