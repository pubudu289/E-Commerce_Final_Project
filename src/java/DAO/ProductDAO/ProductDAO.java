/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.ProductDAO;

import DTO.AdminDTO.AdminLoginDTO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.Part;
import modal.Admin;
import modal.Product;
import org.hibernate.Criteria;
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
    
    public void saveProduct(Product pr) {
        
        Session session = null;
        Transaction tr = null;
        try {
           
            
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
    }
}
