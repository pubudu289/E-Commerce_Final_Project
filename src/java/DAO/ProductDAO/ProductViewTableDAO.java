/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.ProductDAO;

import java.util.List;
import modal.Product;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Pubudu Kasun
 */
public class ProductViewTableDAO {

    public List<Product> searchAllProducts() {
        Session session = Connection.ConnectionBuilder.hibSession();
        Query Query = session.createQuery("From Product WHERE status = '1'");
        List<Product> list = Query.list();
        return list;
    }

    public Product SearchItem(String pid) {
        Session session = Connection.ConnectionBuilder.hibSession();
        Query query = session.createQuery("From Product WHERE status='1' and product_id = '"+pid+"'");
        Product item = (Product) query.uniqueResult();
        return item;
    }

}
