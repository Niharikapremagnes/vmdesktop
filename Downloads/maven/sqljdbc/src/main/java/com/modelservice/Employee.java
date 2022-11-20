package com.modelservice;

public class Employee {
	private String EmpName;
	   private int id;
	   private int Age;
	   
	   public Employee(int id,String EmpName,int Age) {
		   this.setEmpName(EmpName);
		   this.setId(id);
		   this.setAge(Age);
		   
	   }

	public Employee() {
		super();
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String toString() {
		return "Employee { id= "+ id + "Employee Name= "+ EmpName + "age= "+ Age +"}";
		
	}

}
