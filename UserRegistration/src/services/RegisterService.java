package services;

import bean.UserBean;
import dao.RegisterDao;

public class RegisterService {

	String firstName;
	String lastName;
	String address;
	String phone;
	String email;
	String role;
	String userName;
	String password;
	public RegisterService(String firstName, String lastName, String address, String phone, String email, String role,
			String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.role = role;
		this.userName = username;
		this.password = password;
	}
	
	public void register() {
		UserBean userBean = new UserBean();

		userBean.setFirstName(firstName);
		userBean.setLastName(lastName);
		userBean.setAddress(address);
		userBean.setPhone(phone);
		userBean.setEmail(email);
		userBean.setRole(role);
		userBean.setUsername(userName);
		userBean.setPassword(password);
		RegisterDao registerDao = new RegisterDao();

		registerDao.registerUser(userBean);
	}
}
