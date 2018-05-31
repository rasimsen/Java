<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp Scriptlets</title>
</head>
<body>

<h2>JSP Scriptlets</h2>

<p>
	<ul>
	<li> Insert 1 to many lines of Java code
	<li>To include content in the page use : out.println(..)
	</ul>

	<pre>
		&lt;% <br />
		//some lines of Java code<br />
		%&gt;
	</pre>	
</p>	

<h2>JSP Scriptlet - Example</h2>
<h3>Hello World of Java</h3>

<%
	int c = 10;
	for(int i=1;i<c;i++){
		out.println("<br/>This is "+i+" lines of "+c);
	}
	
%>

<h2>JSP Scriptlet - Best Practise</h2>
<p>
	<ul>
		<li>Minimize of the amount of scriptlet code in a JSP</li>
		<li>Avoid dumping thousands of lines of code in a JSP </li>
		<li>Refoctor this into a seperate Java class ... make use of MVC</li>
	</ul>
</p>



</body>
</html>