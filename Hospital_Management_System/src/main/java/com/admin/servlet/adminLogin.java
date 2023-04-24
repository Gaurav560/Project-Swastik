package com.admin.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.User;
import com.sun.org.apache.bcel.internal.generic.NEW;

@WebServlet("/adminLogin1")
public class adminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
	String emaiString=request.getParameter("email");
	String passwordString=request.getParameter("password");
	HttpSession session=request.getSession();
	
	if ("admin123@gmail.com".equals(emaiString) && "Admin@123".equals(passwordString)) {
		session.setAttribute("adminObj",  new User());
		response.sendRedirect("admin/index.jsp");
	}else {
		session.setAttribute("failMsg","Invalid email and Password..");
		response.sendRedirect("admin_login.jsp");
	}
	
	
} catch (Exception e) {
e.printStackTrace();
}
	}

}
