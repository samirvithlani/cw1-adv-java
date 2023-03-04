package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection {

	// cred
	private static final String userName = "root";
	private static final String password = "root";
	private static final String url = "jdbc:mysql://localhost:3306/cw2";
	private static final String dirverClass = "com.mysql.cj.jdbc.Driver";

	public static Connection getDbConnection() {

		Connection conn = null;

		try {
			// driver load... it's nothing but creation an object of driver class
			Class.forName(dirverClass);
			// getting connection with Database.
			conn = DriverManager.getConnection(url, userName, password);
			if (conn != null) {
				System.out.println("connected with database...");
			} else {
				System.out.println("not connected with database...");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	
}
