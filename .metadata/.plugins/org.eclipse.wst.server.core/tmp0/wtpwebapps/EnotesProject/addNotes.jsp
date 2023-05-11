<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    
    UserDetails user1=(UserDetails)session.getAttribute("userD");
    if(user1==null){
    	response.sendRedirect("login.jsp");
    	session.setAttribute("login-error", "Please Login...");
    }
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddNotes</title>
<%@include file="all_component/allcss.jsp" %>
</head>
<style>
.back{
  background: url(img/plaine.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
.kalar{
background:#eaba6b;
color:#fc0002;
}
.win{
color:#ff5400;
}</style>
<body class="back">
<div class="container-fluid">
<%@include file="all_component/navbar.jsp" %>
<h1 class="text-center mt-2 win">Add Your Notes</h1>
<div class="container"><div class="row">
<div class="col-md-12">
<form action="AddNotesServlet" method="post">
 <div class= "form-group win">
  <%
  UserDetails us=(UserDetails)session.getAttribute("userD");
  if(us!=null){%>
	  
	  <input type="hidden" value="<%= us.getId() %>" name="uid">
  <%}
  %>
 
  
    <label for="exampleFormControlInput1">Enter Title</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter your title here" name="title" required="required">
  </div>
  
  
  <div class="form-group win">
    <label for="exampleFormControlTextarea1">TextArea</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="10" placeholder="enter your content here" name="content" required="required"></textarea>
   </div>
   <div class="container text-center mb-2"><button type="submit" class="btn btn-primary kalar">Add Notes</button></div>
</form>
</div>
</div></div>


</div>


<%@include file="all_component/footer.jsp" %>
</body>
</html>