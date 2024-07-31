<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User info</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .container {
        max-width: 600px;
        padding: 20px;
        background-color: #fff;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    h1 {
        font-size: 24px;
        margin-bottom: 20px;
    }
    .info {
        margin-bottom: 20px;
    }
    a {
        display: inline-block;
        margin: 5px 0;
        text-decoration: none;
        color: #007BFF;
    }
    a:hover {
        text-decoration: underline;
    }
    form {
        margin-top: 20px;
    }
    input[type="text"] {
        padding: 5px;
        width: calc(100% - 12px);
        margin-bottom: 10px;
    }
    input[type="submit"] {
        padding: 10px 20px;
        background-color: #007BFF;
        border: none;
        color: white;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>User Info</h1>
        <div class="info">
            <% 
                String un = request.getParameter("uname");
                String ps = request.getParameter("uword");

                out.println("Username: " + un + "<br/>");
                out.println("Password: " + ps + "<br/>");
            %>
        </div>
        <form action='decide.jsp' method="post">
            <label for="choice">Your choice (1,2,3):</label>
            <input type='text' id="choice" name='ch'/><br/>
            <input type='submit' value='Submit'/>
        </form>
    </div>
</body>
</html>
