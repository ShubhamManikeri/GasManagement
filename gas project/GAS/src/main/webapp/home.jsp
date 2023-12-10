<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            color: #333;
        }

        header {
            background-color: #4285f4;
            color: #fff;
            text-align: center;
            padding: 20px;
        }

        nav {
            background-color: #333;
            overflow: hidden;
        }

        nav a {
            float: left;
            display: block;
            color: #f2f2f2;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
            font-size: 18px;
        }

        nav a:hover {
            background-color: #ddd;
            color: black;
        }

        section {
            background-color: #fff;
            margin: 20px;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        footer {
            background-color: #4285f4;
            color: #fff;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>

    <header>
        <h1>Gas cylinder Management System</h1>
    </header>

    <nav>
        <a href="customer.jsp" class="button">Consumer</a>
        <a href="stock.jsp" class="button">RateDetails</a>
        <a href="dilivery.jsp" class="button">StockUpdate</a>
        <a href="newregisteratio.jsp" class="button">new registeration</a>
        <!-- Add more buttons as needed -->
    </nav>

    <section>
        <!-- Main content goes here -->
        <h2>Main Content Section</h2>
        <p>This is the main content of your home page.</p>
    </section>

    
</body>
</html>
