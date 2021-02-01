<%-- 
    Document   : agecalculator
    Created on : Jan 30, 2021, 4:06:01 PM
    Author     : 821214
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type ="number" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
            <p>${message}</p>
            
    </body>
</html>
