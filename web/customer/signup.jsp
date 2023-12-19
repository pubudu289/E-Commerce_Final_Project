<%-- 
    Document   : signuppage
    Created on : Nov 26, 2023, 11:17:16 AM
    Author     : Pubudu Kasun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignUp</title>
        <%@include file="../customer/Main/resourse.jsp" %>


    </head>
    <body>


        <section class="vh-20" style="background-color: #eee;">
            <div class="container h-200">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-lg-12 col-xl-11">
                        <div class="card text-black mt-4 mb-4" style="border-radius: 25px;">
                            <div class="card-body p-md-5">
                                <div class="row justify-content-center">

                                    <div class="col-md-10 col-lg-8 col-xl-7 order-2 order-lg-1">

                                        <p class="h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign up</p>

                                        <form class="mx-1 mx-md-4 form" onsubmit="" id="form" name="form">
                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <div class="row">
                                                        <span style="color: red; font-size: 11px; "id="name_error_first" class="mt-0"></span>
                                                        <div class="d-flex flex-row align-items-center mb-4">

                                                            <div class="form-outline flex-fill mb-0">

                                                                <input type="text" id="first_name"  class="form-control" />
                                                                <label class="form-label" for="first_name" id="first_name" >First Name</label>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                                <div class="col-sm-6">
                                                    <div class="row">
                                                        <span style="color: red; font-size: 11px;" id="name_error_last" class="mt-0"></span>

                                                        <div class="d-flex flex-row align-items-center mb-4">
                                                            <div class="form-outline flex-fill mb-0">
                                                                <input type="text" id="last_name" class="form-control"  />
                                                                <label class="form-label" for="last_name">Last Name</label>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>
                                            <span style="color: red; font-size: 11px;" id="name_error_email" class="mt-0"></span>
                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <div class="form-outline flex-fill mb-0">
                                                    <input type="email" id="txt_email" class="form-control"  />
                                                    <label class="form-label" for="txt_email">Your Email</label>
                                                </div>
                                            </div>
                                            <div class="row">
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
                                                <div class="col-sm-6">
                                                    <div class="row">
                                                        <span style="color: red; font-size: 11px;" id="name_error_compass" class="mt-0"></span>
                                                        <div class="d-flex flex-row align-items-center mb-4">
                                                            <div class="form-outline flex-fill mb-0">
                                                                <input type="password" id="comfirmpassword"  class="form-control"  />
                                                                <label class="form-label" for="comfirmpassword">Repeat your password</label>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                                <p class="text mb-0" id="chareight" style="font-size: 12px; color: #4f4f4f;">Min. 8 characters</p>
                                                <p class="text mb-0" id="lownum" style="font-size: 12px; color: #4f4f4f;">Include lowercase letter</p>
                                                <p class="text mb-0" id="num" style="font-size: 12px; color: #4f4f4f;"> Include number</p>
                                                <p class="text mb-0" id="upper" style="font-size: 12px; color: #4f4f4f;">Include uppercase letter</p>
                                                <p class="text mb-2" id="spec" style="font-size: 12px; color: #4f4f4f;">Include a special character: #.-?!@$%^&*</p>

                                            </div>

                                            <div class="row">
                                                <div class="col-sm-12">
                                                    <span style="color: red; font-size: 11px;" id="name_error_checkbox" class=" d-flex justify-content-center mt-0 mb-0"></span>
                                                </div>
                                                <div class="col-sm-12">

                                                    <div class="form-check d-flex justify-content-center mb-5">
                                                        <input class="form-check-input me-2" type="checkbox" value="" id="truecheckbox" title="click the checkbox" required/>
                                                        <label class="form-check-label" for="form2Example3">
                                                            I agree all statements in <a href="#!" data-mdb-ripple-init data-mdb-modal-init data-mdb-target="#staticBackdrop">Terms of service</a>
                                                        </label>
                                                    </div>  
                                                </div>

                                            </div>


                                        </form>
                                        <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                            <button type="button" id="Register" class="btn btn-primary btn-lg">Register</button>
                                        </div>
                                    </div>
                                    <div class="col-md-10 col-lg-4 col-xl-5 d-flex align-items-center order-1 order-lg-2">
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4"><span class="text-warning">PRASANNA</span> DRESS POINT</p>   

                                                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
                                                     class="img-fluid" alt="Sample image"> 
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


    <!-- Modal Term and Service-->
    <div
        class="modal fade"
        id="staticBackdrop"
        data-mdb-backdrop="static"
        data-mdb-keyboard="false"
        tabindex="-1"
        aria-labelledby="staticBackdropLabel"
        aria-hidden="true"
        >
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="staticBackdropLabel"> <p class="fw-bold"><span class="text-warning">PRASANNA</span> DRESS POINT</p>Terms of service</h5>
                    <button type="button" class="btn-close" data-mdb-ripple-init data-mdb-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">

                    <!-- Scrollable modal -->
                    <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
                        <p>
                            Modal
                            Bootstrap 5 Modal component
                            Responsive popup window with Bootstrap 5. Examples of with image, modal position i.e. center, z-index usage, modal fade animation, backdrop usage, modal size & more.

                            Modal is a responsive popup used to display extra content. That includes prompts, configurations, cookie consents, etc.

                            Use MDB modal component to add dialogs to your site for lightboxes, user notifications, or completely custom content.

                            Modal
                            Bootstrap 5 Modal component
                            Responsive popup window with Bootstrap 5. Examples of with image, modal position i.e. center, z-index usage, modal fade animation, backdrop usage, modal size & more.

                            Modal is a responsive popup used to display extra content. That includes prompts, configurations, cookie consents, etc.

                            Use MDB modal component to add dialogs to your site for lightboxes, user notifications, or completely custom content.

                            Modal
                            Bootstrap 5 Modal component
                            Responsive popup window with Bootstrap 5. Examples of with image, modal position i.e. center, z-index usage, modal fade animation, backdrop usage, modal size & more.

                            Modal is a responsive popup used to display extra content. That includes prompts, configurations, cookie consents, etc.

                            Use MDB modal component to add dialogs to your site for lightboxes, user notifications, or completely custom content.
                            Modal
                            Bootstrap 5 Modal component
                            Responsive popup window with Bootstrap 5. Examples of with image, modal position i.e. center, z-index usage, modal fade animation, backdrop usage, modal size & more.

                            Modal is a responsive popup used to display extra content. That includes prompts, configurations, cookie consents, etc.

                            Use MDB modal component to add dialogs to your site for lightboxes, user notifications, or completely custom content.
                            Modal
                            Bootstrap 5 Modal component
                            Responsive popup window with Bootstrap 5. Examples of with image, modal position i.e. center, z-index usage, modal fade animation, backdrop usage, modal size & more.

                            Modal is a responsive popup used to display extra content. That includes prompts, configurations, cookie consents, etc.

                            Use MDB modal component to add dialogs to your site for lightboxes, user notifications, or completely custom content.
                        </p>
                    </div>   
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-mdb-ripple-init data-mdb-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
    <!-- Modal Term and Service end-->


    <!-- Modal load-->
    <div
        class="modal fade"
        id="staticBackdrop1"
        data-mdb-backdrop="static"
        data-mdb-keyboard="false"
        tabindex="-1"
        aria-labelledby="staticBackdropLabel"
        aria-hidden="true"
        >
        <div class="modal-dialog modal-sm">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="staticBackdropLabel">Processing.....</h5>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-sm-12 text-center">
                            <img class="img-fluid" alt="success" src="../customer/images/alerts/Double Ring.svg">   
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                </div>
            </div>
        </div>
    </div>


    <!-- First modal dialog -->
    <div class="modal fade" id="exampleModalToggle1" aria-hidden="true" aria-labelledby="exampleModalToggleLabel1" tabindex="-1">
        <div class="modal-dialog modal-dialog-centered modal-sm">
            <div class="modal-content">
                <div class="modal-header bg-danger">
                    <h5 class="modal-title text-white" id="exampleModalToggleLabel1">Alert</h5>
                    <button type="button" class="btn-close" data-mdb-ripple-init data-mdb-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    Email already taken
                </div>
            </div>
        </div>
    </div>
 


</body>
<script type="text/javascript" src="../customer/external_js/signupFormValidation.js"></script>
<script type="text/javascript" src="../customer/bootstrap/js/mdb.umd.min.js" ></script>
<script type="text/javascript" src="../customer/bootstrap/js/mdb.min.js" ></script>
</html>
