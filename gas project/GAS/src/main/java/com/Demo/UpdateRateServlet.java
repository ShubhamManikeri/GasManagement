package com.Demo;
import com.admin.*;
import com.Dao.*;


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
        Double Comm = Double.parseDouble(request.getParameter("CommRate"));
        Double Dom = Double.parseDouble(request.getParameter("DomRate"));
        

        

        // In a real-world scenario, you would update the rate in your data source (e.g., database)
        // For simplicity, let's just create a new Rate object with the updated rate
        Rate Rate=new Rate();
        Rate.setId(1);
        Rate.setComRate(Comm);
        Rate.setDomRate(Dom);
        RateDAO r=new RateDAO();
        RateDAO.UpdateRate(Rate);

        // Set the updated rate in a scope that can be accessed by the JSP
        request.setAttribute("updatedRate", updatedRate);

        // Forward the request to the updateRate.jsp for displaying the confirmation message
        request.getRequestDispatcher("/RateDetails.jsp").forward(request, response);
    }
}

