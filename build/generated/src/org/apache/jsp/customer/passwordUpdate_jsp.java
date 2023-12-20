package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class passwordUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Password</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"../customer/bootstrap/css/mdb.min.css\">\n");
      out.write("        <script src=\"../customer/owl-carousel/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #f5f5f5;\">\n");
      out.write("\n");
      out.write("        ");

            String email = request.getParameter("email");
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card mt-3\">\n");
      out.write("\n");
      out.write("                <div class=\"text-center p-5\">\n");
      out.write("                    <h1 class=\"fw-bold\" ><span class=\"text-warning\">PRASANNA</span> DRESS POINT</h1>\n");
      out.write("                    <h1>Change Your New Password</h1>\n");
      out.write("                    <p class=\"lead\">Please Enter Your new password and confirm it.</p>\n");
      out.write("                    <form>\n");
      out.write("                        <!-- Password input -->\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\"></div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                                <div class=\"form-outline\">\n");
      out.write("                                    <input type=\"email\" id=\"typeEmail\" class=\"form-control my-3\" value=\"");
      out.print(email);
      out.write("\"  disabled/>\n");
      out.write("                                    <label class=\"form-label\" for=\"typeEmail\">Email input</label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-3\"></div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <span style=\"color: red; font-size: 11px;\" id=\"name_error_pass\" class=\"mt-0\"></span>\n");
      out.write("\n");
      out.write("                                    <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                        <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                            <input type=\"password\" id=\"newpassword\" class=\"form-control\" />\n");
      out.write("                                            <label class=\"form-label\" for=\"newpassword\">Password</label>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div> \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-3\"></div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <span style=\"color: red; font-size: 11px;\" id=\"name_error_compass\" class=\"mt-0\"></span>\n");
      out.write("                                    <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                        <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                            <input type=\"password\" id=\"comfirmpassword\"  class=\"form-control\"  />\n");
      out.write("                                            <label class=\"form-label\" for=\"comfirmpassword\">Confirm your password</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-3\"></div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <p class=\"text mb-0\" id=\"chareight\" style=\"font-size: 12px; color: #4f4f4f;\">Min. 8 characters</p>\n");
      out.write("                                    <p class=\"text mb-0\" id=\"lownum\" style=\"font-size: 12px; color: #4f4f4f;\">Include lowercase letter</p>\n");
      out.write("                                    <p class=\"text mb-0\" id=\"num\" style=\"font-size: 12px; color: #4f4f4f;\"> Include number</p>\n");
      out.write("                                    <p class=\"text mb-0\" id=\"upper\" style=\"font-size: 12px; color: #4f4f4f;\">Include uppercase letter</p>\n");
      out.write("                                    <p class=\"text mb-2\" id=\"spec\" style=\"font-size: 12px; color: #4f4f4f;\">Include a special character: #.-?!@$%^&*</p>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\"></div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-3\"></div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <button type=\"button\" id=\"btnpwUpdate\" class=\"btn btn-primary mb-3 btn-block\">Update</button>\n");
      out.write("                                </div>                              \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- FOOTER -->\n");
      out.write("        <footer class=\"footer mt-5 text-muted text-center text-small\">\n");
      out.write("            <p>Developed by Pubudu Kasun &copy; 2023, All Rights Reserved.</p>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"#btnpwUpdate\").click(function () {\n");
      out.write("                const pass = document.getElementById(\"newpassword\").value;\n");
      out.write("                const compass = document.getElementById(\"comfirmpassword\").value;\n");
      out.write("                const email = document.getElementById(\"typeEmail\").value;\n");
      out.write("                $.ajax({\n");
      out.write("                    type: 'POST',\n");
      out.write("                    url: \"/Ecom_final_project/passwordUpdate\",\n");
      out.write("                    data: {\"pass\": pass, \"compass\": compass, \"email\": email},\n");
      out.write("                    success: function (data) {\n");
      out.write("                        if (data === \"00\") {\n");
      out.write("                            window.location = \"/Ecom_final_project/customer/signin.jsp\";\n");
      out.write("                        } else {\n");
      out.write("                            window.location = \"/Ecom_final_project/customer/passwordUpdate.jsp?email=\"+email;\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function () {\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"../customer/bootstrap/js/mdb.min.js\" ></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"../customer/external_js/forgotPassValidation.js\" ></script>\n");
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
