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
	<form action="login.do" method="post">
		<table>
			<tr>
				<th>Enter EmailID:</th>
				<td><input type="text" name="email" placeholder="example123@abc.com"></td>
			</tr>
			<tr>
				<th>Enter Password:</th>
				<td><input type="password" name="pass" placeholder="qwerty"></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Login">
				</td>
				<td>
					<input type="reset" value="Reset">
				</td>
			</tr>
		</table>
	</form>
	<br><br>
	<a href="register.jsp">If not a member. Click here to register and Become our valued customer</a>
</body>
</html>