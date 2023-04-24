<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Register Page</title>
<%@include file="all_component/allcss.jsp"%>
</head>
<style>
.div-color{
  background: url(img/registrationBack.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
.bg-custom2{
background:#2b1810}
</style>
<body>
	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid div-color">

		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card mt-3 mb-3 ">


					<div class="card-header text-center text-white bg-custom2">
						<i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
						<h5>Registration</h5>
					</div>
					<%
						String regMsg = (String) session.getAttribute("reg-success");

					if (regMsg != null) {
					%>
					<div class="alert alert-success" role="alert">
						<%=regMsg%>
						For Login <a href="login.jsp">CLick here</a>
					</div>
					<%
						session.removeAttribute("reg-success");

					}
					%>

					<%
						String failedMsg = (String) session.getAttribute("failed-msg");

					if (failedMsg != null) {
					%>
					<div class="alert alert-danger" role="alert">
						<%=failedMsg%>
					</div>
					<%
						session.removeAttribute("failed-msg");
					}
					%>





					<div class="container">
						<div class="row">
							<div class="col-md-12">
								<div class="card-body">
									<form action="UserServlet" method="post">
										<div class="form-group">
											<label for="exampleInputFirstName">First Name</label> <input
												type="text" class="form-control" id="exampleInputFirstName"
												aria-describedby="textHelp" placeholder="Enter FirstName"
												name="fname">



										</div>
										<div class="form-group">
											<label for="exampleInput">LastName</label> <input type="text"
												class="form-control" id="exampleInputLastName"
												aria-describedby="textHelp" placeholder="Enter lastName"
												name="lname">

										</div>
										<div class="form-group">
											<label for="exampleInputEmail">Email</label> <input
												type="email" class="form-control" id="exampleInputEmail"
												aria-describedby="emailHelp" placeholder="Enter Email"
												name="uemail">

										</div>
										<div class="form-group">
											<label for="exampleInputNumber">Phone Number</label> <input
												type="number" class="form-control" id="exampleInputNumber"
												aria-describedby="numberHelp" placeholder="Enter Number"
												name="unumber">

										</div>
										<div class="form-group">
											<label for="exampleInputPassword">Password</label> <input
												type="password" class="form-control"
												id="exampleInputPassword" placeholder="Must contains 1 UpperCase,1 LowerCase and 1 Special Character"
												name="upassword">
										</div>

										<button type="submit" class="btn btn-primary">Register</button>
									</form>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="all_component/footer.jsp"%>
</body>
</html>