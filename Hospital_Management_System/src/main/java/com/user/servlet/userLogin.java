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
import com.entity.User;

@WebServlet("/userLogin")
public class userLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String emaiString=request.getParameter("email");
			String passwordString=request.getParameter("password");
			HttpSession session=request.getSession();
			
			UserDao uDao=new UserDao(DBConnect.getConnection());
			User user=uDao.loginUser(emaiString, passwordString);
			
			
			if (user!=null) {
				session.setAttribute("userObj",user);
				response.sendRedirect("user_appointment.jsp");
			}else {
				session.setAttribute("failMsg","Invalid email and Password..");
				response.sendRedirect("user_login.jsp");
			}
			
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
