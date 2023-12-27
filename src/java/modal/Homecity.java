package modal;
// Generated Dec 26, 2023 2:34:59 AM by Hibernate Tools 4.3.1


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
 * Homecity generated by hbm2java
 */
@Entity
@Table(name="homecity"
    ,catalog="ecom_final_db"
)
public class Homecity  implements java.io.Serializable {


     private Integer id;
     private Districts districts;
     private String discription;

    public Homecity() {
    }

    public Homecity(Districts districts, String discription) {
       this.districts = districts;
       this.discription = discription;
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
    @JoinColumn(name="distric_id", nullable=false)
    public Districts getDistricts() {
        return this.districts;
    }
    
    public void setDistricts(Districts districts) {
        this.districts = districts;
    }

    
    @Column(name="discription", nullable=false, length=45)
    public String getDiscription() {
        return this.discription;
    }
    
    public void setDiscription(String discription) {
        this.discription = discription;
    }




}

