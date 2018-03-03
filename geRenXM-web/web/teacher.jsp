<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/22
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>

    <title>Title</title>
</head>
<body>

<h1><font color="blue">分页查询</font></h1><hr>

<table border="1" align="center" bordercolor="red" width="50%">

    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    <%--//struts标签遍历输出--%>
    <s:iterator value="#request.pageBean.list" var="list">

        <tr>
            <th><s:property value="#list.gonhao"/></th>
            <th><s:property value="#list.kemu"/></th>
            <th><s:property value="#list.name"/></th>

        </tr>

    </s:iterator>

</table>

<center>

    <font size="5">共<font color="red"><s:property value="#request.pageBean.totalPage"/></font>页 </font>&nbsp;&nbsp;
    <font size="5">共<font color="red"><s:property value="#request.pageBean.allRows"/></font>条记录</font><br><br>

    <s:if test="#request.pageBean.currentPage == 0">
        首页&nbsp;&nbsp;&nbsp;上一页
    </s:if>

    <s:else>
        <a href="teacherAction.action">首页</a>
        &nbsp;&nbsp;&nbsp;
        <a href="teacherAction.action?page=<s:property value="#request.pageBean.currentPage - 1"/>">上一页</a>
    </s:else>

    <s:if test="#request.pageBean.currentPage != #request.pageBean.totalPage">
        <a href="teacherAction.action?page=<s:property value="#request.pageBean.currentPage + 1"/>">下一页</a>
        &nbsp;&nbsp;&nbsp;
        <a href="teacherAction.action?page=<s:property value="#request.pageBean.totalPage"/>">尾页</a>
    </s:if>

    <s:else>
        下一页&nbsp;&nbsp;&nbsp;尾页
    </s:else>

</center><br>






</body>
</html>
