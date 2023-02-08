package com.magnit.EmpSatiProj.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magnit.EmpSatiProj.entity.EmployeeEntity;
import com.magnit.EmpSatiProj.repo.EmpRepository;

@Service
public class EmpServiceImpl implements IEmpService {

	@Autowired
	private EmpRepository repo;

	// Read operation
	@Override
	public List<EmployeeEntity> fetchEmployeeList() {
		return (List<EmployeeEntity>)
	            repo.findAll();
	}

	// Save operation
	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity emp) {
		
		return repo.save(emp);
	}

	// Update operation
	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity emp, Integer empId) {
		
		EmployeeEntity depDB
        = repo.findById(empId)
              .get();

    if (Objects.nonNull(emp.getName())
        && !"".equalsIgnoreCase(
            emp.getName())) {
        depDB.setName(
            emp.getName());
    }

    if (Objects.nonNull(
            emp.getFeedbacks())
        && !"".equalsIgnoreCase(
            emp.getFeedbacks())) {
        depDB.setFeedbacks(
            emp.getFeedbacks());
    }

    if (Objects.nonNull(emp.getOverallSatisfaction())
        && !"".equalsIgnoreCase(
            emp.getOverallSatisfaction())) {
        depDB.setOverallSatisfaction(
            emp.getOverallSatisfaction());
    }
    
    if (Objects.nonNull(emp.getValuedAtWorks())
            && !"".equalsIgnoreCase(
                emp.getValuedAtWorks())) {
            depDB.setValuedAtWorks(
                emp.getValuedAtWorks());
        }
    if (Objects.nonNull(emp.getDayOfWeek())
            && !"".equalsIgnoreCase(
                emp.getDayOfWeek())) {
            depDB.setDayOfWeek(
                emp.getDayOfWeek());
        }

    return repo.save(depDB);
	}

	 // Delete operation
	@Override
	public void deleteEmployeeById(Integer empId) {
		repo.deleteById(empId);
		
	}
	
}
