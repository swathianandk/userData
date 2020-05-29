package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.EmployeeRepository;


@RestController
@RequestMapping("/app")
public class EmployeeController {
	
	@Autowired
    EmployeeRepository repository;

// Get All mngrs
    @GetMapping("/post")
    public List<Employee> getAllData() {
        return repository.findAll();
    }

// Create   
     @PostMapping("/postMng")
     public Employee createData( @RequestBody Employee orgn) {
         return repository.save(orgn);
     }
    
     @PutMapping("/update/{id}")
     public ResponseEntity<Employee> updateOrganization(@PathVariable(value = "id") int employeeId,
          @RequestBody Employee employees) throws ResourceNotFoundException {
    	 Employee employee = repository.findById(employeeId)
         .orElseThrow(() -> new ResourceNotFoundException());

    	 employees.setId(employee.getId());
     	employees.setFirst_name(employee.getFirst_name());
     	employee.setLast_name(employee.getLast_name());
     	employee.setMobile(employee.getMobile());
     	employee.setEmail(employee.getEmail());
     	employee.setLocation_type(employee.getLocation_type());
     	employee.setLocation_string(employee.getLocation_string());
     	employee.setStatus(employee.isStatus());
     	employee.setCommunication(employee.getCommunication());
        
         final Employee updateEmployee = repository.save(employeeId);
         return ResponseEntity.ok(employee);
     }
     
     
     

  // delete 
    @DeleteMapping("/del/{id}")
    public void deleteEmpId(@PathVariable int id) {
    	repository.deleteById(id);  
     
}
}