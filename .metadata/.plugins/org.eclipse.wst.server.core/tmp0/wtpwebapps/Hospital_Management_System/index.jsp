<%@page import="com.Database.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
<%@include file="component/allcss.jsp"%>

<style>
.paint-card {
	box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-webkit-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
	-moz-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);
}

.iw {
	background-color: #F08080;
}

.kr {
	background-color: #B9D9EB;
}
</style>
</head>
<body>
	<%@include file="component/navbar.jsp"%>
	<!-- <div id="carouselExample" class="carousel slide">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/doc1.jpg" class="d-block w-100" alt="..."
					height="550px">
			</div>
		</div>
	</div> -->

	<div id="carouselExampleIndicators"
		class="carousel slide carousel-fade" data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img class="d-block w-100" src="img/doc1.jpg" alt="First slide"
					height="580px">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="img/h19.jpg" alt="Third slide"
					height="580px">
			</div>

			<div class="carousel-item">
				<img class="d-block w-100" src="img/h2.jpg" alt="Third slide"
					height="580px">
			</div>

			<div class="carousel-item">
				<img class="d-block w-100" src="img/h5.jpg" alt="Third slide"
					height="580px">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="img/h11.jpg" alt="Third slide"
					height="580px">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="img/h21.jpg" alt="Third slide"
					height="580px">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="img/h18.jpg" alt="Third slide"
					height="580px">
			</div>

		</div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>

	<div class="container p-4 mt-4">
		<p class="text-center fst-italic fs-2">Key features of our
			Hospital</p>
		<div class="row">
			<div class="col-md-8 p-5">
				<div class="row">
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card body text-center">

								<p class=" fw-bold fst-italic fs-5 iw">100% Safety</p>
								<p class="kr">With our highly skilled doctors and staffs we
									ensure 100% safety to our patients if patient is in a condition
									to be brought back to life .</p>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card body text-center">

								<p class="fw-bold fst-italic fs-5 iw">Experienced Doctors</p>
								<p class="kr">Your body is very complex and it requires very
									experienced and skilled doctors to perform any operation
									succesfully.So keep trust in our experienced Doctors.</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card body text-center">

								<p class="fw-bold fst-italic fs-5 iw">Clean and Friendly
									Environment</p>
								<p class="kr">A weak body and an successful operation
									requires hygienic and friendly environment to prosper .And At
									Swastika we provide world class hygiene.</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card body text-center">
								<p class="fw-bold fst-italic fs-5 iw">Skilled Nursing Staff</p>
								<p class="kr">we have highly skilled and experienced Nurses
									to accommodate our patients and Doctors so that patients can be treated with care.</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4 mt-5">
				<img alt="Doctors" src="img/doc6.jpg"
					style="height: 340px; width: 370px">
			</div>
		</div>
	</div>
	<hr>
	<div class="container p-2 mt-4">
		<p class="text-center fst-italic fs-2">Our Team</p>
		<div class="row">
			<div class="col-md-3 ">
				<div class="card paint-card">
					<div class="card body text-center">
						<img src="img/doc9.jpg" alt="DOctor1" width="250px" height="270px">
						<p class="fw-bold fs-5">Greg Chan</p>
						<p class="fs-7 iw">CEO,Swastik Sanatorium and Senior OrthoSurgeon</p>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card body text-center">
						<img src="img/doc5.jpg" alt="DOctor2" width="250px" height="270px">
						<p class="fw-bold fs-5">Lisa George</p>
						<p class="fs-7 iw">MD-1,Swastik Sanatorium and Senior Psychatrist</p>
					</div>
				</div>
			</div>
			<div class="col-md-3 ">
				<div class="card paint-card">
					<div class="card body text-center">
						<img src="img/doc11.jpg" alt="DOctor3" width="250px"
							height="270px">
						<p class="fw-bold fs-5">Ben White</p>
						<p class="fs-7 iw">MD-2 Swastik Sanatorium(NeuroSurgeon)</p>
					</div>
				</div>
			</div>
			<div class="col-md-3 ">
				<div class="card paint-card">
					<div class="card body text-center">
						<img src="img/doc12.jpg" alt="DOctor4" width="250px"
							height="270px">
						<p class="fw-bold fs-5">Gwen Stefani</p>
						<p class="fs-7 iw">MD-3 and Senior Heart Surgeon(Cardiologist)</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="component/footer.jsp"%>
</body>
</html>