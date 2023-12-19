/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.RegisterUser;

import Connection.ConnectionBuilder;
import DAO.SendEmailRegister;
import DTO.RegisterDto.RegisterDto;
import modal.UserLogin;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Pubudu Kasun
 */
public class RegisterDAO {

    public RegisterDAO() {

    }

    public RegisterDAO(String email, String hash) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String RegisterUser(RegisterDto registerDto) {
        String fname = registerDto.getFirstName();
        String lname = registerDto.getLastName();
        String toemail = registerDto.getEmail();
        String pass = registerDto.getPassword();
        String myHash = registerDto.getMyHash();

        Session session = null;
        Transaction tr = null;
        try {

            UserLogin login = new UserLogin();
            login.setFirstName(fname);
            login.setLastName(lname);
            login.setEmail(toemail);
            login.setPassword(pass);
            login.setHash(myHash);
            login.setActive(Boolean.FALSE);

            session = ConnectionBuilder.hibSession();
            tr = session.beginTransaction();

            int i = (int) session.save(login);
            tr.commit();
            if (i != 0) {
                System.out.println("Succesfully created new user.");
                System.out.println("Sending Mail... ");

                SendEmailRegister emailRegister = new SendEmailRegister(toemail, myHash);
                emailRegister.sendMail();

                return "success";
            }
        } catch (org.hibernate.exception.ConstraintViolationException ex) {
            tr.rollback();
            return "02";

        } catch (Exception e) {
            e.printStackTrace();
            tr.rollback();
            System.out.println("Error at RegisterDAO.java: " + e);
        }

        return "error";
    }

    public UserLogin searchUserEmail(String email) {
        
        Session session = ConnectionBuilder.hibSession();
        return (UserLogin) session.createCriteria(UserLogin.class)
                .add(Restrictions.eq("email", email))
                .uniqueResult();

    }
    
    
    
    
    
    

}
