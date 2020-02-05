<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.PrintWriter" %>
<html>
<head>
<title>Display Result</title>
</head>
<body>
<%
PrintWriter pw=response.getWriter();
session=request.getSession();
pw.println(session.getAttribute("name"));
pw.println(session.getAttribute("usn"));
pw.println(session.getAttribute("marks1"));
pw.println(session.getAttribute("marks2"));
pw.println(session.getAttribute("marks3"));
%>

</body>
</html>