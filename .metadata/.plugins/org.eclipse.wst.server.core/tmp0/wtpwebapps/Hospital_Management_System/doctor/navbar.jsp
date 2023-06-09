
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>



<nav class="navbar 
navbar-expand-lg" style="background: #84a59d">

	<div class="container-fluid p-1">

		<a class="navbar-brand fw-bold" href="#"> <img src="../img/swastik.png" style="height:25px; width:25px; margin:4px">   SWASTIK SANATORIUM
		</a>

		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">

			<span class="navbar-toggler-icon"></span>

		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">

			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active fw-bold"
					aria-current="page" href="index.jsp"> <i
						class="fa-solid fa-right-to-bracket"></i>HOME
				</a></li>
				<li class="nav-item"><a class="nav-link active fw-bold"
					aria-current="page" href="patient.jsp">PATIENT</a></li>

			</ul>

			<form class="d-flex mx-5">

				<div class="btn-group dropleft">
					<button type="button" class="btn btn-danger">
						<i class="fas fa-user-md"></i> ${docObj.fullName}
					</button>

					<button type="button"
						class="btn btn-danger dropdown-toggle dropdown-toggle-split"
						data-toggle="dropdown" aria-expanded="false">
						<span class="sr-only">Toggle Dropdown</span>
					</button>

					<div class="dropdown-menu">
						<a class="dropdown-item" href="editProfile.jsp">Edit Profile</a> <a
							class="dropdown-item" href="../doctorLogout">LogOut</a>


					</div>
				</div>

			</form>


		</div>



	</div>
</nav>