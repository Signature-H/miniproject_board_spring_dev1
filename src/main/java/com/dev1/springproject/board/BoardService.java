package com.dev1.springproject.board;

import java.util.List;

public interface BoardService {

	//�۵��
	public void insertBoard(BoardVO vo);

	//�� �� ��ȸ
	public void getBoard(BoardVO vo);
	
	//�� ��� ��ȸ
	public List<BoardVO> getBoardList(BoardVO vo);

}
