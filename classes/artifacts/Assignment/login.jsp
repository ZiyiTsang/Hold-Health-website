<%--
  Created by IntelliJ IDEA.
  User: 曾子懿
  Date: 2022/6/11
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <title>login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/Login.css">
</head>

<body>
<div class="container">
    <div class="form row" style="margin-top: 240px;">
        <form class="form-horizontal col-sm-offset-3 col-md-offset-3" action="<%= request.getContextPath()%>/loginServlet" method="post">

            <h3 class="form-title" style="margin-left: 70px; font-family: times; font-weight: bold; font-size:30px;">Login</h3>
            <div style="color: red;margin-left:40px;">${loginMsg}${Msg}</div>
            <div style="color: red;margin-left:50px;">${Msg2}</div>
            <br>
            <div class="col-sm-9 col-md-9">
                <div class="form-group">
                    <!--        用户名图标和用户名输入框            -->
                    <i class="fa fa-user" aria-hidden="true"></i>
                    <input class="form-control" type="text" name="username" id="username" placeholder="username" required autofocus>
                </div>
                <!--        密码图标和密码输入框                -->
                <div class="form-group">
                    <i class="fa fa-key" aria-hidden="true"></i>
                    <input class="form-control " type="password" name="password" id="password" placeholder="password" required>
                </div>
                <!--        用超链接跳转到注册页面               -->
                <br>
                <!--         登录按钮           -->
                <div class="form-group">
                    <input type="submit" value="login" class="btn btn-success pull-right">
                </div>
                <div class="form-group smallText">
                    <br>
                    <a href="${pageContext.request.contextPath}/homepage.html" class="text-sm text-muted" style="float: right;">
                        <small>back</small>
                    </a>
                    <a href="register-email.jsp?id=1" class="text-sm text-muted " style="float: left;">
                        <small>Register</small>
                    </a>
                </div><br>
            </div>
        </form>
    </div>
</div>
</body>

</html>
