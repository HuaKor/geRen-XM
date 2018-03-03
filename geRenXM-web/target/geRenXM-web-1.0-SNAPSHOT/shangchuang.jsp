<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/26
  Time: 2:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上床</title>
</head>
<body>
   <%-- <form action="simpleFileupload" method="post" enctype="multipart/form-data">
        最简单的文件上传：<input type="file" name="fileupload"/>
        描述：<input type="text" name="desc"/>
        <input type="submit" value="submit"/>
    </form>
--%>
   <form action="upload1.do" method="post" enctype="multipart/form-data">
       用户名：<input type="text" name="username"><br/>
       兴趣：
       <input type="checkbox" name="hobby" value="eat">吃
       <input type="checkbox" name="hobby" value="drink">喝
       <input type="checkbox" name="hobby" value="play">玩
       <input type="checkbox" name="hobby" value="happy">乐
       <br/>
       头像：<input type="file" name="touXiang"/><br/>
       <input type="submit" value="提交"/><br/>
   </form>


</body>
</html>
