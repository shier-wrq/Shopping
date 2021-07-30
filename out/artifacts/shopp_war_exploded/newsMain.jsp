<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/04/11
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="position" class="warp">
    <!--文字导航-->
    ${navCode}
</div>

<div id="main" class="warp">
    <div class="lefter">
        <!--商品分类信息栏-->
        <jsp:include page="common/left.jsp"></jsp:include>
    </div>
    <!--融合新闻标题和内容-->
    <jsp:include page="${mainPage}"></jsp:include>
</div>
</body>
</html>
