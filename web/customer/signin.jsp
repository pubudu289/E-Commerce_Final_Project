<%-- 
    Document   : signinpage
    Created on : Nov 26, 2023, 11:16:50 AM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignIn</title>
        <%@include file="../customer/Main/resourse.jsp" %>
    </head>
    <body>
        <%
            if (request.getSession().getAttribute("UserData") != null) {
                response.sendRedirect("/Ecom_final_project/customer/main.jsp");
            }
        %>
        <section class="vh-100">
            <div class="container py-5 h-100">
                <div class="row d-flex align-items-center justify-content-center h-100">
                    <div class="col-md-8 col-lg-7 col-xl-6">
                        <h2 class=" text-center"><strong><span class="text-warning"> PRASANNA </span> DRESS POINT</strong></h2>

                        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
                             class="img-fluid" alt="Phone image">
                    </div>
                    <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
                        <form>
                            <h3 class="mt-3"><strong>Sign In Now</strong></h3>
                            <!-- Email input -->
                            <div class="form-outline mb-4">
                                <input type="email" id="txtemail" class="form-control form-control-lg" />
                                <label class="form-label" for="form1Example13">Email address</label>
                            </div>

                            <!-- Password input -->
                            <div class="form-outline mb-4">
                                <input type="password" id="txtpass" class="form-control form-control-lg" />
                                <label class="form-label" for="form1Example23">Password</label>
                            </div>

                            <div class="d-flex justify-content-around align-items-center mb-4">
                                <!-- Checkbox -->
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" value="" id="form1Example3" checked />
                                    <label class="form-check-label" for="form1Example3"> Remember me </label>
                                </div>
                                <a href="#!"  data-mdb-toggle="modal" data-mdb-target="#exampleModal">Forgot password?</a>
                            </div>

                            <!-- Submit button -->
                            <button type="button" class="btn btn-warning  btn-lg btn-block" id="signinbtn">Sign in</button>
                            <p class="text-center text-muted mt-1"><small>Register Now for Free By Clicking <a class="term" href="../customer/signup.jsp">Register Now</a> Button </small></p>
                            <div class="divider d-flex align-items-center my-4">
                                <p class="text-center fw-bold mx-3 mb-0 text-muted">OR</p>
                            </div>

                            <a class="btn btn-primary btn-lg btn-block" style="background-color: #3b5998" href="#!"
                               role="button">
                                <i class="fab fa-facebook-f me-2"></i>Continue with Facebook
                            </a>
                            <a class="btn btn-danger btn-lg btn-block" style="background-color: #b02a37" href="#!"
                               role="button">
                                <i class="fab fa-google me-2"></i>Continue with Google</a>

                        </form>
                    </div>
                </div>
            </div>
        </section>

        <!-- Modal -->
        <div class="modal top fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
             aria-hidden="true" data-mdb-backdrop="true" data-mdb-keyboard="true">
            <div class="modal-dialog" style="width: 300px;">
                <div class="modal-content text-center">
                    <div class="modal-header h5 text-white bg-primary justify-content-center">
                        Password Reset
                    </div>
                    <div class="modal-body px-5">
                        <p class="py-2">
                            Enter your email address and we'll send you an email with instructions to reset your password.
                        </p>
                        <div class="form-outline">
                            <input type="email" id="typeEmail" class="form-control my-3" />
                            <label class="form-label" for="typeEmail">Email input</label>
                        </div>
                        <a href="#" id="sendOTP" class="btn btn-primary w-100">Send OTP</a>

                    </div>
                </div>
            </div>
        </div>




    </body>
    <script>

        $(document).ready(function () {
            $('#signinbtn').click(function () {

                var email = $('#txtemail').val();
                var password = $('#txtpass').val();


                $.ajax({
                    type: 'POST',
                    url: "/Ecom_final_project/CustomerLogin",
                    data: {"txtemail": email, "password": password},
                    success: function (data) {
                        if (data === "00") {
                            alert("login success")
                            window.location = "/Ecom_final_project/customer/main.jsp";
                        } else {
                            alert("Try again...")
                            window.location = "/Ecom_final_project/customer/signin.jsp";
                        }
                    },
                    error: function () {

                    }

                });

            });
        });


        $(document).ready(function () {
            $("#sendOTP").click(function () {

                const  email = document.getElementById("typeEmail").value;

                $.ajax({
                    type: 'POST',
                    url: "/Ecom_final_project/OTPController",
                    data: {txtEmail: email},
                    success: function (data) {
                        if (data === "00") {
                            window.location = "/Ecom_final_project/customer/verify.jsp?email=" + email;
                        } else if (data === "01") {
                            window.location = "/Ecom_final_project/customer/signin.jsp";

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
    <script type="text/javascript" src="../customer/bootstrap/js/mdb.min.js" ></script>

</html>
