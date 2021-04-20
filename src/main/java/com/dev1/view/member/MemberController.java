package com.dev1.view.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dev1.springproject.member.MemberService;
import com.dev1.springproject.member.MemberVO;

@Controller
@SessionAttributes("member")
public class MemberController {

	private MemberService memberservice;
	
	@RequestMapping("/joinUser.do")
	public String insert(MemberVO vo) {
	memberservice.insert(vo);
	return "login.do";
	}
}
