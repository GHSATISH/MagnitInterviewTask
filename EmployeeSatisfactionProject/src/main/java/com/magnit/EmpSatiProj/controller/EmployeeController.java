package com.magnit.EmpSatiProj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magnit.EmpSatiProj.entity.EmployeeEntity;
import com.magnit.EmpSatiProj.repo.EmpRepository;
import com.magnit.EmpSatiProj.service.IEmpService;

@RestController
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private IEmpService service;

	//http://localhost:8989/save
	
	// Save operation
	@PostMapping("/save")
	public EmployeeEntity saveEmployeeObject(@RequestBody EmployeeEntity entity) {
		System.out.println(entity);
		return service.saveEmployee(entity);
	}

	// Read operation
	@GetMapping("/fatch")
	public List<EmployeeEntity> getEmployeeObject(EmployeeEntity entity) {
		
		return service.fetchEmployeeList();
	}

	// Update operation
	@PutMapping("/employees/{id}")
	public EmployeeEntity updateDepartment(@RequestBody EmployeeEntity emp, @PathVariable("id") Integer empId) {
		
		return service.updateEmployee(emp, empId);
	}

	// Delete operation
	@DeleteMapping("/employees/{id}")
	public String deleteEmployeeById(@PathVariable("id") Integer empId) {
		
		service.deleteEmployeeById(empId);
		
		return "Deleted Successfully";
	}

}
