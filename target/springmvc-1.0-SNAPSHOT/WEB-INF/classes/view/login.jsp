<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>

<body>
<h1>密码错误，请重新登录</h1>
<form action="/user/login" method="post">
    <h2>${info}</h2>
    <input type="text" name="name"><br>
    <input type="password" name="password"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>