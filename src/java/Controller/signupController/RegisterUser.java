/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.signupController;

import DAO.RegisterUser.RegisterDAO;
import DTO.RegisterDto.RegisterDto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "RegisterUser", urlPatterns = {"/RegisterUser"})
public class RegisterUser extends HttpServlet {

    public static final long serialVersionUID = 1L;

    public RegisterUser() {
        super();
    }

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
                String password, firstName, lastName, toemail, newPassword;

                firstName = request.getParameter("first_name");
                lastName = request.getParameter("last_name");
                toemail = request.getParameter("txt_email");
                password = request.getParameter("pass");
                newPassword = DigestUtils.md5Hex(password);

                Random theRandom = new Random();
                theRandom.nextInt(999999);
                String myHash = DigestUtils.md5Hex("" + theRandom);

                RegisterDto registerDto = new RegisterDto();
                registerDto.setFirstName(firstName);
                registerDto.setLastName(lastName);
                registerDto.setEmail(toemail);
                registerDto.setPassword(newPassword);
                registerDto.setMyHash(myHash);

                RegisterDAO dAO = new RegisterDAO();
                String s1 = dAO.RegisterUser(registerDto);

                if (s1.equals("success")) {
                    out.print("00");
                    System.out.println("mailVerifySuccess page redirect");
                } else if (s1.equals("02")) {
                    out.print("03");
                } else {
                    out.print("01");
                }
            } catch (Exception e) {
                System.out.println("Error at RegisterUser.java: " + e);
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
        response.getWriter().append("Served at: ").append(request.getContextPath());

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
