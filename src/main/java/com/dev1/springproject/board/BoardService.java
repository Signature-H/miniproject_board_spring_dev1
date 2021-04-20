package com.dev1.springproject.board;

import java.util.List;

public interface BoardService {

	//글 목록 조회
	List<BoardVO> getBoardList(BoardVO vo);
	
	
}
