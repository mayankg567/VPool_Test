<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-1.12.2.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	   $('#eotpresend').click(function(event) {
	      console.log("Ajax eotp resend calling");
	      $.getJSON('ajaxEOtpResend', {}, function(jsonResponse) {
	        $('#eotpr').text("OTP resend successfully");
	        console.log("Ajax eotp resend successful");
	      							});
	      								});
							});
</script>
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
	<form action="register2" method="post">
		<table>
			<tr>
				<th>Enter OTP received on your Email &nbsp;<%=session.getAttribute("emailID").toString() %>:</th>
				<td><input type="text" name="eotp" maxlength="6" required></td>
				<!-- <td><button id="eotpresend">Resend OTP on your Email</button></td> -->
				<td><a href="#" id="eotpresend">Resend OTP on Email ID</a> </td>
				<td id="eotpr"></td>
			</tr>
			<tr>
				<th>Enter OTP received on your Mobile &nbsp;<%=session.getAttribute("mobNo").toString() %>:</th>
				<td><input type="text" name="motp" maxlength="6"></td>
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
	<a href="register1.jsp">Made a mistake. Go back and change details.</a>
	<br><br>
	<a href="index.jsp">If Already a member. Click here to LOGIN</a>
</body>
</html>