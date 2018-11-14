<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.webproject.entity.ProductTableEntity" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/8/2018
  Time: 3:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">

    <div class="row">


        <div class="col-lg-3">

            <h1 class="my-4">Shopping Cart</h1>


        </div>
        <!-- /.col-lg-3 -->

        <div class="col-lg-9">

            <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active">
                        <img class="d-block img-fluid" src="<c:url value="/resources/images/book-main.JPG"/> "
                             alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="<c:url value="/resources/images/laptop.jpg"/>"
                             alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid" src="<c:url value="/resources/images/phone.jpg"/>"
                             alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>


            <div class="row">

                <%
                    List<ProductTableEntity> shoppingCart = (List<ProductTableEntity>) request.getAttribute("shoppingCart");
                    if (shoppingCart == null)
                    {

                %>
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card h-100">
                        <p>CART EMPTY</p>
                    </div>
                </div>
                <%

                    } else {


                        for (int i = 0; i < shoppingCart.size(); i++) {
                %>
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card h-100">
                        <a href="#"><img class="card-img-top"
                                         src="<c:url value="<%=shoppingCart.get(i).getImageUrl()%>"/>"
                                         alt=""></a>
                        <div class="card-body">
                            <h4 class="card-title">
                                <a href="#"><%=shoppingCart.get(i).getName()%>
                                </a>
                            </h4>
                            <h5><%=shoppingCart.get(i).getPrice()*shoppingCart.get(i).getQuantity()%> bdt</h5>
                            <p class="card-text"><%=shoppingCart.get(i).getDescription()%>
                            </p>
                            <form action="updateCart">
                                <h5> Quantity: <input type="text" name="productQuantity" style="width: 75px" value="<%=shoppingCart.get(i).getQuantity()%>"> </h5>
                                <input type="hidden" name="productId" value="<%=shoppingCart.get(i).getId()%>">
                                <input type="submit" value="Update Cart">
                            </form>
                        </div>
                        <div class="card-footer">
                            <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>

                        </div>
                    </div>
                </div>
                <%
                        }
                    }
                %>
            </div>
            -

            <!-- /.row -->

        </div>
        <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

</div>
<!-- /.container -->
