package com.entity;

public class doctor {
	public doctor(int id, String fullName, String dobirth, String qualification, String speciality, String email,
			String number, String password) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.dobirth = dobirth;
		this.qualification = qualification;
		this.speciality = speciality;
		this.email = email;
		this.number = number;
		this.password = password;
	}


	private int id;
	private String fullName;
	private String dobirth;
	
	public doctor(int id, String qualification, String speciality, String number, String password) {
		super();
		this.id = id;
		this.qualification = qualification;
		this.speciality = speciality;
		this.number = number;
		this.password = password;
	}


	private String qualification;
	private String speciality;
	private String email;
	private String number;
	private String password;

	
	


	public doctor(String fullName, String dobirth, String qualification, String speciality, String email,
			String number, String password) {
		super();
		this.fullName = fullName;
		this.dobirth = dobirth;
		this.qualification = qualification;
		this.speciality = speciality;
		this.email = email;
		this.number = number;
		this.password = password;
	}


	public doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getDobirth() {
		return dobirth;
	}


	public void setDobirth(String dobirth) {
		this.dobirth = dobirth;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
}
