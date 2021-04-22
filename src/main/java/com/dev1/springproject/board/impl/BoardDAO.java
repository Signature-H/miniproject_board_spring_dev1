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
		System.out.println("==> Mybatis�� insertBoard() ��� ó��");
		mybatis.insert("BoardDAO.insertBoard", vo);
		mybatis.commit();
	}
	
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("==> Mybatis�� deleteBoard() ��� ó��");
		mybatis.delete("BoardDAO.deleteBoard", vo);
		mybatis.commit();
		
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("==> Mybatis�� getBoard() ��� ó��");
		return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("==> Mybatis�� getBoardList() ��� ó��");
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}

}
