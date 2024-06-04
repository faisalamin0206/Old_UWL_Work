/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore3;

/**
 *
 * @author faisa
 */
import java.util.Scanner;
public class OnlineStore3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean finished = false;
        Scanner input = new Scanner(System.in);
        while (!finished) {
            System.out.println("What product would you like?");
            System.out.println("1: Apples, £1");
            System.out.println("2: Oranges, £1");
            System.out.println("3: Tomatoes, £1");
            System.out.println("4: Bananas, £1");
            System.out.println("Press 0 to exit");
            int item = input.nextInt();
            switch (item) {
                case 1:
                    System.out.println("You have chosen apples. Pay £1");
                    break;
                case 2:
                    System.out.println ("You have chosen oranges. Pay £1");
                    break;
                case 3:
                    System.out.println("You have chosen tomatoes. Pay £1");
                    break;
                case 4:
                    System.out.println("You have chosen bananas. Pay £1");
                    break;
                case 0:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("You have not chosen anything, please retry");
                    break;
            }
        }
    }
}

