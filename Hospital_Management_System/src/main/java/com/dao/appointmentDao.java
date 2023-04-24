package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import com.entity.appointment;

public class appointmentDao {
	private Connection con;

//use of constructor -it initializes default values to variables of a class when
	// object is created(it initializes the connection object )
	public appointmentDao(Connection con) {
		super();
		this.con = con;
	}

//	function to add new appointment in the database by passing the appointment object
	public boolean addAppointment(appointment ap) {
		boolean f = false;

		try {

			String insertString = "insert into appointment(user_id,fullName,gender,age,appointmentDate,email,number,disease,doctorId,fullAddress,status) values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(insertString);
			pstmt.setInt(1, ap.getUserid());
			pstmt.setString(2, ap.getFullName());
			pstmt.setString(3, ap.getGender());
			pstmt.setInt(4, ap.getAge());
			pstmt.setString(5, ap.getAppointmentDate());
			pstmt.setString(6, ap.getEmail());
			pstmt.setString(7, ap.getNumber());
			pstmt.setString(8, ap.getDisease());
			pstmt.setInt(9, ap.getDoctorId());
			pstmt.setString(10, ap.getFullAddres());
			pstmt.setString(11, ap.getStatus());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				f = true;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	// function to get appointment objects stored in list by userId (it will show
	// every appointment a user has made by his id)

	public List<appointment> getAppointmentDetailsByUserId(int userId) {
		List<appointment> list = new ArrayList<appointment>();
		appointment apn = null;

		try {
			String selectString = "select * from appointment  where user_id=?";
			PreparedStatement pstmt = con.prepareStatement(selectString);
			pstmt.setInt(1, userId);
			// in resultSet data comes in packed form .we have to always extract data from
			// resultSet

			ResultSet rSet = pstmt.executeQuery();
			while (rSet.next()) {
				apn = new appointment();
				apn.setId(rSet.getInt(1));
				apn.setUserid(rSet.getInt(2));
				apn.setFullName(rSet.getString(3));
				apn.setGender(rSet.getString(4));
				apn.setAge(rSet.getInt(5));
				apn.setAppointmentDate(rSet.getString(5));
				apn.setEmail(rSet.getString(7));
				apn.setNumber(rSet.getString(8));
				apn.setDisease(rSet.getString(9));
				apn.setDoctorId(rSet.getInt(10));
				apn.setFullAddres(rSet.getString(11));
				apn.setStatus(rSet.getString(12));
				list.add(apn);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	// function to get appointment objects stored in list by doctorId (it will show
	// every appointment a doctor has)

	public List<appointment> getAppointmentDetailsByDoctorId(int doctorId) {
		List<appointment> list = new ArrayList<appointment>();
		appointment apn = null;

		try {
			String selectString = "select * from appointment  where doctorId=?";
			PreparedStatement pstmt = con.prepareStatement(selectString);
			pstmt.setInt(1, doctorId);
			// in resultSet data comes in packed form .we have to always extract data from
			// resultSet

			ResultSet rSet = pstmt.executeQuery();
			while (rSet.next()) {
				apn = new appointment();
				apn.setId(rSet.getInt(1));
				apn.setUserid(rSet.getInt(2));
				apn.setFullName(rSet.getString(3));
				apn.setGender(rSet.getString(4));
				apn.setAge(rSet.getInt(5));
				apn.setAppointmentDate(rSet.getString(5));
				apn.setEmail(rSet.getString(7));
				apn.setNumber(rSet.getString(8));
				apn.setDisease(rSet.getString(9));
				apn.setDoctorId(rSet.getInt(10));
				apn.setFullAddres(rSet.getString(11));
				apn.setStatus(rSet.getString(12));
				list.add(apn);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

//	function to get appointment details in the form of appointment object of any individual just by injecting id 

	public appointment getAppointmentDetailsId(int Id) {

		appointment apn = null;

		try {
			String selectString = "select * from appointment  where id=?";
			PreparedStatement pstmt = con.prepareStatement(selectString);
			pstmt.setInt(1, Id);
			// in resultSet data comes in packed form .we have to always extract data from
			// resultSet

			ResultSet rSet = pstmt.executeQuery();
			while (rSet.next()) {
				apn = new appointment();
				apn.setId(rSet.getInt(1));
				apn.setUserid(rSet.getInt(2));
				apn.setFullName(rSet.getString(3));
				apn.setGender(rSet.getString(4));
				apn.setAge(rSet.getInt(5));
				apn.setAppointmentDate(rSet.getString(5));
				apn.setEmail(rSet.getString(7));
				apn.setNumber(rSet.getString(8));
				apn.setDisease(rSet.getString(9));
				apn.setDoctorId(rSet.getInt(10));
				apn.setFullAddres(rSet.getString(11));
				apn.setStatus(rSet.getString(12));

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return apn;

	}

//	function for updating the status when doctor will comment

	public boolean updateComment(int id, int docId, String comment) {
		boolean f = false;

		try {

			String updateQuery = "update appointment set status=? where id=? and doctorId=?";
			PreparedStatement pstmt = con.prepareStatement(updateQuery);
			pstmt.setString(1, comment);
			pstmt.setInt(2, id);
			pstmt.setInt(3, docId);
			int up = pstmt.executeUpdate();
			if (up == 1) {
				f = true;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;

	}

//	function to get appointment details in admin ->patient section 

	public List<appointment> getAppointmentDetails() {
		List<appointment> list11 = new ArrayList<appointment>();
		appointment apn = null;

		try {
			String selectString = "select * from appointment order by id desc";
			PreparedStatement pstmt = con.prepareStatement(selectString);

			// in resultSet data comes in packed form .we have to always extract data from
			// resultSet

			ResultSet rSet = pstmt.executeQuery();
			while (rSet.next()) {
				apn = new appointment();
				apn.setId(rSet.getInt(1));
				apn.setUserid(rSet.getInt(2));
				apn.setFullName(rSet.getString(3));
				apn.setGender(rSet.getString(4));
				apn.setAge(rSet.getInt(5));
				apn.setAppointmentDate(rSet.getString(5));
				apn.setEmail(rSet.getString(7));
				apn.setNumber(rSet.getString(8));
				apn.setDisease(rSet.getString(9));
				apn.setDoctorId(rSet.getInt(10));
				apn.setFullAddres(rSet.getString(11));
				apn.setStatus(rSet.getString(12));
				list11.add(apn);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return list11;

	}

}
