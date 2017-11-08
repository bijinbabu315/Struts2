<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Empolyee Page</title>
</head>
<body width='100%'>
<html:form action="addEmployee" method="post">
<h3>Employee Details</h3>
<table>
<tr><td>Name :</td><td></td><td><html:textfield name="ename"></html:textfield></td></tr>
<tr><td>Age  :</td><td></td><td><html:textfield name="age"></html:textfield></td><td></td></tr>
<tr><td>Email :</td><td></td><td><html:textfield name="email"></html:textfield></td></tr>
<tr><td></td><td><html:submit value="Add Employee"></html:submit></td><td></td></tr>
</table>
<html:hidden name='postBack' value='true'/>
</html:form>
</body>
</html>