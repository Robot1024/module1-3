<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<!-- JSTL 函数 包含一系列标准函数，大部分是通用的字符串处理函数-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!-- JSTL 核心标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- JSTL 格式化标签 用来格式化并输出文本、日期、时间、数字 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- JSTL SQL标签库 提供了与关系型数据库进行交互的标签 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!-- JSTL XML标签库 提供了创建和操作XML文档的标签 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<html>
<head>
</head>
<body>
</body>
<table>
    　　<thead>
　　　　<tr>
    　　<th>id</th>
    　　<th>姓名</th>
    　　<th>地址</th>
    　　<th>电话</th>
        <th>
            <a href="/add.jsp">新增</a>
        </th>
    　　</tr>
　　</thead>
<c:forEach items="${resumes}" var="resume">
    <tr>
        <td>${resume.id}</td>
        <td>${resume.name}</td>
        <td>${resume.address}</td>
        <td>${resume.phone}</td>
        <td>
            <a href="/resume/query/${resume.id}">编辑</a>
            <a href="/resume/delete/${resume.id}">删除</a>
        </td>
    </tr>
</c:forEach>
</table>


</html>
