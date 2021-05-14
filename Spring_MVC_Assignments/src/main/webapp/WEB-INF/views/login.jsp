<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>

<form action="/spring-mvc/login" method="post">
<p><font color="red"> ${errormsg}</font></p>
Name :<input type="text" name="name"> Account Number :<input type="text" name="accountNo"> The money want to send:<input type="text" name="moneySend"> <input type="submit" value="send">
       
</form>
</body>
</html>