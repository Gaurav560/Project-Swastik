package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.specialist;

public class specialistDao {
private Connection connection;


public specialistDao(Connection connection) {
	super();
	this.connection = connection;
}


public boolean addSpecialist(String spec){
	boolean f=false;
	
	try {
		
		String insertSpecialistqueryString="insert into specialist(spec_name) value(?)";
		PreparedStatement pstmt=connection.prepareStatement(insertSpecialistqueryString);
		pstmt.setString(1, spec);
int i=pstmt.executeUpdate();
if (i==1) {
	f=true;
	
	
}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return f;
	
}
public List<specialist> getAllSpecialists(){
	List<specialist> list=new ArrayList<specialist>();
	specialist specialist=null;
	try {
		String sqlQuery="select * from specialist";
		PreparedStatement pstmt=connection.prepareStatement(sqlQuery);
		ResultSet rSet=pstmt.executeQuery();
		while (rSet.next()) {
			specialist=new specialist();
			
			specialist.setId(rSet.getInt(1));
			specialist.setSpecialistName(rSet.getString(2));
			list.add(specialist);
		}
	} catch (Exception e) {
	e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	return list;
	
	
}



}
