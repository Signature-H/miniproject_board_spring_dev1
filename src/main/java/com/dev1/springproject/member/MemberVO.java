package com.dev1.springproject.member;

import java.util.Date;

// DEV_MEMBER Å×ÀÌºí
public class MemberVO {
	
	// ID
	private String id;
	// NAME
	private String name;
	// PASSWORD
	private String password;
	// REGDATE
	private Date regDate;
	// EMAIL
	private String eMail;
	// PHONENUMBER1
	private int phoneNumber1;
	// PHONENUMBER2
	private int phoneNumber2;
	// PHONENUMBER3
	private int phoneNumber3;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int getPhoneNumber1() {
		return phoneNumber1;
	}
	public void setPhoneNumber1(int phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}
	public int getPhoneNumber2() {
		return phoneNumber2;
	}
	public void setPhoneNumber2(int phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}
	public int getPhoneNumber3() {
		return phoneNumber3;
	}
	public void setPhoneNumber3(int phoneNumber3) {
		this.phoneNumber3 = phoneNumber3;
	}
}
