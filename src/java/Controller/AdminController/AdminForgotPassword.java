/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.AdminController;

import DAO.AdminDAO.AdminForgotPasswordDAO;
import DAO.SendForgotOTP;
import DTO.AdminDTO.AdminForgotPasswordDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modal.Admin;

/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "AdminForgotPassword", urlPatterns = {"/AdminForgotPassword"})
public class AdminForgotPassword extends HttpServlet {

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
            String email = request.getParameter("txtemail");

            AdminForgotPasswordDAO searchEmail = new AdminForgotPasswordDAO();
            Admin adminSearch = searchEmail.searchByEmail(email);

            if (adminSearch != null) {
                SendForgotOTP sendOTP = new SendForgotOTP();
                String code = sendOTP.getRandom();

                AdminForgotPasswordDTO fp = new AdminForgotPasswordDTO();
                fp.setCode(code);
                fp.setEmail(email);
                boolean test = sendOTP.sendAdminEmail(fp);

                if (test) {
                    HttpSession session = request.getSession();
                    session.setAttribute("authcode", fp);
                    out.print("00");
                } else {
                    out.print("01");
                }

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
