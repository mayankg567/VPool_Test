<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="register.do" method="post">
		<table>
			<tr>
				<th>Enter First Name:</th>
				<td><input type="text" name="fname" required></td>
			</tr>
			<tr>
				<th>Enter Middle Name:</th>
				<td><input type="text" name="mname"></td>
			</tr>
			<tr>
				<th>Enter Last Name:</th>
				<td><input type="text" name="lname" required></td>
			</tr>
			<tr>
				<th>Enter EmailID:</th>
				<td><input type="text" name="email" placeholder="example123@abc.com" required></td>
			</tr>
			<tr>
				<th>Enter Mobile Number:</th>
				<td><input type="text" name="mobile" required></td>
			</tr>
		</table>
	</form>
	<br><br>
	<a href="index.jsp">If Already a member. Click here to LOGIN</a>
</body>
</html>