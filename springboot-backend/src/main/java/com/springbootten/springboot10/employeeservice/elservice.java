package com.springbootten.springboot10.employeeservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootten.springboot10.model.employee;
import com.springbootten.springboot10.repository.employeerepository;

@Service
public class elservice {
private
@Autowired employeerepository emplrepo;
public List<employee> getallempl() {
	return emplrepo.findAll();
}
public employee saveemployee(employee model) {
	
	return emplrepo.save(model);
}
public List<employee> search(String username) {
	return emplrepo.findByFirstnameContaining(username);
}
public List<employee> deluser(String firstname){
	 emplrepo.deleteByfirstname(firstname);
	 return emplrepo.findAll();
}
public Optional<employee> finduser(Long id) {
	return emplrepo.findById(id);
}
 public Optional<employee> ssss(Long idd){
	 return emplrepo.findById(idd);
 }
}
