<%-- 
    Document   : adminVerifyotp
    Created on : Dec 20, 2023, 1:26:45 PM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">

        <link rel="stylesheet" href="../customer/bootstrap/css/mdb.min.css">
        <link rel="stylesheet" href="../customer/external_css/otpcss.css">
        <script src="../customer/owl-carousel/jquery.min.js"></script>


        <title>Admin Forgot Password</title>
    </head>
    <body style="background-color: #f5f5f5;">
        <%
            String email = request.getParameter("email");
        %>
        <div class="container">
            <div class="card mt-5">

                <div class="text-center p-5">
                    <h1 class="fw-bold mt-5" ><span class="text-warning">PRASANNA</span> DRESS POINT</h1>
                    <h1>Admin OTP Confirmation</h1>
                    <p class="lead">Please Check Your code was sent to you via email.</p>

                    <form>
                        <div class="row">
                            <div class="col-sm-3"></div>
                            <div class="col-sm-6">
                                
                                <div class="form-outline">
                                    <input type="email" id="typeEmail" class="form-control my-3" value="<%=email%> "  disabled/>
                                    <label class="form-label" for="typeEmail">Email input</label>
                                </div>
                                
                                
                            </div>
                              <div class="col-sm-3"></div>
                        </div>
                       

                        <div class="otp-field mb-4">
                            <input id="one" type="number" />
                            <input id="two" type="number" disabled />
                            <input id="three" type="number" disabled />
                            <input id="four" type="number" disabled />
                            <input id="five" type="number" disabled />
                            <input id="six" type="number" disabled />
                        </div>
                        <button type="button" id="btnOtp" class="btn btn-primary mb-3">Verify</button>
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
            $("#btnOtp").click(function () {
                const email = document.getElementById("typeEmail").value;
                
                const  one = document.getElementById("one");
                const  two = document.getElementById("two");
                const  three = document.getElementById("three");
                const  four = document.getElementById("four");
                const  five = document.getElementById("five");
                const  six = document.getElementById("six");

                const otp = one.value + "" + two.value + "" + three.value + "" + four.value + "" + five.value + "" + six.value;

                $.ajax({
                    type: 'POST',
                    url: "/Ecom_final_project/AdminVerifyCode",
                    data: {"txtOtp": otp},
                    success: function (data) {
                        if (data === "00") {
                            window.location = "/Ecom_final_project/admin/adminUpdatePassword.jsp?email="+email;
                        } else {
                            window.location = "/Ecom_final_project/admin/adminVerifyotp.jsp?email="+email;
                            alert("Wrong OTP..! Please Check and Enter Correct OTP");
                        }
                    },
                    error: function () {

                    }
                });

            });
        });
    </script> 

    <script type="text/javascript" src="../customer/bootstrap/js/mdb.min.js" ></script>
    <script src="../customer/external_js/otpjs.js"></script>
</html>

