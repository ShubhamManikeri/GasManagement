<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.Dao.*" %>
<%@ page import="com.Demo.*" %>

<%@ page import="com.admin.Rate" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rate Details</title>
</head>
<body>

    <h2>Rate Details</h2>

    <table border="1">
        <tr>
           <th>id</th>
            <th>commRate</th>
            <th>DommRate</th>
            
        </tr>

        <%
            // Sample data for demonstration
          // List<Rate> rateList = new ArrayList<>();
            //rateList.add(new Rate("Commercial",23));
           // rateList.add(new Rate("Domestic", 7.5));

           // for (Rate rate : rateList) {
        	    RateDAO rateDao = new RateDAO();
       Rate rate = rateDao.SelectRate();
        %>
            <tr>
                <td><%= rate.getId() %></td>
                <td><%= rate.getCommRate() %></td>
                <td><%= rate.getDomRate() %></td>
                <td><a href="EditRate.jsp">Edit</a></td>
            </tr>
       
    </table>

</body>
</html>
