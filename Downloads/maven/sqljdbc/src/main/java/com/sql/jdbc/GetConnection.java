package com.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	public static Connection connection;
	
	public static Connection getConnection() throws SQLException
	{
		String host="localhost";
		String port="3306";
		connection =DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Employees","root","root");
		System.out.println("Connection Successful");
		return connection;
	}

}
