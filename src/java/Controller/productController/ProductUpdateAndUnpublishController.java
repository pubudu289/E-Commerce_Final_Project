/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.productController;

import DAO.AdminDAO.AdminLoginDAO;
import DAO.ProductDAO.ProductUpdateAndUnpublishDAO;
import DAO.ProductDAO.ProductUpdateDAO;
import DTO.AdminDTO.AdminLoginDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Admin;
import modal.Product;

/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "ProductUpdateAndUnpublishController", urlPatterns = {"/ProductUpdateAndUnpublishController"})
public class ProductUpdateAndUnpublishController extends HttpServlet {

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

            String pid = request.getParameter("productId");

            String unit = request.getParameter("unit");
            String qty = request.getParameter("qty");
            String filethumb = request.getParameter("file");
            String imageone = request.getParameter("imageone");
            String imagetwo = request.getParameter("imagetwo");
            String imagethree = request.getParameter("imagethree");
            String imagefour = request.getParameter("imagefour");
            String description = request.getParameter("description");
            String unitprice = request.getParameter("unitprice");
            String purchasePrice = request.getParameter("purchasePrice");
            String discount = request.getParameter("discount");
            String shipping_status = request.getParameter("shipping_status");
            String quantity_warning = request.getParameter("quantity_warning");
            String visibility = request.getParameter("visibility");
            String shipping_days = request.getParameter("shipping_days");
            String txtflatrate = request.getParameter("txtflatrate");

            String brand = request.getParameter("brand");
            String mainCategory = request.getParameter("mainCategory");
            String subcategory = request.getParameter("subcategory");
            String category = request.getParameter("category");
            String productName = request.getParameter("productName");
            String shortdes = request.getParameter("shortdes");

            try {
                if (!pid.equals("")) {
                    AdminLoginDTO dto = (AdminLoginDTO) request.getSession().getAttribute("UserData");
                    int adminid = dto.getId();

                    AdminLoginDAO adminDAO = new AdminLoginDAO();
                    Admin admin = adminDAO.searchByID(adminid);

                    ProductUpdateAndUnpublishDAO p = new ProductUpdateAndUnpublishDAO();
                    Product itm = p.SearchItem(pid);

                    int sortkey = itm.getSortId();

                    ProductUpdateAndUnpublishDAO update = new ProductUpdateAndUnpublishDAO();
                    String s = update.ProductUpdate(pid, unit, qty, description, unitprice,
                            purchasePrice, discount, shipping_status, quantity_warning,
                            shipping_days, admin, brand, mainCategory, subcategory,
                            category, productName, sortkey, shortdes);

                    if (s.equals("success")) {
                        out.print("00");
                    } else {
                        out.print("01");
                    }

                }
            } catch (java.lang.NullPointerException ex) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
