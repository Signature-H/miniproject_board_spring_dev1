package com.dev1.view.member;


import java.sql.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dev1.springproject.member.MemberService;
import com.dev1.springproject.member.MemberVO;

@Controller
@SessionAttributes("member")
public class MemberController {
	@Autowired
	private MemberService memberservice;
	//회원가입
	@RequestMapping("/joinMember.do")
	public String join(MemberVO vo) {
		long timeInMilliSeconds = new java.util.Date().getTime();
		Date now = new Date(timeInMilliSeconds);
		vo.setRegDate(now);
	memberservice.insert(vo);
	return "list.do";
	}
	
	//로그인
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginView(MemberVO vo) {
		System.out.println("로그인 화면으로 이동");
		return "login.jsp";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(MemberVO vo, HttpSession session){
		System.out.println("로그인 인증 처리");
		MemberVO mvo = memberservice.select(vo);
		session.setAttribute("member",mvo);
		if(mvo != null) return "list.do";
		else return "login.jsp";
	}
	//로그아웃
	@RequestMapping(value = "/logout.do")
	public String logout(HttpSession session) {
		session.setAttribute("member", null);
		memberservice.logout(session);
		return "list.do";
	}
	
	@RequestMapping("/MyInfo.do")
	public String MyInfo(@ModelAttribute("member") MemberVO vo){
		System.out.println("이름:"+vo.getName());
		System.out.println("아이디:"+vo.getId());
		System.out.println("비밀번호:"+vo.getPassword());
		System.out.println("핸드폰번호:"+vo.getPhoneNumber1()+"-"+vo.getPhoneNumber2()+"-"+vo.getPhoneNumber3());
		System.out.println("이메일:"+vo.geteMail());
		System.out.println("등록일:"+vo.getRegDate());
		return "MyInfo.jsp";
	}
		
}
