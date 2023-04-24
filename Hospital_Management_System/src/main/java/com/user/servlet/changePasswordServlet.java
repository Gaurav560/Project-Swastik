package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Database.DBConnect;
import com.dao.UserDao;

@WebServlet("/changePassword")
public class changePasswordServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

//			getting old password and new password from changepassword.jsp
			String getOldPassword = request.getParameter("oldPassword");
			String newPasswordString = request.getParameter("NewPassword");
			int userId = Integer.parseInt(request.getParameter("userid"));

			UserDao uDao = new UserDao(DBConnect.getConnection());
			boolean f = uDao.checkOldPassword(userId, getOldPassword);
			HttpSession session;
			if (f)

			{

				if (uDao.updateOldPassword(userId, newPasswordString))

				{
		
					session = request.getSession();
					session.setAttribute("sucMsg", "Password  updated Successfully..."
						+"Please Login Again ");
					response.sendRedirect("user_login.jsp");

				}
				
				
				else 
				{
					session = request.getSession();
					session.setAttribute("failMsg", "OOps! Something went wrong on the server.");
					response.sendRedirect("changePassword.jsp");
				}

			}

			else 
			{
				session = request.getSession();
				session.setAttribute("failMsg", "Old Password Incorrect...");
				response.sendRedirect("changePassword.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
