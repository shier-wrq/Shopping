<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/11/25
  Time: 1:04
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="styles/shop.css">

</head>
<body>
    <script src="https://s3.pstatp.com/cdn/expire-1-M/jquery/3.3.1/jquery.min.js"></script>
    <div id="header" class="warp">
        <!--导航栏-->
        <jsp:include page="common/top.jsp"></jsp:include>
    </div>

    <div id="main" class="warp">
        <div class="lefter">
            <!--商品分类信息栏-->
            <jsp:include page="common/left.jsp"></jsp:include>
        </div>
        <!--特价商品 热卖商品-->
        <div class="main">
            <div class="price-off">
                <h2>今日特价</h2>
                <ul class="product clearfix">
                    <c:forEach items="${specialPriceProductList}" var="spProduct">
                        <li>
                            <dl>
                                <dt>
                                    <a href="productServlet?oper=addCard&productId=${spProduct.id}" target="_blank"><img src="${spProduct.proPic}"></a>
                                </dt>
                                <dd class="title">
                                    <a href="productServlet?oper=addCard&productId=${spProduct.id}" target="_blank">${spProduct.name}</a>
                                </dd>
                                <dd class="price">
                                    ${spProduct.price}
                                </dd>
                            </dl>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <!--新闻 公告 热卖-->
        <div class="side">
            <div class="news-list">
                <h4>最新公告</h4>
                <ul>
                    <c:forEach items="${noticeList}" var="notice">
                        <li>
                            <a href="noticeServlet?noticeId=${notice.id}">${notice.title}</a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <div class="spacer"></div>

            <div class="news-list">
                <h4>最新新闻</h4>
                <ul>
                    <c:forEach items="${newsList}" var="news">
                        <li>
                            <a href="newsServlet?newsId=${news.id}">${news.title}</a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <div class="spacer clear"></div>

            <div>
               <h2>热卖推荐</h2>
                <ul class="product clearfix">
                    <c:forEach items="${hotProductList}" var="hProduct">
                        <li>
                            <dl>
                                <dt>
                                    <a href="productServlet?oper=addCard&productId=${hProduct.id}"><img src="${hProduct.proPic}"></a>
                                </dt>
                                <dd class="title">
                                    <a href="productServlet?oper=addCard&productId=${hProduct.id}">${hProduct.name}</a>
                                </dd>
                                <dd class="price">
                                    ${hProduct.price}
                                </dd>
                            </dl>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
        <div class="clear"></div>
    </div>

    <div id="footer" class="warp">
        <jsp:include page="common/footer.jsp"></jsp:include>
    </div>

    <!--访问当前项目
        http://local:8080/项目名称/index
    -->

</body>
</html>
