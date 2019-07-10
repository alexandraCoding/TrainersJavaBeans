<%-- 
    Document   : insert
    Created on : 09-Jul-2019, 21:55:42
    Author     : alexa
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
        <html>
    <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <p><strong><a href="<c:url value='/' />">Go back to Menu</a></strong></p>
        
        <h2>Spring MVC Create for Trainers</h2>
        <form:form method="POST" action="/TrainersBean/insert" modelAttribute="trainer">
             <table>
                <tr>
                    <td><label for="firstName">First Name</label></td>
                    <td><form:input type="text" path="fname" id="firstName"/></td>
                    
                </tr>
                <tr>
                    <td><label for="lastName">Last Name</label></td>
                    <td><form:input type="text" path="lname" id="lastName"/></td>
                </tr>
                            
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
        
    </body>
</html>