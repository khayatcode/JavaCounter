<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<h1>Welcome User!</h1>
		<a href="/your_server" class="btn btn-secondary">increment by 1</a>
		<a href="/double" class="btn btn-info">Increment by 2</a>
		<a href="/reset" class="btn btn-danger">Reset</a>
		<a href="/your_server/counter">View Details</a>
		<h3>Amount visited this page <c:out value="${count}"></c:out></h3>
	</div>
</body>
</html>