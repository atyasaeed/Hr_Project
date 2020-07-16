package com.hr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.hr.customexception.RecordNotFoundException;
import com.hr.entity.EmployeeEntity;
import com.hr.repositry.EmployeeRepo;

@Service
public class EmployeeService {
	@Value("E:\\IT\\Back_End\\Spring")
	 String filePath;
	@Value("spring.application.name")
	String appName;
	@Autowired
	EmployeeRepo employeeRepo;

	public List<EmployeeEntity> getAllEmployee() {

		return employeeRepo.findAll();

	}

	public void addEmployee(EmployeeEntity employeeEntity) {

		employeeRepo.save(employeeEntity);
	}

	public EmployeeEntity getEmpById(Integer empId) {

		return employeeRepo.findById(empId).orElseThrow(()-> new RecordNotFoundException("the Employee number : "+ empId + " Not found" ));

	}

	public List<EmployeeEntity> getEmpByFirstName(String empName) {

		return employeeRepo.findByEmpFirstName(empName);

	}

	public List<EmployeeEntity> getEmpByEmpLastName(String emplastName) {

		return employeeRepo.getByEmpLastName(emplastName);

	}

	public List<EmployeeEntity> getEmpBySalary(double empSalary) {
		return employeeRepo.empSearch(empSalary);

	}

	public void updateEmp(EmployeeEntity employeeEntity) {
		employeeRepo.save(employeeEntity);
	}

	public void deletEmp(Integer empId) {
		employeeRepo.deleteById(empId);
	}

//	public List<EmployeeEntity> getDeptEmps(Integer deptId) {
//		return employeeRepo.findByDepartementEntity(deptId);
//	}

}
