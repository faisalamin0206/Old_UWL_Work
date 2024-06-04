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
import java.util.HashMap;
import java.util.Scanner;
import onlinestore2.Item;
public class OnlineStore2 {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        

        
     
          
     
        
        
        
        
        
        
        
        boolean count = true;
        while (count == true) {
        System.out.println("Welcome to ASDA");
        System.out.println("Apples");
        System.out.println("Bananas");
        System.out.println("Oranges");
        System.out.println("Tomatoes");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nPlease enter the product that you want:\n");
        String products = input.nextLine();
        
        int quantity = input.nextInt();
        
        System.out.println("Please enter the quantity of the products you want");
            System.out.println("Would you like to enter more products or quantities");
            String useranswer = input.nextLine();
            if (useranswer == "Yes") {
                
            }
            
            
            
            
        }
            
        }
}
