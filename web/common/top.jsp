<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/04/09
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--首页用户注册-->
    <div class="help">
        <jsp:useBean id="currentUser" scope="session" class="label.User"/>
        <c:if test="${not empty currentUser}">
            <a href="shopping?oper=list" class="shopping">购物车(0)个商品</a>
            <a href="UserServlet?oper=userCenter">${currentUser.userName}</a>
            <a href="javascript:logout()">注销</a>
            <a href="../register.jsp">注册</a>
            <a href="comment?oper=list">留言板</a>
        </c:if>
        <c:if test="${empty currentUser}">
            <a href="javascript:checkLogin()" class="shopping">购物车</a>
            <a href="../login.jsp">登录</a>
            <a href="../register.jsp">注册</a>
            <a href="javascript:checkLogin()">留言板</a>
        </c:if>

        <form action="productServlet" method="post">
            <input type="text" name="product" autocomplete="off"/>
            <input type="hidden" name="oper" value="search"/>
            <input type="submit" value="搜索"/>
        </form>
    </div>
    <!--导航-->
    <div class="navbar">
        <ul class="clearfix">
            <li class="current">
                <a href="index">首页</a>
            </li>
            <jsp:useBean id="bigTypeList" scope="session" class="control.InitControl"/>
            <c:forEach items="${bigTypeList}" var="bType">
                <li>
                    <a href="productServlet?oper=productType&id=${bType.id}">${bType.name}</a>
                </li>
            </c:forEach>
        </ul>
    </div>

    <div id="childNav">
        <div class="warp">
            <ul class="clearfix">
                <jsp:useBean id="tagList" scope="session" class="control.InitControl"/>
                <c:forEach items="${tagList}" var="tag" varStatus="status">
                    <c:choose>
                        <c:when test="${status.first==true}">
                            <li class="first"><a href="${tag.url}" target="_blank">${tag.name}</a></li>
                        </c:when>
                        <c:when test="${status.last==true}">
                            <li class="last"><a href="${tag.url}" target="_blank">${tag.name}</a></li>
                        </c:when>
                        <c:otherwise>
                            <li><a href="${tag.url}" target="_blank">${tag.name}</a></li>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </ul>
        </div>
    </div>
</body>
<script type="text/javascript">
    function checkLogin(){
        if('${currentUser.userName}'===''){
            alert("请先登录");
        }else{
            window.location.href="shopping?oper=list";
        }
    }

    function logout(){
        if(confirm('您真的要退出吗?')){
            window.location.href="UserServlet?oper=logout";
        }
    }
</script>
</html>
