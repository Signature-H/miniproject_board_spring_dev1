package com.dev1.springproject.board;

import java.util.Date;

// DEV_BOARD ���̺�
public class BoardVO {

	// ARTICLE_NO 
	private int number; 
	// WRITER_ID
	private String id;
	// WRITER_NAME
	private String name; 
	// TITLE
	private String title;
	// REGDATE
	private Date regDate;
	// MODDATE
	private Date modDate;
	// READ_CNT
	private int read_cnt;
	// CONTENT
	private String content;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public int getRead_cnt() {
		return read_cnt;
	}
	public void setRead_cnt(int read_cnt) {
		this.read_cnt = read_cnt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}