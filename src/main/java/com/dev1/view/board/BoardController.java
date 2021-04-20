package com.dev1.view.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;import com.dev1.springproject.board.BoardListVO;
import com.dev1.springproject.board.BoardService;
import com.dev1.springproject.board.BoardVO;

@Controller
@SessionAttributes("board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	//�� ��� �˻�
	@RequestMapping("/list.do")
	public String getBoardList(BoardVO vo, Model model) {
		//Model ���� ����
	model.addAttribute("boardList", boardService.getBoardList(vo));
	return "getBoardList.jsp"; // view �̸� ����
	}
}
