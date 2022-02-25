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
    String[] images;
    String category;
    Manufacture manfacture;
    double taskRate;
    String barcode;
    Unity unity;

    public Product(double price, String pName, Manufacture manfacture, double taskRate, Unity unity) {
        this.price = price;
        this.pName = pName;
        this.manfacture = manfacture;
        this.taskRate = taskRate;
        this.unity = unity;
    }
    

    public Product(int id, double price, String pName, String pDescription) {
        this.id = id;
        this.price = price;
        this.pName = pName;
        this.pDescription = pDescription;
    
    }

    public Product(double price, String pName, String pDescription) {
        this.price = price;
        this.pName = pName;
        this.pDescription = pDescription;
     
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


    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Manufacture getManfacture() {
        return manfacture;
    }

    public void setManfacture(Manufacture manfacture) {
        this.manfacture = manfacture;
    }

    public double getTaskRate() {
        return taskRate;
    }

    public void setTaskRate(double taskRate) {
        this.taskRate = taskRate;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Unity getUnity() {
        return unity;
    }

    public void setUnity(Unity unity) {
        this.unity = unity;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price + ", pName=" + pName + ", pDescription=" + pDescription + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + ", images=" + images + ", category=" + category + ", manfacture=" + manfacture + ", taskRate=" + taskRate + ", barcode=" + barcode + ", unity=" + unity + '}';
    }



   
    
    
}
