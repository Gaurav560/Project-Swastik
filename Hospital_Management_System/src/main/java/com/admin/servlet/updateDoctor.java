package com.admin.servlet;

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

@WebServlet("/updateDoctor")
public class updateDoctor extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		try {

			String fullName = request.getParameter("fullName");
			String dobString = request.getParameter("dob");
			String qualificationString = request.getParameter("qualification");
			String specialityString = request.getParameter("speciality");
			String emailString = request.getParameter("email");
			String numberString = request.getParameter("number");
			String passwordString = request.getParameter("password");
			int id=Integer.parseInt(request.getParameter("id"));

		    doctor d0cDoctor=new doctor(id, fullName, dobString, qualificationString, specialityString, emailString, numberString, passwordString);
			doctorDao dao = new doctorDao(DBConnect.getConnection());
			
			HttpSession session=request.getSession();
		if (dao.updateDoctor(d0cDoctor)) {
			session.setAttribute("sucMsg", "Doctor details updated successfully.");
			response.sendRedirect("admin/viewDoctor.jsp");
		}else {
			session.setAttribute("failMsg", "Oops! Something went wrong in the Server.");
			response.sendRedirect("admin/viewDoctor.jsp");
		}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
