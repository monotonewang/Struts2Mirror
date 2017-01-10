<%--
  Created by IntelliJ IDEA.
  User: 7
  Date: 2017/1/10
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${requestScope["login.message"] }<br>
    <form action="${pageContext.request.contextPath}/login1" method="post">
        username1:<input type="text" name="username"><br>
        password1:<input type="password" name="password"><br>
        <input type="submit" value="登录">
        <%--username2:<input type="text" name="users[1].username"><br>--%>
        <%--password2:<input type="password" name="users[1].password"><br>--%>

    </form>
</body>
</html>
