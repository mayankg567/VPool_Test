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
	<form action="register3" method="post">
		<table>
			<tr>
				<th>Enter Alternative Contact Number:</th>
				<td><input type="text" name="altMobNo"></td>
			</tr>
			<tr>
				<th>Select Gender:</th>
				<td>
					<select name="gender" required>
						<option value="male">Male</option>
						<option value="female">Female</option>
						<option value="other">other</option>
					</select> 
				</td>
			</tr>
			<tr>
				<th>Enter Date of Birth:</th>
				<td><input type="date" name="userdob" required></td>
			</tr>
			<tr>
				<th>Enter Address:</th>
				<td><input type="textarea" name="address" placeholder="Enter your address here" required></td>
			</tr>
			<tr>
				<th>Enter City:</th>
				<td><input type="text" name="city" required></td>
			</tr>
			<tr>
				<th>Enter state:</th>
				<td><input type="text" name="state" required></td>
			</tr>
			<tr>
				<th>Enter pincode:</th>
				<td><input type="number" name="pincode" required></td>
			</tr>
			<tr>
				<th>Enter Password:</th>
				<td><input type="password" name="pass" maxlength="14" placeholder="8 to 14 characters only" required></td>
			</tr>
			<tr>
				<th>Retype Password:</th>
				<td><input type="password" name="cpass" required></td>
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