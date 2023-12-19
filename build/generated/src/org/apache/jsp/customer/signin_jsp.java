package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/customer/../customer/Main/resourse.jsp");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SignIn</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <link href=\"../customer/font/font-awesome/css/font_css.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../customer/bootstrap/css/mdb.min.css\" rel=\"stylesheet\"/>   \n");
      out.write("    <link rel=\"stylesheet\" href=\"../customer/owl-carousel/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../customer/owl-carousel/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"../customer/bootstrap/js/mdb.min.js\" ></script>\n");
      out.write("    <script src=\"../customer/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"../customer/owl-carousel/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../customer/owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if (request.getSession().getAttribute("UserData") != null) {
                response.sendRedirect("/Ecom_final_project/customer/main.jsp");
            }
        
      out.write("\n");
      out.write("        <section class=\"vh-100\">\n");
      out.write("            <div class=\"container py-5 h-100\">\n");
      out.write("                <div class=\"row d-flex align-items-center justify-content-center h-100\">\n");
      out.write("                    <div class=\"col-md-8 col-lg-7 col-xl-6\">\n");
      out.write("                        <h2 class=\" text-center\"><strong><span class=\"text-warning\"> PRASANNA </span> DRESS POINT</strong></h2>\n");
      out.write("\n");
      out.write("                        <img src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg\"\n");
      out.write("                             class=\"img-fluid\" alt=\"Phone image\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-7 col-lg-5 col-xl-5 offset-xl-1\">\n");
      out.write("                        <form>\n");
      out.write("                            <h3 class=\"mt-3\"><strong>Sign In Now</strong></h3>\n");
      out.write("                            <!-- Email input -->\n");
      out.write("                            <div class=\"form-outline mb-4\">\n");
      out.write("                                <input type=\"email\" id=\"txtemail\" class=\"form-control form-control-lg\" />\n");
      out.write("                                <label class=\"form-label\" for=\"form1Example13\">Email address</label>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Password input -->\n");
      out.write("                            <div class=\"form-outline mb-4\">\n");
      out.write("                                <input type=\"password\" id=\"txtpass\" class=\"form-control form-control-lg\" />\n");
      out.write("                                <label class=\"form-label\" for=\"form1Example23\">Password</label>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"d-flex justify-content-around align-items-center mb-4\">\n");
      out.write("                                <!-- Checkbox -->\n");
      out.write("                                <div class=\"form-check\">\n");
      out.write("                                    <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"form1Example3\" checked />\n");
      out.write("                                    <label class=\"form-check-label\" for=\"form1Example3\"> Remember me </label>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"#!\"  data-mdb-toggle=\"modal\" data-mdb-target=\"#exampleModal\">Forgot password?</a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Submit button -->\n");
      out.write("                            <button type=\"button\" class=\"btn btn-warning  btn-lg btn-block\" id=\"signinbtn\">Sign in</button>\n");
      out.write("                            <p class=\"text-center text-muted mt-1\"><small>Register Now for Free By Clicking <a class=\"term\" href=\"../customer/signup.jsp\">Register Now</a> Button </small></p>\n");
      out.write("                            <div class=\"divider d-flex align-items-center my-4\">\n");
      out.write("                                <p class=\"text-center fw-bold mx-3 mb-0 text-muted\">OR</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <a class=\"btn btn-primary btn-lg btn-block\" style=\"background-color: #3b5998\" href=\"#!\"\n");
      out.write("                               role=\"button\">\n");
      out.write("                                <i class=\"fab fa-facebook-f me-2\"></i>Continue with Facebook\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"btn btn-danger btn-lg btn-block\" style=\"background-color: #b02a37\" href=\"#!\"\n");
      out.write("                               role=\"button\">\n");
      out.write("                                <i class=\"fab fa-google me-2\"></i>Continue with Google</a>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal top fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("             aria-hidden=\"true\" data-mdb-backdrop=\"true\" data-mdb-keyboard=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" style=\"width: 300px;\">\n");
      out.write("                <div class=\"modal-content text-center\">\n");
      out.write("                    <div class=\"modal-header h5 text-white bg-primary justify-content-center\">\n");
      out.write("                        Password Reset\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body px-5\">\n");
      out.write("                        <p class=\"py-2\">\n");
      out.write("                            Enter your email address and we'll send you an email with instructions to reset your password.\n");
      out.write("                        </p>\n");
      out.write("                        <div class=\"form-outline\">\n");
      out.write("                            <input type=\"email\" id=\"typeEmail\" class=\"form-control my-3\" />\n");
      out.write("                            <label class=\"form-label\" for=\"typeEmail\">Email input</label>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#\" id=\"sendOTP\" class=\"btn btn-primary w-100\">Send OTP</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#signinbtn').click(function () {\n");
      out.write("\n");
      out.write("                var email = $('#txtemail').val();\n");
      out.write("                var password = $('#txtpass').val();\n");
      out.write("\n");
      out.write("\n");
      out.write("                $.ajax({\n");
      out.write("                    type: 'POST',\n");
      out.write("                    url: \"/Ecom_final_project/CustomerLogin\",\n");
      out.write("                    data: {\"txtemail\": email, \"password\": password},\n");
      out.write("                    success: function (data) {\n");
      out.write("                        if (data === \"00\") {\n");
      out.write("                            alert(\"login success\")\n");
      out.write("                            window.location = \"/Ecom_final_project/customer/main.jsp\";\n");
      out.write("                        } else {\n");
      out.write("                            alert(\"Try again...\")\n");
      out.write("                            window.location = \"/Ecom_final_project/customer/signin.jsp\";\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function () {\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"#sendOTP\").click(function () {\n");
      out.write("\n");
      out.write("                const  email = document.getElementById(\"typeEmail\").value;\n");
      out.write("\n");
      out.write("                $.ajax({\n");
      out.write("                    type: 'POST',\n");
      out.write("                    url: \"/Ecom_final_project/OTPController\",\n");
      out.write("                    data: {txtEmail: email},\n");
      out.write("                    success: function (data) {\n");
      out.write("                        if (data === \"00\") {\n");
      out.write("                            window.location = \"/Ecom_final_project/customer/verify.jsp?email=\" + email;\n");
      out.write("                        } else if (data === \"01\") {\n");
      out.write("                            window.location = \"/Ecom_final_project/customer/signin.jsp\";\n");
      out.write("\n");
      out.write("                        } else {\n");
      out.write("                            alert(\"user Not Found\");\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function () {\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\" src=\"../customer/bootstrap/js/mdb.min.js\" ></script>\n");
      out.write("\n");
      out.write("</html>\n");
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
