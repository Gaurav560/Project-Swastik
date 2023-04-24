<%@page import="com.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password Of User</title>
<%@include file="../component/allcss.jsp"%>
</head>
<style>
.paint-card {
	box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-webkit-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-moz-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
}

.back-img {
	background-image: url("img/h21.jpg");
	background-repeat: no-repeat;
	height: 95vh;
	width: 100v;
	background-size: cover;
}
</style>
<body class="back-img">


	<c:if test="${empty userObj }">
		<c:redirect url="user_login.jsp">

		</c:redirect>
	</c:if>

	<%@include file="component/navbar.jsp"%>



	<!-- card -->
	<div class="card col-md-4 offset-md-4 p-4 mt-4 paint-card">

		<c:if test="${not empty sucMsg}">
			<p class="text-center text-success fs-4">${sucMsg}</p>
			<c:remove var="sucMsg" scope="session" />
		</c:if>



		<c:if test="${not empty failMsg}">
			<p class="text-center text-danger fs-4">${failMsg}</p>
			<c:remove var="failMsg" scope="session" />
		</c:if>



		<h5 class="card-title text-center fs-3">Change Password</h5>
		<div class="card-body">

			<!-- inserting form  -->
			<form action="changePassword" method="post">
				<div class="mb-3">



					<label for="exampleInputEmail1" class="form-label fs-5">Enter
						Old Password</label> <input type="password" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp"
						name="oldPassword">

				</div>
				<div class="mb-3">
					<label for="exampleInputPassword1" class="form-label fs-5">Enter
						New Password</label> <input type="password" class="form-control"
						id="exampleInputPassword1" name="NewPassword">
					<div id="emailHelp" class="form-text">We'll never share your
						password with anyone else.</div>
				</div>



				<!--getting userid and sending to changePassword Servlet   -->
				<%
					HttpSession session2 = request.getSession();
				User u1 = (User) session2.getAttribute("userObj");
				int usrId = u1.getId();
				%>



				<input type="hidden" name="userid" value="<%=usrId%>">

				<button type="submit" class="btn btn-primary offset-md-4">Submit</button>
			</form>



		</div>

	</div>

</body>
</html>