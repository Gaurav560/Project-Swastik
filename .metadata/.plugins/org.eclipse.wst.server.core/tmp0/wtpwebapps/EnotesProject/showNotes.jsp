<%@page import="com.User.post"%>
<%@page import="java.util.List"%>
<%@page import="com.Db.DBConnect"%>
<%@page import="com.DAO.postDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	UserDetails user3 = (UserDetails) session.getAttribute("userD");
if (user3 == null) {
	response.sendRedirect("login.jsp");
	session.setAttribute("login-error", "Please Login...");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Notes</title>
<%@include file="all_component/allcss.jsp"%>


</head>
<style>
.kill {
	height: 15vh;
	width: 15vh;
}
.back {
	background: url(img/desert.jpg) no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
.back1{
background-color:#70d6ff;

}
</style>
<body class="back">
	<%@include file="all_component/navbar.jsp"%>
	<%
		String updateMsgString = (String) session.getAttribute("updateMsg");
	if (updateMsgString != null) {
	%>
	<div class="alert alert-success" role="alert"><%=updateMsgString%>
	</div>



	<%
		}
	session.removeAttribute("updateMsg");
	%>

	<%
		String wrongMsgString = (String) session.getAttribute("wrongMsg");
	if (wrongMsgString != null) {
	%>
	<div class="alert alert-danger" role="alert"><%=wrongMsgString%>
	</div>



	<%
		}
	session.removeAttribute("wrongMsg");
	%>

	<div class="container">
		<h2 class="text-center">All Notes:</h2>
		<div class="row">

			<div class="col-md-12">

				<%
					if (user3 != null) {
					postDao obj = new postDao(DBConnect.getConnection());
					List<post> pos = obj.getData(user3.getId());
					for (post po : pos) {
				%>
				<div class="card mt-3 back1">
					<img alt="eNotes image" src="img/notess.png"
						class="card-img-top mt-2 mx-auto kill">
					<div class="card-body p-4">



						<h5 class="card-title"><%=po.getTitle()%></h5>
						<p><%=po.getContent()%></p>
						<p>
							<b class="text-success">Published by:</b><b class="text-primary	"><%=user3.getFirstNameString()%></b>
						</p>
						<p>
							<b class="text-success">Published Date:</b><b
								class="text-primary"><%=po.getpDate()%></b>
						</p>
						<div class="container text-center mt-2">
							<a href="deleteServlet?note_id=<%=po.getId()%>"
								class="btn btn-danger">Delete</a> <a
								href="edit.jsp?note_id=<%=po.getId()%>" class="btn btn-primary">Edit</a>
						</div>
					</div>
				</div>


				<%
					}
				}
				%>




			</div>
		</div>




	</div>
	
</body>
</html>