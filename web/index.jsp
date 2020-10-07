<%--
  Created by IntelliJ IDEA.
  User: liu
  Date: 2020/9/24
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloWorld</title>
</head>
<body>
<form method="post" action="user/login">
    <label>用户名
        <input type="text" name="uno" />
    </label>
    <br />
    <label>密码
        <input type="password" name="password" />
    </label>
    <br />
    <lable>
    <input type="radio" name="authority" value="0" />
        管理员
    </lable>
    <lable>
        <input type="radio" name="authority" value="1" />
        教师
    </lable>
    <lable>
        <input type="radio" name="authority" value="2" />
        学生
    </lable>
    <input type="submit" />
</form>
</body>
</html>
