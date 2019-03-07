<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<form id="insert" action="UpdateStudent" method="post">
		<table>
			<tr>
				<td>Student ID</td>
				<td><input type="number" id="StudentID" name="StudentID"></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><input type="text" id="StudentName" name="StudentName"></td>
			</tr>
			<tr>
				<td>Student Phone</td>
				<td><input type="number" id="StudentNumber"
					name="StudentNumber"></td>
			</tr>
			<tr>
				<td>CGPA</td>
				<td><input type="number" step="any" id="CGPA" name="CGPA"></td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td><input type="date" id="DOB" name="DOB"></td>
			</tr>
		</table><br>

		<input type="submit" id="CreateRecord" value="Update Record">
	</form><br>
	${msg}
	<a href="index.jsp">Back To Home</a><br>
	<tr><a href="ListStudent">Check Student List after update operation</a></tr><br>
</body>
</html>