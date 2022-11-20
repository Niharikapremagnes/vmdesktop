package com.SpringBoot.Employee.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.SpringBoot.Employee.Entity.Employee;
import com.SpringBoot.Employee.Repository.EmployeeRepository;
import com.SpringBoot.Employee.VO.Department;
import com.SpringBoot.Employee.VO.ResponseTemplateVO;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	RestTemplate rest;
	
	public List<Employee> getEmployees()
	{
		List<Employee> empList=new ArrayList<>();
		Iterator<Employee> it=employeeRepository.findAll().iterator();
		while(it.hasNext())
			empList.add(it.next());
		return empList;
	}
	public void addEmployee(Employee e) 
	{
		employeeRepository.save(e);
	}

	public void updateEmployee(Employee emp) 
	{
		employeeRepository.save(emp);
	}

	public Employee getEmployeeById(int id) 
	{
		return employeeRepository.findById(id);	
	}
	
	public ResponseTemplateVO getEmployeeByDept(int id)
	{
		ResponseTemplateVO vo=new ResponseTemplateVO();
		Employee employee =employeeRepository.findById(id);
		Department department=rest.getForObject("http://DEPARTMENTDATA/department/" +employee.getDeptId(), Department.class);
		vo.setDepartment(department);
		vo.setEmployee(employee);
		return vo;
	}
}
