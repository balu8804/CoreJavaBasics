package com.java.singleton;

import java.io.*;
import java.sql.*;

public class DBCommunication {
	public static void main(String[] args) {
		try {
			// reading driver information from keyboard
			BufferedReader keyBoardReader = new BufferedReader(
					new InputStreamReader(System.in));

			System.out.print("Enter Driver Class Name: ");
			String driver = keyBoardReader.readLine();

			System.out.print("Enter URL: ");
			String url = keyBoardReader.readLine();

			System.out.print("Enter Username: ");
			String username = keyBoardReader.readLine();

			System.out.print("Enter Password: ");
			String password = keyBoardReader.readLine();

			System.out.println();

			// Creating JDBC objects to establish communication with DB
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username,
					password);
			System.out.println("Con subclass name =>  " + con);

			Statement stmt = con.createStatement();
			System.out.println("Stmt subclass name =>  " + stmt);

			String sql = "SELECT sno, sname, course, fee FROM student";

			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("RS subclass name =>  " + rs);

			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("RSMD subclass name =>  " + rsmd);

			System.out.println();

			// retrieving column names
			int noOfColumns = rsmd.getColumnCount();
			for (int columnIndex = 1; columnIndex <= noOfColumns; columnIndex++) {
				System.out.print("|" + rsmd.getColumnName(columnIndex) + "\t");
			}
			System.out.println("|");

			// retrieving row data
			int sno;
			String sname;
			String course;
			double fee;

			while (rs.next()) {
				sno = rs.getInt(1);
				sname = rs.getString(2);
				course = rs.getString(3);
				fee = rs.getDouble(4);

				System.out.println("|" + sno + "\t|" + sname + "\t|" + course
						+ "\t|" + fee + "\t|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}