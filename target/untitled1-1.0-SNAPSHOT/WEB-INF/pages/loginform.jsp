<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Çağatay Han
  Date: 16.09.2016
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/index">HOME</a>
<h3>Login Form</h3>
<form:form action="loginform" modelAttribute="loginForm">
    <table>
        <tr>
            <td>
                User Name:<form:errors path="userName"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:input path="userName" label="Enter your username"/>
            </td>
        </tr>
        <tr>
            <td>
                Password: <form:errors path="password"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:input path="password" label="Enter your password"/>
            </td>
        </tr>
        <tr>
            <td>
                Password: <form:errors path="password"/>
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit" value="Submit">Login</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
