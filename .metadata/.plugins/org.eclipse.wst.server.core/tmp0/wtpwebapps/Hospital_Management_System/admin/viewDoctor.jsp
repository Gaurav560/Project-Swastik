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
	background-image: url("../img/hospital.jpg");
	background-repeat: no-repeat;
	height: 100vh;
	width: 100v;
	background-size: cover;
}
</style>
<body>
	<%@include file="navbar.jsp"%>
	<div class="container-fluid back-img p-3">
		<div class="row">


			<div class="col-md-10 offset-md-1">
				<div class="card paint-card mt-5">
					<div class="card-body">
						<c:if test="${not empty sucMsg}">
							<p class="text-center text-success fs-3">${sucMsg}</p>
							<c:remove var="sucMsg" scope="session" />
						</c:if>


						<c:if test="${not empty failMsg}">
							<p class="text-center text-danger fs-3">${failMsg}</p>
							<c:remove var="failMsg" scope="session" />
						</c:if>
						<p class="text-center fs-3">Doctor Details</p>
						<table class="table table-dark">
							<thead>
								<tr>
									<th scope="col">Name</th>
									<th scope="col">Dob</th>
									<th scope="col">Degree</th>
									<th scope="col">Speciality</th>
									<th scope="col">email</th>
									<th scope="col">phone No.</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>

								<%
									doctorDao dao2 = new doctorDao(DBConnect.getConnection());
								List<doctor> list2 = dao2.fetchDoctorDetails();
								for (doctor d : list2)

								{
								%>



								<tr>

									<td><%=d.getFullName()%></td>
									<td><%=d.getDobirth()%></td>
									<td><%=d.getQualification()%></td>
									<td><%=d.getSpeciality()%></td>
									<td><%=d.getEmail()%></td>
									<td><%=d.getNumber()%></td>
									<td><a href="editDoctor.jsp?id=<%=d.getId()%>"
										class="btn btn-sm btn-primary">Edit</a> <a
										href="../deleteDoctor?id=<%=d.getId()%>"
										class="btn btn-sm btn-danger">Delete</a></td>

								</tr>


								<%
									}
								%>


							</tbody>
						</table>

					</div>
				</div>


			</div>

		</div>




	</div>
	<%@include file="../component/footer.jsp"%>
</body>
</html>