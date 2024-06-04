/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

/**
 *
 * @author faisa
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.Basket;
public class OnlineStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Basket BSK = new Basket();
               
        
        System.out.println("Welcome to ASDA");
        List<String> Products = new ArrayList<String>();
        Products.add("Apples");
        Products.add("Bananas");
        Products.add("Oranges");
        Products.add("Tomatoes");
        System.out.println("Press 1 for Apples");
        System.out.println("Press 2 for Bananas");
        System.out.println("Press 1 for Orangess");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter what products you would like:");
        String Products;
        Products = input.nextLine();
        int quantity;
        quantity = input.nextInt();
    }
    
}
