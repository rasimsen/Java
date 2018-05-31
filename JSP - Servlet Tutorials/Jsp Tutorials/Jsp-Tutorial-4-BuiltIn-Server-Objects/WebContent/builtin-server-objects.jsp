<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Built-In Server Objects</title>
</head>
<body>
<h2>Built-In Server Objects</h2>

<h3>List of commonly used JSP objects</h3>
<ul>
<li>request - Contains HTTP request headers and form data </li>
<li>response - Provides HTTP support for sending response</li>
<li>out - JSPWriter for including content in HTML page </li>
<li>session - Unique session for each user of the web application</li>
<li>application - Shared data for all users of the web application</li>
</ul>

<h3>Code Example</h3>

<p>Request user agent :<%= request.getHeader("User-Agent") %></p>
<br>
Request language: <%= request.getLocale()%>

</body>
</html>