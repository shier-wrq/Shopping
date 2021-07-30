<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/04/11
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
        <!--融合公告标题和内容-->
        <jsp:include page="${mainPage}"></jsp:include>
    </div>
</body>
</html>
