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
    <title>Register</title>
</head>
<body>

<h1>Register to JTA Bank</h1>

<form action="register" method="post">

    <table>
        <tr>
            <th><label for="name">Name</label></th>
            <td><input type="text" name="name" id="name" required></td>
        </tr>
        <tr>
            <th><label for="email">Email</label></th>
            <td><input type="email" name="email" id="email" required></td>
        </tr>
        <tr>
            <th><label for="password">Password</label></th>
            <td><input type="password" name="password" id="password" required></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Register"></td>
        </tr>
    </table>
    <br>
    <br>
    <a href="logIn.jsp">Already Have an Account? Log In</a>
</form>

</body>
</html>
