package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;

	@GetMapping("/")
	public List<Department> findAll() {
		return deptService.findAll();
	}

	@PostMapping("/save")
	public void save(@RequestBody Department dept) {
		deptService.save(dept);
	}

	@GetMapping("/{Id}")
	public Department findById(@PathVariable("Id") Long departmentId) {
		return deptService.findById(departmentId);
	}
}
