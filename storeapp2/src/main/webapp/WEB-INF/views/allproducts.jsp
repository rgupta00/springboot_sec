<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product store application</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-sm-6">

	<table class="table table-striped">
		<thead>
			<tr>
				<th>productId</th>
				<th>productName</th>
				<th>productPrice</th>
				<th>productDiscount</th>
				<th>productQuantity</th>
				<th>expiryDate</th>
				<th>update</th>
				<th>delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.productId }</td>
					<td>${product.productName }</td>
					<td>${product.productPrice }</td>
					<td>${product.productDiscount }</td>
					<td>${product.productCategory }</td>
					<td>${product.productQuantity }</td>
					<fmt:parseDate value="${product.expiryDate }" pattern="yyyy-MM-dd" var="prodExp" type="date"/>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${prodExp}"/></td>
					<td><a href="update?id=${product.productId }">update</a></td>
					<td><a href="delete?id=${product.productId}">delete</a></td>
						
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</div>
</div>

</body>
</html>