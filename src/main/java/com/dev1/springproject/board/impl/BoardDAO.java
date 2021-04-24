package com.dev1.springproject.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dev1.springproject.board.BoardVO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoard(BoardVO vo) {
		System.out.println("==> Call insertBoard() method to mybatis");
		mybatis.insert("BoardDAO.insertBoard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo)
	{
		System.out.println("==> Call getBoard() method to mybatis");
		return mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	public void updateBoard(BoardVO vo)
	{
		System.out.println("==> Call updateBoard() method to mybatis");
		mybatis.update("BoardDAO.updateBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("==> Call getBoardList() method to mybatis");
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}

}
