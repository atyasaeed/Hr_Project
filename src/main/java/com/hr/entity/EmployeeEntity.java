package com.hr.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "Employee")

//@NamedQuery(name="EmployeeEntity.getBySalary", query="SELECT e FROM EmployeeEntity e where e.empSalary = :empSalary") 

public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Employee_Id")
	private Integer employeeId;
	@Column(name = "First_Name")
	private String empFirstName;
	@Column(name = "Last_Name")
	
	private String empLastName;
	@Column(name = "Salary")
	private double empSalary;
	@Column(name = "Address")
	private String empAddress;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_id")
	private DepartementEntity departementEntity;

	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(Integer employeeId, String empFirstName, String empLastName, double empSalary,
			String empAddress, DepartementEntity departementEntity) {
		super();
		this.employeeId = employeeId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.departementEntity = departementEntity;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public DepartementEntity getDepartementEntity() {
		return departementEntity;
	}

	public void setDepartementEntity(DepartementEntity departementEntity) {
		this.departementEntity = departementEntity;
	}

}
