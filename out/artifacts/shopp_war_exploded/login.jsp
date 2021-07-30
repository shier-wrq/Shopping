
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/04/08
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>
<body>
    <script src="https://s3.pstatp.com/cdn/expire-1-M/jquery/3.3.1/jquery.min.js"></script>
    <div id="register" class="warp"></div>
    <div class="shadow">
        <em class="corner lb"></em> <em class="ui-corner-right"></em>
        <div class="box">
            <h1>欢迎回来</h1>
            <form id="LoginForm" method="post" action="UserServlet" onsubmit="return checkForm()">
                <input type="hidden" name="oper" value="login"/>
                <table>
                    <tr>
                        <td class="field">用户名:</td>
                        <td>
                            <input class="text" type="text" id="userName" name="userName" value="${user.userName}"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="field">登录密码</td>
                        <td>
                            <input class="text" type="password" id="password" name="password" value="${user.userName}"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="field">验证码</td>
                        <td>
                            <input class="text" style="width: 60px;margin-right: 10px"
                            type=text value="${imageCode}" name="imageCode" id="imageCode">
                            <img src="image.jsp" onclick="loadImage();" title="换一张试一试" name="rangImage"
                            id="randImage" width="60" height="20" border="1" align="absmiddle">
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <label class="ui-green">
                                <input type="submit" name="submit" value="立即登录">&nbsp;&nbsp;&nbsp;&nbsp;
                                <font id="error" color="red">${error}</font>
                            </label>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</body>
<script type="text/javascript">
    function checkForm() {
        var userName = $("userName").val();
        var password = $("password").val();
        var imageCode = $("imageCode").val();
        if(userName === ""){
            $("#error").html("用户名不能为空");
            return false;
        }
        if(password === ""){
            $("#error").html("密码不能为空");
            return false;
        }
        if(imageCode === ""){
            $("#error").html("验证码错误");
            return false;
        }
        return true;
    }

    function loadImage(){
        document.getElementById("rangImage").src = "image.jsp ?" + Math.random();
    }
</script>
</html>






