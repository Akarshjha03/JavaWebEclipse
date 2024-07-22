<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    .login-container {
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
    }
    .login-container h2 {
        margin-bottom: 20px;
        font-size: 24px;
        text-align: center;
    }
    .login-container input[type="text"], .login-container input[type="password"] {
        width: 90%;
        padding: 10px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 16px;
    }
    .login-container input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #4CAF50;
        border: none;
        border-radius: 4px;
        color: white;
        font-size: 16px;
        cursor: pointer;
    }
    .login-container input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
    <div class="login-container">
        <h2>Login!</h2>
        <form name="uform" action="CheckUser" method="POST" onSubmit="return validate()">
            <input type="text" name="uname" placeholder="Username" required>
            <input type="password" name="uword" placeholder="Password" minlength="5" required>
            <input type="submit" name="Submit" value="Login">
        </form>
    </div>
    <script>
        function validate() {
            var ul = document.uform.uname.value;
            if (ul == "" || ul == null) {
                alert("No blank please");
                return false;
            }
            return true;
        }
    </script>
</body>
</html>
