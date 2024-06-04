/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore2;

/**
 *
 * @author faisa
 */
public class Item {
    
    private int ID;
    private String name;
    private int price;
    private int quantiy;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }

    @Override
    public String toString() {
        return "Item{" + "ID=" + ID + ", name=" + name + ", price=" + price + ", quantiy=" + quantiy + '}';
    }
    
    
    
    
    
}
