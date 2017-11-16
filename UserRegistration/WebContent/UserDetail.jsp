<%@page import="org.apache.tomcat.jni.User"%>
<%@page import="bean.UserBean"%>
<%@page import="dao.UserDetailDao"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="dao.LoginDao"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>User Details</h2>
	<script type="text/javascript">
	function edit(){
		document.getElementById("firstName").readOnly = false;
	}
	</script>

	<form action="UserDetailUpdateServlet" method="post">
		First name:<input type="text" id="firstName" name="firstName"
			value=<%=((UserBean) request.getSession().getAttribute("userDetails")).getFirstName()%> readonly>
		<br> Last name:<input type="text" id="lastName" name="lastName"
			value=<%=((UserBean) request.getSession().getAttribute("userDetails")).getLastName()%> readonly>
		<br> Address:<input type="text" id="address" name="address"
			value=<%=((UserBean) request.getSession().getAttribute("userDetails")).getAddress()%> readonly>
		<br> Phone:<input type="text" id="phone" name="phone"
			value=<%=((UserBean) request.getSession().getAttribute("userDetails")).getPhone()%> readonly>
		<br>Email:<input type="text" id="email" name="email"
			value=<%=((UserBean) request.getSession().getAttribute("userDetails")).getEmail()%> readonly>
		<br> Username:<input type="text" id="username" name="username"
			value=<%=((UserBean) request.getSession().getAttribute("userDetails")).getUsername()%> readonly>
		<br> Password:<input type="password" id="password" name="password"
			value=<%=((UserBean) request.getSession().getAttribute("userDetails")).getPassword()%> readonly>
		<br>
		<input type="submit" value="Submit">
	</form>
	
		<button onclick="edit()">Edit</button>


</body>
</html>