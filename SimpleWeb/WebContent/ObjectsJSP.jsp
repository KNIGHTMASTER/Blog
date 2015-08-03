<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Objects JSP</title>
</head>
<body>
	<%
		String userName = request.getParameter("userName");
		if(userName != null){
			session.setAttribute("userName", userName);
			application.setAttribute("userName", userName);
			pageContext.setAttribute("userName", userName, PageContext.APPLICATION_SCOPE);
		}
	%>
	<br />
	Request object is <%=userName %>
	<br />
	Session object is <%=session.getAttribute("userName") %>
	<br />
	Application object is <%=application.getAttribute("userName") %>
	<br />
	Page Context object is <%=pageContext.getAttribute("userName") %>
</body>
</html>