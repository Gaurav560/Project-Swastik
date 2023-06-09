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
<title>Edit Doctor Profile</title>
<%@include file="../component/allcss.jsp"%>
</head>
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
.colour-class{

background-color: #90caf9;

}
</style>
<body class="back-img">

	<c:if test="${empty docObj }">
		<c:redirect url="../doctor_login.jsp"></c:redirect>
	</c:if>

	<%@include file="navbar.jsp"%>

	<p class="text-center fs-2 mt-3 fw-bold text-light">Edit Your
		Profile</p>

	<div class="container-fluid">
		<div class="row pb-5 pt-2">

			<div class="card col-md-4 offset-md-1 paint-card  colour-class">






				<div class="card-title text-center fs-2  p-2">Change Password</div>
				<c:if test="${not empty sucMsg}">
					<p class="text-center text-success fs-4">${sucMsg}</p>
					<c:remove var="sucMsg" scope="session" />
				</c:if>



				<c:if test="${not empty failMsg}">
					<p class="text-center text-danger fs-4">${failMsg}</p>
					<c:remove var="failMsg" scope="session" />
				</c:if>

				<div class="card-body">

					<!-- inserting form  -->
					<form action="../changePasswordDoc" method="post">
						<div class="mb-3">

							<input type="hidden" name="docid" value="${docObj.id}"> <label
								for="exampleInputEmail1" class="form-label fs-5">Enter
								Old Password</label> <input type="password" class="form-control"
								id="exampleInputEmail1" aria-describedby="emailHelp"
								name="oldPassword">

						</div>
						<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label fs-5">Enter
								New Password</label> <input type="password" class="form-control"
								id="exampleInputPassword1" name="NewPassword">
							<div id="emailHelp" class="form-text">We'll never share
								your password with anyone else.</div>
						</div>



						<!--getting userid and sending to changePassword Servlet   -->



						<input type="hidden" name="docid" value="${docObj.id}">

						<button type="submit" class="btn btn-primary offset-md-4">Submit</button>
					</form>



				</div>

			</div>


			<!--card for editing doctor profile   -->


			<div class="col-md-5 mx-5">
				<div class="card paint-card colour-class">

					<div class="card-title text-center fs-2  p-2">Edit your
						Profile</div>
					<div class="card-body">




						<c:if test="${not empty sucMsgd}">
							<p class="text-center text-success fs-3">${sucMsgd}</p>
							<c:remove var="sucMsgd" scope="session" />
						</c:if>


						<c:if test="${not empty failMsgd}">
							<p class="text-center text-danger fs-3">${failMsgd}</p>
							<c:remove var="failMsgd" scope="session" />
						</c:if>



						<!-- form starts here -->


						<form action="../updateDoctorDetails" method="post">
							<div class="form-row">
								<input type="hidden" name="docid" value="${docObj.id}">
								<div class="form-group mb-2">
									<label for="inputEmail4">Full Name</label> <input type="text"
										readonly required class="form-control" id="inputEmail4"
										placeholder=" full Name" name="fullName"
										value="${docObj.fullName }">
								</div>
								<div class="form-group mb-2">
									<label for="inputPassword4">Date of Birth</label> <input
										type="date" readonly required class="form-control"
										id="inputPassword4" placeholder="enter Dob" name="dob"
										value="${docObj.dobirth }">
								</div>

								<div class="form-group mb-2">
									<label for="inputAddress">Qualification</label> <input
										type="text" required class="form-control" id="inputAddress"
										placeholder="Highest Qualification" name="qualification"
										value="${docObj.qualification }">
								</div>
								<div class="input-group mb-2">
									<div class="input-group-prepend">
										<label class="input-group-text" for="inputGroupSelect01">Speciality</label>
									</div>
									<select class="custom-select" id="inputGroupSelect01"
										name="speciality">
										<option selected>${docObj.speciality }</option>
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
									<label for="inputAddress02">Email</label> <input type="email"
										readonly required class="form-control" id="inputAddress02"
										placeholder="email" name="email" value="${docObj. email }">
								</div>

								<div class="form-group mb-2">
									<label for="inputAddress05">Mobile Number</label> <input
										type="number" required class="form-control"
										id="inputAddress05" placeholder="mobile number" name="number"
										value="${docObj.number }">
								</div>
								<div class="form-group mb-2">
									<label for="inputpassword">Password</label> <input
										type="password" required class="form-control"
										id="inputpassword" placeholder="mobile number" name="password"
										value="${docObj.password }">
								</div>

							</div>

							<button type="submit" class=" offset-md-4 btn btn-primary">Update
							</button>
						</form>



					</div>

				</div>


			</div>

		</div>
	</div>
</body>
</html>