<%--
  Created by IntelliJ IDEA.
  User: danjh
  Date: 2021/4/23
  Time: 3:32 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>

<c:if test="${name == null}">
    <a href="${pageContext.request.contextPath}/login.jsp">请登录</a>
</c:if>

<c:if test="${name !=null}" >

    <a href="${pageContext.request.contextPath}/add.jsp">添加学生</a>
    <a href="${pageContext.request.contextPath}/CkServlet">查看学生</a>
</c:if>



</body>
</html>
