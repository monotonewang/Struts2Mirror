<%--
  Created by IntelliJ IDEA.
  User: 7
  Date: 2017/1/11
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/mapLogin" method="post">
    username1:<input type="text" name="map['aaa'].username"><br>
    password1:<input type="password" name="map['aaa'].password"><br>

    username2:<input type="text" name="map['bbb'].username"><br>
    password2:<input type="password" name="map['bbb'].password"><br>

    <input type="submit" value="登录">
</form>
</body>
</html>
