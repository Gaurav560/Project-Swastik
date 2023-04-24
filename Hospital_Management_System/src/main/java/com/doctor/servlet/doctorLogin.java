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

@WebServlet("/doctorLogin")
public class doctorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String emaiString = request.getParameter("email");
			String passwordString = request.getParameter("password");
			HttpSession session = request.getSession();

			doctorDao uDao = new doctorDao(DBConnect.getConnection());
			doctor doc = uDao.loginDoctor(emaiString, passwordString);

			if (doc != null) {
				session.setAttribute("docObj", doc);
				response.sendRedirect("doctor/index.jsp");
			} else {
				session.setAttribute("failMsg", "Invalid email and Password..");
				response.sendRedirect("doctor_login.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
