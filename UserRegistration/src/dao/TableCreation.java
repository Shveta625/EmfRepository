package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import util.ConnectionProvider;

public class TableCreation {

	public static void main(String[] args) {
		Connection conn = ConnectionProvider.getCon();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();

			String sql = "CREATE TABLE REGISTERED_USERS " + "( FIRST_NAME VARCHAR(255), " + " LAST_NAME VARCHAR(255), " + " DOB DATE, " + " AGE INTEGER, "
					+ " ADDRESS VARCHAR(255), " + " PHONE VARCHAR(12), " + " EMAIL VARCHAR(255), "
					+ " ROLE VARCHAR(255), " + " USERNAME VARCHAR(255), " + " PASSWORD VARCHAR(255), "
					+ " PRIMARY KEY ( USERNAME ))";

			stmt.executeUpdate(sql);
			sql = "Insert into REGISTERED_USERS (FIRST_NAME, LAST_NAME, DOB, AGE, ADDRESS, PHONE, EMAIL, ROLE, "
					+ "USERNAME, PASSWORD) VALUES ('Shveta', 'Patyal', '1992-07-25', 25, 'abc',"
					+ " '9999999999', 'shveta625@gmail.com','admin', 'admin', 'admin')";

			stmt.executeUpdate(sql);
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

}
