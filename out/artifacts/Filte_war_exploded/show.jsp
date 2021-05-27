<%--
  Created by IntelliJ IDEA.
  User: danjh
  Date: 2021/4/23
  Time: 8:10 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<table border="1px">
    <tr>
        <td>学生姓名</td>
        <td>学生年龄</td>
        <td>学生成绩</td>
        <td>是否合格</td>
    </tr>

<c:forEach items="${list}" var="st">
    <tr>
        <td>${st.name}</td>
        <td>${st.bang}</td>
        <td>${st.source}</td>
        <td>${st.source >=60 ? "合格":"不合格"}</td>
    </tr>

</c:forEach>
</table>
</body>
</html>
