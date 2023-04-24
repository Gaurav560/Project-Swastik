package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;
import com.sun.javafx.binding.StringFormatter;

public class UserDao {
	private Connection conn;

	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean userRegister(User us) {
		boolean f = false;

		try {
			String sqlInsertQuery = "insert into user_Details(fullName,phoneNumber,email,password) values(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sqlInsertQuery);
			pstmt.setString(1, us.getFullName());
			pstmt.setString(2, us.getPhoneNumber());
			pstmt.setString(3, us.getEmail());
			pstmt.setString(4, us.getPassword());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				f = true;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;

	}

	public User loginUser(String email, String password) {

		User u = null;
		try {

			String queryString = "select * from user_details where email=? and password=?";
			PreparedStatement pstmt = conn.prepareStatement(queryString);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet rSet = pstmt.executeQuery();
			while (rSet.next()) {
				u = new User();
				u.setId(rSet.getInt(1));
				u.setFullName(rSet.getString(2));
				u.setPhoneNumber(rSet.getString(3));
				;
				u.setEmail(rSet.getString(4));
				u.setPassword(rSet.getString(5));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	public boolean checkOldPassword(int userId, String OldPassword) {

		boolean f = false;

		try {

			String queryString = "select * from user_details where id=? and password=? ";
			PreparedStatement pstmt = conn.prepareStatement(queryString);
			pstmt.setInt(1, userId);
			pstmt.setString(2, OldPassword);
			ResultSet rSet = pstmt.executeQuery();
			while (rSet.next()) {
				f = true;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;

	}

	public boolean updateOldPassword(int userId, String NewPassword) {

		boolean f = false;

		try {

			String queryString = "update user_details set password=? where id=?";
			PreparedStatement pstmt = conn.prepareStatement(queryString);
			pstmt.setString(1, NewPassword);
			pstmt.setInt(2, userId);
			int rowCOunt = pstmt.executeUpdate();
			if (rowCOunt == 1) {
				f = true;
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return f;

	}
}
