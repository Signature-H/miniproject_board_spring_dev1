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
	//?�원가??
	@RequestMapping(value="/joinMember.do",method=RequestMethod.GET)
	public String joinView(MemberVO vo) {
		System.out.println("?�원가?? ?�면?�로 ?�동");
		return "login.jsp";
	}
	@RequestMapping(value="/joinMember.do",method=RequestMethod.POST)
	public String join(MemberVO vo) {
	System.out.println("?�원가?? 처리");
		long timeInMilliSeconds = new java.util.Date().getTime();
		Date now = new Date(timeInMilliSeconds);
		vo.setRegDate(now);
	memberservice.insert(vo);
	return "list.do";
	}
		
	//로그??
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginView(MemberVO vo) {
		System.out.println("로그?? ?�면?�로 ?�동");
		return "login.jsp";
	}	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(MemberVO vo, HttpSession session){
		System.out.println("로그?? ?�증 처리");
		MemberVO mvo = memberservice.select(vo);
		session.setAttribute("member",mvo);
		if(mvo != null) return "list.do";
		else return "login.jsp";
	}
	//로그?�웃
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.setAttribute("member", null);
		memberservice.logout(session);
		return "list.do";
	}
	//마이?�이지
	@RequestMapping("/MyInfo.do")
	public String MyInfo(@ModelAttribute("member") MemberVO vo){
		System.out.println("?�름:"+vo.getName());
		System.out.println("?�이??:"+vo.getId());
		System.out.println("비�?번호:"+vo.getPassword());
		System.out.println("?�드?�번??:"+vo.getPhoneNumber1()+"-"+vo.getPhoneNumber2()+"-"+vo.getPhoneNumber3());
		System.out.println("?�메??:"+vo.geteMail());
		System.out.println("?�록??:"+vo.getRegDate());
		return "MyInfo.jsp";
	}
	
	@RequestMapping(value="/changeMyInfoView.do",method = RequestMethod.GET)
	public String changeMyInfoView(MemberVO vo) {
		return "changeMyInfo.jsp";
	}
	
	@RequestMapping(value ="/changeMyInfo.do",method = RequestMethod.POST)
	public String changeMyInfo(@ModelAttribute("member") MemberVO vo) {
		memberservice.changeMyInfo(vo);
		return "MyInfo.jsp";
	}
		
}
