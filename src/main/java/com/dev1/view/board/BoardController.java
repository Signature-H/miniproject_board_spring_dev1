package com.dev1.view.board;

import java.util.HashMap;
import java.util.Map;

import javax.naming.directory.SearchControls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev1.springproject.board.BoardService;
import com.dev1.springproject.board.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	//글 등록
	@RequestMapping(value = "/write.do", method = RequestMethod.GET)
	public String InsertForm(BoardVO vo) {
		return "writeArticleForm.jsp";
	}
	
	@RequestMapping(value = "/write.do", method = RequestMethod.POST)
	public String InsertBoard(BoardVO vo) {
		boardService.insertBoard(vo);
		return "list.do";
	}
	
	//글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	
	//글 상세 조회
	@RequestMapping("/read.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board");
		return "readArticleForm.jsp";
	}
	
	//검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> SearchConditionMap(){
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
		
	}
	
	
	//글 목록 검색
	@RequestMapping("/list.do")
	public String getBoardList(BoardVO vo, Model model) {
		//Model 정보 저장
	model.addAttribute("boardList", boardService.getBoardList(vo));
	return "getBoardList.jsp"; // view 이름 리턴
	}
}
