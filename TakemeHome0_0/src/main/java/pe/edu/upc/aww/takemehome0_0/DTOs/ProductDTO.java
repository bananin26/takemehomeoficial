package pe.edu.upc.aww.takemehome0_0.DTOs;

import pe.edu.upc.aww.takemehome0_0.Entities.User;



public class ProductDTO {
    private int idProduct;

    private String nameProduct;
    private String descriptionProduct;
    private Double priceProduct;


    private String dimensionsProduct;

    private User user;

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

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
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
