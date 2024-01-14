<%-- 
    Document   : updateProduct
    Created on : Jan 1, 2024, 8:15:56 PM
    Author     : Pubudu Kasun
--%>

<%@page import="modal.Product"%>
<%@page import="DAO.ProductDAO.ProductUpdateDAO"%>
<%@page import="DAO.ProductDAO.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>PRASANNA DP | Update Product</title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="dist/css/adminlte.min.css">

        <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker.css">
        <!-- iCheck for checkboxes and radio inputs -->
        <link rel="stylesheet" href="plugins/icheck-bootstrap/icheck-bootstrap.min.css">
        <!-- Bootstrap Color Picker -->
        <link rel="stylesheet" href="plugins/bootstrap-colorpicker/css/bootstrap-colorpicker.min.css">
        <!-- Tempusdominus Bootstrap 4 -->
        <link rel="stylesheet" href="plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
        <!-- Select2 -->
        <link rel="stylesheet" href="plugins/select2/css/select2.min.css">
        <link rel="stylesheet" href="plugins/select2-bootstrap4-theme/select2-bootstrap4.min.css">
        <!-- Bootstrap4 Duallistbox -->
        <link rel="stylesheet" href="plugins/bootstrap4-duallistbox/bootstrap-duallistbox.min.css">
        <!-- BS Stepper -->
        <link rel="stylesheet" href="plugins/bs-stepper/css/bs-stepper.min.css">
        <!-- dropzonejs -->
        <link rel="stylesheet" href="plugins/dropzone/min/dropzone.min.css">
        <!--multipal selector-->
        <link rel="stylesheet" href="plugins/multipal-selector/css/bootstrap-select.min.css">

        <!-- summernote -->
        <link rel="stylesheet" href="plugins/summernote/summernote-bs4.min.css">
        <link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>
        <link rel="stylesheet" href="../admin/externalcss/product_image.css">
    </head>
    <body class="hold-transition sidebar-mini">
        <%
