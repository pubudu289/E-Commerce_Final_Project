/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.ProductDAO;

import java.util.List;
import modal.Product;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Pubudu Kasun
 */
public class ProductDAO {

    public List<Product> productSearch() {
        Session session = Connection.ConnectionBuilder.hibSession();
        Criteria criteria = session.createCriteria(Product.class);
        List<Product> list = criteria.list();
        return list;

    }

    public List<Product> searchProductList() {
        Session session = Connection.ConnectionBuilder.hibSession();
        Criteria criteria = session.createCriteria(Product.class);
        List<Product> list = criteria.list();
        return list;
    }

    public String saveProduct(Product pr) {

        Session session = null;
        Transaction tr = null;
        try {
            session = Connection.ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            String b = (String) session.save(pr);
            tr.commit();

            if (!b.equals("")) {
                System.out.println("Product Upoading Success...");
                return "success";
            }
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
        return "error";
    }

    public String deleteProduct(String id) {

        Session session = null;
        Transaction tr = null;
        try {
            session = Connection.ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            Product product = (Product) session.load(Product.class, id);
            if (product != null) {
                Query query = session.createQuery("UPDATE Product SET status ='0' WHERE product_id ='"+id+"'");
                int executeUpdate = query.executeUpdate();
                tr.commit();
                return "success";
            }
        } catch (Exception e) {
            e.printStackTrace();
            tr.rollback();
        }

        return "error";
    }
}
