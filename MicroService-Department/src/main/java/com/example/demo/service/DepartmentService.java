package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository deptRepo;
	
	public List<Department> findAll(){
		return deptRepo.findAll();
	}
	
	public void save(Department dept) {
		deptRepo.save(dept);
	}
	
	public Department findById(Long departmentId) {
		return deptRepo.findById(departmentId).get();
	}
}
