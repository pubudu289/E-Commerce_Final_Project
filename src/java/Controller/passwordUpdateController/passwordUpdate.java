/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.passwordUpdateController;

import DAO.updatePassword.updatePasswrdDAO;
import DTO.UserForgetPwDTO;
import java.awt.BorderLayout;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.UserLogin;

/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "passwordUpdate", urlPatterns = {"/passwordUpdate"})
public class passwordUpdate extends HttpServlet {

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
            String pass = request.getParameter("pass");
            String compass = request.getParameter("compass");
            String email = request.getParameter("email");
            
            if (pass.equals(compass) && !pass.equals("") && !compass.equals("")) {
                updatePasswrdDAO passwrdDAO = new updatePasswrdDAO();
                boolean isUpdated = passwrdDAO.updatePassword(pass, email);
                
                if (isUpdated) {
                    out.print("00");
                    
                } else {
                    out.print("01");
                }
            }
        }
    }
    
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
