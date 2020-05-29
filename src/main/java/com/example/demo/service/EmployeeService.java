package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository ;

	public EmployeeRepository getEmployerRepository() {
		return repository;
	}

	public void setRepository(EmployeeRepository repository) {
		this.repository = repository;
	}
	
	}
