<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Weisslogia
  Date: 08-Nov-18
  Time: 2:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>E-commerce website for IUTians - ${title}</title>


    <script>
        window.menu='${title}';
    </script>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/> " rel="stylesheet">

    <!-- Bootstrap custom theme CSS -->
    <link href="<c:url value="/resources/css/bootstrap-theme.css"/> " rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/shop-homepage.css"/> " rel="stylesheet">

</head>

<body>

<div class="wrapper">

<!-- Navigation -->

<%@include file="./shared/navbar.jsp"%>



<!-- Page Content -->

<div class="content">
<!-- Load only when home is called -->
<c:if test="${userClickHome == true}">
    <%@include file="home.jsp"%>
</c:if>


<!-- Load only when user clicks about -->
<c:if test="${userClickAbout == true}">
    <%@include file="about.jsp"%>
</c:if>

<!-- Load only when user clicks about -->
<c:if test="${userClickContact == true}">
    <%@include file="contact.jsp"%>
</c:if>

</div>
<!-- Footer -->

<%@include file="./shared/footer.jsp"%>


<!-- Bootstrap core JavaScript -->
<script src="<c:url value="/resources/vendor/jquery/jquery.min.js"/> "></script>
<script src="<c:url value="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"/> "></script>


<!-- Self coded myapp.js file added -->
<script src="<c:url value="/resources/vendor/bootstrap/js/myapp.js"/> "></script>

</div>

</body>

</html>
