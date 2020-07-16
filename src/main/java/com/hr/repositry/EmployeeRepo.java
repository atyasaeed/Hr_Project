package com.hr.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hr.entity.EmployeeEntity;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {
	
	
	List<EmployeeEntity> findByEmpFirstName(String empFirstName);
	
	List<EmployeeEntity> getByEmpLastName(String empLastName);
	@Query("select e from EmployeeEntity e where e.empSalary =?1")
	List<EmployeeEntity> empSearch(double empsalary);
	 
//	List<EmployeeEntity> findByDepartementEntity(Integer deptId);
	
	

}
