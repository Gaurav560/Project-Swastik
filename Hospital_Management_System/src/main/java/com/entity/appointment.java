package com.entity;

public class appointment {

	private int id;
	private int userid;
	private String fullName;
	private String gender;
	private int age;
	private String appointmentDate;
	private String email;
	private String number;
	private String disease;
	private int doctorId;
	private String fullAddres;
	private String status;

	public appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public appointment(int userid, String fullName, String gender, int age, String appointmentDate, String email,
			String number, String disease, int doctorId, String fullAddres, String status) {
		super();
		this.userid = userid;
		this.fullName = fullName;
		this.gender = gender;
		this.age = age;
		this.appointmentDate = appointmentDate;
		this.email = email;
		this.number = number;
		this.disease = disease;
		this.doctorId = doctorId;
		this.fullAddres = fullAddres;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getFullAddres() {
		return fullAddres;
	}

	public void setFullAddres(String fullAddres) {
		this.fullAddres = fullAddres;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
