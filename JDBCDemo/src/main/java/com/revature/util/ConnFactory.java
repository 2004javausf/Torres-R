package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnFactory {
	//Singleton Factory
	
	//private static instance of itself
	private static ConnFactory cf = new ConnFactory();

	//private no args contructor
	private ConnFactory() {
		super();	
	}
	
	//public static synchronized "getter" method
	public static synchronized ConnFactory getInstance() {
		if (cf == null) {
			cf = new ConnFactory();
		}
		return cf;
	}
	//Methods that do stuff
	//get a Connection to DB
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@javarevature2020.cshaia6groec.us-east-2.rds.amazonaws.com:1521:ORCL";
		String user = "Falgus";
		String password = "sickness6";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
