<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Show</title>
</head>
<body>
	<h3>Show product list:</h3>
	<h3>Số lượng: ${productList.size()}</h3>
	<c:forEach var="product" items="${productList}">
		Id: ${product.id}<br>
		Name: ${product.name}<br>
		Price: ${product.price}<br>
		=======================<br>
	</c:forEach>
</body>
</html>