package com.springbootten.springboot10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootten.springboot10.employeeservice.loginserveice;
import com.springbootten.springboot10.model.loginmodel;
import com.springbootten.springboot10.repository.loginrepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class loginmodelcontroller {
@Autowired
private loginserveice service;
@PostMapping("/haha")
public loginmodel regis(@RequestBody loginmodel lgmd) throws Exception {
	 String tempusername = lgmd.getUserName();
	 if(tempusername != null && !"".equals(tempusername)) {
		loginmodel lgmdobj = service.fetchemployeebyusername(tempusername);
		if(lgmdobj != null) {
			throw new Exception("user with name " +tempusername+" is already exits");
		}
	 }
	loginmodel lgmdd = null;
	lgmdd = service.register(lgmd);
	return lgmdd;
}
@PostMapping("/login")
public String login(@RequestBody loginmodel llgmd) throws Exception {
	String tempusername = llgmd.getUserName();
	String temppasswork = llgmd.getPassWord(); 
	loginmodel lgmmd = service.fetchloginmodel(tempusername, temppasswork);
	if(lgmmd == null) {
		throw new Exception("badass");
	}
	return lgmmd.getRoLes();
}
@GetMapping("/login")
public String fetchusbylogin(@RequestBody loginmodel loginmodell) throws Exception {
	String usname = loginmodell.getUserName();
	String pass = loginmodell.getPassWord();
	loginmodel lgmmdd = service.fetchloginmodel(usname, pass);
	if(lgmmdd == null) {
		throw new Exception("badass");
	}
	return lgmmdd.getRoLes();
	}
}
