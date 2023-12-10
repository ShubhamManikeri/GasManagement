package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.DB.DbConfiuration;
import com.admin.Rate;

public class RateDAO {
	private static String Driver1 = "com.mysql.cj.jdbc.Driver";
	

	// Add your database connection details here
	private static String JDBC_URL = "jdbc:mysql://localhost:3306/gasmanagement1";
	private static String JDBC_USER = "root";
	private static String JDBC_PASSWORD = "Yash@2912";
	

	// SQL queries
	// private static final String SELECT_ALL_RATES = "SELECT * FROM ratedetails";
	private static final String UPDATE_RATE = "UPDATE ratedetails SET DommRate = ?,CommRate = ? WHERE id = ?";

	private static final String SELECT_RATE = "SELECT * from ratedetails";

	public int UpdateRate(Rate Rate) {
	        try (
	        	Connection connection = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
	             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_RATE)) {

	            preparedStatement.setDouble( 1,Rate.getDomRate());
	            preparedStatement.setDouble(2, Rate.getCommRate());
	            preparedStatement.setDouble(3, 1);


	            preparedStatement.executeUpdate();

	        } catch (Exception e) {
            e.printStackTrace(); // Handle this exception properly in a real-world scenario
            return 0;
	        }
			return 0;
	    }

	public Rate SelectRate() {
	        try  {
	        	
	        	Connection connection =  DbConfiuration.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_RATE);
	             
	             try (ResultSet resultSet =preparedStatement.executeQuery();) {
	                    while (resultSet.next()) {
	                        int id = resultSet.getInt("id");
	                        double DomRate = resultSet.getDouble("DomRate");
	                        double CommRate = resultSet.getDouble("commRate");
	                       
	                        return new Rate(id, DomRate,CommRate);
	                       
	                    }

	        } catch (Exception e) {
	            e.printStackTrace(); // Handle this exception properly in a real-world scenario
	        }
	             return null;
	    } catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	        return null;
	}

}
