<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/12/6
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="text" name="captcha">
<section>
    <img src="/utils/imagecheck" onclick="changImg(this)">
</section>

<script>

    function changImg(img) {
        // 浏览器有一个缓存特性,
        // 第一次从服务器获取图片，浏览器第二次发送请求时发现地址没有改变，就会使用第一次的图片，而不会真正发送请求
        // 为了让浏览器每次都把请求发送给服务器，给一个时间参数
        img.src = "/utils/image?t="+new Date().getTime(); // 给src赋一个新值，就会向新值的地址发送一次请求
    }
</script>
</body>
</html>
