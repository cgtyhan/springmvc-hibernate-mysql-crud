<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Çağatay Han
  Date: 28.09.2016
  Time: 01:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<a href="/index">HOME</a>
<h3>Register Form</h3>
<form:form action="registerform" modelAttribute="registerForm">
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
                Name: <form:errors path="surname"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:input path="name" label="Enter your password"/>
            </td>
        </tr>
        <tr>
            <td>
                Surname: <form:errors path="surname"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:input path="surname" label="Enter your password"/>
            </td>
        </tr>
        <tr>
            <td>
                Address: <form:errors path="address"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:input path="address" label="Enter your password"/>
            </td>
        </tr>
        <tr>
            <td>
                <button type="submit" value="Submit">Register</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
