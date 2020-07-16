package com.hr.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 


import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "customer")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custID;
	@ApiModelProperty
	@Column(name = "customer_name")
	 
	private String custName;
	@Column(name = "customer_phone_number")
	private String custPhoneNumber;
	@Column(name = "customer_address")
	
	private String custAddress;
	@Column(name = "customer_registration_date")
	private Date CustRegistreation;
	
	@Column(name = "customer_email")
	private String custEmail;

	public CustomerEntity(Integer custID, String custName, String custPhoneNumber, String custAddress,
			Date custRegistreation, String custEmail) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custPhoneNumber = custPhoneNumber;
		this.custAddress = custAddress;
		CustRegistreation = custRegistreation;
		this.custEmail = custEmail;
	}

	public CustomerEntity() {

	}

	public Integer getCustID() {
		return custID;
	}

	public void setCustID(Integer custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPhoneNumber() {
		return custPhoneNumber;
	}

	public void setCustPhoneNumber(String custPhoneNumber) {
		this.custPhoneNumber = custPhoneNumber;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public Date getCustRegistreation() {
		return CustRegistreation;
	}

	public void setCustRegistreation(Date custRegistreation) {
		CustRegistreation = custRegistreation;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

}
