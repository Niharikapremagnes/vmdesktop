package com.SpringBoot.Department.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SpringBoot.Department.Entity.Department;
import com.SpringBoot.Department.Repository.DepartmentRepository;
@Service
public class DepartmentService 
{
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getDepartments()
	{
		List<Department> empList=new ArrayList<>();
		Iterator<Department> it=departmentRepository.findAll().iterator();
		while(it.hasNext())
			empList.add(it.next());
		return empList;
	}
	public Department getDepartment(int id) 
	{
		return departmentRepository.findById(id);
	}

	public void addDepartment(Department dept) 
	{
		departmentRepository.save(dept);
	}
	
}
