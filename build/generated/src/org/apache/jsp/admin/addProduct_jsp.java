package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/admin/../admin/main/navbar.jsp");
    _jspx_dependants.add("/admin/../admin/main/sidebar.jsp");
    _jspx_dependants.add("/admin/../admin/main/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("This is a starter template page. Use this page to start your new project from\n");
      out.write("scratch. This page gets rid of all links and provides the needed markup only.\n");
      out.write("-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>PRASANNA DP | Product</title>\n");
      out.write("\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/fontawesome-free/css/all.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/adminlte.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("            <!-- Navbar -->\n");
      out.write("            <nav class=\"main-header navbar navbar-expand navbar-white navbar-light\">\n");
      out.write("                <!-- Left navbar links -->\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\" role=\"button\"><i class=\"fas fa-bars\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item d-none d-sm-inline-block\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"nav-link\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item d-none d-sm-inline-block\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <!-- Right navbar links -->\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                    <!-- Navbar Search -->\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" data-widget=\"navbar-search\" href=\"#\" role=\"button\">\n");
      out.write("                            <i class=\"fas fa-search\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"navbar-search-block\">\n");
      out.write("                            <form class=\"form-inline\">\n");
      out.write("                                <div class=\"input-group input-group-sm\">\n");
      out.write("                                    <input class=\"form-control form-control-navbar\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                                    <div class=\"input-group-append\">\n");
      out.write("                                        <button class=\"btn btn-navbar\" type=\"submit\">\n");
      out.write("                                            <i class=\"fas fa-search\"></i>\n");
      out.write("                                        </button>\n");
      out.write("                                        <button class=\"btn btn-navbar\" type=\"button\" data-widget=\"navbar-search\">\n");
      out.write("                                            <i class=\"fas fa-times\"></i>\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <!-- Messages Dropdown Menu -->\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"far fa-comments\"></i>\n");
      out.write("                            <span class=\"badge badge-danger navbar-badge\">3</span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <!-- Message Start -->\n");
      out.write("                                <div class=\"media\">\n");
      out.write("                                    <img src=\"dist/img/user1-128x128.jpg\" alt=\"User Avatar\" class=\"img-size-50 mr-3 img-circle\">\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        <h3 class=\"dropdown-item-title\">\n");
      out.write("                                            Brad Diesel\n");
      out.write("                                            <span class=\"float-right text-sm text-danger\"><i class=\"fas fa-star\"></i></span>\n");
      out.write("                                        </h3>\n");
      out.write("                                        <p class=\"text-sm\">Call me whenever you can...</p>\n");
      out.write("                                        <p class=\"text-sm text-muted\"><i class=\"far fa-clock mr-1\"></i> 4 Hours Ago</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Message End -->\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <!-- Message Start -->\n");
      out.write("                                <div class=\"media\">\n");
      out.write("                                    <img src=\"dist/img/user8-128x128.jpg\" alt=\"User Avatar\" class=\"img-size-50 img-circle mr-3\">\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        <h3 class=\"dropdown-item-title\">\n");
      out.write("                                            John Pierce\n");
      out.write("                                            <span class=\"float-right text-sm text-muted\"><i class=\"fas fa-star\"></i></span>\n");
      out.write("                                        </h3>\n");
      out.write("                                        <p class=\"text-sm\">I got your message bro</p>\n");
      out.write("                                        <p class=\"text-sm text-muted\"><i class=\"far fa-clock mr-1\"></i> 4 Hours Ago</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Message End -->\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <!-- Message Start -->\n");
      out.write("                                <div class=\"media\">\n");
      out.write("                                    <img src=\"dist/img/user3-128x128.jpg\" alt=\"User Avatar\" class=\"img-size-50 img-circle mr-3\">\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        <h3 class=\"dropdown-item-title\">\n");
      out.write("                                            Nora Silvester\n");
      out.write("                                            <span class=\"float-right text-sm text-warning\"><i class=\"fas fa-star\"></i></span>\n");
      out.write("                                        </h3>\n");
      out.write("                                        <p class=\"text-sm\">The subject goes here</p>\n");
      out.write("                                        <p class=\"text-sm text-muted\"><i class=\"far fa-clock mr-1\"></i> 4 Hours Ago</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Message End -->\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item dropdown-footer\">See All Messages</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- Notifications Dropdown Menu -->\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"far fa-bell\"></i>\n");
      out.write("                            <span class=\"badge badge-warning navbar-badge\">15</span>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\">\n");
      out.write("                            <span class=\"dropdown-header\">15 Notifications</span>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <i class=\"fas fa-envelope mr-2\"></i> 4 new messages\n");
      out.write("                                <span class=\"float-right text-muted text-sm\">3 mins</span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <i class=\"fas fa-users mr-2\"></i> 8 friend requests\n");
      out.write("                                <span class=\"float-right text-muted text-sm\">12 hours</span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item\">\n");
      out.write("                                <i class=\"fas fa-file mr-2\"></i> 3 new reports\n");
      out.write("                                <span class=\"float-right text-muted text-sm\">2 days</span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-item dropdown-footer\">See All Notifications</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" data-widget=\"fullscreen\" href=\"#\" role=\"button\">\n");
      out.write("                            <i class=\"fas fa-expand-arrows-alt\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" data-widget=\"control-sidebar\" data-slide=\"true\" href=\"#\" role=\"button\">\n");
      out.write("                            <i class=\"fas fa-th-large\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <!-- /.navbar -->\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("  <!-- Main Sidebar Container -->\n");
      out.write("            <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\n");
      out.write("                <!-- Brand Logo -->\n");
      out.write("                <a href=\"index3.html\" class=\"brand-link\">\n");
      out.write("                    <img src=\"dist/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\" style=\"opacity: .8\">\n");
      out.write("                    <span class=\"brand-text font-weight-light\">AdminLTE 3</span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!-- Sidebar -->\n");
      out.write("                <div class=\"sidebar\">\n");
      out.write("                    <!-- Sidebar user panel (optional) -->\n");
      out.write("                    <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\n");
      out.write("                        <div class=\"image\">\n");
      out.write("                            <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle elevation-2\" alt=\"User Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"info\">\n");
      out.write("                            <a href=\"#\" class=\"d-block\">Alexander Pierce</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- SidebarSearch Form -->\n");
      out.write("                    <div class=\"form-inline\">\n");
      out.write("                        <div class=\"input-group\" data-widget=\"sidebar-search\">\n");
      out.write("                            <input class=\"form-control form-control-sidebar\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <button class=\"btn btn-sidebar\">\n");
      out.write("                                    <i class=\"fas fa-search fa-fw\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Sidebar Menu -->\n");
      out.write("                    <nav class=\"mt-2\">\n");
      out.write("                        <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\n");
      out.write("                            <!-- Add icons to the links using the .nav-icon class\n");
      out.write("                                 with font-awesome or any other icon font library -->\n");
      out.write("                            <li class=\"nav-item menu-open\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link active\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-tachometer-alt\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                       Dash Board\n");
      out.write("                                        <i class=\"right fas fa-angle-left\"></i>\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"nav nav-treeview\">\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a href=\"index.jsp\" class=\"nav-link active\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Report</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a href=\"addProducts.jsp\" class=\"nav-link\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Product</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"nav-item\">\n");
      out.write("                                        <a href=\"#\" class=\"nav-link\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Product</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"nav-item\">\n");
      out.write("                                        <a href=\"#\" class=\"nav-link\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Product</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"nav-item\">\n");
      out.write("                                        <a href=\"#\" class=\"nav-link\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Product</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"nav-item\">\n");
      out.write("                                        <a href=\"#\" class=\"nav-link\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Product</p>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-th\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        Simple Link\n");
      out.write("                                        <span class=\"right badge badge-danger\">New</span>\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                    <!-- /.sidebar-menu -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <div class=\"content-header\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row mb-2\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h1 class=\"m-0\">Admin Dashboard</h1>\n");
      out.write("                            </div><!-- /.col -->\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <ol class=\"breadcrumb float-sm-right\">\n");
      out.write("                                    <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("                                    <li class=\"breadcrumb-item active\">Admin Dashboard</li>\n");
      out.write("                                </ol>\n");
      out.write("                            </div><!-- /.col -->\n");
      out.write("                        </div><!-- /.row -->\n");
      out.write("                    </div><!-- /.container-fluid -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.content-header -->\n");
      out.write("\n");
      out.write("<!--                 Main content \n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("\n");
      out.write("                                        <p class=\"card-text\">\n");
      out.write("                                            Some quick example text to build on the card title and make up the bulk of the card's\n");
      out.write("                                            content.\n");
      out.write("                                        </p>\n");
      out.write("\n");
      out.write("                                        <a href=\"#\" class=\"card-link\">Card link</a>\n");
      out.write("                                        <a href=\"#\" class=\"card-link\">Another link</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"card card-primary card-outline\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("\n");
      out.write("                                        <p class=\"card-text\">\n");
      out.write("                                            Some quick example text to build on the card title and make up the bulk of the card's\n");
      out.write("                                            content.\n");
      out.write("                                        </p>\n");
      out.write("                                        <a href=\"#\" class=\"card-link\">Card link</a>\n");
      out.write("                                        <a href=\"#\" class=\"card-link\">Another link</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div> /.card \n");
      out.write("                            </div>\n");
      out.write("                             /.col-md-6 \n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <h5 class=\"m-0\">Featured</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h6 class=\"card-title\">Special title treatment</h6>\n");
      out.write("\n");
      out.write("                                        <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"card card-primary card-outline\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <h5 class=\"m-0\">Featured</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h6 class=\"card-title\">Special title treatment</h6>\n");
      out.write("\n");
      out.write("                                        <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                             /.col-md-6 \n");
      out.write("                        </div>\n");
      out.write("                         /.row \n");
      out.write("                    </div> /.container-fluid \n");
      out.write("                </div>\n");
      out.write("                 /.content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("            <!-- Control Sidebar -->\n");
      out.write("            <aside class=\"control-sidebar control-sidebar-dark\">\n");
      out.write("                <!-- Control sidebar content goes here -->\n");
      out.write("                <div class=\"p-3\">\n");
      out.write("                    <h5>Title</h5>\n");
      out.write("                    <p>Sidebar content</p>\n");
      out.write("                </div>\n");
      out.write("            </aside>\n");
      out.write("            <!-- /.control-sidebar -->\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!-- Main Footer -->\n");
      out.write("<footer class=\"main-footer\">\n");
      out.write("    <!-- To the right -->\n");
      out.write("    <div class=\"float-right d-none d-sm-inline\">\n");
      out.write("        Anything you want\n");
      out.write("    </div>\n");
      out.write("    <!-- Default to the left -->\n");
      out.write("    <strong>Copyright &copy; 2014-2021 <a href=\"https://adminlte.io\">AdminLTE.io</a>.</strong> All rights reserved.\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- ./wrapper -->\n");
      out.write("\n");
      out.write("        <!-- REQUIRED SCRIPTS -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"plugins/jquery/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap 4 -->\n");
      out.write("        <script src=\"plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"dist/js/adminlte.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
