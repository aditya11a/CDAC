package com.cdac.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static Connection connection;
	
	public static void openConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/advancejava";
		connection = DriverManager.getConnection(url, "root", "cdac");
	}
	
	public static Connection getConnection() throws SQLException{
		return connection;
	}

	public static void closeConnection() throws SQLException{
		connection.close();
		System.out.println("Connection is closed");
	}
}