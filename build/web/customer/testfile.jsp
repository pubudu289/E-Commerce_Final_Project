<%-- 
    Document   : testfile
    Created on : Nov 27, 2023, 5:36:57 PM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> test file</title>
        <%@include file="Main/resourse.jsp" %>
    </head>
    <body>
        <form>   <div class="container mt-5">
                <div class="row">

                    <div class="col-sm-4">
                        <input type="email" id="txtemail" placeholder="email" class="form-control">

                    </div>
                    <div class="col-sm-4">
                        <input type="password" id="pass" placeholder="password" class="form-control">
                    </div>
                    <div class="col-sm-4">
                        <button type="button" class="btn btn-primary" id="btnNext">Next</button>
                    </div>



                </div>
            </div>  
        </form>
    </body>
    <script>

//            function btnNext() {
//                var txtemail = document.getElementById("txtemail").value;
//                var pass = document.getElementById("pass").value;
//
//
//                alert(txtemail + " " + pass );
//
//                var xhttp = new XMLHttpRequest();
//                xhttp.onload = function () {
//
//                }
//                xhttp.open("POST", "details?txtemail=" + txtemail + "&pass=" + pass);
//                xhttp.send();
//            }
//        


        $(document).ready(function () {
            $("#btnNext").click(function () {

                var txtemail = $("#txtemail").val();
                var pass = $("#pass").val();

                $.ajax({
                    type: 'POST',
                    url: "/Ecom_final_project/details",
                    data: {"txtemail": txtemail, "pass": pass},
                    success: function (data) {

                    },
                    error: function () {

                    }
                });
            });
        });
    </script>
</html>
