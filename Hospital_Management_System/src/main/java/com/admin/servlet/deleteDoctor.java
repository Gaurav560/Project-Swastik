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


@WebServlet("/deleteDoctor")
public class deleteDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	try {
		int id=Integer.parseInt(request.getParameter("id"));

		doctorDao dao = new doctorDao(DBConnect.getConnection());
		
		HttpSession session=request.getSession();
	if (dao.deleteDoctor(id)) {
		session.setAttribute("sucMsg", "Doctor deleted successfully.");
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
