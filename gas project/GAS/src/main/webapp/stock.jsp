<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.DB.*" %>

<div>
    <!-- Stock-related content and code go here -->
    <%  
   double d= DbConfiuration.getConnection();
    out.println(d);
     %>
    <p>This is the Stock Section.</p>
</div>
