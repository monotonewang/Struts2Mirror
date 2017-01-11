<%--
  Created by IntelliJ IDEA.
  User: 7
  Date: 2017/1/11
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/register" method="post">
        username:<input type="text" name="username"><br>
        password:<input type="password" name="password"><br>
        hobby:<input type="checkbox" name="hobby" value="eat">吃
             <input type="checkbox" name="hobby" value="drink">喝<br>
        age:<input type="text" name="age"><br>
        birthday:<input type="text" name="birthday"><br>
        <input type="submit" value="register">

    </form>
</body>
</html>
