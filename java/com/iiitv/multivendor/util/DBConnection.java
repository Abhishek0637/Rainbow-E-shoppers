package com.iiitv.multivendor.util;

import java.sql.Connection;

import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() throws Exception {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/multivendor","root","");
		} catch (ClassNotFoundException e) {
			System.out.print(e.toString());
		}
		return connection;
	}

}
