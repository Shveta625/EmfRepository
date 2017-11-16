package services;

import java.sql.ResultSet;
import java.sql.SQLException;

import bean.LoginBean;
import bean.UserBean;
import dao.LoginDao;
	
public class LoginService {
	String username;
	String password;

	public LoginService(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserBean getUserBean() {
		LoginBean loginBean = new LoginBean();
		loginBean.setUsername(username);
		loginBean.setPassword(password);
		ResultSet rs=LoginDao.validate(loginBean);
		UserBean user=null;
		if (rs != null) {			
			user=new UserBean();
				try {
					if(rs.next()) {
						user.setFirstName(rs.getString("FIRST_NAME"));
						user.setLastName(rs.getString("LAST_NAME"));
						user.setAddress(rs.getString("ADDRESS"));
						user.setPhone(rs.getString("PHONE"));
						user.setEmail(rs.getString("EMAIL"));
						user.setRole(rs.getString("ROLE"));
						user.setUsername(rs.getString("USERNAME"));
						user.setPassword(rs.getString("PASSWORD"));
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return user;
	}

}
