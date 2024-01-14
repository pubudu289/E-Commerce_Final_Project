<%-- 
    Document   : viewAllProduct
    Created on : Dec 18, 2023, 1:56:11 PM
    Author     : Pubudu Kasun
--%>

<%@page import="java.util.List"%>
<%@page import="modal.Product"%>
<%@page import="DAO.ProductDAO.ProductViewTableDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>PRASANNA DP | Product</title>

        <!-- Google Font: Source Sans Pro -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
        <!-- DataTables -->
        <link rel="stylesheet" href="plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" href="plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
        <link rel="stylesheet" href="plugins/datatables-buttons/css/buttons.bootstrap4.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="dist/css/adminlte.min.css">
    </head>
    <body class="hold-transition sidebar-mini">
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
                                <h1 class="m-0">Product Page</h1>
                            </div><!-- /.col -->
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                                    <li class="breadcrumb-item active">Product Page</li>
                                </ol>
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.container-fluid -->
                </div>
                <!-- /.content-header -->

                <!-- Main content -->
                <section class="content">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-12">

                                <div class="card">
                                    <div class="card-header">
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <h3 class="card-title fw-bold">All Active Products</h3>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- /.card-header -->
                                    <div class="card-body">
                                        <table id="example1" class="table table-bordered table-hover">
                                            <thead>
                                                <tr>
                                                    <th>Item Id</th>
                                                    <th>Item Name</th>
                                                    <th>Unit</th>
                                                    <th>Quantity</th>
                                                    <th>Add to By</th>
                                                    <th>Unit Price</th>
                                                    <th>Purchase Price</th>
                                                    <th>Discount</th>
                                                    <th>Discount Price</th>
                                                    <th>Action</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%                                                    ProductViewTableDAO productView = new ProductViewTableDAO();
                                                    List<Product> productList = productView.searchAllProducts();
                                                    for (Product pr : productList) {

                                                %>

                                                <tr>
                                                    <td><%=pr.getProductId()%></td>
                                                    <td><%=pr.getName()%> </td>
                                                    <td><%=pr.getUnit()%></td>
                                                    <td><%=pr.getQty()%></td>
                                                    <td><%=pr.getAddtoby()%></td>
                                                    <td><%=pr.getUnitPrice()%></td>
                                                    <td><%=pr.getPurchasePrice()%></td>
                                                    <td><%=pr.getDiscount()%>%</td>
                                                    <td><%=pr.getDiscountPrice()%></td>
                                                    <td>
                                                        <div class="row">
                                                            <div class="col-sm-4"><button class="btn" onclick="btnItem(`<%=pr.getProductId()%>`)" data-toggle="modal" data-target="#staticBackdrop"><i class="fas fa-eye text-warning"></i></button></div>
                                                            <div class="col-sm-4"><button class="btn" onclick="btnUpdateItem(`<%=pr.getProductId()%>`)"><i class="fas fa-edit text-success"></i></button></div>
                                                            <div class="col-sm-4"><button class="btn" onclick="btnDeleteItem(`<%=pr.getProductId()%>`)" ><i class="fas fa-trash-alt text-danger"></i></button></div>
                                                        </div>
                                                    </td>
                                                </tr>

                                                <%
                                                    }
                                                %>


                                            </tbody>
                                            <tfoot>
                                                <%
                                                    int count = productList.size();
                                                %>
                                                <tr>
                                                    <th>Item Count</th>
                                                    <td><%=count%></td>

                                                </tr>
                                            </tfoot>
                                        </table>
                                    </div>
                                    <!-- /.card-body -->
                                </div>
                                <!-- /.card -->
                            </div>
                            <!-- /.col -->
                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- /.container-fluid -->
                </section>
                <!-- /.content -->

                <!-- Modal View -->
                <div id="mod">

                </div>


            </div>
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
        <!-- DataTables  & Plugins -->
        <script src="plugins/datatables/jquery.dataTables.min.js"></script>
        <script src="plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
        <script src="plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
        <script src="plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>
        <script src="plugins/datatables-buttons/js/dataTables.buttons.min.js"></script>
        <script src="plugins/datatables-buttons/js/buttons.bootstrap4.min.js"></script>
        <script src="plugins/jszip/jszip.min.js"></script>
        <script src="plugins/pdfmake/pdfmake.min.js"></script>
        <script src="plugins/pdfmake/vfs_fonts.js"></script>
        <script src="plugins/datatables-buttons/js/buttons.html5.min.js"></script>
        <script src="plugins/datatables-buttons/js/buttons.print.min.js"></script>
        <script src="plugins/datatables-buttons/js/buttons.colVis.min.js"></script>
        <!-- AdminLTE App -->
        <script src="dist/js/adminlte.min.js"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="dist/js/demo.js"></script>
        <!-- Page specific script -->

        <script src="../admin/externaljs/sweetalert.min.js"></script>
        <script>
                                                                $(document).ready(function () {
                                                                    $.ajax({
                                                                        type: 'POST',
                                                                        url: "/Ecom_final_project/ProductViewController",
                                                                        data: {},
                                                                        success: function (data) {
                                                                        },
                                                                        error: function () {
                                                                        }
                                                                    });
                                                                });

                                                                function btnItem(pid) {
                                                                    $.ajax({
                                                                        type: 'POST',
                                                                        url: "/Ecom_final_project/ProductViewModalController",
                                                                        data: {"pid": pid},
                                                                        success: function (data) {
                                                                            document.getElementById("mod").innerHTML = data;
                                                                        },
                                                                        error: function () {
                                                                        }
                                                                    });
                                                                }

                                                                function btnUpdateItem(product_id) {
                                                                    $.ajax({
                                                                        type: 'POST',
                                                                        url: "/Ecom_final_project/ProductUpdateController",
                                                                        data: {"product_id": product_id},
                                                                        success: function (data) {
                                                                            window.location.replace("/Ecom_final_project/admin/updateProduct.jsp?pid=" + product_id);
                                                                        },
                                                                        error: function () {
                                                                        }
                                                                    });
                                                                }

                                                                function btnDeleteItem(product_id) {

                                                                    swal({
                                                                        title: "Are you sure?",
                                                                        text: "Do you really want to delete this product..?",
                                                                        icon: "warning",
                                                                        buttons: true,
                                                                        dangerMode: true,
                                                                    })
                                                                            .then((value) => {
                                                                                if (value) {
                                                                                    $.ajax({
                                                                                        type: 'POST',
                                                                                        url: "/Ecom_final_project/ProductDeleteController",
                                                                                        data: {"product_id": product_id},
                                                                                        success: function (data) {
                                                                                            if (data === "success") {
                                                                                                window.location.replace("/Ecom_final_project/admin/viewAllProduct.jsp");
                                                                                            }
                                                                                        },
                                                                                        error: function () {

                                                                                        }
                                                                                    });
                                                                                }
                                                                            });
                                                                }


                                                                $(function () {
                                                                    $("#example1").DataTable({
                                                                        "responsive": false, "lengthChange": true, "autoWidth": true,
                                                                        "buttons": ["copy", "csv", "excel", "pdf", "print", "colvis"]
                                                                    }).buttons().container().appendTo('#example1_wrapper .col-md-6:eq(0)');
                                                                    $('#example2').DataTable({
                                                                        "paging": true,
                                                                        "lengthChange": false,
                                                                        "searching": false,
                                                                        "ordering": true,
                                                                        "info": true,
                                                                        "autoWidth": false,
                                                                        "responsive": true,
                                                                    });
                                                                });

        </script>
    </body>
</html>