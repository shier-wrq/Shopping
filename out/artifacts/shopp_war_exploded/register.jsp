<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2021/04/08
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>
<body>
    <script src="https://s3.pstatp.com/cdn/expire-1-M/jquery/3.3.1/jquery.min.js"></script>
    <div>
        <form id="regForm" action="UserServlet?oper=register" method="post" onsubmit="return checkForm()">
            <table>
                <tr>
                    <td class="field">用户名：</td>
                    <td><input class="text" type="text" id="userName" name="userName" onblur="checkUserName()"/></td>
                </tr>
                <tr>
                    <td class="field">登陆密码：</td>
                    <td><input class="text" type="password" id="password" name="password"/></td>
                </tr>
                <tr>
                    <td class="field">确认密码：</td>
                    <td><input class="text" type="password" id="rePassword" name="userName"/></td>
                </tr>
                <tr>
                    <td class="field">性别：</td>
                    <td>
                        <input type="radio" name="sex" value="男" checked="checked"/>男&nbsp;&nbsp;
                        <input type="radio" name="sex" value="女" checked="checked"/>
                    </td>
                </tr>
                <tr>
                    <td class="field">出生日期：</td>
                    <td><input type="text" id="birthday" name="birthday" class="Wdate" onclick="WdatePicker"/></td>
                </tr>
                <tr>
                    <td class="field">身份证号：</td>
                    <td><input class="text" type="text" id="dentityCode" name="dentityCode"/></td>
                </tr>
                <tr>
                    <td class="field">电子邮箱：</td>
                    <td><input class="text" type="text" id="email" name="email"/></td>
                </tr>
                <tr>
                    <td class="field">手机号码：</td>
                    <td><input class="text" type="text" id="mobile" name="mobile"/></td>
                </tr>
                <tr>
                    <td class="field">收货地址：</td>
                    <td><input class="text" type="text" id="address" name="address"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" id="submit" name="submit"/></td>
                    <td><input type="reset" id="reset" name="reset"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><font id="error" color="red"></font></td>
                </tr>
            </table>
        </form>
    </div>
</body>
<script type="text/javascript">
    function checkForm(){
        var userName=$("#userName").val();
        var password=$("#password").val();
        var rePassword=$("#rePassword").val();
        var mobile=$("#mobile").val();
        var address=$("#address").val();
        if(userName===""){
            $("#error").html("用户名不能为空！");
            return false;
        }
        if(password===""){
            $("#error").html("密码不能为空！");
            return false;
        }
        if(rePassword===""){
            $("#error").html("确认密码不能为空！");
            return false;
        }
        if(rePassword!==password){
            $("#error").html("密码与确认密码要相同！");
            return false;
        }
        if(mobile===""){
            $("#error").html("手机号不能为空！");
            return false;
        }
        if(address===""){
            $("#error").html("收货地址不能为空！");
            return false;
        }
    }

    function checkUserName(){
        var userName=$("#userName").val();
        if (userName==""){
            $("#userErrorInfo").html("用户名不能为空！");
            //鼠标仍在此输入框中
            $("#userName").focus();
            return;
        }else{
            $("#userErrorInfo").html("")
        }

        $.post("UserServlet?oper==checkName",{userName:userName},function (data){
                if(data=='true'){
                    $("#userErrorInfo").html("");
                }else {
                    $("#userErrorInfo").html("用户名已存在，请重新输入！");
                    $("#userName").focus();
                }
            })
    }
</script>
</html>
