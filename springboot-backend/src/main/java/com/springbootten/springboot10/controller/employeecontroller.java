package com.springbootten.springboot10.controller;

import java.util.List;
import java.util.Optional;

import javax.print.attribute.standard.Severity;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootten.springboot10.employeeservice.elservice;
import com.springbootten.springboot10.model.employee;
import com.springbootten.springboot10.repository.employeerepository;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/khoa/api")
public class employeecontroller {
	@Autowired
	private employeerepository repository;
	@Autowired
	private elservice service;
	@GetMapping("/employee")
	public List<employee> getall(){
		return service.getallempl();
	}
	@GetMapping("/employee/{id}")
	public Optional<employee> finduserbyid(@PathVariable Long id) {
		return repository.findById(id);
	}
	@PostMapping("/employee")
	public employee savemodel(@RequestBody employee model ) {
		
		return service.saveemployee(model);
	}
	@GetMapping("/search/{username}")
	public List<employee> searchempl(@PathVariable String username) {
		return service.search(username);
	}
	@GetMapping("/deluser/{firstname}")
	@Transactional
	public List<employee> delate(@PathVariable String firstname){
		
		return service.deluser(firstname);
	}
}
