/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.productController;

import DAO.ProductDAO.ProductViewTableDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Product;

/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "ProductViewModalController", urlPatterns = {"/ProductViewModalController"})
public class ProductViewModalController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String pid = request.getParameter("pid");
//            System.out.println(pid);
            String stat,pub_unpub;

            ProductViewTableDAO itm = new ProductViewTableDAO();
            Product p = itm.SearchItem(pid);

            int shipping_stat = p.getShippingStatus();
            if (shipping_stat == 1) {
                stat = "Free Shipping";
            } else if (shipping_stat == 2) {
                stat = "Flat Rate";
            } else {
                stat = "No Shipping Methode";
            }

            if (p.isPublishUnpublishId()) {
                 pub_unpub = "Item Published";
            } else {
                    pub_unpub = "Item not published";
            }
            
            String prod = "  <div class=\"modal fade\" id=\"staticBackdrop\" data-backdrop=\"static\" data-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n"
                    + "                    <div class=\"modal-dialog modal-lg\">\n"
                    + "                        <div class=\"modal-content\">\n"
                    + "                            <div class=\"modal-header\">\n"
                    + "                                <h5 class=\"modal-title\" id=\"staticBackdropLabel\">View Product Details</h5>\n"
                    + "                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n"
                    + "                                    <span aria-hidden=\"true\">&times;</span>\n"
                    + "                                </button>\n"
                    + "                            </div>\n"
                    + "                            <div class=\"modal-body\">\n"
                    + "\n"
                    + "                                <form  method=\"POST\">\n"
                    + "                                    <div class=\"form-group\">\n"
                    + "                                        <div class=\"row\">\n"
                    + "                                            <div class=\"col-sm-8\">\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Product ID :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                      <input type=\"text\" class=\"form-control\" value=\"" + p.getProductId() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Product Name :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getName() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Main Category :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getMainCategory().getDescription() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Sub Category :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getSubCategory().getDescription() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Category :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getCategory().getCatDescription() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Product Brand :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getBrand().getBrand() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Unit :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getUnit() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Quantity :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getQty() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Add to by Date:</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getAddtoby() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Add to By :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getAdmin().getFirstName() + " " + p.getAdmin().getLastName() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Unit Price :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getUnitPrice() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Purchase Price :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getPurchasePrice() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Discount :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getDiscount() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-4\">\n"
                    + "                                                        <label class=\"form-label\">Price By Discount :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-8\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + p.getDiscountPrice() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-4\">\n"
                    + "                                                        <label class=\"form-label\">Publish & Un-publish Status :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-8\">\n"
                    + "                                                        <input type=\"text\" class=\"form-control\" value=\"" + pub_unpub + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Description :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                     <div class=\"card\">\n"
                    + "                                                      <div class=\"card-body\">\n"
                    + "                                                      <div id=\"summernote\">" + p.getDescription() + "</div>\n"
                    + "                                                      </div>\n"
                    + "                                                      </div>"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Shipping Days:</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                         <input type=\"text\" class=\"form-control\" value=\"" + p.getShippingDays() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-4\">\n"
                    + "                                                        <label class=\"form-label\">Shipping Status :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-8\">\n"
                    + "                                                         <input type=\"text\" class=\"form-control\" value=\"" + stat + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "\n"
                    + "                                                <div class=\"row\">\n"
                    + "                                                    <div class=\"col-sm-3\">\n"
                    + "                                                        <label class=\"form-label\">Low Stock Warning :</label>\n"
                    + "                                                    </div>\n"
                    + "                                                    <div class=\"col-sm-9\">\n"
                    + "                                                         <input type=\"text\" class=\"form-control\" value=\"" + p.getLowStockWarning() + "\" disabled >\n"
                    + "                                                    </div>\n"
                    + "                                                </div>\n"
                    + "                                                <!--end-->\n"
                    + "\n"
                    + "\n"
                    + "                                            </div>\n"
                    + "                                            <div class=\"col-sm-4 mt-3\">\n"
                    + "                                                <div class=\"card\">\n"
                    + "                                                    <img alt=\"Iem Image\" id=\"item-image\" src=\"\" height=\"150px\" width=\"120px\">\n"
                    + "                                                </div>\n"
                    + "                                            </div>\n"
                    + "                                        </div>\n"
                    + "                                    </div>\n"
                    + "\n"
                    + "                                </form>\n"
                    + "\n"
                    + "                            </div>\n"
                    + "                            <div class=\"modal-footer\">\n"
                    + "                                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n"
                    + "\n"
                    + "                            </div>\n"
                    + "                        </div>\n"
                    + "                    </div>\n"
                    + "                </div>\n"
                    + "";
            out.print(prod);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
