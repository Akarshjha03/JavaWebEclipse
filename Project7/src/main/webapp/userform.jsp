<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
<style>
    body {
        font-family: Arial, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
        background-color: #f5f5f5;
    }
    .form-container {
        background-color: white;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
    }
    .form-container h2 {
        text-align: center;
        margin-bottom: 20px;
    }
    .input-group {
        margin-bottom: 15px;
    }
    .input-group input {
        width: 100%;
        padding: 10px;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 4px;
    }
    input[type="submit"] {
        background-color: blue;
        color: white;
        border: none;
        padding: 10px 20px;
        cursor: pointer;
        width: 100%;
        border-radius: 4px;
        margin-top: 20px;
    }
    input[type="submit"]:hover {
        background-color: darkblue;
    }
</style>
</head>
<body>
<div class="form-container">
    <h2>Details</h2>
    <form name="uform" action="userinfo" method="POST" onSubmit="return validate()">
        <div class="input-group">
            <input type="text" name="uid" placeholder="Enter User ID"/>
        </div>
        <div class="input-group">
            <input type="text" name="uname" minlength="6" placeholder="Enter User Name"/>
        </div>
        <div class="input-group">
            <input type="password" name="upassword" minlength="5" placeholder="Enter Password"/>
        </div>
        <div class="input-group">
            <input type="text" name="remark" placeholder="Remarks" size="30"/>
        </div>
        <input type="submit" value="Submit"/>
    </form>
</div>

<script>
    function validate() {
        var u1 = document.uform.uid.value;
        if (u1 == "" || u1 == null) {
            alert("User id can never be blank");
            return false;
        }
    }
</script>
</body>
</html>
