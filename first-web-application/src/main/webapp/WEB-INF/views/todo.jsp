<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Contehttp://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1212020nt-Type" content="text/html; charset=ISO-8859-1">
<title>Yahoo! Congratz!</title>
<!-- Bootstrap core CSS -->
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

.footer .container {
width: auto;
max-width: 680px;
padding: 0 15px;
}

.myinline {
display: inline;
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
                <li><a href="/todo.do">Todos</a></li>
                <li><a href="http://www.in28minutes.com">In28Minutes</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li id="logout"><a href="/logout.do">LogOut</a></li>
            </ul>
        </div>

    </nav>

<div class="container">
        <H1>Welcome ${name}</H1>

        Your Todos are
        <ol>
            <c:forEach items="${todos}" var="todo">
                <li>${todo}</li>
            </c:forEach>
        </ol>
 	
 	<div class="myinline">
	 	<form class="myinline" action="/addtodo.do" method="get">
	 		<input id="add" type="submit" value="Add"> 
	 	</form>
	 	<form class="myinline" action="/deletetodo.do" method="get">
	 		<input id="delete" type="submit" value="Delete">
	 	</form>
 	</div>
 </div>

    <footer class="footer">
        <div class="container">
            <p>footer content</p>
        </div>
    </footer>
	
	
</body>
</html>