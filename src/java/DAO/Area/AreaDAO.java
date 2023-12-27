/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Area;

import java.util.List;
import modal.Districts;
import modal.Homecity;
import modal.Postalcode;
import modal.Province;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Pubudu Kasun
 */
public class AreaDAO {

    public List<Province> searchAllAreas() {
        Session session = Connection.ConnectionBuilder.hibSession();
        Criteria criteria = session.createCriteria(Province.class);
        List<Province> list = criteria.list();
        return list;
    }

    public Province searchProvinceByName(String province_name) {
        Session session = Connection.ConnectionBuilder.hibSession();
        return (Province) session.createCriteria(Province.class)
                .add(Restrictions.eq("province", province_name))
                .uniqueResult();
    }

    public List<Districts> districtSearchByProvinceID(int proid) {
        Session session = Connection.ConnectionBuilder.hibSession();
        Query queary = session
                .createQuery("From Districts WHERE proince_id =" + proid);
        List<Districts> list = queary.list();
        return list;
    }

    public Districts searchDistrictByName(String homeCity) {
        Session session = Connection.ConnectionBuilder.hibSession();
        return (Districts) session.createCriteria(Districts.class)
                .add(Restrictions.eq("districName", homeCity))
                .uniqueResult();
    }

    public List<Homecity> searchHomecityByDistrictID(int district_id) {
        Session session = Connection.ConnectionBuilder.hibSession();
        Query queary = session
                .createQuery("From Homecity WHERE distric_id=" + district_id);
        List<Homecity> list = queary.list();
        return list;
    }

    public List<Postalcode> searchPostalcodeByDistrictID(int district_id) {
        Session session = Connection.ConnectionBuilder.hibSession();
        Query queary = session.createQuery("From Postalcode WHERE district_id=" + district_id);
        List<Postalcode> list = queary.list();
        return list;
    }

}
