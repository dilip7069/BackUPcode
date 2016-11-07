<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Laptop</title>
</head>
<body>
<h3 align="center">
Insert a Laptop built by a particular Microchip Manufacturer.
</h3>
<h3 align="center">
</h3>
<form action="Two_action.jsp">
<div align="center">
<p>&nbsp;</p>
<table cellspacing="2" cellpadding="3" border="1" width="369">
<tr>
<td width="38%">
<strong>Serial No:</strong>
</td>
<td width="62%">
<input type="text" name="serialno"/>
</td>
</tr>
<tr>
<td width="38%">
<strong>Speed:</strong>
</td>
<td width="62%">
<input type="text" name="speed"/>
</td>
</tr>
<tr>
<td width="38%">
<strong>Price:</strong>
</td>
<td width="62%">
<input type="text" name="price"/>
</td>
</tr>
<tr>
<td width="62%">
<strong>Memory:</strong>
</td>
<td width="62%">
<input type="text" name="memory"/>
</td>
</tr>
<tr>
<td>
<strong>Micro Manfacturer:</strong>
</td>
<td width="62%">
<input type="text" name="micromanf"/>
</td>
</tr>
<tr>
<td width="38%">
<strong>Weight:</strong>
</td>
<td width="62%">
<input type="text" name="weight"/>
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