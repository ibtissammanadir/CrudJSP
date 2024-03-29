<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <title>Liste des Employés</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <style>
        /* Styles existants */

        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
    </style>
</head>
<body>
<h2>Liste des Employés :</h2>
<table border="1">
    <tr>
        <th>LastName</th>
        <th>FirstName</th>
        <th>Email</th>
        <th>PhoneNumber</th>
        <th>Address</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.lastName}</td>
             <td>${employee.firstName}</td>
            <td>${employee.email}</td>
            <td>${employee.phoneNumber}</td>
            <td>${employee.adresse}</td>
            <td>${employee.department}</td>
            <td>${employee.salary}</td>
            <td>
                <a href="EmployeeController?action=edit&id=${employee.employeeID}">Éditer</a> |
                <a href="EmployeeController?action=delete&id=${employee.employeeID}">Supprimer</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
