package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			System.out.println("Connecting to databse");
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println(myConn);
			System.out.println("Connection successful!!");
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
