<%@ page language="java" import="java.util.*"  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>

<form method="post" action="/resume/add">
    姓名：<input type="text" name="name"><br>
    地址：<input type="text" name="address"><br>
    电话：<input type="text" name="phone"><br>
    <input type="hidden" name="_method" value="put"/>
    <input type="submit" value="保存"/>
</form>

</body>
</html>
