package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Database.DBConnect;
import com.dao.specialistDao;
@WebServlet("/addSpecialist")
public class addSpecialist extends HttpServlet{


	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String specName=request.getParameter("specName");
		specialistDao sp=new specialistDao(DBConnect.getConnection());
		boolean f=sp.addSpecialist(specName);
		HttpSession session=request.getSession();
		if (f) {
			session.setAttribute("sucMsg","Specialist added successfully.");
			response.sendRedirect("admin/index.jsp");
		}else {
			session.setAttribute("failMsg","Something went wrong on the server.");
			response.sendRedirect("admin/index.jsp");
		}
	}

}
