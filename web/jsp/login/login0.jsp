<%--
  Created by IntelliJ IDEA.
  User: 7
  Date: 2017/1/5
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  ${requestScope["login.message"] }<br>
  <form action="${pageContext.request.contextPath}/login0" method="post">
    username:<input type="text" name="username"><br>
    password:<input type="password" name="password"><br>
    <input type="submit" value="login0">
  </form>
  </body>
</html>
