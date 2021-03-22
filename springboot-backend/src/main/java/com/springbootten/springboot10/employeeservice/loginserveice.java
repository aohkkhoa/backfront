package com.springbootten.springboot10.employeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootten.springboot10.model.loginmodel;
import com.springbootten.springboot10.repository.loginrepository;

@Service
public class loginserveice {
@Autowired
private loginrepository loginrepo;

public loginmodel register(loginmodel lgmd) {
	return  loginrepo.save(lgmd);
	
}
public loginmodel fetchloginmodel(String username, String pass) {
	return loginrepo.findByUserNameAndPassWord(username, pass);
}
public loginmodel fetchemployeebyusername(String username) {
	return loginrepo.findByUserName(username);
}
}
