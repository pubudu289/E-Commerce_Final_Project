<%-- 
    Document   : mainheaderbar
    Created on : Nov 24, 2023, 2:46:51 PM
    Author     : Pubudu Kasun
--%>

<%@page import="DTO.LoginDTO.LoginDTO"%>
<!--navbar start-->
<div class="superNav border-bottom py-2 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-lg-5 col-md-5 col-sm-12 col-xs-12 centerOnMobile">

                <select  class="me-3 border-0 bg-light">
                    <option value="en-us">EN-US</option>
                </select>

                <!--cart notify Start-->
                <span class="me-4" >
                    <a class="text-reset me-1 dropdown-toggle hidden-arrow"
                       href="#"
                       id="navbarDropdownMenuLink"
                       role="button"
                       data-mdb-toggle="dropdown"
                       aria-expanded="false"
                       >
                        <i class="fa-solid fa-shopping-cart me-1 text-warning"></i>
                        <span class="badge rounded-pill badge-notification bg-success">2</span>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-end"
                        aria-labelledby="navbarDropdownMenuLink">
                        <li>
                            <a class="dropdown-item" href="#">Some news</a>
                        </li>

                    </ul>
                </span>
                <!--Cart notify End-->

                <!-- Notifications Start-->
                <span class="me-4" >
                    <a class="text-reset me-1 dropdown-toggle hidden-arrow"
                       href="#"
                       id="navbarDropdownMenuLink"
                       role="button"
                       data-mdb-toggle="dropdown"
                       aria-expanded="false"
                       >
                        <i class="fa-solid fa-bell me-1 text-warning"></i>
                        <span class="badge rounded-pill badge-notification bg-danger">6</span>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-end"
                        aria-labelledby="navbarDropdownMenuLink">
                        <li>
                            <a class="dropdown-item" href="#">Some news</a>
                        </li>
                        <li>
                            <a class="dropdown-item" href="#">Another news</a>
                        </li>
                        <li>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </li>
                    </ul>
                </span>
                <!-- Notifications End-->
                <!-- Avatar Start -->
                <%
                    if (request.getSession().getAttribute("UserData") != null) {
                        LoginDTO ldto = (LoginDTO) request.getSession().getAttribute("UserData");


                %>
                <span class="me-4" >
                    <a class="text-reset me-1 dropdown-toggle hidden-arrow"
                       href="#"
                       id="navbarDropdownMenuLink"
                       role="button"
                       data-mdb-toggle="dropdown"
                       aria-expanded="false"
                       >
                        <img
                            src="https://mdbcdn.b-cdn.net/img/new/avatars/2.webp"
                            class="rounded-circle"
                            height="25"
                            alt="User"
                            loading="lazy"
                            />
                    </a>
                    <ul
                        class="dropdown-menu dropdown-menu-end"
                        aria-labelledby="navbarDropdownMenuAvatar">
                        <li>
                            <a class="dropdown-item" href="#"><%=ldto.getFnme() + " "+ ldto.getLname()%> </a>
                        </li>
                        <li>
                            <a class="dropdown-item" href="#">Settings</a>
                        </li>
                        <li>
                            <a class="dropdown-item" href="/Ecom_final_project/SessionExpire">Log out</a>
                        </li>
                    </ul>
                </span>

                <%                } else {
                %>

                <span class="me-4" >
                    <a class="text-reset me-1 dropdown-toggle hidden-arrow"
                       href="#"
                       id="navbarDropdownMenuLink"
                       role="button"
                       data-mdb-toggle="dropdown"
                       aria-expanded="false"
                       >
                        <img
                            src="customer/images/userimage/userempty.png"
                            class="rounded-circle"
                            height="25"
                            alt="User"
                            loading="lazy"
                            />
                    </a>
                    <ul
                        class="dropdown-menu dropdown-menu-end"
                        aria-labelledby="navbarDropdownMenuAvatar">
                        <li>
                            <a class="dropdown-item" href="/Ecom_final_project/customer/signin.jsp">Log In</a>
                        </li>
                    </ul>
                </span>
                <%
                    }

                %>



                <!-- Avatar End -->

            </div>
            <div class="col-lg-7 col-md-7 col-sm-12 col-xs-12 d-none d-lg-block d-md-block-d-sm-block d-xs-none text-end">
                <span class="d-none d-lg-inline-block d-md-inline-block d-sm-inline-block d-xs-none me-3"><strong>prasannadresspoint@gmail.com</strong></span>
                <span class="me-3"><i class="fa-solid fa-phone me-1 text-warning"></i> <strong>+94-775641235</strong></span>
                <span class="me-3"><i class="fa-solid fa-truck text-muted me-1"></i><a class="text-muted text-decoration-none" href="#">Shipping</a></span>
                <span class="me-3"><i class="fa-solid fa-file  text-muted me-2"></i><a class="text-muted text-decoration-none"  href="#">Policy</a></span>
            </div>
        </div>
    </div>
</div>
