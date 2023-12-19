/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.signupController;

import DAO.RegisterUser.RegisterDAO;
import DAO.RegisterUser.RegisterUserDetailsDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.RollbackException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.UserLogin;
import modal.UserRegistration;

/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "AddUserDetails", urlPatterns = {"/AddUserDetails"})
public class AddUserDetails extends HttpServlet {

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
            try {
                String email = request.getParameter("email");
                String fullname = request.getParameter("fullname");

                String birthday = request.getParameter("bday");
                Date bday = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);

                String gender = request.getParameter("gender");
                String mobileNo = request.getParameter("mobileNo");
                String country = request.getParameter("country");
                String maincity = request.getParameter("maincity");
                String homecity = request.getParameter("homecity");
                String addlineone = request.getParameter("addlineone");
                String addlinetwo = request.getParameter("addlinetwo");
                String addlinethree = request.getParameter("addlinethree");
                String postalcode = request.getParameter("postalcode");

                RegisterDAO rdao = new RegisterDAO();
                UserLogin loginUser = rdao.searchUserEmail(email);

                if (loginUser != null) {
                    RegisterUserDetailsDAO reguserdao = new RegisterUserDetailsDAO();
                    String s1 = reguserdao.saveUserDetails(loginUser, email, fullname, bday, gender, mobileNo,
                            country, maincity, homecity, addlineone, addlinetwo,
                            addlinethree, postalcode);

                    if (s1.equals("success")) {
                        out.print("00");
                    } else {
                        out.print("01");
                    }

                }
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
