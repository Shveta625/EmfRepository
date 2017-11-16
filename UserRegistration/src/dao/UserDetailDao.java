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
	public static int updateDetails(String username, String detail, String update) {

		int result = 0;
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps=con.prepareStatement("UPDATE REGISTERED_USERS SET " +detail+"=? WHERE USERNAME=?");
			ps.setString(1,update);
			ps.setString(2,username);
			result = ps.executeUpdate();
		} catch (Exception e) {

		}
		return result;
	}
}
