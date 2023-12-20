package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mailVerifySuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("      \n");
      out.write("        <link rel=\"stylesheet\" href=\"../customer/bootstrap/css/mdb.min.css\">\n");
      out.write("        <title>Verify Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #f5f5f5;\">\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card mt-5\">\n");
      out.write("\n");
      out.write("                <div class=\"text-center p-5\">\n");
      out.write("                    <h1 class=\"fw-bold mt-5\" ><span class=\"text-warning\">PRASANNA</span> DRESS POINT</h1>\n");
      out.write("                    <h1>Thank You For Registration!</h1>\n");
      out.write("                    <p class=\"lead\">Please Check your Email for Account Verification Link.</p>\n");
      out.write("                    <p class=\"lead\"><a href=\"#\" class=\"btn btn-lg btn-primary\">Learn more</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- FOOTER -->\n");
      out.write("        <footer class=\"footer mt-5 text-muted text-center text-small\">\n");
      out.write("            <p>Developed by Pubudu Kasun &copy; 2023, All Rights Reserved.</p>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"../customer/bootstrap/js/mdb.min.js\"></script>\n");
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
