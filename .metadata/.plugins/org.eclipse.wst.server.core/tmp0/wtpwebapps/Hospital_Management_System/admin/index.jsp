<%@page import="com.Database.DBConnect"%>
<%@page import="com.dao.doctorDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Index Page</title>
<%@include file="../component/allcss.jsp"%>
<style>
.paint-card {
	box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-webkit-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-moz-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
}
.back-img {
	background-image: url("../img/h23.jpg");
	background-repeat: no-repeat;
	height: 95vh;
	width: 100v;
	background-size: cover;
}
</style>
</head>
<body class="back-img">
	<%@include file="navbar.jsp"%>
	<c:if test="${empty adminObj}">
		<c:redirect url="../admin_login.jsp"></c:redirect>
	</c:if>

	<c:if test="${not empty sucMsg}">
		<p class="text-center text-primary fs-3">${sucMsg}</p>
		<c:remove var="sucMsg" scope="session" />
	</c:if>


	<c:if test="${not empty failMsg}">
		<p class="text-center text-danger fs-3">${failMsg}</p>
		<c:remove var="failMsg" scope="session" />
	</c:if>



	<!--  making doctorDao object to call functions to count no of doctors,appointments,users and specialist-->
	<%
	
	doctorDao dao=new doctorDao(DBConnect.getConnection());
	int noOfAppointments=dao.countNoOfAppointments();
	int noOfDoctors=dao.countNoOfDoctors();
	int noOfSpecialist=dao.countNoOfSpecialists();
	int noOfUsers=dao.countNoOfUsers();
	
	
	%>
	<div class="container-fluid p-5 text-center">

		<h1 class="text-success">
			<i class="fa-solid fa-user"></i> Admin Dashboard
		</h1>
		<div class="row p-3">
			<div class="col-md-4 mt-3">
				<div class="card paint-card">
					<div class="card-body">
						<i class="fa-solid fa-person-half-dress fa-4x"></i><br>
						<h4 class="card-title text-primary">
							Patient<br><%=noOfUsers %>
						</h4>

					</div>
				</div>
			</div>
			<div class="col-md-4 mt-3">
				<div class="card paint-card">
					<div class="card-body">
						<i class="fas fa-user-md fa-4x"></i><br>
						<h4 class="card-title text-primary">
							Doctors<br><%=noOfDoctors %>
						</h4>

					</div>
				</div>
			</div>




			<div class="col-md-4 mt-3">
				<div class="card paint-card">
					<div class="card-body">
						<i class="fa-solid fa-calendar-check fa-4x"></i><br>
						<h4 class="card-title text-primary">
							Total Appointments<br><%=noOfAppointments %>
						</h4>

					</div>
				</div>
			</div>


			<div class="col-md-4 mt-4 offset-md-4" data-toggle="modal"
				data-target="#exampleModal">
				<div class="card paint-card">
					<div class="card-body">
						<i class="fas fa-user-md fa-4x"></i><br>
						<h4 class="card-title text-primary">
							Specialists<br><%=noOfSpecialist %>
						</h4>


					</div>
				</div>
			</div>


		</div>
	</div>





	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Add Specialist</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">

					<form action="../addSpecialist" method="post">
						<div class="form-group fw-bold">
							<label for="exampleInputEmail1">Specialist Name</label> <input
								type="text" class="form-control mt-2"
								placeholder="Enter specialist Name" name="specName">

						</div>


						<button type="submit" class="btn btn-primary mt-3 ">Add</button>
					</form>




				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>

				</div>
			</div>
		</div>
	</div>






	<%@include file="../component/footer.jsp"%>
</body>
</html>