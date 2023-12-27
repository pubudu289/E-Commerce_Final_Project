/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.productController;

import DAO.ProductDAO.LoadCategoryDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.MainCategory;
import modal.SubCategory;

/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "LoadSubCategoryController", urlPatterns = {"/LoadSubCategoryController"})
public class LoadSubCategoryController extends HttpServlet {

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
            
            String mcatname = request.getParameter("itemName");
            
            LoadCategoryDAO mdAO = new LoadCategoryDAO();
            MainCategory mainList = mdAO.searchMainListByName(mcatname);
            
            int id = mainList.getMId();
            request.setAttribute("id", id);
            
            List<SubCategory> categoryList = mdAO.searchSubCategoryByID(id);
            String content = "";
            for (SubCategory category : categoryList) {
                content += "<option selected=\"selected1\">" + category.getDescription() + "</option>";
            }
            out.print(content);
            
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
