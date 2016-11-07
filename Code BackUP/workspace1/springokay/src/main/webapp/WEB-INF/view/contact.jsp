<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<h2>Contact Manager</h2>
 
<form:form action="add.html" commandName="contact">
 
    <table>
    <tr>
        
        <td><form:label path="username">USER NAME</form:label></td>
        <td><form:input path="username" /></td>
        
    </tr>
    <tr>
        <td><form:label path="password">PASSWORD</form:label></td>
        <td><form:input path="password" /></td>
        <td><form:errors path="password" cssClass="error"/></td>
    </tr>
    <tr>
        <td><form:label path="email">EMAIL</form:label></td>
        <td><form:input path="email" /></td>
        <td><form:errors path="email" cssClass="error"/></td>
    </tr>
        <tr>
        <td colspan="2">
            <input type="submit" value="submit"/>
        </td>
    </tr>
</table> 
</form:form>

</body>