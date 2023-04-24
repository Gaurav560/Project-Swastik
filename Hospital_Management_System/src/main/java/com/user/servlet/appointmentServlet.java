package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Database.DBConnect;
import com.dao.appointmentDao;
import com.entity.appointment;

@WebServlet("/addAppointment")
public class appointmentServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// id-autoincrement hai aur status field nahi hai jo databse mein diye hain

		try {
			int userId = Integer.parseInt(request.getParameter("userid"));
			String fullName = request.getParameter("name");
			String gender = request.getParameter("gender");
			int age = Integer.parseInt(request.getParameter("age"));
			String appointmentDate = request.getParameter("date");
			String emial = request.getParameter("email");
			String number = request.getParameter("number");
			String disease = request.getParameter("disease");
			int doctorId = Integer.parseInt(request.getParameter("doctor"));
			String address = request.getParameter("address");

			appointment app = new appointment(userId, fullName, gender, age, appointmentDate, emial, number, disease,
					doctorId, address, "pending");
			appointmentDao apDao = new appointmentDao(DBConnect.getConnection());
			HttpSession session = request.getSession();
			if (apDao.addAppointment(app)) {
				session.setAttribute("sucMsg", "appointment created successfully...");
				response.sendRedirect("user_appointment.jsp");
			} else {
				session.setAttribute("failMsg", "Oops! Something went wrong on the server...");
				response.sendRedirect("user_appointment.jsp");

			}

		} catch (NumberFormatException ne) {
			ne.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
