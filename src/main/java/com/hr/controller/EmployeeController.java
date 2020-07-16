package com.hr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hr.entity.EmployeeEntity;
import com.hr.service.EmployeeService;

@RestController
@RequestMapping(path = EmployeeController.REST_URL)
public class EmployeeController {
	static final String REST_URL = "/api";
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/getallemp")
	public List<EmployeeEntity> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@PostMapping("/addemployee")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<EmployeeEntity> addEmployee(@RequestBody EmployeeEntity employeeEntity) {
		employeeService.addEmployee(employeeEntity);
		return new ResponseEntity<EmployeeEntity>(employeeEntity, HttpStatus.OK);
	}

	@GetMapping("/getempbyid")
	public EmployeeEntity getEmpById(@RequestParam Integer empId) {

		return employeeService.getEmpById(empId);

	}

	@GetMapping("/getByname")
	public List<EmployeeEntity> getEmpByFirstName(@RequestParam String empName) {

		return employeeService.getEmpByFirstName(empName);

	}

	@GetMapping("/getBylastname")
	public List<EmployeeEntity> getEmpByLastName(@RequestParam String empSalary) {

		return employeeService.getEmpByEmpLastName(empSalary);

	}

	@GetMapping("/getByempsalary")
	public List<EmployeeEntity> getEmpBySalary(@RequestParam double empSalary) {

		return employeeService.getEmpBySalary(empSalary);

	}

	@PutMapping("/updateEmp")
	public String updateEmp(@RequestBody EmployeeEntity employeeEntity) {
		employeeService.updateEmp(employeeEntity);
		return "update Successfull";
	}

	@DeleteMapping("/deleteemp")
	public String deletEmp(@RequestParam Integer empId) {
		employeeService.deletEmp(empId);
		return "Deleted Successful";
	}

//	@GetMapping("/deptemps")
//	public List<EmployeeEntity> getDeptEmps(@RequestParam Integer deptId) {
//		return employeeService.getDeptEmps(deptId);
//
//	}

}
