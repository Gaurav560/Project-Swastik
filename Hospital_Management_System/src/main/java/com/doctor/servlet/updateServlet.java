package com.doctor.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Database.DBConnect;
import com.dao.appointmentDao;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			// getting appointment id,doctor id and comment made by doctor from comment form
			// through request object
			
			
			int appointmentId = Integer.parseInt(request.getParameter("aid"));
			int doctorId = Integer.parseInt(request.getParameter("did"));
			String doctorComment = request.getParameter("comment");

			
			
			// creating appointmentDao object and calling update Comment method to update
			// the comment made by Doctor
			
			
			appointmentDao appDao = new appointmentDao(DBConnect.getConnection());
			boolean f = appDao.updateComment(appointmentId, doctorId, doctorComment);

			
			
			// creating a session object to store the information which can be retrieved on
			// jsp pages
			
			
			HttpSession session = request.getSession();
			if (f==true) {
				
				session.setAttribute("sucMsg", "Comment Updated Successfully..");
				response.sendRedirect("doctor/patient.jsp");
			} else {
				
				session.setAttribute("failMsg", "Something went wrong on the server....");
				response.sendRedirect("doctor/patient.jsp");
			}

			
			
			
			// handling the exception

			// Null Pointer exception thrown at runtime when u are trying to convert a
			// string to int through Integer.parseInt
			
			
			
		} catch (NullPointerException Ne) {
			Ne.printStackTrace();

			// handling the general exception
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
