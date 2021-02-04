<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form:form
		action="${pageContext.request.contextPath}/authenticateTheUser"
		method="post">
		<c:if test="${param.error!=null}">
			<p style="color: red">You entered wrong credentials!</p>

		</c:if>
		<c:if test="${param.logout!=null}">
			<p style="color: green">You have successfully logged out.!</p>
		</c:if>
		<label for="name">Enter User Name</label>
		<input type="text" name="username">
		<br>
		<br>
		<label for="password">Enter Password</label>
		<input type="password" name="password">
		<br>
		<br>
		<input type="submit" value="Login">
	</form:form>
</body>
</html>