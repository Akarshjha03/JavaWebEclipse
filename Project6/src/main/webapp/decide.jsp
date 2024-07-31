<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Decision</title>
</head>
<body>
<%
String ch = request.getParameter("ch");
if (ch.equals("1"))
	response.sendRedirect("staff.jsp");
else
	if(ch.equals("2"))
		response.sendRedirect("admin.jsp");
else
	if(ch.equals("3"))
response.sendRedirect("std.jsp");


%>
</body>
</html>