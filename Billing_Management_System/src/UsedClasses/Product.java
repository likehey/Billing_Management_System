/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsedClasses;

import java.util.Date;

/**
 *
 * @author Kwizera Claude
 */
public class Product {
    int id;
    double price;
    String pName,pDescription;
    User client;
    Date createdAt,modifiedAt;

    public Product(int id, double price, String pName, String pDescription, User supplier, Date createdAt, Date modifiedAt) {
        this.id = id;
        this.price = price;
        this.pName = pName;
        this.pDescription = pDescription;
        this.client = supplier;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Product(double price, String pName, String pDescription, User supplier) {
        this.price = price;
        this.pName = pName;
        this.pDescription = pDescription;
        this.client = supplier;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public User getSupplier() {
        return client;
    }

    public void setSupplier(User supplier) {
        this.client = supplier;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price + ", pName=" + pName + ", pDescription=" + pDescription + ", supplier=" + client + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + '}';
    }
    
    
}
