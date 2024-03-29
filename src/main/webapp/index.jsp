<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title>Formulaire</title>
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
      padding: 5px;
      margin: 4px 0;
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
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h1>
  Formulaire :
</h1>
<form method="Get" action="EmployeeController">
  <p>
    <label for="LastName">LastName : </label>
    <input type="text" name="LastName" id="LastName" />
  </p>

  <p>
    <label for="FirstName">FirstName : </label>
    <input type="text" name="FirstName" id="FirstName" />
  </p>

  <p>
    <label for="Email">Email : </label>
    <input type="text" name="Email" id="Email" />
  </p>
  <p>
    <label for="phoneNumber">PhoneNumber : </label>
    <input type="text" name="phoneNumber" id="phoneNumber" />
  </p>
  <p>
    <label for="Adresse">Adresse : </label>
    <input type="text" name="Adresse" id="Adresse" />
  </p>
  <p>
    <label for="Department">Department : </label>
    <input type="text" name="Department" id="Department" />
  </p>
  <p>
    <label for="Salary">Salary : </label>
    <input type="text" name="Salary" id="Salary" />
  </p>

  <input type="submit" value="Envoyer " />
</form>

</body>
</html>