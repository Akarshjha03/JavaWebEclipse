<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Servlet CRUD</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #677DB7;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background-color: #9CA3DB;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        td {
            padding: 10px;
            text-align: left;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #007BFF;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        a {
            color: #007BFF;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .actions {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
    </style>
</head>
<body>
    <form action="stdadddServlet" method="POST">
        <h2>Register</h2>
        <table>
            <tr>
                <td>Rollno:</td>
                <td><input type="text" name="rollno" placeholder="Enter rollno" required/></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="sname" placeholder="Enter name" required/></td>
            </tr>
            <tr>
                <td>Course:</td>
                <td><input type="text" name="course" placeholder="Enter course" required/></td>
            </tr>
            <tr>
                <td>Fees:</td>
                <td><input type="text" name="fees" placeholder="Enter fees" required/></td>
            </tr>
        </table>
        <div class="actions">
            <a href="readStudentData">Read Student</a>
            <input type="submit" value="Submit"/>
        </div>
    </form>
</body>
</html>
