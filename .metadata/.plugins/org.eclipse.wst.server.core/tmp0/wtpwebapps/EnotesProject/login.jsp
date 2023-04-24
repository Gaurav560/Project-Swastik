<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Login Page</title>
<%@include file="all_component/allcss.jsp"%>
</head>
<style>
.div-color {
	background: url(img/pattern.jpg) no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}

.measurement {
	height: 82vh
}

.bg-custom1 {
	background: #492200;
}
</style>
<body>


	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid div-color ">
		<div class="row measurement">
			<div class="col-md-6 offset-md-3 ">
				<div class="card mt-5 mb-5">

					<div class="card-header text-center text-white bg-custom1">
						<i class="fa fa-sign-in" aria-hidden="true"></i>
						<h4>Login</h4>
					</div>

					<%
						String invalidMsg = (String) session.getAttribute("login-failed");
					if (invalidMsg != null) {
					%>
					<div class="alert alert-danger" role="alert">
						<%=invalidMsg%>
					</div>


					<%
						session.removeAttribute("login-failed");
					}
					%>


					<%
						String withoutLogin = (String) session.getAttribute("login-error");
					if (withoutLogin != null)

					{
					%>

					<div class="alert alert-danger" role="alert"><%=withoutLogin%>
					</div>

					<%
						session.removeAttribute("login-error");
					}
					%>
					
					<%
					String lgMsg=(String)session.getAttribute("logOutMsg"); 
					if(lgMsg!=null){
						
						%>
					
					<div class="alert alert-success" role="alert"><%=lgMsg%>
					</div>
					<%
					}
					session.removeAttribute("logOutMsg");
					
					%>
					

					<div class="container">
						<div class="card-body ">
							<form action="loginServlet" method="post">

								<div class="form-group">
									<label for="exampleInputEmail">Email</label> <input
										type="email" class="form-control" id="exampleInputEmail"
										aria-describedby="emailHelp" placeholder="Enter email"
										name="uemail">
								</div>
								<div class="form-group">
									<label for="exampleInputPassword">Password</label> <input
										type="password" class="form-control" id="exampleInputPassword"
										placeholder="Password" name="upassword">
								</div>

								<button type="submit" class="btn btn-primary">Login</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="all_component/footer.jsp"%>
</body>
</html>