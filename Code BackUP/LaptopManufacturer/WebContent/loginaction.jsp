<%@page import="base.LaptopManufacturer" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
LaptopManufacturer handler = new LaptopManufacturer();
if(handler.authenticateUser("jdbc:mysql://localhost:3306/college",request.getParameter("id"),request.getParameter("pwd"),request.getSession())==true)
out.println("<a href =Home.jsp>Valid Credentials Press Here to go to Home Page</a>");
else
out.println("<a href =Login.jsp>Wrong Credentials Press Here to go to Login Page Again</a>");
%>
</body>
</html>