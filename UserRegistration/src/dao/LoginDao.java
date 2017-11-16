package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.LoginBean;
import util.ConnectionProvider;

public class LoginDao {

	public static ResultSet validate(LoginBean bean) {
		ResultSet rs = null;
		try {
			Connection con = ConnectionProvider.getCon();

			PreparedStatement ps = con
					.prepareStatement("select * from REGISTERED_USERS where USERNAME=? and PASSWORD=?");
			ps.setString(1, bean.getUsername());
			ps.setString(2, bean.getPassword());

			rs = ps.executeQuery();
		} catch (Exception e) {
		}
		return rs;
	}
}
