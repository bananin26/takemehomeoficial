package pe.edu.upc.aww.takemehome0_0.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;

    @Column(name = "nameProduct",length = 45,nullable = false)
    private String nameProduct;
    @Column(name = "descriptionProduct",length = 45,nullable = false)
    private String descriptionProduct;
    @Column(name = "priceProduct",nullable = false)
    private String priceProduct;


    @Column(name = "dimensionsProduct",nullable = false)
    private String dimensionsProduct;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    public Product(){}

   public Product(int idProduct,String nameProduct,String descriptionProduct,String priceProduct,String dimensionsProduct, User user){
        this.idProduct=idProduct;
        this.nameProduct=nameProduct;
        this.descriptionProduct=descriptionProduct;
        this.priceProduct=priceProduct;

        this.dimensionsProduct=dimensionsProduct;
        this.user=user;
   }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }



    public String getDimensionsProduct() {
        return dimensionsProduct;
    }

    public void setDimensionsProduct(String dimensionsProduct) {
        this.dimensionsProduct = dimensionsProduct;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
