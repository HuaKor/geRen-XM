<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--用到Struts2 -core 里的标钱-->
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>查询</title>
</head>
<style type="text/css" >
    #tr th{
        background-color:dodgerblue;
        background: deepskyblue;
        font-family: "Bradley Hand ITC";
        margin-left:200px;
    }
</style>

<body>

<form action="RenYuanUpdate.action" rel="stylesheet">
    id:<input type="text" name="id"/><br/>
    name:<input type="text" name="name"/><br/>
    sex:<input type="text" name="sex"/><br/>
    height:<input type="text" name="height"/><br/>
    手机号码：<input type="text" name="sjhm"/><br/>
    <input type="submit" value="修改"/>
</form>

<table border="1px" cellpadding="0px">
    <tr id="tr">
        <th>id</th>
        <th>name</th>
        <th>sex</th>
        <th>height</th>
        <th>手机号码</th>
        <th>操作</th>
    </tr>
    <c:forEach var="s" items="${requestScope.list}">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.sex}</td>
            <td>${s.height}</td>
            <td>${s.sjhm}</td>
            <<td>
                <a href="RenYuanAdd.jsp">添加</a>
                <a onclick="sc()" href="RenYuanDelete.action?id=${s.id}">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>


<script>
    function sc() {
        alert("你真的要删除吗？");
    }
</script>

</body>
</html>
