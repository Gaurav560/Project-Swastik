<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
        <%
    
    UserDetails user2=(UserDetails)session.getAttribute("userD");
    if(user2==null){
    	response.sendRedirect("login.jsp");
    	session.setAttribute("login-error", "Please Login...");
    }
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Alkatra&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Home Page</title>
<%@ include file="all_component/allcss.jsp" %>
</head>
<style>
body{font-family: 'Alkatra', cursive;

}

.kalar{
background:#eaba6b;
color:#fc0002;
}



</style>
<body >

<div class="container-fluid p-0 bg-custom3">
<%@include file="all_component/navbar.jsp"%>
<div class="card py-6">
<div class="card-body text-center">
<img alt="" src="img/paper.jpg" class="img-fluid  mx-auto padding-bottom-20" style="max-width:500px;">
<h1 class="mt-3">START TAKING YOUR NOTES HERE</h1>
<a href="addNotes.jsp" class="btn btn-outline-primary kalar">Start Here</a>
</div>
</div>
</div>




<%@include file="all_component/footer.jsp"%>
</body>
</html>