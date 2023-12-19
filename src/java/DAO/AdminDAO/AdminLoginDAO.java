/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.AdminDAO;

import Utill.MD5Utils;
import modal.Admin;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Pubudu Kasun
 */
public class AdminLoginDAO {

    public Admin AdminLogin(String email, String password) {
        Session session = Connection.ConnectionBuilder.hibSession();
        Criteria cr = session.createCriteria(Admin.class);
        cr.add(Restrictions.eq("email", email));
        String encriptpassword = MD5Utils.passwordEncript(password);
        cr.add(Restrictions.eq("password", encriptpassword));

        Admin adminlogin = (Admin) cr.uniqueResult();
        return adminlogin;
    }

}
