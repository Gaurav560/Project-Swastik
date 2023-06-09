<%@page import="com.dao.doctorDao"%>
<%@page import="com.entity.doctor"%>
<%@page import="com.entity.appointment"%>
<%@page import="java.util.List"%>
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
<title>Patient page</title>
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


	<%@include file="navbar.jsp"%>

	<div class="container-fluid p-3">
		<div class="row">

			<!--inside a row making a div of col-md-10  -->
			<div class="col-md-12 ">

				<!-- card inside the container  -->
				<div class="card paint-card mt-5 mb-5">



					<!--card body  -->
					<div class="card-body">



						<p class="text-center fs-3">Patient Details</p>


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
									<th scope="col">Doctor Name</th>
									<th scope="col">Address</th>
									<th scope="col">Status</th>

								</tr>
							</thead>
							<tbody>

								<!-- using the scriptlet tag to make appointmentDao object so that we can call the getAppointment Detail method 
							so that we can show the appointment details inside the table body  -->


								<%
									appointmentDao apDaaDao = new appointmentDao(DBConnect.getConnection());
								List<appointment> list= apDaaDao.getAppointmentDetails();
								doctorDao d1=new doctorDao(DBConnect.getConnection());
								
								
								//iska matlab hota hai ki for every object of appointment type in list 
								// hai uske liye iterate karo poora list .(x works as a reference variable for appointment
										
								for(appointment x:list){
									doctor d2=d1.fetchDoctorDetailsbyId(x.getDoctorId());
									
									%>
									
									
									<tr>

									<td><%=x.getFullName() %></td>
									<td><%=x.getGender()  %></td>
									<td><%=x.getAge()  %></td>
									<td><%=x.getAppointmentDate()  %></td>
									<td><%=x.getEmail()  %></td>
									<td><%=x.getNumber()  %></td>
									<td><%= x.getDisease() %></td>
									<td><%=d2.getFullName()  %></td>
									<td><%= x.getFullAddres() %></td>
									<td><%=x.getStatus()  %></td>
								</tr>
									
								<%}
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