/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.AdminDAO;

import com.mchange.v1.db.sql.ConnectionUtils;
import modal.Admin;
import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Pubudu Kasun
 */
public class AdminForgotPasswordDAO {

    public Admin searchByEmail(String email) {
        Session session = Connection.ConnectionBuilder.hibSession();
        return (Admin) session.createCriteria(Admin.class)
                .add(Restrictions.eq("email", email))
                .uniqueResult();
    }

    public boolean AdminUpdatePassword(String pass, String email) {
        Session session = Connection.ConnectionBuilder.hibSession();
        Admin admin = searchByEmail(email);
        if (admin != null) {
            Transaction tr = session.beginTransaction();
            admin.setPassword(DigestUtils.md5Hex(pass));

            session.merge(admin);
            tr.commit();
            return true;
        } else {
            return false;
        }
    }

}
