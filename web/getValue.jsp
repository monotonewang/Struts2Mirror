<%--
  Created by IntelliJ IDEA.
  User: 7
  Date: 2017/1/9
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--这里Get和Post都是可以的-->
<form action="${pageContext.request.contextPath}/sessionValue2" method="get">
    <input type="text" name="username">
    <input type="submit" value="确认提交">
</form>

</body>
</html>
