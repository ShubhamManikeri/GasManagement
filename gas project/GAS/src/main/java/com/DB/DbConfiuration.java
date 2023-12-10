package com.DB;

import java.sql.*;

public class DbConfiuration {
	 static double d;
	private static Connection conn;
	public static Connection getConnection() {
		    String JDBC_URL = "jdbc:mysql://localhost:3306/gasmanagement1";
	        String JDBC_USER = "root";
	        String JDBC_PASSWORD = "Yash@2912";
	        final String SELECT_RATE = "SELECT * from ratedetails";


	            try  {
	            	try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            	 conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
//	                System.out.println("Connected to the database");
//	                Statement st=conn.createStatement();
//	                ResultSet rs=st.executeQuery(SELECT_RATE);
//	              d=  rs.getDouble(2);
//	              conn.close();

	              
	               
                     
	            }

	         catch (SQLException e) {
	            e.printStackTrace();
	        } 
		return conn;
	
	}

}
