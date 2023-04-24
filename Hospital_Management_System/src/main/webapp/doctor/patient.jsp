<%@page import="com.dao.doctorDao"%>
<%@page import="com.entity.doctor"%>
<%@page import="com.entity.appointment"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.User"%>
<%@page import="com.Database.DBConnect"%>
<%@page import="com.dao.appointmentDao"%>

<%@page import="com.entity.doctor"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Details</title>
<%@include file="../component/allcss.jsp"%>
</head>

<style>
.paint-card {
	box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-webkit-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-moz-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
}

.back-img {
	background-image: url("../img/h19.jpg");
	background-repeat: no-repeat;
	height: 95vh;
	width: 100v;
	background-size: cover;
}
</style>

<body class="back-img">
	<c:if test="${empty docObj }">
		<c:redirect url="../doctor_login.jsp"></c:redirect>
	</c:if>


	<%@include file="navbar.jsp"%>




	<div class="container-fluid p-3">
		<div class="row">

			<!--inside a row making a div of col-md-10  -->
			<div class="col-md-10 offset-md-1">

				<!-- card inside the container  -->
				<div class="card paint-card mt-5 mb-5">



					<!--card body  -->
					<div class="card-body">



						<p class="text-center fs-3">Patient Details</p>

						<!--  to print successful i-->
						<c:if test="${not empty sucMsg}">
							<p class="text-center text-success fs-3">${sucMsg}</p>
							<c:remove var="sucMsg" scope="session" />
						</c:if>


						<c:if test="${not empty failMsg}">
							<p class="text-center text-danger fs-3">${failMsg}</p>
							<c:remove var="failMsg" scope="session" />
						</c:if>

						<!--  adding a table inside the card body-->
						<table class="table table-dark">
							<thead>
								<tr>
									<th scope="col">Name</th>
									<th scope="col">Gender</th>
									<th scope="col">Age</th>
									<th scope="col">Date(App.)</th>
									<th scope="col">email</th>
									<th scope="col">cell No.</th>
									<th scope="col">Disease</th>
									<th scope="col">Status</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>

								<!-- using the SCRIPTLET tag to make appointmentDao object so that we can call the getAppointment Detail method 
							so that we can show the appointment details inside the table body  -->
								<%
									doctor d = (doctor) session.getAttribute("docObj");

								appointmentDao aDao1 = new appointmentDao(DBConnect.getConnection());
								doctorDao dDao = new doctorDao(DBConnect.getConnection());
								List<appointment> li = aDao1.getAppointmentDetailsByDoctorId(d.getId());
								for (appointment a1 : li) {
								%>
								<tr>

									<td><%=a1.getFullName()%></td>
									<td><%=a1.getGender()%></td>
									<td><%=a1.getAge()%></td>
									<td><%=a1.getAppointmentDate()%></td>
									<td><%=a1.getEmail()%></td>
									<td><%=a1.getNumber()%></td>
									<td><%=a1.getDisease()%></td>
									<td><%=a1.getStatus()%></td>
									
									<%
									
									if("pending".equals(a1.getStatus())){%>
										<!--URL rewriting  -->
										<td><a href="comment.jsp?Idd=<%=a1.getId()%>"
												class="btn btn-success btn-sm"><i
													class="fa-solid fa-comment"></i> Comment</a></td>

										
								<% 	}
									else{
									%>
										<td><a href="comment.jsp?Idd=<%=a1.getId()%>"
										class="btn btn-success btn-sm"><i
											class="fa-solid fa-comment"></i> Comment</a></td>
									<% }
									%>
								

								</tr>

								<%
									}
								%>


							</tbody>
						</table>
						<!-- table ends here -->
					</div>
				</div>


			</div>

		</div>




	</div>
</body>
</html>