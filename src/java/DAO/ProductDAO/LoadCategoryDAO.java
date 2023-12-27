/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.ProductDAO;

import java.util.List;
import modal.Brand;
import modal.Category;
import modal.MainCategory;
import modal.SubCategory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Pubudu Kasun
 */
public class LoadCategoryDAO {

    public List<MainCategory> searchMainList() {
        Session session = Connection.ConnectionBuilder.hibSession();
        Query query = session.createQuery("From MainCategory");
        List<MainCategory> list = query.list();
        return list;
    }

    public MainCategory searchMainListByName(String mcatname) {
        Session session = Connection.ConnectionBuilder.hibSession();
        return (MainCategory) session.createCriteria(MainCategory.class)
                .add(Restrictions.eq("description", mcatname))
                .uniqueResult();
    }

    public List<SubCategory> searchSubCategoryByID(int id) {
        Session session = Connection.ConnectionBuilder.hibSession();
        Query query = session.createQuery("From SubCategory WHERE m_id =" + id);
        List<SubCategory> list = query.list();
        return list;
    }

    public SubCategory searhIdBySubName(String subname) {
        Session session = Connection.ConnectionBuilder.hibSession();
        return (SubCategory) session.createCriteria(SubCategory.class)
                .add(Restrictions.eq("description", subname))
                .uniqueResult();
    }

    public List<Category> searshCategoryBySubID(int subid) {
        Session session = Connection.ConnectionBuilder.hibSession();
        Query query = session.createQuery("From Category WHERE s_id =" + subid);
        List<Category> list = query.list();
        return list;
    }

    public Category searchCategoryByCategoryName(String category) {
        Session session = Connection.ConnectionBuilder.hibSession();
        return (Category) session.createCriteria(Category.class)
                .add(Restrictions.eq("catDescription", category))
                .uniqueResult();

    }

    public List<Brand> searhBrandList() {
        Session session = Connection.ConnectionBuilder.hibSession();
        Query queary = session.createQuery("From Brand");
        List<Brand> list = queary.list();
        return list;
    }

    public Brand searchBrandByBrandName(String brand) {
        Session session = Connection.ConnectionBuilder.hibSession();
        return (Brand) session.createCriteria(Brand.class)
                .add(Restrictions.eq("brand", brand))
                .uniqueResult();
    }

}
