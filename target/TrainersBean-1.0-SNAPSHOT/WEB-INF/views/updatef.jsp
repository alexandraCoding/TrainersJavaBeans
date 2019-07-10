<%-- 
    Document   : update
    Created on : 09-Jul-2019, 21:21:42
    Author     : alexa
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student</title>
    </head>
    <body>  
      <p><strong><a href="<c:url value='/' />">Go back to Menu</a></strong></p>
<h2>Spring MVC  Update  for Trainers</h2>
                <form:form method="POST" action="/TrainersBean/updatef" modelAttribute="trainer"> 
           <form:input name="id" path="id" type="hidden"/>
            First Name:<form:input name="fname" type="text" path="fname" id="firstName"/><br>
            Last Name:<form:input name="lname" type="text" path="lname" id="lastName"/><br>
                                
           <input type="submit" value="Update"  /><br>
            </form:form> 

    </body>
</html>
    