<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
<%@include file="component/allcss.jsp" %>
<style>
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
.colour-class{

background-color: #90caf9;

}
</style>
</head>
<body>
	<%@include file="component/navbar.jsp"%>
	<div class="container-fluid back-img">
		<div class="row ">
			<div class="col-md-5 offset-md-4 mt-5">
				<div class="card paint-card colour-class">
			
					<div class="card-body">
						<p class="fs-3 text-center">User Login</p>
							
							
							<c:if test="${not empty sucMsg}">
			<p class="text-center text-success fs-4">${sucMsg}</p>
			<c:remove var="sucMsg" scope="session" />
		</c:if>
		
		

		<c:if test="${not empty failMsg}">
			<p class="text-center text-danger fs-4">${failMsg}</p>
			<c:remove var="failMsg" scope="session" />
		</c:if>
		
		
						<form action="userLogin" method="post">
							<div class="mb-3">
								<label class="form-label">Email</label><input required
									name="email" type="email" class="form-control">
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label><input required
									name="password" type="password" class="form-control">
							</div>
							<button type="submit"
								class="btn bg-success text-white col-md-4 offset-md-4">Submit</button>
						</form>
						<br>Don't have an account? <a href="signUp.jsp"
							class="text-decoration-none">Create One</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="component/footer.jsp"%>

</body>
</html>