<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/8/2018
  Time: 3:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="${contextRoot}/home">E-commerce website for IUTians</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item" id="home">
                    <a class="nav-link" href="${contextRoot}/home">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item" id="about">
                    <a class="nav-link" href="${contextRoot}/about">About</a>
                </li>
                <li class="nav-item" id="listProducts">
                    <a class="nav-link" href="${contextRoot}/listProducts">View Products</a>
                </li>
                <li class="nav-item" id="contact">
                    <a class="nav-link" href="${contextRoot}/contact">Contact</a>
                </li>
                <li class="nav-item" id="viewCart">
                    <a class="nav-link" href="${contextRoot}/viewCart">View Cart</a>
                </li>
                <li class="nav-item" id="login">
                    <a class="nav-link" href="${contextRoot}/login">Log In</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
