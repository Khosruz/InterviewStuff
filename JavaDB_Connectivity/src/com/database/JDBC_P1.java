package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
/***
 * Befor connection bellow steps has to be done
 * 1. Create Connection
 * 2. Create Statement
 * 3. Execute statement/query 
 * 4. Close the connection
 * @author khosuzzaman
 *
 */
public class JDBC_P1 {

	public static void main(String[] args) throws Exception {
		getConnection();


	 
	}
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/store";
			String userName = "root";
			String password = "ABcd**12";
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected");
			return connection;
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("Connection doesnt established");
		}
		return null;
	}

}
