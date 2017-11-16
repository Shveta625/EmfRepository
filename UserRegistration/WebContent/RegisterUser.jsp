<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="obj" class="bean.UserBean" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<script>
		function validate() {
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
			if (a == "form2") {
				alert("abc: " + document.getElementById("form2").style.display == "none");
				document.getElementById("form1").style.display = "none";
				document.getElementById("form2").style.display = "block";
				document.getElementById("form3").style.display = "none";
			} else if (a == "form3"){
				document.getElementById("form1").style.display = "none";
				document.getElementById("form2").style.display = "none";
				document.getElementById("form3").style.display = "block";
			}  else if (a == "form1"){
				document.getElementById("form1").style.display = "block";
				document.getElementById("form2").style.display = "none";
				document.getElementById("form3").style.display = "none";
			}

			alert("after: " + document.getElementById("form2").style.display == "none");
		}
		
		function submitForms(){

			  $('#form2 :input').not(':submit').clone().hide().appendTo('#form1');
			  $('#form3 :input').not(':submit').clone().hide().appendTo('#form1');
			    document.getElementById("form1").submit();
		}
	</script>

	<form id="form1" action="RegisterUserServlet" method="post">
		First name:<input type="text" id="firstName" name="firstName">
		Last name:<input type="text" id="lastName" name="lastName">
		DOB:<input type="date" id="dob" name="dob">
		Age:<input type="number" id="age" name="age">
		
		<button type="button" onclick="showForm('form2')">Next</button>
	</form>
	<form id="form2" action="RegisterUserServlet" method="post">
		Address:<input type="text" id="address" name="address">
		Phone:<input type="text" id="phone" name="phone">
		Email:<input type="text" id="email" name="email">
		
		<button type="button" onclick="showForm('form1')">Previous</button>
		<button type="button" onclick="showForm('form3')">Next</button>
	</form>
	<form id="form3" action="RegisterUserServlet" method="post"
		onsubmit="submitForms()">
		<br> Role:<select id="role" name="role">
			<option value="admin">Admin</option>
			<option value="user">User</option>
		</select>
		<br> Username:<input type="text" id="username" name="username">
		<br> Password:<input type="password" id="password"
			name="password"> <br> Confirm Password:<input
			type="password" id="confPassword" name="confPassword"> <br>
			
		<button type="button" onclick="showForm('form2')">Previous</button>
		<input type="Submit" value="Submit">
	</form>

</body>
</html>