//            if (request.getSession().getAttribute("UserData") == null) {
//                response.sendRedirect("/Ecom_final_project/adminLogin.jsp");
//
//            }
%> 
        <div class="wrapper">
            <%@include file="../admin/main/navbar.jsp" %>
            <%@include file="../admin/main/sidebar.jsp" %>


            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1 class="m-0">Update Product</h1>
                            </div><!-- /.col -->
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                                    <li class="breadcrumb-item active">Admin</li>
                                    <li class="breadcrumb-item active">Update Product</li>
                                </ol>
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.container-fluid -->
                </div>
                <!-- /.content-header -->

                <div class="container">
                    <div class="row">
                        <div class="col-sm-8">
                            <div class="card">
                                <div class="card-header">
                                    Product Information
                                </div>
                                <div class="card-body">

                                    <div class="row">
                                        <%                                           
                                            String pid = request.getParameter("pid");
                                            ProductUpdateDAO pdao = new ProductUpdateDAO();
                                            Product pro = pdao.SearchItem(pid);

                                        %>
                                        <div class="col-sm-3">
                                            <div class="form-group">
                                                <label class="mb-0"  for="exampleInputEmail1">Product ID</label>
                                                <input type="text" class="form-control" id="txtproductid" aria-describedby="emailHelp" value="<%=pro.getProductId()%>" disabled>
                                            </div>
                                        </div>
                                        <div class="col-sm-9">
                                            <div class="form-group">
                                                <label class="mb-0"  for="productName">Product Name</label>
                                                <input type="text" class="form-control" id="txtProductName" value="<%=pro.getName()%>" disabled>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="form-group">
                                        <label>Main Category</label>
                                        <select class="form-control select2bs4"  style="width: 100%;" id="options" disabled>

                                            <option selected="selected"><%=pro.getMainCategory().getDescription()%></option>

                                        </select> 

                                    </div>

                                    <div class="form-group">
                                        <label>Sub Category</label>
                                        <select class="form-control select2bs4" style="width: 100%;" id="subcat" disabled>
                                            <option selected="selected"><%=pro.getSubCategory().getDescription()%></option>
                                        </select>
                                    </div>

                                    <div class="form-group">
                                        <label>Category</label>
                                        <select class="form-control select2bs4" style="width: 100%;" id="category"  disabled>
                                            <option selected="selected"><%=pro.getCategory().getCatDescription()%></option>
                                        </select>
                                    </div>

                                    <div class="form-group">
                                        <label>Brand</label>
                                        <select class="form-control select2bs4" style="width: 100%;" id="brand" disabled>

                                            <option selected="selected"><%=pro.getBrand().getBrand()%></option>

                                        </select>
                                    </div>

                                    <div class="form-group">
                                        <label class="mb-0" for="txtunit">Unit (Kg/Cm/Pcs/..)</label>
                                        <input type="text" class="form-control" id="txtunit" value="<%=pro.getUnit()%>">
                                    </div>
                                    <div class="form-group">
                                        <label class="mb-0 fw-normal"  for="txtqty">Quantity</label>
                                        <input type="text" class="form-control" id="txtqty" value="<%=pro.getQty()%>">
                                    </div>
                                </div>
                            </div>  

                            <div class="card">
                                <div class="card-header">
                                    Product Images
                                </div>
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <label>Thumbnail Image</label>
                                            <div class="card">
                                                <div class="card-body">
                                                    <input type="file" id="filethumb" name="filethumb" accept="image/*" hidden>
                                                    <div class="img-area" id="image-areathumb" data-img="" >
                                                        <i class='bx bxs-cloud-upload icon'></i>

                                                    </div>
                                                    <p class="sizeText">Image size must be less than <span>2MB</span></p>
                                                    <button class="select-image" id="selct-imagethumb">Select Image</button>
                                                </div>
                                            </div> 

                                        </div>


                                    </div>
                                    <label>Gallery Images</label>
                                    <div class="card">
                                        <div class="container">
                                            <div class="row">

                                                <div class="col-sm-3 mt-2">
                                                    <div class="card">
                                                        <div class="card-body">
                                                            <input type="file" id="fileone" accept="image/*" hidden>
                                                            <div class="img-area" id="image-areaone" data-img="" >
                                                                <i class='bx bxs-cloud-upload icon'></i>

                                                            </div>
                                                            <p class="sizeText">Image size must be less than <span>2MB</span></p>
                                                            <button class="select-image" id="selct-imageone">Select Image</button>
                                                        </div>
                                                    </div> 
                                                </div>

                                                <div class="col-sm-3 mt-2">
                                                    <div class="card">
                                                        <div class="card-body">
                                                            <input type="file" id="filetwo" accept="image/*" hidden>
                                                            <div class="img-area" id="image-areatwo" data-img="" >
                                                                <i class='bx bxs-cloud-upload icon'></i>

                                                            </div>
                                                            <p class="sizeText">Image size must be less than <span>2MB</span></p>
                                                            <button class="select-image" id="selct-imagetwo">Select Image</button>
                                                        </div>
                                                    </div> 
                                                </div>

                                                <div class="col-sm-3 mt-2">
                                                    <div class="card">
                                                        <div class="card-body">
                                                            <input type="file" id="filethree" accept="image/*" hidden>
                                                            <div class="img-area" id="image-areathree" data-img="" >
                                                                <i class='bx bxs-cloud-upload icon'></i>

                                                            </div>
                                                            <p class="sizeText">Image size must be less than <span>2MB</span></p>
                                                            <button class="select-image" id="selct-imagethree">Select Image</button>
                                                        </div>
                                                    </div> 
                                                </div>

                                                <div class="col-sm-3 mt-2">
                                                    <div class="card">
                                                        <div class="card-body">
                                                            <input type="file" id="filefour" accept="image/*" hidden>
                                                            <div class="img-area" id="image-areafour" data-img="" >
                                                                <i class='bx bxs-cloud-upload icon'></i>

                                                            </div>
                                                            <p class="sizeText">Image size must be less than <span>2MB</span></p>
                                                            <button class="select-image" id="selct-imagefour">Select Image</button>
                                                        </div>
                                                    </div> 
                                                </div>

                                            </div>


                                        </div>
                                    </div>


                                </div>
                                <!-- /.card-body -->
                            </div>
                            <div class="card">
                                <div class="card-header">
                                    Product Short Description
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <input type="text" class="form-control" id="shortdes" value="<%=pro.getShortdes()%>">
                                    </div>
                                </div>
                            </div>

                            <div class="card">
                                <div class="card-header">
                                    Product Description
                                </div>
                                <div class="card-body">
                                    <textarea id="summernote">
                                        <%=pro.getDescription()%> 
                                    </textarea>
                                </div>
                            </div>


                            <div class="card">
                                <div class="card-header">
                                    Product Price + Stock
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label class="mb-0" for="txtunitPrice">Unit Price</label>
                                        <input type="number" class="form-control" id="txtunitPrice" value="<%=pro.getUnitPrice()%>">
                                    </div>
                                    <div class="form-group">
                                        <label class="mb-0 fw-normal"  for="txtpurchaseprice">Purchase Price</label>
                                        <input type="number" class="form-control" id="txtpurchaseprice" value="<%=pro.getPurchasePrice()%>">
                                    </div>
                                    <div class="form-group">
                                        <label class="mb-0 fw-normal"  for="txtdiscount">Discount %</label>
                                        <input type="number" class="form-control" id="txtdiscount" value="<%=pro.getDiscount()%>">
                                        <div class="row">
                                            <div class="col-sm-5">
                                                <label class="form-label" style="font-size: 18px; color: green;">The selling price by discount Rs:</label>
                                            </div>
                                            <div class="col-sm-7">
                                                <label class="form-label" style="font-size: 18px; color: tomato;" id="discountPrice">0.00</label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>






                        <div class="col-sm-4">
                            <div class="card">
                                <div class="card-header">
                                    Shipping Status
                                </div>
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-sm-9">
                                            <div class="form-group">
                                                <label  for="exampleInputPassword1">Free Shipping</label>
                                            </div>
                                        </div>
                                        <div class="col-sm-3">
                                            <div class="form-group">
                                                <div class="custom-control custom-switch">
                                                    <input type="checkbox" class="custom-control-input" id="txtfreeshipping" onclick="FreeShip()">
                                                    <label class="custom-control-label" for="txtfreeshipping"></label>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-9">
                                            <div class="form-group">
                                                <label  for="exampleInputPassword1">Flat Rate</label>
                                            </div>
                                        </div>
                                        <div class="col-sm-3 mb-0">
                                            <div class="form-group">
                                                <div class="custom-control custom-switch">
                                                    <input type="checkbox" class="custom-control-input" id="toggFlatrate" onclick="flatrate()">
                                                    <label class="custom-control-label" for="toggFlatrate"></label>
                                                </div>
                                            </div>

                                        </div>

                                    </div>
                                    <div col-sm-12 mt-0>

                                        <div class="container">
                                            <div class="row"  id="flatrate"  style="display: none;">
                                                <div class="row">
                                                    <div class="col-sm-4">
                                                        <p  style="font-size: 15px; font: normal;">Flat Rate</p>
                                                    </div>
                                                    <div class="col-sm-8">
                                                        <input type="number" class="form-control" value="0" placeholder="Rate (Rs)" id="txtflatrate">
                                                    </div> 
                                                </div> 
                                            </div>
                                        </div>

                                    </div>


                                </div>
                            </div>

                            <div class="card">
                                <div class="card-header">
                                    Low Stock Quantity Warning
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label class="mb-0 fw-normal"  for="txtlowstock">Quantity</label>
                                        <input type="number" class="form-control" id="txtlowstock" value="<%=pro.getLowStockWarning()%>">
                                    </div>
                                </div>
                            </div>

                            <div class="card">
                                <div class="card-header">
                                    Stock Visibility State
                                </div>
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-sm-9">
                                            <div class="form-group">
                                                <label  for="exampleInputPassword1">Show Stock Quantity</label>
                                            </div>
                                        </div>
                                        <div class="col-sm-3">
                                            <div class="form-group">
                                                <div class="custom-control custom-switch">
                                                    <input type="checkbox" class="custom-control-input" id="showstock" onclick="showstock()">
                                                    <label class="custom-control-label" for="showstock"></label>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-9">
                                            <div class="form-group">
                                                <label  for="exampleInputPassword1">Show Stock With Text Only</label>
                                            </div>
                                        </div>
                                        <div class="col-sm-3">
                                            <div class="form-group">
                                                <div class="custom-control custom-switch">
                                                    <input type="checkbox" class="custom-control-input" id="stockwithtext" onclick="stockwithtext()">
                                                    <label class="custom-control-label" for="stockwithtext"></label>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-sm-9">
                                            <div class="form-group">
                                                <label  for="exampleInputPassword1">Hide Stock</label>
                                            </div>
                                        </div>
                                        <div class="col-sm-3">
                                            <div class="form-group">
                                                <div class="custom-control custom-switch">
                                                    <input type="checkbox" class="custom-control-input" id="hidestock" onclick="hidestock()">
                                                    <label class="custom-control-label" for="hidestock"></label>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="card">
                                <div class="card-header">
                                    Shipping Days
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label class="mb-0 fw-normal"  for="txtdays">Days</label>
                                        <input type="text" class="form-control" id="txtdays" value="<%=pro.getShippingDays()%>">
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>

                    <div class="row mb-3">
                        <div class="col-sm-5"></div>
                        <div class="col-sm-7">
                            <div class="row">
                                <div class="col-sm-4 mt-1">
                                    <button type="button" class="btn btn-block bg-gradient-info btn-lg" id="btnUpdateAndPublish">Update & Publish</button>
                                </div>
                                <div class="col-sm-4 mt-1">
                                    <button type="button" class="btn btn-block bg-gradient-primary btn-lg" id="btnUpdateAndUnpublish"   >Update & Unpubish</button>
                                </div>
                                <div class="col-sm-4 mt-1">
                                    <button type="button" class="btn btn-block bg-gradient-warning btn-lg" id="canclebtn">Cancle</button>
                                </div>
                            </div>

                        </div>
                    </div>

                </div>

            </div>
            <input type="number" id="shipingstat" value="<%=pro.getShippingStatus()%>" hidden>
            <!-- /.content-wrapper -->

            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
                <div class="p-3">
                    <h5>Title</h5>
                    <p>Sidebar content</p>
                </div>
            </aside>
            <!-- /.control-sidebar -->
            <%@include file="../admin/main/footer.jsp" %>
        </div>
        <!-- ./wrapper -->

        <!-- REQUIRED SCRIPTS -->

        <!-- jQuery -->
        <script src="plugins/jquery/jquery.min.js"></script>
        <!-- Bootstrap 4 -->
        <script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- bs-custom-file-input -->
        <script src="plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>
        <script src="plugins/select2/js/select2.full.min.js"></script>
        <!-- Bootstrap4 Duallistbox -->
        <script src="plugins/bootstrap4-duallistbox/jquery.bootstrap-duallistbox.min.js"></script>
        <!-- InputMask -->
        <script src="plugins/moment/moment.min.js"></script>
        <script src="plugins/inputmask/jquery.inputmask.min.js"></script>
        <!-- date-range-picker -->
        <script src="plugins/daterangepicker/daterangepicker.js"></script>
        <!-- bootstrap color picker -->
        <script src="plugins/bootstrap-colorpicker/js/bootstrap-colorpicker.min.js"></script>
        <!-- Tempusdominus Bootstrap 4 -->
        <script src="plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
        <!-- Bootstrap Switch -->
        <script src="plugins/bootstrap-switch/js/bootstrap-switch.min.js"></script>
        <!-- BS-Stepper -->
        <script src="plugins/bs-stepper/js/bs-stepper.min.js"></script>
        <!-- dropzonejs -->
        <script src="plugins/dropzone/min/dropzone.min.js"></script>
        <!-- AdminLTE App -->
        <script src="dist/js/adminlte.min.js"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="dist/js/demo.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="plugins/multipal-selector/js/bootstrap-select.min.js"></script>

        <!-- Summernote -->
        <script src="plugins/summernote/summernote-bs4.min.js"></script>
        <script src="../admin/externaljs/productImage.js"></script>



        <script>
                                                        $(document).ready(function () {
                                                            var pidl = document.getElementById('shipingstat').value;
                                                            if (pidl == 1) {

                                                                var frees = document.getElementById("txtfreeshipping");
                                                                frees.checked = true;

                                                            }

                                                            if (pidl == 2) {
                                                                var flats = document.getElementById("toggFlatrate");
                                                                flats.checked = true;

                                                            }
                                                            if (pidl == 0) {
                                                                var frees = document.getElementById("txtfreeshipping");
                                                                frees.checked = false;
                                                                var flats = document.getElementById("toggFlatrate");
                                                                flats.checked = false;
                                                            }

                                                        });
        </script>
        <script src="../admin/externaljs/product_update.js"></script>
        <script src="../admin/externaljs/product_validation.js"></script>
        <script src="../admin/externaljs/sweetalert.min.js"></script>
    </body>
</html>

