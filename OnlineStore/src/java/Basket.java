/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

/**
 *
 * @author faisa
 */
public class Basket {
    int Id;
    String Item;
    Boolean Paid ;

    public int getId() {
        return Id;
    }

    public String getItem() {
        return Item;
    }

    public Boolean getPaid() {
        return Paid;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }

    public void setPaid(Boolean Paid) {
        this.Paid = Paid;
    }

    @Override
    public String toString() {
        return "Basket{" + "Id=" + Id + ", Item=" + Item + ", Paid=" + Paid + '}';
    }
    
    
}
