<%-- 
    Document   : viewAllProduct
    Created on : Dec 18, 2023, 1:56:11 PM
    Author     : Pubudu Kasun
--%>

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
                                    <div class="card-header bg-warning">
                                        <div class="row">
                                            <div class="col-sm-10">
                                                <h3 class="card-title fw-bold">Stock</h3>
                                            </div>
                                            <div class="col-sm-2">
                                                <!-- Button trigger modal -->
                                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#staticBackdrop">
                                                    Add New Stock
                                                </button>
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
                                                    <th>Image</th>
                                                    <th>Status</th>
                                                    <th>Add Item</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>Internet
                                                        Explorer 4.0
                                                    </td>
                                                    <td>Win 95+</td>
                                                    <td> 4</td>
                                                    <td>X</td>
                                                </tr>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>Internet
                                                        Explorer 5.0
                                                    </td>
                                                    <td>Win 95+</td>
                                                    <td>5</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>Internet
                                                        Explorer 5.5
                                                    </td>
                                                    <td>Win 95+</td>
                                                    <td>5.5</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>Internet
                                                        Explorer 6
                                                    </td>
                                                    <td>Win 98+</td>
                                                    <td>6</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>Internet Explorer 7</td>
                                                    <td>Win XP SP2+</td>
                                                    <td>7</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>AOL browser (AOL desktop)</td>
                                                    <td>Win XP</td>
                                                    <td>6</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Firefox 1.0</td>
                                                    <td>Win 98+ / OSX.2+</td>
                                                    <td>1.7</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Firefox 1.5</td>
                                                    <td>Win 98+ / OSX.2+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Firefox 2.0</td>
                                                    <td>Win 98+ / OSX.2+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Firefox 3.0</td>
                                                    <td>Win 2k+ / OSX.3+</td>
                                                    <td>1.9</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Camino 1.0</td>
                                                    <td>OSX.2+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Camino 1.5</td>
                                                    <td>OSX.3+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Netscape 7.2</td>
                                                    <td>Win 95+ / Mac OS 8.6-9.2</td>
                                                    <td>1.7</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Netscape Browser 8</td>
                                                    <td>Win 98SE+</td>
                                                    <td>1.7</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Netscape Navigator 9</td>
                                                    <td>Win 98+ / OSX.2+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.0</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.1</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.1</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.2</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.2</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.3</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.3</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.4</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.4</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.5</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.5</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.6</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.6</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.7</td>
                                                    <td>Win 98+ / OSX.1+</td>
                                                    <td>1.7</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.8</td>
                                                    <td>Win 98+ / OSX.1+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Seamonkey 1.1</td>
                                                    <td>Win 98+ / OSX.2+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Epiphany 2.20</td>
                                                    <td>Gnome</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>Safari 1.2</td>
                                                    <td>OSX.3</td>
                                                    <td>125.5</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>Safari 1.3</td>
                                                    <td>OSX.3</td>
                                                    <td>312.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>Safari 2.0</td>
                                                    <td>OSX.4+</td>
                                                    <td>419.3</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>Safari 3.0</td>
                                                    <td>OSX.4+</td>
                                                    <td>522.1</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>OmniWeb 5.5</td>
                                                    <td>OSX.4+</td>
                                                    <td>420</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>iPod Touch / iPhone</td>
                                                    <td>iPod</td>
                                                    <td>420.1</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>S60</td>
                                                    <td>S60</td>
                                                    <td>413</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 7.0</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 7.5</td>
                                                    <td>Win 95+ / OSX.2+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 8.0</td>
                                                    <td>Win 95+ / OSX.2+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 8.5</td>
                                                    <td>Win 95+ / OSX.2+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 9.0</td>
                                                    <td>Win 95+ / OSX.3+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 9.2</td>
                                                    <td>Win 88+ / OSX.3+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 9.5</td>
                                                    <td>Win 88+ / OSX.3+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera for Wii</td>
                                                    <td>Wii</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Nokia N800</td>
                                                    <td>N800</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Nintendo DS browser</td>
                                                    <td>Nintendo DS</td>
                                                    <td>8.5</td>
                                                    <td>C/A<sup>1</sup></td>
                                                </tr>
                                                <tr>
                                                    <td>KHTML</td>
                                                    <td>Konqureror 3.1</td>
                                                    <td>KDE 3.1</td>
                                                    <td>3.1</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>KHTML</td>
                                                    <td>Konqureror 3.3</td>
                                                    <td>KDE 3.3</td>
                                                    <td>3.3</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>KHTML</td>
                                                    <td>Konqureror 3.5</td>
                                                    <td>KDE 3.5</td>
                                                    <td>3.5</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Tasman</td>
                                                    <td>Internet Explorer 4.5</td>
                                                    <td>Mac OS 8-9</td>
                                                    <td>-</td>
                                                    <td>X</td>
                                                </tr>
                                                <tr>
                                                    <td>Tasman</td>
                                                    <td>Internet Explorer 5.1</td>
                                                    <td>Mac OS 7.6-9</td>
                                                    <td>1</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Tasman</td>
                                                    <td>Internet Explorer 5.2</td>
                                                    <td>Mac OS 8-X</td>
                                                    <td>1</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>NetFront 3.1</td>
                                                    <td>Embedded devices</td>
                                                    <td>-</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>NetFront 3.4</td>
                                                    <td>Embedded devices</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>Dillo 0.8</td>
                                                    <td>Embedded devices</td>
                                                    <td>-</td>
                                                    <td>X</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>Links</td>
                                                    <td>Text only</td>
                                                    <td>-</td>
                                                    <td>X</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>Lynx</td>
                                                    <td>Text only</td>
                                                    <td>-</td>
                                                    <td>X</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>IE Mobile</td>
                                                    <td>Windows Mobile 6</td>
                                                    <td>-</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>PSP browser</td>
                                                    <td>PSP</td>
                                                    <td>-</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Other browsers</td>
                                                    <td>All others</td>
                                                    <td>-</td>
                                                    <td>-</td>
                                                    <td>U</td>
                                                </tr>
                                            </tbody>
                                            <tfoot>
                                                <tr>
                                                    <th>Rendering engine</th>
                                                    <th>Browser</th>
                                                    <th>Platform(s)</th>
                                                    <th>Engine version</th>
                                                    <th>CSS grade</th>
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

                <!-- Main content -->
                <section class="content">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-12">

                                <div class="card">
                                    <div class="card-header bg-warning">

                                        <h3 class="card-title">Stock Items</h3>

                                    </div>
                                    <!-- /.card-header -->
                                    <div class="card-body">
                                        <table id="example3" class="table table-bordered table-hover">
                                            <thead>
                                                <tr>
                                                    <th>Rendering engine</th>
                                                    <th>Browser</th>
                                                    <th>Platform(s)</th>
                                                    <th>Engine version</th>
                                                    <th>CSS grade</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>Internet
                                                        Explorer 4.0
                                                    </td>
                                                    <td>Win 95+</td>
                                                    <td> 4</td>
                                                    <td>X</td>
                                                </tr>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>Internet
                                                        Explorer 5.0
                                                    </td>
                                                    <td>Win 95+</td>
                                                    <td>5</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>Internet
                                                        Explorer 5.5
                                                    </td>
                                                    <td>Win 95+</td>
                                                    <td>5.5</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>Internet
                                                        Explorer 6
                                                    </td>
                                                    <td>Win 98+</td>
                                                    <td>6</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>Internet Explorer 7</td>
                                                    <td>Win XP SP2+</td>
                                                    <td>7</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Trident</td>
                                                    <td>AOL browser (AOL desktop)</td>
                                                    <td>Win XP</td>
                                                    <td>6</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Firefox 1.0</td>
                                                    <td>Win 98+ / OSX.2+</td>
                                                    <td>1.7</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Firefox 1.5</td>
                                                    <td>Win 98+ / OSX.2+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Firefox 2.0</td>
                                                    <td>Win 98+ / OSX.2+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Firefox 3.0</td>
                                                    <td>Win 2k+ / OSX.3+</td>
                                                    <td>1.9</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Camino 1.0</td>
                                                    <td>OSX.2+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Camino 1.5</td>
                                                    <td>OSX.3+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Netscape 7.2</td>
                                                    <td>Win 95+ / Mac OS 8.6-9.2</td>
                                                    <td>1.7</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Netscape Browser 8</td>
                                                    <td>Win 98SE+</td>
                                                    <td>1.7</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Netscape Navigator 9</td>
                                                    <td>Win 98+ / OSX.2+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.0</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.1</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.1</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.2</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.2</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.3</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.3</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.4</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.4</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.5</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.5</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.6</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>1.6</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.7</td>
                                                    <td>Win 98+ / OSX.1+</td>
                                                    <td>1.7</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Mozilla 1.8</td>
                                                    <td>Win 98+ / OSX.1+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Seamonkey 1.1</td>
                                                    <td>Win 98+ / OSX.2+</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Gecko</td>
                                                    <td>Epiphany 2.20</td>
                                                    <td>Gnome</td>
                                                    <td>1.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>Safari 1.2</td>
                                                    <td>OSX.3</td>
                                                    <td>125.5</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>Safari 1.3</td>
                                                    <td>OSX.3</td>
                                                    <td>312.8</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>Safari 2.0</td>
                                                    <td>OSX.4+</td>
                                                    <td>419.3</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>Safari 3.0</td>
                                                    <td>OSX.4+</td>
                                                    <td>522.1</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>OmniWeb 5.5</td>
                                                    <td>OSX.4+</td>
                                                    <td>420</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>iPod Touch / iPhone</td>
                                                    <td>iPod</td>
                                                    <td>420.1</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Webkit</td>
                                                    <td>S60</td>
                                                    <td>S60</td>
                                                    <td>413</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 7.0</td>
                                                    <td>Win 95+ / OSX.1+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 7.5</td>
                                                    <td>Win 95+ / OSX.2+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 8.0</td>
                                                    <td>Win 95+ / OSX.2+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 8.5</td>
                                                    <td>Win 95+ / OSX.2+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 9.0</td>
                                                    <td>Win 95+ / OSX.3+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 9.2</td>
                                                    <td>Win 88+ / OSX.3+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera 9.5</td>
                                                    <td>Win 88+ / OSX.3+</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Opera for Wii</td>
                                                    <td>Wii</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Nokia N800</td>
                                                    <td>N800</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Presto</td>
                                                    <td>Nintendo DS browser</td>
                                                    <td>Nintendo DS</td>
                                                    <td>8.5</td>
                                                    <td>C/A<sup>1</sup></td>
                                                </tr>
                                                <tr>
                                                    <td>KHTML</td>
                                                    <td>Konqureror 3.1</td>
                                                    <td>KDE 3.1</td>
                                                    <td>3.1</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>KHTML</td>
                                                    <td>Konqureror 3.3</td>
                                                    <td>KDE 3.3</td>
                                                    <td>3.3</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>KHTML</td>
                                                    <td>Konqureror 3.5</td>
                                                    <td>KDE 3.5</td>
                                                    <td>3.5</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Tasman</td>
                                                    <td>Internet Explorer 4.5</td>
                                                    <td>Mac OS 8-9</td>
                                                    <td>-</td>
                                                    <td>X</td>
                                                </tr>
                                                <tr>
                                                    <td>Tasman</td>
                                                    <td>Internet Explorer 5.1</td>
                                                    <td>Mac OS 7.6-9</td>
                                                    <td>1</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Tasman</td>
                                                    <td>Internet Explorer 5.2</td>
                                                    <td>Mac OS 8-X</td>
                                                    <td>1</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>NetFront 3.1</td>
                                                    <td>Embedded devices</td>
                                                    <td>-</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>NetFront 3.4</td>
                                                    <td>Embedded devices</td>
                                                    <td>-</td>
                                                    <td>A</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>Dillo 0.8</td>
                                                    <td>Embedded devices</td>
                                                    <td>-</td>
                                                    <td>X</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>Links</td>
                                                    <td>Text only</td>
                                                    <td>-</td>
                                                    <td>X</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>Lynx</td>
                                                    <td>Text only</td>
                                                    <td>-</td>
                                                    <td>X</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>IE Mobile</td>
                                                    <td>Windows Mobile 6</td>
                                                    <td>-</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Misc</td>
                                                    <td>PSP browser</td>
                                                    <td>PSP</td>
                                                    <td>-</td>
                                                    <td>C</td>
                                                </tr>
                                                <tr>
                                                    <td>Other browsers</td>
                                                    <td>All others</td>
                                                    <td>-</td>
                                                    <td>-</td>
                                                    <td>U</td>
                                                </tr>
                                            </tbody>
                                            <tfoot>
                                                <tr>
                                                    <th>Rendering engine</th>
                                                    <th>Browser</th>
                                                    <th>Platform(s)</th>
                                                    <th>Engine version</th>
                                                    <th>CSS grade</th>
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



                <!-- Modal -->
                <div class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="staticBackdropLabel">Add New Product</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">

                                <form action="stockUpdate.jsp" method="POST">

                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-8">
                                                <div class="form-group  mb-3">
                                                    <label class="form-label">Item Name & (Current Item ID: )</label>
                                                    <input class="form-control" type="text" name="itemName" id="itemName" placeholder="Item Name"/>
                                                </div>
                                                <div class="form-group mb-3">
                                                    <label class="form-label">Select Image</label>
                                                    <input type="file" class="form-control" id="file" name="file">
                                                </div>
                                                <div class="form-check mb-3">
                                                    <input class="form-check-input" type="checkbox"  id="checkbox" name="checkbox" checked="">
                                                    <label class="form-check-label" for="flexCheckDefault">Item Status</label>
                                                </div>
                                            </div>
                                            <div class="col-sm-4 mt-3">
                                                <div class="card">
                                                    <img alt="Iem Image" id="item-image" src="" height="150px" width="120px">
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </form>

                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-primary">Upload</button>
                            </div>
                        </div>
                    </div>
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
        <script>
            $(function () {
                $("#example1").DataTable({
                    "responsive": true, "lengthChange": false, "autoWidth": false,
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


            $(function () {
                $("#example3").DataTable({
                    "responsive": true, "lengthChange": false, "autoWidth": false,
                    "buttons": ["copy", "csv", "excel", "pdf", "print", "colvis"]
                }).buttons().container().appendTo('#example3_wrapper .col-md-6:eq(0)');
                $('#example4').DataTable({
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