package com.SpringBoot.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Employee.Entity.Employee;
import com.SpringBoot.Employee.Service.EmployeeService;
import com.SpringBoot.Employee.VO.ResponseTemplateVO;


@RestController
@RequestMapping("/employee")
public class EmployeeController
{
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/emp")
	public List<Employee> getEmployees()
	{
		return employeeService.getEmployees();
	}
	
	@GetMapping("/emp/{id}")
	public Employee getEmployee(@PathVariable("id") int id)
	{
		return employeeService.getEmployeeById(id);
	}
	@PostMapping("/emp")
	public void addEmployee(@RequestBody Employee emp)
	{
		employeeService.addEmployee(emp);
	}
	@PutMapping("/emp/{id}")
	public void updateEmployee(@RequestBody Employee emp ,@PathVariable("id") int id )
	{
		employeeService.updateEmployee(emp);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getEmployeeByDept(@PathVariable("id") int id)
	{
		return employeeService.getEmployeeByDept(id);
	}
	
	
}
