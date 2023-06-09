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

@WebServlet("/changePasswordDoc")
public class doctorPasswordChangeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

//			getting old password and new password from changepassword.jsp
			String getOldPassword = request.getParameter("oldPassword");
			String newPasswordString = request.getParameter("NewPassword");
			int userId = Integer.parseInt(request.getParameter("docid"));

			doctorDao dao = new doctorDao(DBConnect.getConnection());
			boolean f = dao.checkOldPassword(userId, getOldPassword);
			HttpSession session;
			if (f)

			{

				if (dao.updateOldPassword(userId, newPasswordString))

				{

					session = request.getSession();
					session.setAttribute("sucMsg", "Password  updated Successfully." );
					response.sendRedirect("doctor/editProfile.jsp");

				}

				else {
					session = request.getSession();
					session.setAttribute("failMsg", "OOps! Something went wrong on the server.");
					response.sendRedirect("doctor/editProfile.jsp");
				}

			}

			else {
				session = request.getSession();
				session.setAttribute("failMsg", "Old Password Incorrect...");
				response.sendRedirect("doctor/editProfile.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
