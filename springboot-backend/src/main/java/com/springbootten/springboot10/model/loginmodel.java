package com.springbootten.springboot10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class loginmodel {
	@Id
	private Long idlogin;
	@Column
	private String userName;
	@Column
	private String passWord;
	@Column
	private String roLes;

	public loginmodel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public loginmodel(Long idlogin, String userName, String passWord, String roLes) {
		super();
		this.idlogin = idlogin;
		this.userName = userName;
		this.passWord = passWord;
		this.roLes = roLes;
	}


	public Long getIdlogin() {
		return idlogin;
	}

	public void setIdlogin(Long idlogin) {
		this.idlogin = idlogin;
	}

	public String getUserName() {
		return userName;
	}

	public String getRoLes() {
		return roLes;
	}


	public void setRoLes(String roLes) {
		this.roLes = roLes;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	

	

}
