<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/25
  Time: 4:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>

<style type="text/css">
    .img{
        position: absolute;
        margin-right: 500px;
    }
</style>

<head>
    <title>Title</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
</head>
<body>



<s:form action="loginValidateAction" theme="simple">

    用户名:<s:textfield name="username"></s:textfield><br>
    密码    :<s:password name="password"></s:password><br>
    验证码:<s:textfield name="checkCode"></s:textfield><br>
    　　　　　
    　　　　　<!--若要点击图片刷新，重新得到一个验证码，要在后面加上个随机数，这样保证每次提交过去的都是不一样的path，防止因为缓存而使图片不刷新-->
    <img class="img" src="createImageAction.action" onclick="this.src='createImageAction.action?'+ Math.random()" title="点击图片刷新验证码"/><br>
    <s:actionerror cssStyle="color:red"/>

    <s:submit value="提交"></s:submit>

</s:form>
</body>
</html>
