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
 * ProductImage generated by hbm2java
 */
@Entity
@Table(name="product_image"
    ,catalog="ecom_final_db"
)
public class ProductImage  implements java.io.Serializable {


     private Integer id;
     private Product product;
     private String productImg;
     private int productProductImageId;

    public ProductImage() {
    }

	
    public ProductImage(Product product, int productProductImageId) {
        this.product = product;
        this.productProductImageId = productProductImageId;
    }
    public ProductImage(Product product, String productImg, int productProductImageId) {
       this.product = product;
       this.productImg = productImg;
       this.productProductImageId = productProductImageId;
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

    
    @Column(name="product_img", length=500)
    public String getProductImg() {
        return this.productImg;
    }
    
    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    
    @Column(name="product_product_image_id", nullable=false)
    public int getProductProductImageId() {
        return this.productProductImageId;
    }
    
    public void setProductProductImageId(int productProductImageId) {
        this.productProductImageId = productProductImageId;
    }




}

