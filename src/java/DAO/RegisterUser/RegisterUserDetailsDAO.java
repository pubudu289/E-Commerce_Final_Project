/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.RegisterUser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import modal.UserLogin;
import modal.UserRegistration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Pubudu Kasun
 */
public class RegisterUserDetailsDAO {

    public String saveUserDetails(UserLogin loginUser, String email,
            String fullname, Date bday, String gender, String mobileNo,
            String country, String province, String maincity, String homecity, String addlineone,
            String addlinetwo, String addlinethree, String postalcode) {

        Session session = null;
        Transaction tr = null;
        try {
            UserRegistration ur = new UserRegistration();
            ur.setUserLogin(loginUser);
            ur.setFullName(fullname);
            ur.setDob(bday);
            ur.setGender(gender);

            String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            ur.setAddtoby(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date));

            ur.setEmail(email);
            ur.setMobileNo(mobileNo);
            ur.setProvince(province);
            ur.setMainCity(maincity);
            ur.setHomeCity(homecity);
            ur.setAddressLine1(addlineone);
            ur.setAddressLine2(addlinetwo);
            ur.setAddressLine3(addlinethree);
            ur.setPostalCode(postalcode);
            ur.setIsactive(Boolean.TRUE);

            session = Connection.ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            session.saveOrUpdate(ur);

            int b = (int) session.save(ur);
            tr.commit();
            if (b != 0) {
                System.out.println("Succesfully Add Details...");

                return "success";
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return "error";
    }

}
