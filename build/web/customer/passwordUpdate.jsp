<%-- 
    Document   : updatePassword
    Created on : Dec 15, 2023, 12:32:52 AM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer | Reset Password</title>

        <link rel="stylesheet" href="../customer/bootstrap/css/mdb.min.css">
        <script src="../customer/owl-carousel/jquery.min.js"></script>
    </head>
    <body style="background-color: #f5f5f5;">

        <%
            String email = request.getParameter("email");
        %>
        <div class="container">
            <div class="card mt-3">

                <div class="text-center p-5">
                    <h1 class="fw-bold" ><span class="text-warning">PRASANNA</span> DRESS POINT</h1>
                    <h1>Change Your New Password</h1>
                    <p class="lead">Please Enter Your new password and confirm it.</p>
                    <form>
                        <!-- Password input -->

                        <div class="row">
                            <div class="col-sm-3"></div>
                            <div class="col-sm-6">

                                <div class="form-outline">
                                    <input type="email" id="typeEmail" class="form-control my-3" value="<%=email%>"  disabled/>
                                    <label class="form-label" for="typeEmail">Email input</label>
                                </div>


                            </div>
                            <div class="col-sm-3"></div>



                            <div class="col-sm-3"></div>
                            <div class="col-sm-6">
                                <div class="row">
                                    <span style="color: red; font-size: 11px;" id="name_error_pass" class="mt-0"></span>

                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="password" id="newpassword" class="form-control" />
                                            <label class="form-label" for="newpassword">Password</label>

                                        </div>
                                    </div> 
                                </div>

                            </div>
                            <div class="col-sm-3"></div>


                            <div class="col-sm-3"></div>
                            <div class="col-sm-6">
                                <div class="row">
                                    <span style="color: red; font-size: 11px;" id="name_error_compass" class="mt-0"></span>
                                    <div class="d-flex flex-row align-items-center mb-4">
                                        <div class="form-outline flex-fill mb-0">
                                            <input type="password" id="comfirmpassword"  class="form-control"  />
                                            <label class="form-label" for="comfirmpassword">Confirm your password</label>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="col-sm-3"></div>


                            <div class="col-sm-3"></div>
                            <div class="col-sm-6">
                                <div class="row">
                                    <p class="text mb-0" id="chareight" style="font-size: 12px; color: #4f4f4f;">Min. 8 characters</p>
                                    <p class="text mb-0" id="lownum" style="font-size: 12px; color: #4f4f4f;">Include lowercase letter</p>
                                    <p class="text mb-0" id="num" style="font-size: 12px; color: #4f4f4f;"> Include number</p>
                                    <p class="text mb-0" id="upper" style="font-size: 12px; color: #4f4f4f;">Include uppercase letter</p>
                                    <p class="text mb-2" id="spec" style="font-size: 12px; color: #4f4f4f;">Include a special character: #.-?!@$%^&*</p>

                                </div>

                            </div>
                            <div class="col-sm-3"></div>

                            <div class="col-sm-3"></div>
                            <div class="col-sm-6">
                                <div class="row">
                                    <button type="button" id="btnpwUpdate" class="btn btn-primary mb-3 btn-block">Update</button>
                                </div>                              
                            </div>
                            <div class="col-sm-3"></div>
                        </div>

                    </form>

                </div>
            </div>
        </div>

        <!-- FOOTER -->
        <footer class="footer mt-5 text-muted text-center text-small">
            <p>Developed by Pubudu Kasun &copy; 2023, All Rights Reserved.</p>
        </footer>
    </body>


    <script>
        $(document).ready(function () {
            $("#btnpwUpdate").click(function () {
                const pass = document.getElementById("newpassword").value;
                const compass = document.getElementById("comfirmpassword").value;
                const email = document.getElementById("typeEmail").value;
                $.ajax({
                    type: 'POST',
                    url: "/Ecom_final_project/passwordUpdate",
                    data: {"pass": pass, "compass": compass, "email": email},
                    success: function (data) {
                        if (data === "00") {
                            window.location = "/Ecom_final_project/customer/signin.jsp";
                        } else {
                            window.location = "/Ecom_final_project/customer/passwordUpdate.jsp?email="+email;
                        }
                    },
                    error: function () {

                    }
                });
            });
        });
    </script>

    <script type="text/javascript" src="../customer/bootstrap/js/mdb.min.js" ></script>
    <script type="text/javascript" src="../customer/external_js/forgotPassValidation.js" ></script>
</html>
