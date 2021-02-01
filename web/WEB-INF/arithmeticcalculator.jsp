<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 31, 2021, 5:56:55 PM
    Author     : 821214
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="+" name="calculate">
            <input type="submit" value="-" name="calculate">
            <input type="submit" value="*" name="calculate">
            <input type="submit" value="%" name="calculate">
        </form>
            <p>${result}</p>
            <br>
            <a href="age">Age Calculator</a>
    </body>
</html>
