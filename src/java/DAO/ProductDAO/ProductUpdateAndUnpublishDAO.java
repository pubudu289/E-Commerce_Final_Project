/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.ProductDAO;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import modal.Admin;
import modal.Brand;
import modal.Category;
import modal.MainCategory;
import modal.Product;
import modal.SubCategory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Pubudu Kasun
 */
public class ProductUpdateAndUnpublishDAO {
    
    public Product SearchItem(String pid) {
        Session session = Connection.ConnectionBuilder.hibSession();
        Query query = session.createQuery("From Product WHERE product_id='" + pid + "'");
        Product item = (Product) query.uniqueResult();
        return item;
    }

    public String ProductUpdate(String pid, String unit, String qty,
            String description, String unitprice, String purchasePrice,
            String discount, String shipping_status, String quantity_warning,
            String shipping_days, Admin admin, String brand, String mainCategory,
            String subcategory, String category, String productName, int sortkey,
            String shortdes) {
        Session session = null;
        Transaction tr = null;
        try {
            Product pro = new Product();
            pro.setProductId(pid);
            pro.setName(productName);
            pro.setUnit(unit);
            pro.setQty(Integer.parseInt(qty));
            pro.setDescription(description.trim());
            pro.setUnitPrice(Double.parseDouble(unitprice));
            pro.setPurchasePrice(Double.parseDouble(purchasePrice));
            pro.setDiscount(Integer.parseInt(discount));
            pro.setShippingStatus(Integer.parseInt(shipping_status));
            pro.setLowStockWarning(Integer.parseInt(quantity_warning));
            pro.setShippingDays(shipping_days);
            pro.setAdmin(admin);

            String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            pro.setAddtoby(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date));;

            LoadCategoryDAO loadCategory = new LoadCategoryDAO();

            Brand brand1 = loadCategory.searchBrandByBrandName(brand);
            pro.setBrand(brand1);

            MainCategory mcatid = loadCategory.searchMainListByName(mainCategory);
            pro.setMainCategory(mcatid);
            SubCategory subCategory = loadCategory.searhIdBySubName(subcategory);
            pro.setSubCategory(subCategory);
            Category category1 = loadCategory.searchCategoryByCategoryName(category);
            pro.setCategory(category1);

            double purprice = Double.parseDouble(purchasePrice);
            double dis = Double.parseDouble(discount);
            double discountprice = purprice - (purprice * dis) / 100;
            DecimalFormat df = new DecimalFormat("#.##");
            String dd = df.format(discountprice);

            pro.setDiscountPrice(Double.parseDouble(dd));
            pro.setStatus(Boolean.TRUE);
            pro.setPublishUnpublishId(Boolean.FALSE);
            pro.setSortId(sortkey);
            pro.setShortdes(shortdes);

            session = Connection.ConnectionBuilder.hibSession();
            tr = session.beginTransaction();
            session.saveOrUpdate(pro);

            String b = (String) session.save(pro);
            tr.commit();

            if (b != "") {
                return "success";
            }

        } catch (Exception e) {
            e.printStackTrace();
            tr.rollback();
        }
        return "error";
    }

}
