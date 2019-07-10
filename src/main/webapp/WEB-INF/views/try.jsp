<%-- 
    Document   : insert
    Created on : 09-Jul-2019, 21:55:42
    Author     : alexa
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <html>
    <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        <form:form method="POST" action="/spring-mvc-xml/insert" modelAttribute="trainer">
             <table>
                 
                <tr>
                    <td><label for="fname">First Name</label></td>
                    <td><form:input type="text" path="fname" id="firstName"/></td>
                    
                </tr>
                <tr>
                    <td><label for="lname">Last Name</label></td>
                    <td><form:input type="text" path="lname" id="lastName"/></td>
                </tr>
                            
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
        
    </body>
</html>


 
