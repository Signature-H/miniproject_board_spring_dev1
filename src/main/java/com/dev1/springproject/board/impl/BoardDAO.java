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
		System.out.println("==> Mybatis로 insertBoard() 기능 처리");
		mybatis.insert("BoardDAO.insertBoard", vo);
		mybatis.commit();
	}
	
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("==> Mybatis로 deleteBoard() 기능 처리");
		mybatis.delete("BoardDAO.deleteBoard", vo);
		mybatis.commit();
		
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("==> Mybatis로 getBoard() 기능 처리");
		return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("==> Mybatis로 getBoardList() 기능 처리");
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}

}
