package com.dev1.springproject.board;

import java.util.List;

public interface BoardService {

	public void insertBoard(BoardVO vo);

	public List<BoardVO> getBoardList(BoardVO vo);

}
