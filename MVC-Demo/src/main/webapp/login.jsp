<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="css/login.css" rel="stylesheet">
</head>

<body>
<div id="loginDiv" style="height: 350px">
    <form action="/MVC-Demo/loginServlet" method="post" id="form">
        <h1 id="loginMsg">LOGIN IN</h1>
        <div id="errorMsg">${login_msg} ${register_msg}</div>
        <label for="username">Username:</label><input id="username" name="username" value="${cookie.username.value}"
                                                      type="text">

        <label for="password">Password:</label><input id="password" name="password" value="${cookie.password.value}"
                                                      type="password">
        <label for="remember">Remember:</label><input id="remember" name="remember" value="1" type="checkbox">
        <div id="subDiv">
            <input type="submit" class="button" value="login up">
            <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
            <a href="register.jsp">没有账号？</a>
        </div>
    </form>
</div>


</body>
</html>