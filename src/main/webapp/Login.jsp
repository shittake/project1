<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="HelloServlet" method="post">
		<div>
		Username: <input type="text" name="username" size="20">
		Password: <input type="text" name="password" size="20">
		<!-- Implement submit button with type = submit to perform the request when clicked  -->
		</div>
		<div><input type="submit" value="Login" /></div>
	</form>
</body>
</html>