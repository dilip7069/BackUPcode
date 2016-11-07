<%@page import="CS5513.DataHandler" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Laptop</title>
</head>
<body>
<%
DataHandler handler = new DataHandler();
if(handler.addLaptopdetails(Integer.parseInt(request.getParameter("serialno")),Integer.parseInt(request.getParameter("speed")),Integer.parseInt(request.getParameter("price")),Integer.parseInt(request.getParameter("memory")),request.getParameter("micromanf"),Integer.parseInt(request.getParameter("weight")))=="success")
	out.println("<a href =Home.jsp>Laptop Details Stored Click here to go to HomePage</a>");
else
out.println("<a href =Home.jsp>Error Occured Click here to go to HomePage</a>"); 

%>
</body>
</html>