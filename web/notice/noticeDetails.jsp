<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/04/11
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div id="notice">
        <!--获取作用域对象-->
        <h1>${notice.title}</h1>
        <div class="content">
            &{notice.content}
        </div>
    </div>
</body>
</html>
