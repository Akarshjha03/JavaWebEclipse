<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f2f5;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .register-container {
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
    }
    .register-container h2 {
        text-align: center;
        margin-bottom: 20px;
    }
    .register-container table {
        width: 100%;
    }
    .register-container td {
        padding: 10px 0;
    }
    .register-container input[type="text"],
    .register-container input[type="password"] {
        width: calc(100% - 20px);
        padding: 8px;
        margin: 5px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
        position: relative;
    }
    .register-container input[type="text"]::placeholder,
    .register-container input[type="password"]::placeholder {
        color: #888;
    }
    .register-container input[type="text"]:focus,
    .register-container input[type="password"]:focus {
        border-color: #007bff;
        outline: none;
    }
    .register-container input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #007bff;
        border: none;
        border-radius: 4px;
        color: white;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }
    .register-container input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<div class="register-container">
    <h2>Register</h2>
    <form action="userServlet" method="POST">
        <table>
            <tr>
                <td>
                    <input type="text" name="uname" placeholder="User name" required/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="password" name="upass" placeholder="Password" required/>
                </td>
            </tr>
            <tr>
                <td style="text-align: center;"><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
