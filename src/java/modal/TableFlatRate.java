package modal;
// Generated Jan 13, 2024 10:48:19 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TableFlatRate generated by hbm2java
 */
@Entity
@Table(name="table_flat_rate"
    ,catalog="ecom_final_db"
)
public class TableFlatRate  implements java.io.Serializable {


     private Integer id;
     private Product product;
     private double rate;
     private String statId;

    public TableFlatRate() {
    }

    public TableFlatRate(Product product, double rate, String statId) {
       this.product = product;
       this.rate = rate;
       this.statId = statId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id", nullable=false)
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

    
    @Column(name="rate", nullable=false, precision=22, scale=0)
    public double getRate() {
        return this.rate;
    }
    
    public void setRate(double rate) {
        this.rate = rate;
    }

    
    @Column(name="stat_id", nullable=false, length=45)
    public String getStatId() {
        return this.statId;
    }
    
    public void setStatId(String statId) {
        this.statId = statId;
    }




}


