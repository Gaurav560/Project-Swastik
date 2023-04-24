package com.entity;

public class specialist {
private int id;
private String specialistName;
public specialist() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSpecialistName() {
	return specialistName;
}
public void setSpecialistName(String specialistName) {
	this.specialistName = specialistName;
}
public specialist(int id, String specialistName) {
	super();
	this.id = id;
	this.specialistName = specialistName;
}
}
