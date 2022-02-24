/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsedClasses;

/**
 *
 * @author Kwizera Claude
 */
public class Client {
    int id;
    int tin;
    String name;

    public Client(int id, int tin, String name) {
        this.id = id;
        this.tin = tin;
        this.name = name;
    }

    public Client(int tin, String name) {
        this.tin = tin;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTin() {
        return tin;
    }

    public void setTin(int tin) {
        this.tin = tin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", tin=" + tin + ", name=" + name + '}';
    }
    
}
