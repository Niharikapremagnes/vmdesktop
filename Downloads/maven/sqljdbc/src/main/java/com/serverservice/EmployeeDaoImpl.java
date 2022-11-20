package com.serverservice;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.daoservice.EmployeeDAO;
import com.sql.jdbc.GetConnection;
import com.modelservice.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {

	public boolean insertEmployee(Employee employee) throws SQLException {
		String sql= "insert into employee values(?,?,?)";
		PreparedStatement ps=GetConnection.getConnection().prepareStatement(sql);
		ps.setInt(1, employee.getId());
		ps.setString(2, employee.getEmpName());
		ps.setInt(3,employee.getAge());
		return ps.executeUpdate() > 0;
	}

	public String retrieveEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		String sql= "select * from employee where ID=?";
		PreparedStatement ps=GetConnection.getConnection().prepareStatement(sql);
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int i=rs.getInt(1);
			String n=rs.getString(2);
			int age= rs.getInt(3);
			System.out.println("Employee Id: \n"+ i + "\nEmployee Name: \n"+ n + "\nEmployee Age: \n"+ age);
		}
		return "Retrieved Data of "+ id;
	}

	public boolean updateEmployee(int id, int age) throws SQLException {
		String sql= "update employee set Age=? where ID=?";
		PreparedStatement ps=GetConnection.getConnection().prepareStatement(sql);
		ps.setInt(1,age);
		ps.setInt(2,id);
		return ps.executeUpdate() > 0;
	}

	public boolean deleteEmployee(int id) throws SQLException {
		String sql= "delete from employee where ID=?";
		PreparedStatement ps=GetConnection.getConnection().prepareStatement(sql);
		ps.setInt(1,id);
		return ps.executeUpdate() > 0;
	}

	public boolean getEmployeeNames() throws SQLException {
		String sql="select Name from employee order by Name DESC";
		PreparedStatement ps=GetConnection.getConnection().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			String data="[Name= "+ rs.getString(1)+" ]";
			System.out.println(data);
		}
		return true;
		
	}

}

