<%
				UserDetails user = (UserDetails) session.getAttribute("userD");
			if (user != null) {
			%>

<%@page import="com.User.UserDetails"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-custom navbar-custom">
	<a class="navbar-brand" href=""><i class="fa fa-book"
		aria-hidden="true"></i>ENotes</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="home.jsp"><i
					class="fa fa-home" aria-hidden="true"></i>Home <span
					class="sr-only">(current)</span></a></li>
			<li class="nav-item"><a class="nav-link" href="addNotes.jsp"><i
					class="fa fa-plus" aria-hidden="true"></i>Add Notes</a></li>

			<li class="nav-item"><a class="nav-link" href="showNotes.jsp"><i
					class="fa fa-address-book-o" aria-hidden="true"></i>Show Notes</a></li>
		</ul>
		<form class="form-inline my-2 my-lg-0">


			
			<a href="" class="btn btn-outline-success my-2 my-sm-0 mr-2 rounded"
				data-toggle="modal" data-target="#exampleModal" type="submit"><i
				class="fa fa-sign-in" aria-hidden="true"></i><%=user.getFirstNameString()%></a>
			<a href="LogoutServlet"
				class="btn btn-outline-success my-2 my-sm-0 rounded" type="submit"><i
				class="fa fa-user" aria-hidden="true"></i>Logout</a>



			<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
				aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalLabel">Details</h5>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body text-center">

							<div class="container text-center">
								<i class="fa fa-user" aria-hidden="true"></i>
								<h5></h5>
								<table class="table table-dark">
									<tbody>
										<tr>
											<th>UserId</th>
											<td><%=user.getId()%></td>
										</tr>
										<tr>
											<th>FirstName</th>
											<td><%=user.getFirstNameString()%></td>
										</tr>
										<tr>
											<th>LastName</th>
											<td><%=user.getLastNameString()%></td>
										</tr>
										<tr>
											<th>email</th>
											<td><%=user.getEmailString()%></td>
										</tr>
										<tr>
											<th>Contact</th>
											<td><%=user.getPhoneString()%></td>
										</tr>


									</tbody>


								</table>
							</div>



						</div>

					</div>
				</div>
			</div>
	</form>
	</div>
</nav>

			<%
				} else {
			%>
			
<%@page import="com.User.UserDetails"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-custom navbar-custom">
	<a class="navbar-brand" href="index.jsp"><i class="fa fa-book"
		aria-hidden="true"></i>ENotes</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="home.jsp"><i
					class="fa fa-home" aria-hidden="true"></i>Home <span
					class="sr-only">(current)</span></a></li>
			<li class="nav-item"><a class="nav-link" href="addNotes.jsp"><i
					class="fa fa-plus" aria-hidden="true"></i>Add Notes</a></li>

			<li class="nav-item"><a class="nav-link" href="showNotes.jsp"><i
					class="fa fa-address-book-o" aria-hidden="true"></i>Show Notes</a></li>
		</ul>
		<form class="form-inline my-2 my-lg-0">
			
			<a href="login.jsp"
				class="btn btn-outline-success my-2 my-sm-0 mr-2 rounded"
				type="submit"><i class="fa fa-sign-in" aria-hidden="true"></i>Login</a>
			<a href="register.jsp"
				class="btn btn-outline-success my-2 my-sm-0 rounded" type="submit"><i
				class="fa fa-user" aria-hidden="true"></i>Register</a>

		<%} %>

		</form>
	</div>
</nav>