<%--
  Created by IntelliJ IDEA.
  User: 7
  Date: 2017/1/6
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session application</title>
</head>
<body>
<%
    session.setAttribute("sname", "svalue");
    application.setAttribute("aname", "avalue");

%>
<a href="${pageContext.request.contextPath}/sessionValue">访问demo1servletAction</a>
</body>
</html>
