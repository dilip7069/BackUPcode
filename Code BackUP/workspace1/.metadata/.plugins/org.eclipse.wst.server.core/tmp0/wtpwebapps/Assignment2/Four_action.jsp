<%@page import="CS5513.DataHandler" %>
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
DataHandler handler = new DataHandler();
String output=handler.addtechsupportdetails(Integer.parseInt(request.getParameter("serialno")),request.getParameter("custname"));
if(output=="success")
	out.println("<a href =Home.jsp> TechSupport Details Stored Click here to go to HomePage</a>");
else
{
	out.println(" Error Occured: " );
	out.println(" <a href =Home.jsp> Click Here to go to Home Page ");
}
%>

</body>
</html>