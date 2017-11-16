package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.RegisterService;

public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		request.getParameter("dob");
		request.getParameter("age");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String role = request.getParameter("role");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		RegisterService registerService = new RegisterService(firstName, lastName, address, phone, email, role,
				userName, password);
		registerService.register();
	}
}