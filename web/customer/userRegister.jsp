<%-- 
    Document   : userRegister
    Created on : Dec 3, 2023, 6:28:06 PM
    Author     : Pubudu Kasun
--%>

<%@page import="modal.Province"%>
<%@page import="DAO.Area.AreaDAO"%>
<%@page import="java.util.List"%>
<%@page import="modal.Districts"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Customer | Registration</title>
            <%@include file="../customer/Main/cus_resource.jsp" %>
            <!-- Select2 -->
            <link rel="stylesheet" href="../admin/plugins/select2/css/select2.min.css">
            <link rel="stylesheet" href="../admin/plugins/select2-bootstrap4-theme/select2-bootstrap4.min.css">

            <!--multipal selector-->
            <link rel="stylesheet" href="../admin/plugins/multipal-selector/css/bootstrap-select.min.css">

        </head>
        <body>
            <%
                String email = request.getParameter("email");

            %>

            <section class="vh-200" style="background-color: #eee;">
                <div class="container h-100">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-lg-12 col-xl-11 mt-4 mb-4">
                            <div class="card text-black" style="border-radius: 25px;">
                                <div class="card-body p-md-5">
                                    <div class="row justify-content-center">

                                        <div class="col-md-10 col-lg-8 col-xl-7 order-2 order-lg-1">

                                            <p class="h3 fw-bold mb-5 mx-1 mx-md-4 mt-4">User Registration</p>

                                            <form class="mx-1 mx-md-4">
                                                <div class="row">
                                                    <div class="d-flex flex-row align-items-center mb-4">
                                                        <div class="form-outline flex-fill mb-0">
                                                            <input type="email" id="txtemail" class="form-control" value="<%=email%>" disabled/>
                                                            <label class="form-label" for="txtemail" id="txtemail" >Email</label>
                                                        </div>
                                                    </div>

                                                    <span style="color: red; font-size: 11px; "id="name_error_fullname" class="mt-0"></span>
                                                    <div class="d-flex flex-row align-items-center mb-4">
                                                        <div class="form-outline flex-fill mb-0">
                                                            <input type="text" id="full_name" class="form-control" />
                                                            <label class="form-label" for="full_name" id="full_name" >Full Name</label>
                                                        </div>
                                                    </div>


                                                    <span style="color: red; font-size: 11px; "id="name_error_dob" class="mt-0"></span>
                                                    <div class="col-sm-6 mb-0">
                                                        <div class="d-flex flex-row align-items-center mb-4">
                                                            <div class="form-outline flex-fill mb-0">
                                                                <input type="date" id="txtdob" class="form-control" />
                                                                <label class="form-label" for="txtdob" id="txtdob" >Date of Birth</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-6 mt-0">
                                                        <div class="row mt-0">
                                                            <label class="mb-0" style="font-size: 13px" for="txtgender" id="txtgender" >Gender</label>
                                                            <div class="col-sm-12">

                                                                <div class="form-check form-check-inline">
                                                                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadioone" value="Male" checked="true"/>
                                                                    <label class="form-check-label" for="inlineRadio1">Male</label>
                                                                </div>

                                                                <div class="form-check form-check-inline">
                                                                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadiotwo" value="Female" />
                                                                    <label class="form-check-label" for="inlineRadio2">Female</label>
                                                                </div>

                                                            </div>

                                                        </div>

                                                    </div>
                                                </div>

                                                <div class="row">
                                                    <span style="color: red; font-size: 11px; "id="name_error_mobile" class="mt-0"></span> 
                                                    <div class="col-sm-6">
                                                        <div class="d-flex flex-row align-items-center mb-4">
                                                            <div class="form-outline flex-fill mb-0">
                                                                <input type="text" id="txtmobile" class="form-control" />
                                                                <label class="form-label" for="txtmobile">Mobile</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-6">
                                                        <div class="d-flex flex-row align-items-center mb-4">
                                                            <div class="form-outline flex-fill mb-0">
                                                                <input type="text" id="txtcountry" class="form-control" value="Sri Lanka" disabled />
                                                                <label class="form-label" for="txtcountry" >Country</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="row">
                                                    <div class="col-sm-6">
                                                        <span style="color: red; font-size: 11px; "id="name_error_province" class="mt-0"></span>
                                                        <div class="form-group mb-3" >
                                                            <label style="font-size: 13px; color: grey;">Province Or State</label>
                                                            <select class="form-control select2bs4"  style="width: 100%;" onchange="ProvinceOptionClicked()" id="txt_province" >
                                                                <option selected="selected" place></option>
                                                                <%
                                                                    AreaDAO area = new AreaDAO();
                                                                    List<Province> provinceList = area.searchAllAreas();
                                                                    for (Province provincelist : provinceList) {

                                                                %>

                                                                <option><%=provincelist.getProvince()%></option>
                                                                <%
                                                                    }

                                                                %>

                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-6">

                                                        <span style="color: red; font-size: 11px; "id="name_error_maincity" class="mt-0"></span>
                                                        <div class="form-group mb-3" >
                                                            <label style="font-size: 13px; color: grey;">Main City</label>
                                                            <select class="form-control select2bs4"  style="width: 100%;" id="txt_maincity" onchange="MaincityOptionClicked()">
                                                            </select>
                                                        </div> 
                                                    </div>
                                                </div>
                                                <div  class="row">
                                                    <div class="col-sm-6">
                                                        <span style="color: red; font-size: 11px; "id="name_error_homecity" class="mt-0"></span>
                                                        <div class="form-group mb-3" >
                                                            <label style="font-size: 13px; color: grey;">Home City</label>
                                                            <select class="form-control select2bs4"  style="width: 100%;" id="homecity">
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-6">
                                                        <span style="color: red; font-size: 11px; "id="name_error_postal" class="mt-0"></span>
                                                        <div class="form-group mb-3" >
                                                            <label style="font-size: 13px; color: grey;">Postal Code</label>
                                                            <select class="form-control select2bs4"  style="width: 100%;" id="txt_postal" >

                                                            </select>
                                                        </div>
                                                    </div>
                                                </div>

                                                <span style="color: red; font-size: 11px; "id="name_error_addlineone" class="mt-0"></span>
                                                <div class="d-flex flex-row align-items-center mb-4">
                                                    <div class="form-outline flex-fill mb-0">
                                                        <input type="text" id="addlineone" class="form-control" />
                                                        <label class="form-label" for="addlineone">Address line 1</label>
                                                    </div>
                                                </div>

                                                <span style="color: red; font-size: 11px; "id="name_error_addlinetwo" class="mt-0"></span>
                                                <div class="d-flex flex-row align-items-center mb-4">
                                                    <div class="form-outline flex-fill mb-0">
                                                        <input type="text" id="addlinetwo" class="form-control" />
                                                        <label class="form-label" for="addlinetwo">Address line 2</label>
                                                    </div>
                                                </div>

                                                <div class="d-flex flex-row align-items-center mb-4">
                                                    <div class="form-outline flex-fill mb-0">
                                                        <input type="text" id="addlinethree" class="form-control" />
                                                        <label class="form-label" for="addlinethree">Address line 3 (Optional)</label>
                                                    </div>
                                                </div>



                                                <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                                    <button type="button" id="btnRegister" class="btn btn-primary btn-lg">Submit</button>
                                                </div>
                                            </form>
                                        </div>
                                        <div class="col-md-10 col-lg-4 col-xl-5 d-flex align-items-center order-1 order-lg-2">
                                            <div class="row">
                                                <div class="col-sm-12">
                                                    <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4"><span class="text-warning">PRASANNA</span> DRESS POINT</p>   

                                                    <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
                                                         class="img-fluid" alt="Sample image"> 
                                                    <p>Don't worry..! You can fill in this form after login..Now you registered user at our web site 
                                                        and Now you can sign in our web site.<a href="../customer/signin.jsp">Skip Now</a></p>
                                                </div>  
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>



    </body>

    <script type="text/javascript" src="../customer/external_js/CustomerRegistrationValidation.js"></script>
    <script type="text/javascript" src="../customer/bootstrap/js/mdb.min.js" ></script>
    <script type="text/javascript" src="../customer/bootstrap/js/mdb.umd.min.js" ></script>




    <script src="../admin/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="../admin/plugins/select2/js/select2.full.min.js"></script> 
    <script src="../admin/plugins/multipal-selector/js/bootstrap-select.min.js"></script>
    <script>
          //Initialize Select2 Elements
           $('.select2bs4').select2({
           theme: 'bootstrap4'
          });
    </script>



</html>
