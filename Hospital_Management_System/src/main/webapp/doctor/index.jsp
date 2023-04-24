<%@page import="com.entity.doctor"%>
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
<title>Insert title here</title>
<%@include file="../component/allcss.jsp"%>
</head>
<style>
.paint-card {
	box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-webkit-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-moz-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
}

.back-img {
	background-image: url("../img/h17.jpg");
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

	<p class="text-center fs-2 p-5 fw-bold">Doctor Dashboard</p>

	<div class="container p-4">

		<div class="row">


			<!-- doctorDao ka object bana rahe hai taaki function ko 
			call kar sake jo dynamic count bataye doctor aur unke appointment ka  -->

			<%
			doctor d=(doctor)session.getAttribute("docObj");
			doctorDao dao=new doctorDao(DBConnect.getConnection());
			int docCount=dao.countNoOfDoctors();
			int appointmentCountOfEachDoctor=dao.countNoOfAppointmentsByDoctorId(d.getId());
			
			
			%>
			<div class="col-md-4 offset-md-1">
				<div class="card paint-card">
					<div class="card-body text-center text-success">
						<i class="fa fa-user-md fa-3x" aria-hidden="true"></i>
						<p class="fs-3 text-center">
							Doctor <br><%=docCount %>
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4 offset-md-1">
				<div class="card paint-card">
					<div class="card-body text-center text-primary">
						<i class="fa fa-user-md fa-3x" aria-hidden="true"></i>
						<p class="fs-3 text-center">
							Appointments <br><%=appointmentCountOfEachDoctor %>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>