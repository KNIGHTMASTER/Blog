<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Arithmetic</title>
</head>
<body>
	<%!
		public int multiply(int a, int b){
			return a*b;
		}
	%>
	
	<%
		int a=10;
		int b=2;
		int result = multiply(a, b);
		out.println("Multiply a + b = "+multiply(a, b));
	%>
	The value of Result is <%=result %>
	<%
		for(int c=0; c<10; c++){
			out.println("<br /> c = "+c);
		}
	%>
</body>
</html>