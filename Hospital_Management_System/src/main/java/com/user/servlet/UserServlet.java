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
import com.mysql.cj.Session;

@WebServlet("/User1")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		
		String fullName=request.getParameter("fullName");
	String phoneNumber=request.getParameter("number");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		User user=new User(fullName,phoneNumber,email,password);
		
		UserDao uDao=new UserDao(DBConnect.getConnection());
		HttpSession session=request.getSession();
		boolean f=uDao.userRegister(user);
		if (f) {
			session.setAttribute("sucMsg", "User Registered Successfully..");
			response.sendRedirect("signUp.jsp");
			
		}else {
			session.setAttribute("failMsg", "Oops! Something went wrong with the server....");
			response.sendRedirect("signUp.jsp");
		}
		
	} catch (Exception e) {
	e.printStackTrace();
	}
	}

}
