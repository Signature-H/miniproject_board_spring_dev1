package com.dev1.view.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev1.springproject.board.BoardService;
import com.dev1.springproject.board.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	//�� ���
	@RequestMapping(value = "/write.do", method = RequestMethod.GET)
	public String InsertForm(BoardVO vo) {
		return "writeBoard.jsp";
	}
	
	@RequestMapping(value = "/write.do", method = RequestMethod.POST)
	public String InsertBoard(BoardVO vo) {
		boardService.insertBoard(vo);
		return "list.do";
	}
	
	
	
	//�� ��� �˻�
	@RequestMapping("/list.do")
	public String getBoardList(BoardVO vo, Model model) {
		//Model ���� ����
	model.addAttribute("boardList", boardService.getBoardList(vo));
	return "getBoardList.jsp"; // view �̸� ����
	}
}
