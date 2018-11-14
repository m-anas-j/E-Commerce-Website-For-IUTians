<%@ page import="java.util.List" %>
<%@ page import="com.webproject.entity.ProductTableEntity" %><%--
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

            <h1 class="my-4">Shop Name</h1>
            <div class="list-group">
                <a href="#" class="list-group-item">Computers</a>
                <a href="#" class="list-group-item">Gadgets</a>
                <a href="#" class="list-group-item">Books</a>
            </div>

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
                    List<ProductTableEntity> productList = (List<ProductTableEntity>) request.getAttribute("productList");
                    for (int i=0; i<productList.size();i++)
                    {
                %>
                <div class="col-lg-4 col-md-6 mb-4">
                    <div class="card h-100">
                        <a href="#"><img class="card-img-top" src="<c:url value="<%=productList.get(i).getImageUrl()%>"/>"
                                         alt=""></a>
                        <div class="card-body">
                            <h4 class="card-title">
                                <a href="#"><%=productList.get(i).getName()%></a>
                            </h4>
                            <h5 style="color: green"><%=productList.get(i).getPrice()%>৳</h5>
                            <p class="card-text"><%=productList.get(i).getDescription()%></p>
                        </div>
                        <div class="card-footer">
                            <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                            <form action="addToCart">
                                <input type="hidden" name="productId" value="<%=productList.get(i).getId()%>">
                                <input type="submit" value="Add to cart">
                            </form>
                            <form action="viewCart">
                                <input type="submit" value="View Cart">
                            </form>
                        </div>
                    </div>
                </div>
                <%
                    }
                %>
            </div>
            <!-- /.row -->

        </div>
        <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

</div>
<!-- /.container -->
