package com.Demo;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class registeration extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // Retrieve form data
	        String username = request.getParameter("username");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        String pincode = request.getParameter("pincode");
	        String aadharNumber = request.getParameter("aadharNumber");
	        String rationCardNumber = request.getParameter("rationCardNumber");
	        String date = request.getParameter("date");
	        String dob = request.getParameter("dob");

	        // You can perform further processing here, such as storing the data in a database

	        // For now, let's print the data to the console
	        System.out.println("Username: " + username);
	        System.out.println("Email: " + email);
	        System.out.println("Password: " + password);
	        System.out.println("Pin Code: " + pincode);
	        System.out.println("Aadhar Number: " + aadharNumber);
	        System.out.println("Ration Card Number: " + rationCardNumber);
	        System.out.println("Date: " + date);
	        System.out.println("Date of Birth: " + dob);

	        // You can redirect to a success page or perform other actions as needed
	       response.sendRedirect("success.jsp");
	    }
	}
