<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/04/08
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("username");
        String pwd = request.getParameter("pwd");
    %>
</body>
</html>
