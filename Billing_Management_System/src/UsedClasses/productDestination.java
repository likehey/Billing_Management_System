/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsedClasses;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Kwizera Claude
 */
public class productDestination {
    int id;
   List<Product> products;
    String place;
    String carPlak;
    Date goneDate;
    User client;
    @Override
    public String toString() {
        return "productDestination{" + "id=" + id + ", products=" + products + ", place=" + place + ", carPlak=" + carPlak + ", goneDate=" + goneDate + ", client=" + client + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCarPlak() {
        return carPlak;
    }

    public void setCarPlak(String carPlak) {
        this.carPlak = carPlak;
    }

    public Date getGoneDate() {
        return goneDate;
    }

    public void setGoneDate(Date goneDate) {
        this.goneDate = goneDate;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public productDestination(List<Product> products, String place, String carPlak, Date goneDate) {
        this.products = products;
        this.place = place;
        this.carPlak = carPlak;
        this.goneDate = goneDate;
    }
 

    public productDestination(List<Product> products, String place, String carPlak, Date goneDate, User client) {
        this.products = products;
        this.place = place;
        this.carPlak = carPlak;
        this.goneDate = goneDate;
        this.client = client;
    }
    
    
}
