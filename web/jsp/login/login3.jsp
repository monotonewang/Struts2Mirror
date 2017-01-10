<%--
  Created by IntelliJ IDEA.
  User: 7
  Date: 2017/1/10
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login2</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login3" method="post">
        username:<input type="text" name="user.username"><br>
        password:<input type="password" name="user.password"><br>
        <input type="submit" value="login2">
    </form>
</body>
</html>
