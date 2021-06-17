package com.app.bean;

public class Users {
	private String name;
	private String password;
	private String mail;
	private long mobile;
	
	
	public Users(String name, String password, String mail, long mobile) {
		super();
		this.name = name;
		this.password = password;
		this.mail = mail;
		this.mobile = mobile;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
}
