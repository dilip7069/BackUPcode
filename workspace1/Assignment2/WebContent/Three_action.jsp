<%@page import="CS5513.DataHandler" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert a customer who ordered a particular computer</title>
</head>
<body>
<%
DataHandler handler = new DataHandler();
String output=handler.addorderdetails(Integer.parseInt(request.getParameter("orderno")),Integer.parseInt(request.getParameter("month")),Integer.parseInt(request.getParameter("year")),Integer.parseInt(request.getParameter("serialno")),request.getParameter("custname"));
if(output=="success")
	out.println("<a href =Home.jsp>Order Details Stored Click here to go to HomePage</a>");
else
{
	out.println("Following Error Occured: " +output);
	out.println(" <a href =Home.jsp> Click Here to go to Home Page ");
}
%>

</body>
</html>