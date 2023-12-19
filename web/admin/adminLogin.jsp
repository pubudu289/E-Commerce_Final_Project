<%-- 
    Document   : adminLogin
    Created on : Dec 20, 2023, 1:40:36 AM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin | Log in</title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
        <!-- icheck bootstrap -->
        <link rel="stylesheet" href="plugins/icheck-bootstrap/icheck-bootstrap.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="dist/css/adminlte.min.css">
    </head>
    <body class="hold-transition login-page">
        <%
            if (request.getSession().getAttribute("UserData") != null) {
                response.sendRedirect("/Ecom_final_project/admin/index.jsp");
            }
        %>
        <div class="login-box">
            <!-- /.login-logo -->
            <div class="card card-outline card-primary">
                <div class="card-header text-center">
                    <h3 class="font-weight-bold"><span class="text-warning">PRASANNA </span>DRESS POINT</h3>
                </div>
                <div class="card-body">
                    <p class="login-box-msg">Sign in</p>

                    <form  method="post">
                        <div class="input-group mb-3">
                            <input type="email" class="form-control" id="txtemail" placeholder="Email">
                            <div class="input-group-append">
                                <div class="input-group-text">
                                    <span class="fas fa-envelope"></span>
                                </div>
                            </div>
                        </div>
                        <div class="input-group mb-3">
                            <input type="password" class="form-control" id="txtpassword" placeholder="Password">
                            <div class="input-group-append">
                                <div class="input-group-text">
                                    <span class="fas fa-lock"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-8">
                                <div class="icheck-primary">
                                    <input type="checkbox" id="remember">
                                    <label for="remember">
                                        Remember Me
                                    </label>
                                </div>
                            </div>
                            <!-- /.col -->
                            <div class="col-4">
                                <button type="button" id="btnSignin" class="btn btn-warning btn-block">Sign In</button>
                            </div>
                            <!-- /.col -->
                        </div>
                    </form>

                    <div class="social-auth-links text-center mt-2 mb-3">
                        <a href="#" class="btn btn-block btn-primary">
                            <i class="fab fa-facebook mr-2"></i> Sign in using Facebook
                        </a>
                        <a href="#" class="btn btn-block btn-danger">
                            <i class="fab fa-google-plus mr-2"></i> Sign in using Google+
                        </a>
                    </div>
                    <!-- /.social-auth-links -->

                    <p class="mb-1">
                        <a href="forgot-password.html">I forgot my password</a>
                    </p>
                    <p class="mb-0">
                        <a href="register.html" class="text-center">Register a new membership</a>
                    </p>
                </div>
                <!-- /.card-body -->
            </div>
            <!-- /.card -->
        </div>
        <!-- /.login-box -->

        <!-- jQuery -->
        <script src="plugins/jquery/jquery.min.js"></script>
        <!-- Bootstrap 4 -->
        <script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- AdminLTE App -->
        <script src="dist/js/adminlte.min.js"></script>




        <script>
            $(document).ready(function () {
                $("#btnSignin").click(function () {
                    const email = document.getElementById("txtemail").value;
                    const password = document.getElementById("txtpassword").value;
                    const checkbox = document.getElementById("remember");

                    if (email && password && checkbox.checked) {

                        $.ajax({
                            type: 'POST',
                            url: "/Ecom_final_project/AdminLogin",
                            data: {"email": email, "password": password},
                            success: function (data) {
                                if (data === "00") {
                                    alert("login success")
                                    window.location = "/Ecom_final_project/admin/index.jsp";
                                } else {
                                    alert("Try again...")
                                    window.location = "/Ecom_final_project/admin/adminLogin.jsp";
                                }
                            },
                            error: function () {

                            }
                        });
                    }


                });
            });
        </script>


    </body>
</html>

