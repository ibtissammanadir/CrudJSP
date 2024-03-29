<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="css/style.css">

<html>
<head>
    <title>Edit Employee</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        form {
            width: 300px;
            margin: auto;
        }
        p {
            margin-bottom: 10px;
        }
        input[type="text"], input[type="email"], input[type="number"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<h2>Edit Employee</h2>
<form action="" method="post">
    <input type="hidden" name="id" value="${employee.employeeID}" />

    <p>
        <label for="LastName">Last Name:</label>
        <input type="text" name="LastName" id="LastName"  />
    </p>
    <p>
        <label for="FirstName">First Name:</label>
        <input type="text" name="FirstName" id="FirstName" />
    </p>
    <p>
        <label for="Email">Email:</label>
        <input type="Email" name="Email" id="Email" />
    </p>
    <p>
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" name="phoneNumber" id="phoneNumber"  />
    </p>
    <p>
        <label for="Adresse">Address:</label>
        <input type="text" name="Adresse" id="Adresse"  />
    </p>
    <p>
        <label for="Department">Department:</label>
        <input type="text" name="Department" id="Department" />
    </p>
    <p>
        <label for="Salary">Salary:</label>
        <input type="number" name="Salary" id="Salary"  />
    </p>

    <input type="submit" value="Save Changes" />
</form>
</body>
</html>
