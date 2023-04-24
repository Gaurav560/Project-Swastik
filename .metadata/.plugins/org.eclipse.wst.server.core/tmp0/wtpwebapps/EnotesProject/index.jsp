<%@page import="com.Db.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.back-img{
background:url("img/notes.jpg");
background-repeat:no-repeat;
background-size:cover;
width:100%;
height:80vh;

}
.text-center{
padding:10px;
}
</style>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<%@include file="all_component/allcss.jsp" %>
</head>

<body>

<%@include file="all_component/navbar.jsp" %>
<% Connection connection=DBConnect.getConnection();
System.out.println(connection);
%>

<div class="container-fluid back-img">
<div class="text-center"><h1 style='color:#f2e8cf;'><i class="fa fa-book" aria-hidden="true"></i>ENotes-Write Down Your Memories</h1>
<a href="login.jsp" class="btn btn-light"><i class="fa fa-user-circle-o" aria-hidden="true"></i>Login</a>
<a href="register.jsp" class="btn btn-light"><i class="fa fa-user-plus" aria-hidden="true"></i>Register</a></div>
</div>
<%@include file="all_component/footer.jsp" %>
</body>
</html>