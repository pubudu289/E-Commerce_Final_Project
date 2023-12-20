<%-- 
    Document   : adminForgotPassword
    Created on : Dec 20, 2023, 12:35:00 PM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin | Forgot Password</title>

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
        <div class="login-box">
            <div class="login-logo">
                <h3 class="font-weight-bold"><span class="text-warning">PRASANNA </span>DRESS POINT</h3>
            </div>
            <!-- /.login-logo -->
            <div class="card">
                <div class="card-body login-card-body">
                    <p class="login-box-msg">You forgot your password? Here you can easily retrieve a new password.</p>

                    <form  method="post">
                        <div class="input-group mb-3">
                            <input type="email" class="form-control" id="txtemail" placeholder="Email">
                            <div class="input-group-append">
                                <div class="input-group-text">
                                    <span class="fas fa-envelope"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-12">
                                <button type="button" id="forgotPw" class="btn btn-primary btn-block">Request new password</button>
                            </div>
                            <!-- /.col -->
                        </div>
                    </form>

                    <p class="mt-3 mb-1">
                        <a href="login.html">Login</a>
                    </p>

                </div>
                <!-- /.login-card-body -->
            </div>
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
                $("#forgotPw").click(function () {
                    const email = document.getElementById("txtemail").value;
                    $.ajax({
                        type: 'POST',
                        url: "/Ecom_final_project/AdminForgotPassword",
                        data: {"txtemail": email},
                        success: function (data) {
                            if (data === "00") {
                                window.location = "/Ecom_final_project/admin/adminVerifyotp.jsp?email=" + email;
                            } else if (data === "01") {
                                window.location = "/Ecom_final_project/admin/adminLogin.jsp";

                            } else {
                                alert("user Not Found");
                            }
                        },
                        error: function () {

                        }
                    });
                });
            });
        </script>

    </body>
</html>

