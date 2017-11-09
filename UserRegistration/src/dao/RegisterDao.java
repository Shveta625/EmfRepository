package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.UserBean;
import util.ConnectionProvider;

public class RegisterDao {
	public String registerUser(UserBean registerBean) {
		String firstName = registerBean.getFirstName();
		String role = registerBean.getRole();
		String userName = registerBean.getUsername();
		String password = registerBean.getPassword();
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			con = ConnectionProvider.getCon();
			;
			String query = "Insert into REGISTERED_USERS (FIRST_NAME, ROLE, USERNAME, PASSWORD) values (?,?,?,?)"; 
			preparedStatement = con.prepareStatement(query); 
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, role);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, password);
			int i = preparedStatement.executeUpdate();
			if (i != 0)
				return "SUCCESS";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "FAILURE";
	}
}