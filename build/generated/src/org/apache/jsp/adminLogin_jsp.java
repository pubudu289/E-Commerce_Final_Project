package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Admin | Login</title>\n");
      out.write("\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/fontawesome-free/css/all.min.css\">\n");
      out.write("        <!-- icheck bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/icheck-bootstrap/icheck-bootstrap.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/adminlte.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition login-page\">\n");
      out.write("        ");

            if (request.getSession().getAttribute("UserData") != null) {
                response.sendRedirect("/Ecom_final_project/admin/adminLogin.jsp");
            }
        
      out.write("\n");
      out.write("        <div class=\"login-box\">\n");
      out.write("            <!-- /.login-logo -->\n");
      out.write("            <div class=\"card card-outline card-primary\">\n");
      out.write("                <div class=\"card-header text-center\">\n");
      out.write("                    <h3 class=\"font-weight-bold\"><span class=\"text-warning\">PRASANNA </span>DRESS POINT</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <p class=\"login-box-msg\">Sign in</p>\n");
      out.write("\n");
      out.write("                    <form  method=\"post\">\n");
      out.write("                        <div class=\"input-group mb-3\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"txtemail\" placeholder=\"Email\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <span class=\"fas fa-envelope\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group mb-3\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"txtpassword\" placeholder=\"Password\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <div class=\"input-group-text\">\n");
      out.write("                                    <span class=\"fas fa-lock\"></span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-8\">\n");
      out.write("                                <div class=\"icheck-primary\">\n");
      out.write("                                    <input type=\"checkbox\" id=\"remember\">\n");
      out.write("                                    <label for=\"remember\">\n");
      out.write("                                        Remember Me\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <button type=\"button\" id=\"btnSignin\" class=\"btn btn-warning btn-block\">Sign In</button>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <div class=\"social-auth-links text-center mt-2 mb-3\">\n");
      out.write("                        <a href=\"#\" class=\"btn btn-block btn-primary\">\n");
      out.write("                            <i class=\"fab fa-facebook mr-2\"></i> Sign in using Facebook\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-block btn-danger\">\n");
      out.write("                            <i class=\"fab fa-google-plus mr-2\"></i> Sign in using Google+\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.social-auth-links -->\n");
      out.write("\n");
      out.write("                    <p class=\"mb-1\">\n");
      out.write("                        <a href=\"/Ecom_final_project/admin/adminForgotPassword.jsp\">I forgot my password</a>\n");
      out.write("                    </p>\n");
      out.write("               \n");
      out.write("                </div>\n");
      out.write("                <!-- /.card-body -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.card -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.login-box -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"plugins/jquery/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap 4 -->\n");
      out.write("        <script src=\"plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"dist/js/adminlte.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#btnSignin\").click(function () {\n");
      out.write("                    const email = document.getElementById(\"txtemail\").value;\n");
      out.write("                    const password = document.getElementById(\"txtpassword\").value;\n");
      out.write("                    const checkbox = document.getElementById(\"remember\");\n");
      out.write("\n");
      out.write("                    if (email && password && checkbox.checked) {\n");
      out.write("\n");
      out.write("                        $.ajax({\n");
      out.write("                            type: 'POST',\n");
      out.write("                            url: \"/Ecom_final_project/AdminLogin\",\n");
      out.write("                            data: {\"email\": email, \"password\": password},\n");
      out.write("                            success: function (data) {\n");
      out.write("                                if (data === \"00\") {\n");
      out.write("                                    alert(\"login success\")\n");
      out.write("                                    window.location = \"/Ecom_final_project/admin/index.jsp\";\n");
      out.write("                                } else {\n");
      out.write("                                    alert(\"Try again...\")\n");
      out.write("                                    window.location = \"/Ecom_final_project/admin/adminLogin.jsp\";\n");
      out.write("                                }\n");
      out.write("                            },\n");
      out.write("                            error: function () {\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
