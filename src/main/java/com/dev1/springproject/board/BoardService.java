package com.dev1.springproject.board;

import java.util.List;

public interface BoardService {

	//글등록
	public void insertBoard(BoardVO vo);

	//글 상세 조회
	public void getBoard(BoardVO vo);
	
	//글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo);

}
