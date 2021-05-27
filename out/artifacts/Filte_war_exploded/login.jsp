<%--
  Created by IntelliJ IDEA.
  User: danjh
  Date: 2021/4/23
  Time: 6:58 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/MyServlet" method="get">
    <label for="name">用户名</label>
    <input id="name" type="text" name="name">
    <br>
    <label for="password">密 码</label>
    <input id="password" type="password" name="password">
    <br>
    <button type="submit">登录</button>
</form>
</body>
</html>
