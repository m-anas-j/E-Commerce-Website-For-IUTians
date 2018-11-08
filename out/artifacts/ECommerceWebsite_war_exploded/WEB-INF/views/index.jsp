<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Weisslogia
  Date: 30-Sep-18
  Time: 1:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>


    <style>
        body
        {
            background: url("<c:url value="/resources/images/aesthetic1.jpg"/> ");
            background-size: cover;
        }
        .loginCard
        {
            height: 500px;
            width: 400px;
            top: 50%;
            left: 50%;
            position: absolute;
            padding: 20px;
            background: darkslategray;
            border-radius: 10px;
            box-sizing: border-box;
            transform: translate(-50%, -50%);
        }
        .loginIcon
        {
            margin-left: 115px;
        }
        input[type=text], input[type=password]
        {
            margin: 5px;
            padding: 5px;
            border: 1px  solid;
            height: 40px;
            width: 250px;
            border-radius: 5px;
            align-content: center;
        }

        input[type=submit]
        {
            width: 350px;
            height: 40px;
            border-radius: 10px;
            left: 50%;
            font-family: "Product Sans";
            color: whitesmoke;
            font-size: 1em;
            background: #b44b4b;
            border: black;
        }
        p{
            color: white;
            font-family: "Product Sans";
        }
        a
        {
            color: cornflowerblue;
            font-family: "Product Sans";
            margin-left: 80px;
        }
    </style>

</head>
<body>



<div class="loginCard">
    <img src="<c:url value="/resources/images/signup_icon_1.png"/> " height="128" class="loginIcon">
    <form action="login" id="loginForm" method="POST">
        <br>
        <br>
        <p>Username: <input type="text" size="30" height="30" name="userName" placeholder="Enter your username"></p>
        <p>Password : <input type="password" id="passWord" name="passWord" placeholder="Enter your password"/></p>
        <input type="submit" value="Log In"/>
        <br>
        <br>
        <a href="#">Need an account? <b><i>Sign up!</i></b></a>
    </form>
</div>


</body>
</html>
