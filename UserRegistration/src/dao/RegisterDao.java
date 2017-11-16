package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.UserBean;
import util.ConnectionProvider;

public class RegisterDao {
	public String registerUser(UserBean registerBean) {
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			con = ConnectionProvider.getCon();
			;
			String query = "Insert into REGISTERED_USERS (FIRST_NAME, LAST_NAME, ADDRESS, PHONE, EMAIL, ROLE, USERNAME, PASSWORD) values (?,?,?,?,?,?,?,?)"; 
			preparedStatement = con.prepareStatement(query); 
			preparedStatement.setString(1, registerBean.getFirstName());
			preparedStatement.setString(2, registerBean.getLastName());
			preparedStatement.setString(3, registerBean.getAddress());
			preparedStatement.setString(4, registerBean.getPhone());
			preparedStatement.setString(5, registerBean.getEmail());
			preparedStatement.setString(6, registerBean.getRole());
			preparedStatement.setString(7, registerBean.getUsername());
			preparedStatement.setString(8, registerBean.getPassword());
			int i = preparedStatement.executeUpdate();
			if (i != 0)
				return "SUCCESS";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "FAILURE";
	}
}