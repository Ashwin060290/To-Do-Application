<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yahoo from JSP!!!</title>
<link href="../webjars/bootstrap/3.3.6/css/bootstrap.min.css"
    rel="stylesheet">

<style>
.footer {
    position: absolute;
    bottom: 0;
    width: 100%;
    height: 60px;
    background-color: #f5f5f5;
}
</style>
</head>
<body>
<script src="../webjars/jquery/jquery.min.js"></script>
<script src="../webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>


<nav role="navigation" class="navbar navbar-default">
	
	<div class="">
	<a href="/" class="navbar-brand">Brand</a>
	</div>
	
	<div class="navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="login.do">Login</a></li>
			<li><a href="todo.do">Todo</a></li>
			<li><a href="http://www.google.com">google</a></li>
			
		</ul>
		
		<ul class="nav navbar-right">
			<li><a href="test.check">TEST</a></li>
			<li><a href="login.do">LogIn</a></li>
		</ul>
	</div>
</nav>

<div class="container">
	<form action="/login.check" method="post">
		<p>PLEASE WAIT TILL WE TEST THIS SITE</p>
		
	</form>
</div>

<footer class="footer">
	<div>Footer</div>
</footer>
</body>
</html>