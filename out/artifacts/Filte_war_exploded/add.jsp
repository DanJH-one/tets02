<%--
  Created by IntelliJ IDEA.
  User: danjh
  Date: 2021/4/23
  Time: 7:31 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addServlet" method="get">
    <label for="name">学生姓名</label>
    <input id="name" type="text" name="name">
    <br>
    <label for="password">学生年龄</label>
    <input id="password" type="text" name="password">
    <br>
    <label for="soure">学生成绩</label>
    <input id="soure" type="text" name="soure">
    <br>
    <button type="submit">保存</button>
</form>
</body>
</html>
