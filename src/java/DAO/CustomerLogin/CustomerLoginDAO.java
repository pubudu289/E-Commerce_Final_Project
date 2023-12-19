/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.CustomerLogin;

import Utill.MD5Utils;
import modal.UserLogin;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Pubudu Kasun
 */
public class CustomerLoginDAO {

    public CustomerLoginDAO() {

    }

    public UserLogin loginCustomer(String email, String pass) {
        Session session = Connection.ConnectionBuilder.hibSession();
        Criteria cr = session.createCriteria(UserLogin.class);
        cr.add(Restrictions.eq("email", email));
        String encryptPassword = MD5Utils.passwordEncript(pass);
        cr.add(Restrictions.eq("password", encryptPassword));

        UserLogin login = (UserLogin) cr.uniqueResult();
        return login;
    }
}
