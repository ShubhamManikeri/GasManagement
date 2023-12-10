package com.Demo;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;


public class AddServlet extends HttpServlet {
	private String username;
	private String password;
     public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

         username = request.getParameter("username");
         password = request.getParameter("password");
        
        //out.println("welcome");
    
         //Add your authentication logic here

        if (isValidUser(username, password)) {
            //out.println("<h3>Login successful</h3>");
            //RequestDispatcher dispatcher=request.getRequestDispatcher("/home.jsp");
        	//dispatcher.forward(request,response);
        	response.sendRedirect("home.jsp");
        	//response.sendRedirect("home.jsp");
        } else {
            out.println("<h3>Login failed. Invalid username or password</h3>");
        }
    }

    private boolean isValidUser(String username, String password) {
       
        return "a".equals(username) && "p".equals(password);
    }
  
    	
    	
    }

