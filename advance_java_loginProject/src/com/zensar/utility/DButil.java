package com.zensar.utility;

import java.sql.*;


public class DButil {
public static Connection getMysqldbConnection() {
		
		String driverClassName= "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String userName = "root";
		String password = "root";
		Connection con = null;
		try {
		Class.forName(driverClassName);
		con = DriverManager.getConnection(url, userName, password);
		
		}catch(Exception e) {
			System.out.println("Exception while creating db connection : " + e);
		}
		return con;
	}

}
