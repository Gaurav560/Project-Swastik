package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.doctor;
import com.sun.jmx.snmp.SnmpStringFixed;

public class doctorDao {
	private Connection connection;

	public doctorDao(Connection connection) {
		super();
		this.connection = connection;
	}

	public boolean registerDoctor(doctor d) {
		boolean f = false;
		try {
			String sqlInsertQuery = "insert into doctor(fullName,dob,qualification,speciality,email,number,password) values(?,?,?,?,?,?,?)";
			PreparedStatement pstmt = connection.prepareStatement(sqlInsertQuery);
			pstmt.setString(1, d.getFullName());
			pstmt.setString(2, d.getDobirth());
			pstmt.setString(3, d.getQualification());
			pstmt.setString(4, d.getSpeciality());
			pstmt.setString(5, d.getEmail());
			pstmt.setString(6, d.getNumber());
			pstmt.setString(7, d.getPassword());

			int i = pstmt.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<doctor> fetchDoctorDetails() {
		List<doctor> list = new ArrayList<doctor>();
		doctor d = null;

		try {

			String queryString = "select * from doctor order by id desc";
			PreparedStatement pstmt = connection.prepareStatement(queryString);
			ResultSet rSet = pstmt.executeQuery();
			while (rSet.next()) {
				d = new doctor();
				d.setId(rSet.getInt(1));
				d.setFullName(rSet.getString(2));
				d.setDobirth(rSet.getString(3));
				d.setQualification(rSet.getString(4));
				d.setSpeciality(rSet.getString(5));
				d.setEmail(rSet.getString(6));
				d.setNumber(rSet.getString(7));
				d.setPassword(rSet.getString(8));
				list.add(d);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	public doctor fetchDoctorDetailsbyId(int id) {
		doctor d = null;
		try {

			String queryString = "select * from doctor where id=?";
			PreparedStatement pstmt = connection.prepareStatement(queryString);
			pstmt.setInt(1, id);
			ResultSet rSet = pstmt.executeQuery();
			while (rSet.next()) {
				d = new doctor();
				d.setId(rSet.getInt(1));
				d.setFullName(rSet.getString(2));
				d.setDobirth(rSet.getString(3));
				d.setQualification(rSet.getString(4));
				d.setSpeciality(rSet.getString(5));
				d.setEmail(rSet.getString(6));
				d.setNumber(rSet.getString(7));
				d.setPassword(rSet.getString(8));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return d;

	}

	public boolean updateDoctor(doctor d) {
		boolean f = false;
		try {
			String sqlUpdateQuery = "update doctor set fullName=?,dob=?,qualification=?,speciality=?,email=?,number=?,password=? where id=? ";
			PreparedStatement pstmt = connection.prepareStatement(sqlUpdateQuery);
			pstmt.setString(1, d.getFullName());
			pstmt.setString(2, d.getDobirth());
			pstmt.setString(3, d.getQualification());
			pstmt.setString(4, d.getSpeciality());
			pstmt.setString(5, d.getEmail());
			pstmt.setString(6, d.getNumber());
			pstmt.setString(7, d.getPassword());
			pstmt.setInt(8, d.getId());

			int i = pstmt.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public boolean deleteDoctor(int id) {

		boolean f = false;
		try {

			String deleteQueryString = "delete from doctor where id=?";
			PreparedStatement pstmt = connection.prepareStatement(deleteQueryString);
			pstmt.setInt(1, id);
			int i = pstmt.executeUpdate();

			if (i == 1) {
				f = true;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;

	}

	public doctor loginDoctor(String email, String password) {
		doctor d5 = null;

		try {

			String sqlQuery = "select * from doctor where email=? and password=?";
			PreparedStatement pstmt = connection.prepareStatement(sqlQuery);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet rSet = pstmt.executeQuery();
			while (rSet.next()) {
				d5 = new doctor();
				d5.setId(rSet.getInt(1));
				d5.setFullName(rSet.getString(2));
				d5.setDobirth(rSet.getString(3));
				d5.setQualification(rSet.getString(4));
				d5.setSpeciality(rSet.getString(5));
				d5.setEmail(rSet.getString(6));
				d5.setNumber(rSet.getString(7));
				d5.setPassword(rSet.getString(8));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return d5;

	}

	// method to count no of doctors
	public int countNoOfDoctors() {
		// local variable ko hamsea initialize karna hota hai .

		int i = 0;

		try {
			String queryString = "select * from doctor";
			PreparedStatement pstmtPreparedStatement = connection.prepareStatement(queryString);
			ResultSet rSet = pstmtPreparedStatement.executeQuery();
			while (rSet.next()) {
				i++;

			}
		} catch (Exception e) {

		}

		return i;

	}

	public int countNoOfUsers() {
		// local variable ko hamsea initialize karna hota hai .

		int i = 0;

		try {
			String queryString = "select * from user_details";
			PreparedStatement pstmtPreparedStatement = connection.prepareStatement(queryString);
			ResultSet rSet = pstmtPreparedStatement.executeQuery();
			while (rSet.next()) {
				i++;

			}
		} catch (Exception e) {

		}

		return i;

	}

	public int countNoOfAppointments() {
		// local variable ko hamsea initialize karna hota hai .

		int i = 0;

		try {
			String queryString = "select * from appointment";
			PreparedStatement pstmtPreparedStatement = connection.prepareStatement(queryString);
			ResultSet rSet = pstmtPreparedStatement.executeQuery();
			while (rSet.next()) {
				i++;

			}
		} catch (Exception e) {

		}

		return i;

	}

	public int countNoOfSpecialists() {
		// local variable ko hamsea initialize karna hota hai .

		int i = 0;

		try {
			String queryString = "select * from specialist";
			PreparedStatement pstmtPreparedStatement = connection.prepareStatement(queryString);
			ResultSet rSet = pstmtPreparedStatement.executeQuery();
			while (rSet.next()) {
				i++;

			}
		} catch (Exception e) {

		}

		return i;

	}

	public int countNoOfAppointmentsByDoctorId(int DocId) {
		// local variable ko hamsea initialize karna hota hai .

		int i = 0;

		try {
			String queryString = "select * from appointment where doctorId=? ";
			PreparedStatement pstmtPreparedStatement = connection.prepareStatement(queryString);
			pstmtPreparedStatement.setInt(1, DocId);
			ResultSet rSet = pstmtPreparedStatement.executeQuery();
			while (rSet.next()) {
				i++;

			}
		} catch (Exception e) {

		}

		return i;

	}

	// checking password and doctor details in doctor login page

	public boolean checkOldPassword(int userId, String OldPassword) {

		boolean f = false;

		try {

			String queryString = "select * from doctor where id=? and password=? ";
			PreparedStatement pstmt = connection.prepareStatement(queryString);
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

	// updating password and doctor details in doctor login page

	public boolean updateOldPassword(int userId, String NewPassword) {

		boolean f = false;

		try {

			String queryString = "update doctor set password=? where id=?";
			PreparedStatement pstmt = connection.prepareStatement(queryString);
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

	// updating doctor details in doctor panel
	public boolean updateDoctorinDoctorPanel(doctor d) {
		boolean f = false;
		try {
			String sqlUpdateQuery = "update doctor set qualification=?,speciality=?,number=?,password=? where id=? ";
			PreparedStatement pstmt = connection.prepareStatement(sqlUpdateQuery);

			pstmt.setString(1, d.getQualification());
			pstmt.setString(2, d.getSpeciality());
			pstmt.setString(3, d.getNumber());
			pstmt.setString(4, d.getPassword());
			pstmt.setInt(5, d.getId());

			int i = pstmt.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

}
