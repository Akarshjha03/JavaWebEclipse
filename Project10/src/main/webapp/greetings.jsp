<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <title>Greeting Page</title>
</head>
<body>
    <h2>Welcome!</h2>
    <%
        // Get the session
        HttpSession sess = request.getSession(false);

        String username = "AKARSH"; // Set username to "AKARSH"
        
        if (username != null) {
            out.println("<p>Hello, " + username + "!</p>");
            // Logout link
            out.println("<p><a href='login.jsp'>Logout</a></p>");
        } else {
            out.println("<p>Please log in.</p>");
        }
    %>
</body>
</html>

