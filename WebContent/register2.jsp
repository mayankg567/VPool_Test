<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		RequestDispatcher rd;
		session = (HttpSession) session.getAttribute("sessionx");
		if (session != null) {
			rd = request.getRequestDispatcher(".jsp");
			rd.forward(request, response);
		}
	%> --%>
	<form action="register2.do" method="post">
		<table>
			<tr>
				<th>Enter OTP received on your Email &nbsp;<%=session.getAttribute("emailID").toString() %>:</th>
				<td><input type="number" name="eotp" maxlength="6" required></td>
			</tr>
			<tr>
				<th>Enter OTP received on your Mobile &nbsp;<%=session.getAttribute("mobNo").toString() %>:</th>
				<td><input type="number" name="motp" maxlength="6"></td>
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