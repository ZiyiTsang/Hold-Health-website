<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 曾子懿
  Date: 2022/6/11
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <title>Register</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/register.css">
</head>




<%--</body>--%>
<body>
<div class="container">
    <div class="form row" style="margin-top: 120px;">
        <div style="color: red; text-align: center; margin-top: 10px;">${loginMsg}${Msg}</div>
        <h3 class="form-title" style="margin-left: 260px; font-family: times; font-weight: bold; font-size:30px;">Register</h3><br><br>


        <form style="margin-left: 110px;" action="<%= request.getContextPath()%>/registerServlet" method="post">
            <div  style="margin-top: 0px;">
                <p style="font-family: Times; font-size: 18px;">Basic Information</p>
                <div class="col-sm-4 col-md-4" >
                    <div class="form-group">
                        <!--        用户名图标和用户名输入框            -->
                        <i class="fa fa-user"></i>
                        <input class="form-control" type="text" name="username" id="username" placeholder="username" required autofocus>
                    </div>
                    <div class="form-group" >
                        <!--        用户名图标和用户名输入框            -->
                        <p>Gender: </p>
                        <input id="man" type="radio" checked="checked" name="1" /> Male<br>
                        <input id="woman" type="radio"  name="1"/> Female
                    </div>

                </div>

                <div class="col-sm-4 col-md-4" style="margin-left: 60px;">
                    <div class="form-group">
                        <i class="fa fa-key" aria-hidden="true"></i>
                        <input class="form-control " type="password" name="password" id="password" placeholder="password" required>
                    </div>
                    <div class="form-group" style="margin-top: 20px;">
                        <i class="fa fa-key" aria-hidden="true"></i>
                        <input class="form-control " type="password" name="passwordRepeat" id="passwordRepeat" placeholder="Repeat" required>
                    </div>
                </div>

                <p style="font-family: Times; font-size: 18px; margin-top: 160px;">Man-machine detection</p>
                <div class="form-group">

                    <div class ="col-md-4">
                        <i class="fa fa-key" aria-hidden="false"></i>
                        <input class="form-control " type="text" name="code" id="code" placeholder="code" required style="width:  100px;">
                    </div>

                    <div class ="col-md-4" style="margin-left: 40px;">
                        <img src="${pageContext.request.contextPath}/CodeServlet" id="checkcodeimg" style="width: 120px;margin-bottom: 15px;">
                        <a href="#" id="change" onclick="">Refresh the code</a>
                    </div>

                </div><br><br><br>
                <!--        用超链接跳转到注册页面               -->

                <!--         register button           -->
                <div class="form-group" style="margin-top: 50px; margin-left: 320px;">
                    <input type="submit" value="Register" class="btn btn-success">
                </div>
                <div class="form-group">
                    <br>
                    <a href="${pageContext.request.contextPath}/homepage.html" class="text-sm text-muted"><small>back</small></a>
                    <a href="${pageContext.request.contextPath}/login.jsp" class="text-sm text-muted"  style="margin-left: 320px;"><small>login</small></a>
                </div>
            </div><br>

        </form>
    </div>
</div>
<script src="./js/bootstrap.min.js"></script>
<script>
    document.getElementById("change").onclick=function () {
        document.getElementById("checkcodeimg").src="${pageContext.request.contextPath}/CodeServlet?"+Math.ceil(Math.random()*10000);
    }
</script>
</body>

</html>
<%
    /*
    男生头像
https://s1.328888.xyz/2022/06/16/0uGfR.jpg
https://s1.328888.xyz/2022/06/16/0uuMS.jpg
https://s1.328888.xyz/2022/06/16/0ug0i.jpg
https://s1.328888.xyz/2022/06/16/0u9Fv.jpg

女生头像
https://s1.328888.xyz/2022/06/16/0uLG0.jpg
https://s1.328888.xyz/2022/06/16/0uXtJ.jpg
https://s1.328888.xyz/2022/06/16/0ufOF.jpg
https://s1.328888.xyz/2022/06/16/0uixW.jpg
* */
%>
