package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Integer> {

	Optional<Employee> findById(int id);

	void deleteById(int id);

	Employee save(int employeeId);

	

	
	
}
