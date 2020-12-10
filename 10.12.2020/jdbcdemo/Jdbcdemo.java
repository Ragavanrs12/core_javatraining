package com.tw.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcdemo {
	public static void main(String[] args) {
	String dbURL = "jdbc:sqlserver://TTCT480S073;databaseName=master";
	String id = "sa";
	String pwd = "12345" ;
	
			try {
				Connection connection=DriverManager.getConnection(dbURL, id, pwd);
				System.out.println("Connection Established");

				Statement stmt = connection.createStatement();
				String query = "select * from STUD";

				ResultSet rs = stmt.executeQuery(query);
				// 6. process the result
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "..." + rs.getString(2));
//								+ rs.getString(4) + "..." + rs.getString(5));
				}
			} catch (SQLException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
