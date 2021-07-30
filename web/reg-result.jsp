<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/04/11
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="register" class="warp">
    <div class="shadow">
        <div class="box">
            <h1>欢迎注册</h1>
            <ul class="steps clearfix">
                <li class="finished"><em></em>填写注册信息</li>
                <li class="last-current"><em></em>注册成功</li>
            </ul>
            <div class="msg">
                <p>恭喜注册成功</p>
                <p>正在进入首页</p>
            </div>
            <script type="text/javascript">
                setTimeout("location.href='${pageContext.request.contextPath}/index", 3000);
            </script>
        </div>
    </div>
</div>
</body>
</html>
