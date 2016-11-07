<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert a customer who ordered a particular computer</title>
</head>
<body>
<h3 align="center">
Insert a customer who ordered a particular computer.
</h3>
<h3 align="center">
</h3>
<form action="Three_action.jsp">
<div align="center">
<p>&nbsp;</p>
<table cellspacing="2" cellpadding="3" border="1" width="369">
<tr>
<td width="38%">
<strong>Order No:</strong>
</td>
<td width="62%">
<input type="text" name="orderno"/>
</td>
</tr>
<tr>
<td width="38%">
<strong>Month:</strong>
</td>
<td width="62%">
<input type="text" name="month"/>
</td>
</tr>
<tr>
<td width="38%">
<strong>Year:</strong>
</td>
<td width="62%">
<input type="text" name="year"/>
</td>
</tr>
<tr>
<td width="62%">
<strong>SerialNo:</strong>
</td>
<td width="62%">
<input type="text" name="serialno"/>
</td>
</tr>
<tr>
<td>
<strong>Customer Name:</strong>
</td>
<td width="62%">
<input type="text" name="custname"/>
</td>
</tr>
</table>
<table cellspacing="3" cellpadding="2" border="0">
<tr>
<td>
<input type="submit" value="Insert Laptop Details"/>
</td>
</tr></table>
<p>
</p>
</div>
</form>
</body>
</html>