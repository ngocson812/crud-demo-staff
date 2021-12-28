<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 12/27/2021
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Staff List</title>
    <style>
        table, td, tr {
            border: 1px solid blueviolet;
        }
        tr, td{
            width: 200px;
        }
    </style>
</head>
<body>
<h1>Product</h1>
<br><br>
<button>
    <a href="/staff?action=create" class="btn btn-success">create</a>
</button>
<br><br>
<table border="1">
<table>
    <td>id</td>
    <td>name</td>
    <td>age</td>
    <td>avatar</td>
    <td>edit</td>
    <td>delete</td>
</table>
    <c:forEach items="${staffList}" var="p" varStatus="loop">
        <table>
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.age}</td>
                <td><img src="${p.img}" width="200" height="auto" alt=""></td>
                <td>
                    <button>
                        <a href="/staff?action=edit&index=${loop.index}" class="btn btn-warning">edit</a>
                    </button>
                </td>
                <td>
                    <button>
                        <a href="/staff?action=delete&index=${loop.index}" class="btn btn-danger">delete</a>
                    </button>
                </td>
            </tr>
        </table>
    </c:forEach>
</table>
</body>
</html>
