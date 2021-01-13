<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add/update employee</title>
</head>
<body>
<form:form action="addEmp" method="post" modelAttribute="emp">
	<form:hidden path="id"/><br/>
	Enter emp name:<form:input path="name"/><br/>
	Enter emp age:<form:input path="age"/><br/>
	<input type ="submit"/>
</form:form>
</body>
</html>