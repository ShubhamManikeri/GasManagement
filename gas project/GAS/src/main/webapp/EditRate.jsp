<%@ page import="com.admin.*" %>
<%@ page import="com.Dao.*" %>
<%@ page import="com.Demo.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Rate</title>
</head>
<body>

    <h2>Edit Rate</h2>

    <%
        // Sample data for demonstration
        String type = request.getParameter("type");
     //   Rate rate = new Rate(type, 0); // Replace 0 with the actual default rate from your data source
       RateDAO rateDao = new RateDAO();
       Rate rate = rateDao.SelectRate();
        // You can use the 'rate' object to pre-fill form fields for editing
    %>

    <form action="UpdateRateServlet" meyhod="post" >
    commercial Rate: <input type="text" name="CommRate" ><br>
    Domestic  Rate: <input type="text" name="DommRate" ><br>
    <input type="submit" value="Update Rate">
</form>

    
</body>
</html>
