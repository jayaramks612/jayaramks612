package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Dept_ID")
	private Long departmentId;
	
	@Column(name="Dept_Name")
	private String departmentName;
	
	@Column(name="Dept_Address")
	private String departmentAddress;
	
	@Column(name="Dept_Code")
	private Integer departmentCode;

	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(Long departmentId, String departmentName, String departmentAddress, Integer departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}



	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public Integer getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(Integer departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	
}
