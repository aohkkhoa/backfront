package com.springbootten.springboot10.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootten.springboot10.model.employee;

public interface employeerepository extends JpaRepository<employee, Long> {
	public List<employee> findByFirstnameContaining(String username);
	public List<employee> deleteByfirstname(String firstname);
	public Optional<employee> findById(Long id);
}
