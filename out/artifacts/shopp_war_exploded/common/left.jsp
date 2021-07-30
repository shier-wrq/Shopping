<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/04/09
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div class="box">
        <h2>商品分类</h2>
        <dl>
            <c:forEach items="${bigTypeList}" var="bigType">
                <dt>${bigType.name}</dt>
                <c:forEach items="${bigType.smallTypeList}" var="smallType">
                    <dd>
                        <a href="productServlet?oper=smallType&id=${smallType.id}">${smallType.name}</a>
                    </dd>
                </c:forEach>
            </c:forEach>
        </dl>

    </div>
</body>
</html>
