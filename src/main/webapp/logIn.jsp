<%--
  Created by IntelliJ IDEA.
  User: upekhansaja
  Date: 2025-05-29
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LogIn</title>
</head>
<body>

<h1>LogIn to JTA Bank</h1>

<form action="login" method="post">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>
    <br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>
    <br>
    <button type="submit">Log In</button>
    <button type="reset">Reset</button>
    <br>
    <br>
    <a href="register.jsp">Register</a>
</form>

</body>
</html>
