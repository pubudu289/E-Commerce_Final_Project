package org.apache.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/customer/../customer/Main/cus_resource.jsp");
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
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <title>Customer | Registration</title>\n");
      out.write("            ");
      out.write("\n");
      out.write("<head>\n");
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
      out.write("\n");
      out.write("            <!-- Select2 -->\n");
      out.write("            <link rel=\"stylesheet\" href=\"../admin/plugins/select2/css/select2.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"../admin/plugins/select2-bootstrap4-theme/select2-bootstrap4.min.css\">\n");
      out.write("\n");
      out.write("            <!--multipal selector-->\n");
      out.write("            <link rel=\"stylesheet\" href=\"../admin/plugins/multipal-selector/css/bootstrap-select.min.css\">\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            ");

                String email = request.getParameter("email");

            
      out.write("\n");
      out.write("\n");
      out.write("            <section class=\"vh-200\" style=\"background-color: #eee;\">\n");
      out.write("                <div class=\"container h-100\">\n");
      out.write("                    <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                        <div class=\"col-lg-12 col-xl-11 mt-4 mb-4\">\n");
      out.write("                            <div class=\"card text-black\" style=\"border-radius: 25px;\">\n");
      out.write("                                <div class=\"card-body p-md-5\">\n");
      out.write("                                    <div class=\"row justify-content-center\">\n");
      out.write("\n");
      out.write("                                        <div class=\"col-md-10 col-lg-8 col-xl-7 order-2 order-lg-1\">\n");
      out.write("\n");
      out.write("                                            <p class=\"h3 fw-bold mb-5 mx-1 mx-md-4 mt-4\">User Registration</p>\n");
      out.write("\n");
      out.write("                                            <form class=\"mx-1 mx-md-4\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                                        <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                            <input type=\"email\" id=\"txtemail\" class=\"form-control\" value=\"");
      out.print(email);
      out.write("\" disabled/>\n");
      out.write("                                                            <label class=\"form-label\" for=\"txtemail\" id=\"txtemail\" >Email</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <span style=\"color: red; font-size: 11px; \"id=\"name_error_fullname\" class=\"mt-0\"></span>\n");
      out.write("                                                    <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                                        <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                            <input type=\"text\" id=\"full_name\" class=\"form-control\" />\n");
      out.write("                                                            <label class=\"form-label\" for=\"full_name\" id=\"full_name\" >Full Name</label>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    <span style=\"color: red; font-size: 11px; \"id=\"name_error_dob\" class=\"mt-0\"></span>\n");
      out.write("                                                    <div class=\"col-sm-6 mb-0\">\n");
      out.write("                                                        <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                                            <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                                <input type=\"date\" id=\"txtdob\" class=\"form-control\" />\n");
      out.write("                                                                <label class=\"form-label\" for=\"txtdob\" id=\"txtdob\" >Date of Birth</label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-sm-6 mt-0\">\n");
      out.write("                                                        <div class=\"row mt-0\">\n");
      out.write("                                                            <label class=\"mb-0\" style=\"font-size: 13px\" for=\"txtgender\" id=\"txtgender\" >Gender</label>\n");
      out.write("                                                            <div class=\"col-sm-12\">\n");
      out.write("\n");
      out.write("                                                                <div class=\"form-check form-check-inline\">\n");
      out.write("                                                                    <input class=\"form-check-input\" type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadioone\" value=\"Male\" checked=\"true\"/>\n");
      out.write("                                                                    <label class=\"form-check-label\" for=\"inlineRadio1\">Male</label>\n");
      out.write("                                                                </div>\n");
      out.write("\n");
      out.write("                                                                <div class=\"form-check form-check-inline\">\n");
      out.write("                                                                    <input class=\"form-check-input\" type=\"radio\" name=\"inlineRadioOptions\" id=\"inlineRadiotwo\" value=\"Female\" />\n");
      out.write("                                                                    <label class=\"form-check-label\" for=\"inlineRadio2\">Female</label>\n");
      out.write("                                                                </div>\n");
      out.write("\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <span style=\"color: red; font-size: 11px; \"id=\"name_error_mobile\" class=\"mt-0\"></span> \n");
      out.write("                                                    <div class=\"col-sm-6\">\n");
      out.write("                                                        <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                                            <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                                <input type=\"text\" id=\"txtmobile\" class=\"form-control\" />\n");
      out.write("                                                                <label class=\"form-label\" for=\"txtmobile\">Mobile</label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-sm-6\">\n");
      out.write("                                                        <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                                            <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                                <input type=\"text\" id=\"txtcountry\" class=\"form-control\" value=\"Sri Lanka\" disabled />\n");
      out.write("                                                                <label class=\"form-label\" for=\"txtcountry\" >Country</label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-sm-6\">\n");
      out.write("                                                        <span style=\"color: red; font-size: 11px; \"id=\"name_error_maincity\" class=\"mt-0\"></span>\n");
      out.write("                                                        <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                                            <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                                <input type=\"text\" id=\"maincity\" class=\"form-control\" />\n");
      out.write("                                                                <label class=\"form-label\" for=\"maincity\">Main City</label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label>Main City</label>\n");
      out.write("                                                            <select class=\"form-control select2bs4\" onchange=\"optionClicked()\"  style=\"width: 100%;\" id=\"options\" >\n");
      out.write("\n");
      out.write("                                                                <option selected=\"selected\"   >Ampara</option>\n");
      out.write("\n");
      out.write("                                                            </select>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col-sm-6\">\n");
      out.write("                                                        <span style=\"color: red; font-size: 11px; \"id=\"name_error_homecity\" class=\"mt-0\"></span>\n");
      out.write("                                                        <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                                            <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                                <input type=\"text\" id=\"homecity\" class=\"form-control\" />\n");
      out.write("                                                                <label class=\"form-label\" for=\"homecity\" >Home City</label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <span style=\"color: red; font-size: 11px; \"id=\"name_error_addlineone\" class=\"mt-0\"></span>\n");
      out.write("                                                <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                                    <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                        <input type=\"text\" id=\"addlineone\" class=\"form-control\" />\n");
      out.write("                                                        <label class=\"form-label\" for=\"addlineone\">Address line 1</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <span style=\"color: red; font-size: 11px; \"id=\"name_error_addlinetwo\" class=\"mt-0\"></span>\n");
      out.write("                                                <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                                    <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                        <input type=\"text\" id=\"addlinetwo\" class=\"form-control\" />\n");
      out.write("                                                        <label class=\"form-label\" for=\"addlinetwo\">Address line 2</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                                    <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                        <input type=\"text\" id=\"addlinethree\" class=\"form-control\" />\n");
      out.write("                                                        <label class=\"form-label\" for=\"addlinethree\">Address line 3 (Optional)</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <span style=\"color: red; font-size: 11px; \"id=\"name_error_postal\" class=\"mt-0\"></span>\n");
      out.write("                                                <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("                                                    <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                        <input type=\"text\" id=\"txt_postal\" class=\"form-control\" />\n");
      out.write("                                                        <label class=\"form-label\" for=\"txt_postal\">Postal Code</label>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"d-flex justify-content-center mx-4 mb-3 mb-lg-4\">\n");
      out.write("                                                    <button type=\"button\" id=\"btnRegister\" class=\"btn btn-primary btn-lg\">Submit</button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-10 col-lg-4 col-xl-5 d-flex align-items-center order-1 order-lg-2\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-sm-12\">\n");
      out.write("                                                    <p class=\"text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4\"><span class=\"text-warning\">PRASANNA</span> DRESS POINT</p>   \n");
      out.write("\n");
      out.write("                                                    <img src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp\"\n");
      out.write("                                                         class=\"img-fluid\" alt=\"Sample image\"> \n");
      out.write("                                                    <p>Don't worry..! You can fill in this form after login..Now you registered user at our web site \n");
      out.write("                                                        and Now you can sign in our web site.<a href=\"../customer/signin.jsp\">Skip Now</a></p>\n");
      out.write("                                                </div>  \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\" src=\"../customer/external_js/CustomerRegistrationValidation.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"../customer/bootstrap/js/mdb.min.js\" ></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"../customer/bootstrap/js/mdb.umd.min.js\" ></script>\n");
      out.write("    <script src=\"../admin/externaljs/add_new_product.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"../admin/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"../admin/plugins/bs-custom-file-input/bs-custom-file-input.min.js\"></script>\n");
      out.write("    <script src=\"../admin/plugins/select2/js/select2.full.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- InputMask -->\n");
      out.write("    <script src=\"../admin/plugins/moment/moment.min.js\"></script>\n");
      out.write("    <script src=\"../admin/plugins/inputmask/jquery.inputmask.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Latest compiled and minified JavaScript -->\n");
      out.write("    <script src=\"../admin/plugins/multipal-selector/js/bootstrap-select.min.js\"></script>\n");
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
