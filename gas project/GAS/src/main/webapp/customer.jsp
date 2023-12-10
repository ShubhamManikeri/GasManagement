<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Details Form</title>
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

        form {
            background-color: #fff;
            margin: 20px;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        input, button {
            margin-bottom: 10px;
            padding: 10px;
            width: 100%;
            box-sizing: border-box;
        }

        button {
            background-color: #4285f4;
            color: #fff;
            border: none;
            cursor: pointer;
            border-radius: 4px;
        }
    </style>
</head>
<body>

    <header>
        <h1>Customer Details Form</h1>
    </header>

    <form action="" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="phone">Phone:</label>
        <input type="tel" id="phone" name="phone" required>

        <button type="submit">Submit</button>
    </form>

    <%-- Display submitted data --%>
    <div>
        <h2>Submitted Data:</h2>
        <p>Name: <%= request.getParameter("name") %></p>
        <p>Email: <%= request.getParameter("email") %></p>
        <p>Phone: <%= request.getParameter("phone") %></p>
    </div>

</body>
</html>
