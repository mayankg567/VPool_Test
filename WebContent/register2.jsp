<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		RequestDispatcher rd;
		session = (HttpSession) session.getAttribute("sessionx");
		if (session != null) {
			rd = request.getRequestDispatcher(".jsp");
			rd.forward(request, response);
		}
	%>
	<form action="register2.do" method="post">
		<table>
			<tr>
				<th>Enter First Name:</th>
				<td><input type="text" name="firstName" required></td>
			</tr>
			<tr>
				<th>Enter Middle Name:</th>
				<td><input type="text" name="middleName"></td>
			</tr>
			<tr>
				<th>Enter Last Name:</th>
				<td><input type="text" name="lastName" required></td>
			</tr>
			<tr>
				<th>Enter EmailID:</th>
				<td><input type="text" name="emailID" placeholder="example123@abc.com" required></td>
			</tr>
			<tr>
				<th>Enter Mobile Number:</th>
				<td><input type="text" name="mobNo" required></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Register">
				</td>
				<td>
					<input type="reset" value="Reset">
				</td>
			</tr>
		</table>
	</form>
	<br><br>
	<a href="index.jsp">If Already a member. Click here to LOGIN</a>
</body>
</html>