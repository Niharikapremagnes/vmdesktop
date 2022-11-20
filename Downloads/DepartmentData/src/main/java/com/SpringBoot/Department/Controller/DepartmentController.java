package com.SpringBoot.Department.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Department.Entity.Department;
import com.SpringBoot.Department.Service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController 
{
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/dept")
	public List<Department> getDepartments()
	{
		return departmentService.getDepartments();
	}
	
	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable("id") int id)
	{
		return departmentService.getDepartment(id);
	}
	@PostMapping("/dept")
	public void addDepartment(@RequestBody Department dept )
	{
		departmentService.addDepartment(dept);
	}
}
