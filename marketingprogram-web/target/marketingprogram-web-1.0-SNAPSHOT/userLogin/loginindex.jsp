<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/8
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    #submit {
        background-color: blue;
        color: white;
        height: 42px;
        width: 215px;
    }

    .loginindex {
        text-align: center
    }

    .bd {
        margin: auto;
        border: 1px white solid;
        width: 500px;
        height: 500px
    }

    .msg {
        color: red
    }

    tr {
        height: 44px
    }

    .kuang {
        height: 30px
    }

    .th {
        border: gainsboro 1px solid;
        width: -moz-max-content;
        height: 90px;
        margin: auto;
        background-color: gainsboro
    }
</style>
<body>

<form action="/userLogin/login" method="post" onsubmit="return check()">
    <div class="th">
        <h1 align="center" style="color: darkslateblue">精准营销登录</h1>
    </div>
    <br>

    <div class="bd">
        <table class="loginindex" id="tb" align="center">
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username" id="username" placeholder="用户名" class="kuang"
                           onchange="msgclear()"></td>
                <td>
                    <div name="usernameMsg" id="usernameMsg" class="msg">${requestScope.usernameMsg}</div>
                </td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password" id="password" placeholder="请输入密码" class="kuang"
                           onchange="msgclear()"></td>
                <td>
                    <div name="passwordMsg" id="passwordMsg" class="msg">${requestScope.passwordMsg}</div>
                </td>
            </tr>
            <tr>
                <td>验证码</td>
                <td><input type="text" name="captcha" id="captcha" placeholder="请输入验证码" class="kuang"
                           onchange="msgclear()"></td>
                <td><img src="/utils/imagecheck" onclick="changImg(this)"></td>
                <td>
                    <div name="captchaMsg" id="captchaMsg" class="msg">${requestScope.captchaMsg}</div>
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="登录" id="submit" style="font-size: 18px"></td>

            </tr>
            <tr>
                <td><a href="userforgetpassword/forgetindex.jsp">忘记密码</a></td>
                <td align="right"><a href="userregister/register.jsp">注册账号</a></td>
            </tr>
        </table>
    </div>
</form>

<script>

    function changImg(img) {
        // 浏览器有一个缓存特性,
        // 第一次从服务器获取图片，浏览器第二次发送请求时发现地址没有改变，就会使用第一次的图片，而不会真正发送请求
        // 为了让浏览器每次都把请求发送给服务器，给一个时间参数
        img.src = "/utils/imagecheck?t=" + new Date().getTime(); // 给src赋一个新值，就会向新值的地址发送一次请求
    }


    function msgclear() {
        document.getElementById("usernameMsg").innerText = "";
        document.getElementById("passwordMsg").innerText = "";
        document.getElementById("captchaMsg").innerText = "";
    }

    <!--判断用户名,密码,验证码是否为空-->
    function check() {

        document.getElementById("usernameMsg").innerText = "";
        document.getElementById("passwordMsg").innerText = "";
        document.getElementById("captchaMsg").innerText = "";
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
        var captcha = document.getElementById("captcha").value;
        var flag1 = true;
        var flag2 = true;
        var flag3 = true;


        if (username == null | username == "") {
            document.getElementById("usernameMsg").innerText = "用户名不能为空";
            flag1 = false;
        }

        if (password == null | password == "") {
            document.getElementById("passwordMsg").innerText = "密码不能为空";
            flag2 = false;
        }

        if (captcha == null | captcha == "") {
            document.getElementById("captchaMsg").innerText = "验证码不能为空";
            flag3 = false
        }


        <!--返回true,可提交-->
        if (flag1 && flag2 && flag3) {
            return true;
        } else {
            return false;
        }

    }


</script>
</body>
</html>
