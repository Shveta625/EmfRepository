package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.ConnectionProvider;

public class UserDetailDao {
	public static ResultSet getUserDetails(String username) {

		ResultSet rs = null;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps=con.prepareStatement("select * from REGISTERED_USERS where USERNAME=?");
			ps.setString(1,username);
			rs = ps.executeQuery();
		} catch (Exception e) {

		}
		return rs;
	}
}
