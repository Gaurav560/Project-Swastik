<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>



<c:if test="${empty userObj}">
	<nav class="navbar navbar-expand-lg" style="background: #b1a7a6">
		<div class="container-fluid p-2">
			<a class="navbar-brand fw-bold" href="index.jsp"> <img
				src="img/swastik.png" style="height: 25px; width: 25px; margin: 4px">
				SWASTIK SANATORIUM
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active fw-bold"
						aria-current="page" href="admin_login.jsp"><i
							class="fa-solid fa-right-to-bracket"></i> ADMIN</a></li>

					<li class="nav-item"><a class="nav-link active fw-bold"
						aria-current="page" href="doctor_login.jsp">DOCTOR</a></li>

					<li class="nav-item"><a class="nav-link active fw-bold"
						aria-current="page" href="user_appointment.jsp">APPOINTMENT</a></li>

					<li class="nav-item"><a class="nav-link active fw-bold"
						aria-current="page" href="user_login.jsp">USER</a></li>


				</ul>

			</div>
		</div>
	</nav>

</c:if>



<c:if test="${not empty userObj}">
	<nav class="navbar navbar-expand-lg" style="background: #b1a7a6">
		<div class="container-fluid p-2">
			<a class="navbar-brand fw-bold" href=""> <img
				src="img/swastik.png" style="height: 25px; width: 25px; margin: 4px">
				SWASTIK SANATORIUM
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">

					<li class="nav-item"><a class="nav-link active fw-bold"
						aria-current="page" href="user_appointment.jsp">APPOINTMENT</a></li>

					<li class="nav-item"><a class="nav-link active fw-bold"
						aria-current="page" href="view_appointment.jsp">VIEW
							APPOINTMENT</a></li>
</ul>

					<div class="btn-group">
						<button type="button" class="btn btn-warning dropdown-toggle"
							data-toggle="dropdown" aria-expanded="false">
							<i class="fa-solid fa-user"></i> ${userObj.fullName}
						</button>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="changePassword.jsp">Change
									Password</a></li>
							<li><a class="dropdown-item" href="userLogout">Logout</a></li>

						</ul>
					</div>
			</div>
			</div>
	</nav>
</c:if>

