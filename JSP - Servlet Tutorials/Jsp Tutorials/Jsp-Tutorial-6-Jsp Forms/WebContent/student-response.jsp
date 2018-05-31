<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Confirmation Title</title>
</head>
<body>
<center>The student is confirmed: ${param.firstName} ${param.lastName} </center>

<h4>Source: </h4>
$ {param.firstName} $ {param.lastName} 

<h3>Another way to get submitted form data</h3>	
<center>The student is confirmed: <%= request.getParameter("firstName") %> <%= request.getParameter("lastName") %> </center>

<h4>Source: </h4>

&lt;%= request.getParameter(&quot;firstName&quot;) %&gt; &lt;%= request.getParameter(&quot;lastName&quot;) %&gt;


</body>
</html>