package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;
import dao.UserDetailDao;

public class UserDetailUpdateServlet extends HttpServlet {
	/**
	 * 
	 */
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

		HttpSession session = request.getSession(true);
		UserBean userBean = (UserBean) session.getAttribute("userDetails");
		if (!userBean.getFirstName().equalsIgnoreCase(firstName)) {
			UserDetailDao.updateDetails(userName, "FIRST_NAME", firstName);
		}
		if (!userBean.getLastName().equalsIgnoreCase(lastName)) {
			UserDetailDao.updateDetails(userName, "LAST_NAME", lastName);
		}
		if (!userBean.getAddress().equalsIgnoreCase(address)) {
			UserDetailDao.updateDetails(userName, "ADDRESS", address);
		}
		if (!userBean.getPhone().equalsIgnoreCase(phone)) {
			UserDetailDao.updateDetails(userName, "PHONE", phone);
		}
		if (!userBean.getEmail().equalsIgnoreCase(email)) {
			UserDetailDao.updateDetails(userName, "EMAIL", email);
		}
		if (!userBean.getUsername().equalsIgnoreCase(userName)) {
			UserDetailDao.updateDetails(userName, "USERNAME", userName);
		}
		if (!userBean.getRole().equalsIgnoreCase(role)) {
			UserDetailDao.updateDetails(userName, "ROLE", role);
		}
		if (!userBean.getPassword().equalsIgnoreCase(password)) {
			UserDetailDao.updateDetails(userName, "PASSWORD", password);
		}

	}
}