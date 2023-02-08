package com.magnit.EmpSatiProj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magnit.EmpSatiProj.entity.EmployeeEntity;

public interface EmpRepository extends JpaRepository<EmployeeEntity, Integer> {

}
