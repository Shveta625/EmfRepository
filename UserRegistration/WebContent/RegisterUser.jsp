<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="obj" class="bean.UserBean" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<script>
		function validate() {
			alert(document.getElementById("firstName").value);
			var name = document.getElementById("firstName").value;
			var username = document.getElementById("username").value;
			var pwd = document.getElementById("password").value;
			var confPwd = document.getElementById("confPassword").value;
			if (firstName == null || firstName == "") {
				alert("FirstName can't be blank");
				return false;
			} else if (username == null || username == "") {
				alert("Username can't be blank");
				return false;
			} else if (pwd.length < 6) {
				alert("Password must be at least 6 characters long.");
				return false;
			} else if (pwd != confPwd) {
				alert("Confirm Password should match with the Password");
				return false;
			}
		}
	</script>

	<script>
		function showForm(a) {
			if (a == document.getElementById("form2")) {
				alert("abc: " + document.getElementById("form2").style.display == "none");
				document.getElementById("form1").style.display = "none";
				document.getElementById("form2").style.display = "block";
			} else {
				document.getElementById("form2").style.display = "none";
				document.getElementById("form3").style.display = "block";
			}

			alert("after: " + document.getElementById("form2").style.display == "none");
		}
	</script>

	<form id="form" action="RegisterUserServlet" method="post"
		onsubmit="return validate()">
		First name:<input type="text" id="firstName" name="firstName">
		<br> Role:<select>
			<option value="admin">Admin</option>
			<option value="user">User</option>
		</select>
		<br> Username:<input type="text" id="username" name="username">
		<br> Password:<input type="password" id="password"
			name="password"> <br> Confirm Password:<input
			type="password" id="confPassword" name="confPassword"> <br>
		<input type="Submit" value="Submit">
	</form>

</body>
</html>