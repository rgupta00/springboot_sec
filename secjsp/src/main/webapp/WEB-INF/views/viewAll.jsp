<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee application</title>
</head>
<body>
<body>
	<table>
		<thead>
			<tr>
				<th>emp id</th>
				<th>emp name</th>
				<th>emp age</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach var="e" items="${emps}">
				<tr>
					<td>${e.id}</td>
					<td>${e.name}</td>
					<td>${e.age}</td>
					<td><a href="updateEmp?id=<c:out value="${e.id }"/>">update</a>
					<td><a href="delEmp?id=<c:out value="${e.id }"/>">delete</a>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<a href="addEmp">Add new employee</a>
</body>

</body>
</html>