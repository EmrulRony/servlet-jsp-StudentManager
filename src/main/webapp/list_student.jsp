<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list</title>
</head>
<body>
	<h2>Student List</h2>
	<p>-----------------------------------------------------</p>
	<table>
		<tr>
			<th>Student ID:</th>
			<th>Student Name:</th>
			<th>Student Contact:</th>
			<th>Student GPA:</th>
			<th>Student DOB:</th>
		</tr>
		<c:forEach var="student" items="${studentList}">
			<tr>
				<td>${student.studentid}</td>
				<td>${student.studentname}</td>
				<td>${student.studentcontact}</td>
				<td>${student.studentgpa}</td>
				<td>${student.studentdob}</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="index.jsp">Back To Home</a><br>

</body>
</html>