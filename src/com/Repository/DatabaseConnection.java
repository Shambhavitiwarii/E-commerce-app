package com.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
	 private static final String URL = "jdbc:mysql://localhost:3306/store";
	    private static final String USER = "root";
	    private static final String PASSWORD = "root";

	    public static Connection getConnection() {
	        Connection connection = null;
	        try {
	            // Load MySQL JDBC Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish connection
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("Database connected successfully!");
	        } catch (ClassNotFoundException e) {
	            System.out.println("JDBC Driver not found!");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Error connecting to the database!");
	            e.printStackTrace();
	        }
	        return connection;
	    }
	

	
}
