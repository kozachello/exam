<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Козак
  Date: 29.05.2017
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <spring:form modelAttribute="userFromServer" method="post" action="/users/check">
        <spring:input path="user"/>
        <spring:input path="pass"/>
        <spring:button>check</spring:button>
    </spring:form>

</body>
</html>
