<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>

</head>
<body>
	<h1>Employee Details</h1>
	<hr>
	<br>
	<br>
	<table border="1">
		<tr>
			<th>EMPLOYEE ID</th>
			<th>EMPLOYEE NAME</th>
			<th>EMPLOYEE AGE</th>
			<th>EMPLOYEE QUALIFICATION</th>
			<th>EMPLOYEE SALARY</th>
		</tr>
		<c:forEach var="e" items="${employeeList}">
			<tr>
				<td>${e.eId}</td>
				<td>${e.eName}</td>
				<td>${e.eAge}</td>
				<td>${e.eQualification}</td>
				<td>${e.eSarlary}</td>
			</tr>

		</c:forEach>




	</table>
	<br>
	<br>
	<button >Add Employee</button>
	<a href="/showAddEmployee">Add Employee link</a>
</body>
</html>