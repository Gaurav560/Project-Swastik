package com.doctor.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Database.DBConnect;
import com.dao.doctorDao;
import com.entity.doctor;


@WebServlet("/updateDoctorDetails")
public class editDoctorDetailsInDoctorProfile extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		try {

	
			String qualificationString = request.getParameter("qualification");
			String specialityString = request.getParameter("speciality");
			String numberString = request.getParameter("number");
			String passwordString = request.getParameter("password");
			int id=Integer.parseInt(request.getParameter("docid"));

		    doctor d0cDoctor=new doctor(id, qualificationString, specialityString, numberString, passwordString);
			doctorDao dao=new doctorDao(DBConnect.getConnection());
			HttpSession session=request.getSession();
		if (dao.updateDoctorinDoctorPanel(d0cDoctor)) {
			session.setAttribute("sucMsgd", "Doctor details updated successfully");
			response.sendRedirect("doctor/editProfile.jsp");
		}else {
			session.setAttribute("failMsgd", "Oops! Something went wrong in the Server.");
			response.sendRedirect("doctor/editProfile.jsp");
		}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}


}
