package com.connect;

import java.sql.Connection;

import java.sql.DriverManager;




public class Connect {
	
	static String user = "SA";
	static String password = "Vanhung1999";
	static String url = "jdbc:sqlserver://localhost:1433;databaseName=Student";
	
	
	public static Connection getConnect() {
		Connection connect = null;
		try {
			connect = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Connect fail");
		}
		return connect;
	}


}
