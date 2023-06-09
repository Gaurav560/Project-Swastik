<%@page import="com.dao.doctorDao"%>
<%@page import="com.entity.doctor"%>
<%@page import="com.entity.appointment"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.User"%>
<%@page import="com.Database.DBConnect"%>
<%@page import="com.dao.appointmentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Appointment</title>
<%@include file="component/allcss.jsp"%>
</head>
<style>

/* adding shadow to containers */
.paint-card {
	box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-webkit-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-moz-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
}

/* styling the background image  */
.back-img {
	background-image: url("img/h14.jpg");
	background-repeat: no-repeat;
	height: 95vh;
	width: 100v;
	background-size: cover;
}
</style>
<body>

	<c:if test="${empty userObj }">
		<c:redirect url="user_login.jsp">

</c:redirect>
	</c:if>

	<!-- NAVBAR -->
	<%@include file="component/navbar.jsp"%>




	<!-- background image  -->
	<div class="container-fluid back-img"></div>


	<div class="container-fluid">
		<div class="row">

			<!--inside a row making a div of col-md-10  -->
			<div class="col-md-10 offset-md-1">

				<!-- card inside the container  -->
				<div class="card paint-card mt-5 mb-5">



					<!--card body  -->
					<div class="card-body">



						<p class="text-center fs-3">Appointment Details</p>

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
									<th scope="col">Address</th>
									<th scope="col">Doctor's Name</th>
									<th scope="col">Status</th>
								</tr>
							</thead>
							<tbody>

								<!-- using the scriptlet tag to make appointmentDao object so that we can call the getAppointment Detail method 
							so that we can show the appointment details inside the table body  -->
								<%
									User u = (User)session.getAttribute("userObj");

								appointmentDao aDaoo = new appointmentDao(DBConnect.getConnection());
								doctorDao dDao = new doctorDao(DBConnect.getConnection());
								List<appointment> li = aDaoo.getAppointmentDetailsByUserId(u.getId());
								for (appointment a : li) {
									doctor d = dDao.fetchDoctorDetailsbyId(a.getDoctorId());
								%>
								<tr>

									<td><%=a.getFullName() %></td>
									<td><%=a.getGender() %></td>
									<td><%=a.getAge() %></td>
									<td><%=a.getAppointmentDate() %></td>
									<td><%=a.getEmail() %></td>
									<td><%=a.getNumber() %></td>
									<td><%=a.getDisease() %></td>
									<td><%=a.getFullAddres() %></td>
									<td><%=d.getFullName() %></td>
								
									<td>
										<%
								if("pending".equals(a.getStatus())){
									%> <a href="#" class="btn btn-sm btn-warning">Pending</a> 
									<%}
								else{%>
								<%=a.getStatus() %>
							<%} %>
									</td>
								</tr>
									
								<%} %>







							</tbody>
						</table>
						<!-- table ends here -->
					</div>
				</div>


			</div>

		</div>




	</div>
	<!-- including  the footer file -->
	<%@include file="../component/footer.jsp"%>
</body>
</html>