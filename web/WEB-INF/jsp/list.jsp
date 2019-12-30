<%--
  Created by IntelliJ IDEA.
  User: 彬
  Date: 2019/11/29
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<table border="1px">
    <tr>
        <td>id</td>
        <td>username</td>
        <td>password</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td><a href="${pageContext.request.contextPath}/delete.action?id=${user.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<%--<table>--%>
<%--    <tr>--%>
<%--        <td>id</td>--%>
<%--        <td>name</td>--%>
<%--        <td>price</td>--%>
<%--        <td>detail</td>--%>
<%--    </tr>--%>
<%--    <c:forEach items="${selectlist }" var="item">--%>
<%--        <tr>--%>
<%--            <td><input type="checkbox" value="${item.id }" name="id"></td>--%>
<%--            <td><input type="text" value="${item.name }" name="name"/></td>--%>
<%--            <td><input type="text" value="${item.price }" name="price"/></td>--%>
<%--            <td>${item.detail }</td>--%>

<%--            <td><a href="${pageContext.request.contextPath }/delete.action?id=${item.id}">删除</a></td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
</body>
</html>
