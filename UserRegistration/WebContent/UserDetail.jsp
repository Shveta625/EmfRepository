<%@page import="org.apache.tomcat.jni.User"%>
<%@page import="bean.UserBean"%>
<%@page import="dao.UserDetailDao"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="dao.LoginDao"%>
<!DOCTYPE html>
<html>
 <link type="text/css" rel="stylesheet" href="Style.css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
	function edit(){
		document.getElementById("firstName").readOnly = false;
		document.getElementById("lastName").readOnly = false;
		document.getElementById("address").readOnly = false;
		document.getElementById("phone").readOnly = false;
		document.getElementById("email").readOnly = false;
		document.getElementById("username").readOnly = false;
		document.getElementById("password").readOnly = false;
		document.getElementById("submit").style.display = "block";
	}
	</script>

	<h2 class="heading">User Details</h2>
	<button onclick="edit()" style="margin-left: 200px">Edit detail</button>
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
		<input type="submit" value="Submit" id="submit" style="display: none;">
	</form>
	
</body>
</html>