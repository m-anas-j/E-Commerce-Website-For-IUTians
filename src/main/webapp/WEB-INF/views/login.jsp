<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Weisslogia
  Date: 14-Nov-18
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>


    <title>Login</title>

    <link href="<c:url value="/resources/css/shop-loginpage.css"/> " rel="stylesheet">

    <style >
        body{
            background: url("<c:url value="/resources/images/aesthetic2.jpg"/> ");
        }
    </style>



</head>
<body>

    <section class="intro">

        <div class="inner">

            <div class="content">
                
                <img src="<c:url value="/resources/images/signup_icon_1.png"/>" class="photo">
                <form method="post" action="signIn">
                    <p><input type="text" name="userName" placeholder="User Name" class="input1"></p>
                    <p><input type="password" name="passWord" placeholder="Password" class="input2"></p>
                    <br>
                    <input type="submit" value="Log In">
                </form>
                <form method="post" action="signUp">
                    <input type="submit" value="Sign Up" class="signup">
                </form>
                
            </div>

        </div>

    </section>



</body>
</html>
