package com.SpringBoot.Employee.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private int id;
	private String name;
	private double salary;
	private int deptId;
	public Employee(int id, String name, double salary, int deptId) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
	}
	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public int getDeptId() 
	{
		return deptId;
	}
	public void setDeptId(int deptId)
	{
		this.deptId = deptId;
	}
	
	
	
}
