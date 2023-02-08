package com.magnit.EmpSatiProj.service;

import java.util.List;

import com.magnit.EmpSatiProj.entity.EmployeeEntity;

public interface IEmpService {

	// Save operation
    public EmployeeEntity saveEmployee(EmployeeEntity emp);
 
 // Read operation
    public List<EmployeeEntity> fetchEmployeeList();
 
    // Update operation
    public EmployeeEntity updateEmployee(EmployeeEntity emp, Integer empId);
 
    // Delete operation
    public void deleteEmployeeById(Integer empId);
	
	
}
