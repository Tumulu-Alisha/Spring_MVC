<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Window</title>
</head>
<body>

<a href="/spring-mvc/login3?sitelanguage=en">English</a> | <a href="/spring-mvc/login3?sitelanguage=fr">French</a> | <a href="/spring-mvc/login3?sitelanguage=vn">vietnam</a>

<form:errors  path="customer1.*"/> 

<form action="/spring-mvc/login3" method="post">

   <table>
               
                <tr>
                   
                   <td><spring:message code="label.Username"/> <input type="text" name="usesrname"></td>
                   
                   
               </tr>
                  <tr>
                   
                   <td><spring:message code="label.Password"/> <input type="password" name="password"></td>
                   
                   
               </tr>
               
                  <tr>
                   
                   <td><spring:message code="label.Email" />   <input type="text" name="email"></td>
                   
                   
               </tr>
               
                      <tr>
                   
                   <td><spring:message code="label.Contact"/> <input type="text" name="contact"></td>
                   
                   
               </tr>
               
                      <tr>
                   
                   <td><spring:message code="label.Zipcode"/> <input type="text" name="zipcode"></td>         
               </tr>        
                      <tr>
                   
                   <td> City:</td> <td> <select name="city" multiple>
                                         <option value="Pune" >Pune</option>
                                           <option value="Solapur" >Solapur</option>
                                             <option value="Mumbai" >Mumbai</option>
                                               <option value="Hyd" >Hyd</option>
                                                 </select></td>
                   
                   
               </tr>
                   <tr>
                   
                    <td> <input type="submit" value="Sumbit"></td>
                   
                   
               </tr>
               
               
               
               </table>


</form>

</body>
</html>