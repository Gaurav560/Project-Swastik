<%@page import="java.util.ArrayList"%>
<%@page import="com.entity.doctor"%>
<%@page import="com.dao.doctorDao"%>
<%@page import="com.entity.specialist"%>
<%@page import="java.util.List"%>
<%@page import="com.Database.DBConnect"%>
<%@page import="com.dao.specialistDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>doctor page</title>
<%@include file="../component/allcss.jsp"%>
</head>
<style>
.paint-card {
	box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-webkit-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-moz-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
}

.back-img {
	background-image: url("../img/doc3.jpg");
	background-repeat: no-repeat;
	height: 100vh;
	width: 100v;
	background-size: cover;
}
.colour-class{

background-color: #92a8d1;

}
</style>
<body>
	<%@include file="navbar.jsp"%>
	<div class="container-fluid  back-img p-3">
		<div class="row">
			<div class="col-md-5 offset-md-4">
				<div class="card paint-card colour-class">
					<h3 class="text-center mt-1">Add Doctor</h3>
					<div class="card-body">
						<c:if test="${not empty sucMsg}">
							<p class="text-center text-success fs-3">${sucMsg}</p>
							<c:remove var="sucMsg" scope="session" />
						</c:if>


						<c:if test="${not empty failMsg}">
							<p class="text-center text-danger fs-3">${failMsg}</p>
							<c:remove var="failMsg" scope="session" />
						</c:if>
						<form action="../addDoctorServlet" method="post">
							<div class="form-row">

								<div class="form-group mb-2">
									<label for="inputEmail4">Full Name</label> <input type="text"
										required class="form-control" id="inputEmail4"
										placeholder=" full Name" name="fullName">
								</div>
								<div class="form-group mb-2">
									<label for="inputPassword4">Date of Birth</label> <input
										type="date" required class="form-control" id="inputPassword4"
										placeholder="enter Dob" name="dob">
								</div>

								<div class="form-group mb-2">
									<label for="inputAddress">Qualification</label> <input
										type="text" required class="form-control" id="inputAddress"
										placeholder="Highest Qualification" name="qualification">
								</div>
								<div class="input-group mb-2">
									<div class="input-group-prepend">
										<label class="input-group-text" for="inputGroupSelect01">Speciality</label>
									</div>
									<select class="custom-select" id="inputGroupSelect01"
										name="speciality">
										<option selected>Choose...</option>
										<%
											specialistDao sDao = new specialistDao(DBConnect.getConnection());
										List<specialist> list = sDao.getAllSpecialists();
										for (specialist s : list) {
										%>

										<option><%=s.getSpecialistName()%></option>


										<%
											}
										%>



									</select>
								</div>

								<div class="form-group mb-2">
									<label for="inputAddress">Email</label> <input type="email"
										required class="form-control" id="inputAddress"
										placeholder="email" name="email">
								</div>

								<div class="form-group mb-2">
									<label for="inputAddress">Mobile Number</label> <input
										type="number" required class="form-control" id="inputAddress"
										placeholder="mobile number" name="number">
								</div>
								<div class="form-group mb-2">
									<label for="inputAddress">Password</label> <input
										type="password" required class="form-control"
										id="inputAddress" placeholder="password" name="password">
								</div>
							</div>

							<button type="submit" class=" offset-md-4 btn btn-primary">Add Doctor</button>
						</form>
					</div>
				</div>


			</div>



		</div>




	</div>
		<%@include file="../component/footer.jsp"%>
</body>
</html>