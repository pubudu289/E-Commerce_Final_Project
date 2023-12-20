package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DTO.UserForgetPwDTO;

public final class verify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"../customer/bootstrap/css/mdb.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../customer/external_css/otpcss.css\">\n");
      out.write("        <script src=\"../customer/owl-carousel/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Forgot Password</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #f5f5f5;\">\n");
      out.write("        ");

            String email = request.getParameter("email");
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card mt-5\">\n");
      out.write("\n");
      out.write("                <div class=\"text-center p-5\">\n");
      out.write("                    <h1 class=\"fw-bold mt-5\" ><span class=\"text-warning\">PRASANNA</span> DRESS POINT</h1>\n");
      out.write("                    <h1>OTP Confirmation</h1>\n");
      out.write("                    <p class=\"lead\">Please Check Your code was sent to you via email.</p>\n");
      out.write("\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\"></div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-outline\">\n");
      out.write("                                    <input type=\"email\" id=\"typeEmail\" class=\"form-control my-3\" value=\"");
      out.print(email);
      out.write(" \"  disabled/>\n");
      out.write("                                    <label class=\"form-label\" for=\"typeEmail\">Email input</label>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                              <div class=\"col-sm-3\"></div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        <div class=\"otp-field mb-4\">\n");
      out.write("                            <input id=\"one\" type=\"number\" />\n");
      out.write("                            <input id=\"two\" type=\"number\" disabled />\n");
      out.write("                            <input id=\"three\" type=\"number\" disabled />\n");
      out.write("                            <input id=\"four\" type=\"number\" disabled />\n");
      out.write("                            <input id=\"five\" type=\"number\" disabled />\n");
      out.write("                            <input id=\"six\" type=\"number\" disabled />\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"button\" id=\"btnOtp\" class=\"btn btn-primary mb-3\">Verify</button>\n");
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
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"#btnOtp\").click(function () {\n");
      out.write("                const email = document.getElementById(\"typeEmail\").value;\n");
      out.write("                \n");
      out.write("                const  one = document.getElementById(\"one\");\n");
      out.write("                const  two = document.getElementById(\"two\");\n");
      out.write("                const  three = document.getElementById(\"three\");\n");
      out.write("                const  four = document.getElementById(\"four\");\n");
      out.write("                const  five = document.getElementById(\"five\");\n");
      out.write("                const  six = document.getElementById(\"six\");\n");
      out.write("\n");
      out.write("                const otp = one.value + \"\" + two.value + \"\" + three.value + \"\" + four.value + \"\" + five.value + \"\" + six.value;\n");
      out.write("\n");
      out.write("                $.ajax({\n");
      out.write("                    type: 'POST',\n");
      out.write("                    url: \"/Ecom_final_project/VerifyCode\",\n");
      out.write("                    data: {txtOtp: otp},\n");
      out.write("                    success: function (data) {\n");
      out.write("                        if (data === \"00\") {\n");
      out.write("                            window.location = \"/Ecom_final_project/customer/passwordUpdate.jsp?email=\"+email;\n");
      out.write("                        } else {\n");
      out.write("                            window.location = \"/Ecom_final_project/customer/verify.jsp\";\n");
      out.write("                            alert(\"Wrong OTP..! Please Check and Enter Correct OTP\");\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function () {\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script> \n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"../customer/bootstrap/js/mdb.min.js\" ></script>\n");
      out.write("    <script src=\"../customer/external_js/otpjs.js\"></script>\n");
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
