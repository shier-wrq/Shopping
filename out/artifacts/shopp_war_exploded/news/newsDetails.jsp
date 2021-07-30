<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/04/11
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="news">
    <!--获取作用域对象-->
    <h1>${news.title}</h1>
    <div class="content">
        &{news.content}
    </div>
</div>
</body>
</html>
