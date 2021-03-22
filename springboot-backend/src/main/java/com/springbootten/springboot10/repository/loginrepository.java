package com.springbootten.springboot10.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springbootten.springboot10.model.loginmodel;

public interface loginrepository extends JpaRepository<loginmodel, Long>{
	public loginmodel findByUserNameAndPassWord(String username, String pass);
	public loginmodel findByUserName(String userName);
}
