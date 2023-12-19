/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.updatePassword;

import Connection.ConnectionBuilder;
import java.util.List;
import java.util.Set;
import modal.UserLogin;
import modal.UserRegistration;
import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Pubudu Kasun
 */
public class updatePasswrdDAO {

    public UserLogin seachByEmail(String email) {
        Session session = ConnectionBuilder.hibSession();
        return (UserLogin) session.createCriteria(UserLogin.class)
                .add(Restrictions.eq("email", email))
                .uniqueResult();
        
    }

    public boolean updatePassword(String pass, String email) {
        Session session = ConnectionBuilder.hibSession();
        UserLogin userLogin = seachByEmail(email);
        if(userLogin != null){
            Transaction transaction = session.beginTransaction();
            userLogin.setPassword(DigestUtils.md5Hex(pass));
            
            session.merge(userLogin);
            transaction.commit();
            return true;
        }else{
            return false;
        }
    }
    

}
