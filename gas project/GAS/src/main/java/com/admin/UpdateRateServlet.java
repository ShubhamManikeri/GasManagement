
package com.admin;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet("/UpdateRateServlet")
public class UpdateRateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve parameters from the request
        String type = request.getParameter("type");
        double newRate = Double.parseDouble(request.getParameter("rate"));

        // In a real-world scenario, you would update the rate in your data source (e.g., database)
        // For simplicity, let's just create a new Rate object with the updated rate
        Rate updatedRate = new Rate(type, newRate);

        // Set the updated rate in a scope that can be accessed by the JSP
        request.setAttribute("updatedRate", updatedRate);

        // Forward the request to the updateRate.jsp for displaying the confirmation message
        request.getRequestDispatcher("/RateDetails.jsp").forward(request, response);
    }
}

