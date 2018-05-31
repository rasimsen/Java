<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Declarations</title>
</head>
<body>

<h2>JSP Declarations</h2>

<ul>
<li>Declare a method in the JSP page</li>
<li>Call the method in the same JSP page</li>
</ul>

<pre>
	&lt;%!
	//declare a method
	%&gt;
</pre>

<h3>Coding Example</h3>

<%!
String makeItLower(String data){
	return data.toUpperCase();			
}

%>

<p>Lower case "Hello World":<%= makeItLower("Hello World") %></p>

<h3>Source :</h3> 

<pre>
&lt;%!
  String makeItLower(String data){
  return data.toUpperCase(); 
  }
%&gt;

Lower case &quot;Hello World&quot;:&lt;%= makeItLower(&quot;Hello World&quot;) %&gt;

</pre>


</body>
</html>