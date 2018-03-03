<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/25
  Time: 0:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>游戏</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">

    <script src="js/jquery-1.12.4.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/login.js"></script>

</head>
<body>
    <input type="text" placeholder="单击图片刷新验证码" name="securityCodecode" id="codeinput">
    <img src="Security/createVerificationCode" alt="验证码" id="Verify" style="margin-left: 1px;">
    <span id="msg"></span>
</body>
</html>
