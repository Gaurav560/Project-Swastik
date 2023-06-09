<%@page import="com.entity.doctor"%>
<%@page import="java.util.List"%>
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
<title>User Appointment</title>
<%@include file="component/allcss.jsp"%>
</head>
<style type="text/css">
.paint-card {
	box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-webkit-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-moz-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
}

.back-img {
	background-image: url("img/h3.jpg");
	background-repeat: no-repeat;
	height: 95vh;
	width: 100v;
	background-size: cover;
}

.wh {
	height: 80vh;
}
.colour-class{

background-color: #90caf9;

}
</style>
<body>
	<%@include file="component/navbar.jsp"%>

	<div class="container-fluid back-img mb-5"></div>

	<div class="container">
		<div class="row">
			<div class="col-md-5 mx-auto p-2">
				<div class="card paint-card">
					<img class="card-img-top wh" src="img/doc7.jpg"
						alt="Card image cap">
				</div>
			</div>
			<div class="col-md-6 mx-auto mb-3">

				<div class="card paint-card colour-class ">

					<div class="card-body">
						<h5 class="card-title text-center fs-3">Book An Appointment</h5>
						<c:if test="${not empty sucMsg}">
							<p class="text-center text-success fs-3">${sucMsg}</p>
							<c:remove var="sucMsg" scope="session" />
						</c:if>


						<c:if test="${not empty failMsg}">
							<p class="text-center text-danger fs-3">${failMsg}</p>
							<c:remove var="failMsg" scope="session" />
						</c:if>
						<form class="row g-3" action="addAppointment" method="post">
							<input type="hidden" name="userid" value="${userObj.id }">

							<div class="col-md-6 fs-5">
								<label for="inputEmail4">Full Name</label> <input required
									type="text" class="form-control" placeholder="Enter Full name"
									aria-label="First name" name="name">
							</div>

							<div class="col-md-6 fs-5 ">
								<label for="inputEmail4">Gender </label> <select required
									class="form-select" aria-label="Default select example"
									name="gender">
									<option value="">--select--</option>
									<option value="Male">Male</option>
									<option value="Female">Female</option>


								</select>
							</div>
							<div class="col-md-6 mb-2 fs-5">
								<label for="inputEmail4">Age</label> <input required
									type="number" class="form-control" placeholder="Enter Age"
									aria-label="First name" name="age">
							</div>
							<div class="col-md-6 mb-2 fs-5">
								<label for="inputEmail4">Appointment Date</label> <input
									required type="date" class="form-control"
									placeholder="Choose Date" aria-label="Last name" name="date">
							</div>
							<div class="col-md-6 mb-2 fs-5">
								<label for="inputEmail4">Email</label> <input required
									type="email" class="form-control" placeholder="Enter email"
									aria-label="First name" name="email">
							</div>
							<div class="col-md-6 mb-2 fs-5">
								<label for="inputEmail4">Phone Number</label> <input required
									type="number" class="form-control"
									placeholder="Enter Cell Number" aria-label="Last name"
									name="number">
							</div>
							<div class="col-md-6 mb-2 fs-5">
								<label for="inputEmail4">Disease</label> <input required
									type="text" class="form-control"
									placeholder="Enter symptoms or disease" aria-label="First name"
									name="disease">
							</div>
							<div class="col-md-6 mb-2 fs-5">
								<label for="inputEmail4"> Choose Doctor</label> <select required
									class="form-select" aria-label="Default select example"
									name="doctor">

									<option value="">--select--</option>

									<%
										doctorDao dao = new doctorDao(DBConnect.getConnection());
									List<doctor> li = dao.fetchDoctorDetails();
									for (doctor d : li) {
									%>


									<option value="<%=d.getId()%>"><%=d.getFullName()%>(<%=d.getSpeciality()%>)
									</option>


									<%
										}
									%>

								</select>
							</div>
							<div class="col-md-12">
								<label for="inputEmail4">Full Address</label> <input required
									type="text" class="form-control"
									placeholder="Enter full Address" aria-label="First name"
									name="address">


							</div>

							<c:if test="${empty userObj}">
								<a href="user_login.jsp"
									class="col-md-6 offset-md-3 btn btn-primary">Submit</a>

							</c:if>
							<c:if test="${not empty userObj }">

								<button type="submit" class="btn btn-dark offset-md-3  col-md-6">Book</button>
							</c:if>

						</form>

					</div>
				</div>

			</div>


		</div>



	</div>




	<%@include file="component/footer.jsp"%>
</body>
</html>