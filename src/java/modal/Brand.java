package modal;
// Generated Jan 13, 2024 10:48:19 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Brand generated by hbm2java
 */
@Entity
@Table(name="brand"
    ,catalog="ecom_final_db"
)
public class Brand  implements java.io.Serializable {


     private int id;
     private String brand;
     private String brandimg;
     private Set<Product> products = new HashSet<Product>(0);

    public Brand() {
    }

	
    public Brand(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }
    public Brand(int id, String brand, String brandimg, Set<Product> products) {
       this.id = id;
       this.brand = brand;
       this.brandimg = brandimg;
       this.products = products;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="brand", nullable=false, length=45)
    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    
    @Column(name="brandimg", length=300)
    public String getBrandimg() {
        return this.brandimg;
    }
    
    public void setBrandimg(String brandimg) {
        this.brandimg = brandimg;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="brand")
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }




}


