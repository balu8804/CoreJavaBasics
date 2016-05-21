package com.java.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSingleton {

	static JDBCSingleton jdbc;

	JDBCSingleton() {

	}

	JDBCSingleton getInstance() {
		if (jdbc == null) {
			jdbc = new JDBCSingleton();
		}
		return jdbc;
	}

	static Connection getConnection() throws ClassNotFoundException, SQLException {
		try {
             String url="jdbc:mysql://localhost:3305/root?autoReconnect=true&useSSL=false";
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, "root", "password");
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("Select * from userdata");

		} catch (Exception e) {
			System.out.println("error");
			

		}
		return getConnection();
	}

	public static int insert(String name,String password) throws SQLException {
		Connection c = null;

		PreparedStatement ps = null;

		int recordCounter = 0;

		try {

			c = getConnection();
			ps = c.prepareStatement("insert into userdata(UserName,UserPassword)values(?,?)");
			ps.setString(1, name);
			ps.setString(2, password);
			recordCounter = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (c != null) {
				c.close();
			}
		}
		return recordCounter;
	}

	// to view the data from the database
	public void view(String name) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			con = this.getConnection();
			ps = con.prepareStatement("select * from userdata where uname=?");
			ps.setString(1, name);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Name= " + rs.getString(2) + "\t"
						+ "Paasword= " + rs.getString(3));

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}

	// to update the password for the given username
	public int update(String name, String password) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;

		int recordCounter = 0;
		try {
			c = this.getConnection();
			ps = c.prepareStatement(" update userdata set =? where uname='"
					+ name + "' ");
			ps.setString(1, password);
			recordCounter = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (ps != null) {
				ps.close();
			}
			if (c != null) {
				c.close();
			}
		}
		return recordCounter;
	}

	// to delete the data from the database
	public int delete(int userid) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;
		int recordCounter = 0;
		try {
			c = this.getConnection();
			ps = c.prepareStatement(" delete from userdata where uid='"
					+ userid + "' ");
			recordCounter = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (c != null) {
				c.close();
			}
		}
		return recordCounter;
	}

	public static void main(String[] args) throws SQLException {
		insert("root","password");

	}

}
