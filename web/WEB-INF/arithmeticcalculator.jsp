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
        <form>
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="button" value="+" name="addition">
            <input type="button" value="-" name="subtraction">
            <input type="button" value="*" name="multiplication">
            <input type="button" value="%" name="remainder">
        </form>
            <p> Result:${result}</p><br>
            <br>
            <a href="age">Age Calculator</a>
    </body>
</html>
