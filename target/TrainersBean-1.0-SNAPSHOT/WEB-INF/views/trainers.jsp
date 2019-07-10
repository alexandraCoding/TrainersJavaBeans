<%-- 
    Document   : trainers
    Created on : 09-Jul-2019, 17:04:21
    Author     : alexa
--%>
     
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Read</title>
</head>
<body>
	<h2>Spring MVC Create, Read, Update and Delete (CRUD) for Trainers</h2>
	<p><strong>Trainers List is Here | <a href="insert/<c:out value='${insert}'/>">Click for Create</a></strong></p>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Action</th>
		</tr>
		<c:forEach var="trainer" items="${trainers}">
			<tr>
				<td>${trainer.id}</td>
				<td>${trainer.fname}</td>
				<td>${trainer.lname}</td>
				
				<td><a href="update/<c:out value='${trainer.id}'/>">Update</a> |
                                    
                                     <a href="delete/<c:out value='${trainer.id}'/>">Delete</a></td>
			 </tr>
		</c:forEach>
	</table>
    
        <h3>Created by Alexandra Matzari</h3>
</body>
</html>

