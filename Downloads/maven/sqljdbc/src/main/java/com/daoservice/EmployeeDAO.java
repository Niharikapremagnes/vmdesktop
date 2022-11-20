package com.daoservice;

import java.sql.SQLException;

import com.modelservice.Employee;

public interface EmployeeDAO {
	public boolean insertEmployee(Employee employee) throws SQLException;
	public String retrieveEmployee(int id) throws SQLException;
	public boolean updateEmployee(int id, int age) throws SQLException;
	public boolean deleteEmployee(int id) throws SQLException;
	public boolean getEmployeeNames() throws SQLException;
}
