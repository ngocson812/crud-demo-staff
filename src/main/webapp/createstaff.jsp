<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 12/27/2021
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Staff</title>
</head>
<body>
<form action="/staff?action=create" method="post">
    <table border="1">
        <tr>
            <td><input name="id" placeholder="id"></td>
            <td><input name="name" placeholder="name"></td>
            <td><input name="img" placeholder="img"></td>
            <td><input name="age" placeholder="age"></td>
            <td><input type="submit" id="submit" style="border: 3px; background: coral">create</td>
        </tr>
    </table>
</form>
</body>
</html>
