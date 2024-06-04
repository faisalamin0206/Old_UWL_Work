package onlinestore4;

/**
 *
 * @author 21397951
 */
import java.util.Scanner;//Here I am importing the java scanner utility class to be able to use the input tool.
public class OnlineStore4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//This is my main method that I use to be able to start coding. This whole line means that it is available for use on any device as well as it being able to be self contained while also not returning any result to the end user.
        try {//This is my try statement. This allows for me to have error handling in my code. This is telling my code to try this piece of the code.
        Scanner input = new Scanner(System.in);//This is my input method scanner. The scanner allows for me to be able to take a user input.
        double totalPrice;//Here I am declaring a variable called totalPrice as a double. This is going to be ued as a value to store the final price of what the user wants.
        totalPrice = 0.00;//Here I am declaring totalPrice as the value 0.00.
        double currentPrice = 0.00;//Here I am declaring a variable called currentPrice as a double and as 0.00.
        boolean checkout = true;//Here I am declaring a variable called checkout as a boolean and as true.
        int quantity = 0;//Here I am declaring a variable called checkout as an integer and as 0. This is going to be use a storage variable to allow for the user to input the quantity.
       
        while (checkout == true) {//Here I am putting the variable checkout in a while loop while it is true so that it will repeat continously.
            System.out.println("Welcome to Faisal's Fruits. Please select an item from the following list below:");//This will print out to the user a welcoming message.
            System.out.println("1 for a pack of 6 Apples, 2 for a pack of 6 vined Tomatoes, 3 for 5 loose Bananas, 4 for a pack of Oranges & 5 for dragonfruit. 0 to finish and exit.");//This will print out to the user what their options are.
           
            int productID = input.nextInt();//Here I am declaring a variable called checkout as an integer input.
            if(productID != 0){//Here I am declaring that if productID is not equal to zero using the != sign, then to do the following actions below.
                System.out.println("Input quantity: ");//This will print out to the user to input their quantity.
                quantity = input.nextInt();//This will allow for the user to input the quantity they want. 
            }
            switch (productID) {//This is my switch statement. This allows for the program to judge certain scenarios of what the user will input. 
                case 1://This is a case in which the user would input the number one.
                    currentPrice = 1.26 * quantity;//This will times the currentPrice variable by 1.26.
                    System.out.println("You have chosen a pack of 6 apples.");//This will print out to the user what they have chosen in this case.
                    totalPrice += currentPrice;//This declares that the variable totalPrice is now equal to currentPrice. += is a short notation for this process of adding two variables together.
                    break;//This will break my case and bring the user back to the menu of items. 
                case 2://This is a case in which the user would input the number two.
                    currentPrice = 2.13 * quantity;//This will times the currentPrice variable by 1.26.
                    System.out.println("You have chosen a pack of Tomatoes.");//This will print out to the user what they have chosen in this case.
                    totalPrice += currentPrice;//This declares that the variable totalPrice is now equal to currentPrice. += is a short notation for this process of adding two variables together.
                    break;//This will break my case and bring the user back to the menu of items.
                case 3://This is a case in which the user would input the number three.
                    currentPrice = 0.58 * quantity;//This will times the currentPrice variable by 1.26.
                    System.out.println("You have chosen Bananas.");//This will print out to the user what they have chosen in this case.
                    totalPrice += currentPrice;//This declares that the variable totalPrice is now equal to currentPrice. += is a short notation for this process of adding two variables together.
                    break;//This will break my case and bring the user back to the menu of items.
                case 4://This is a case in which the user would input the number four.
                    currentPrice = 1.13 * quantity;//This will times the currentPrice variable by 1.26.
                    System.out.println("You have chosen Oranges.");//This will print out to the user what they have chosen in this case.
                    totalPrice += currentPrice;//This declares that the variable totalPrice is now equal to currentPrice. += is a short notation for this process of adding two variables together.
                    break;//This will break my case and bring the user back to the menu of items.
                case 5://This is a case in which the user would input the number four.
                    currentPrice = 0.89 * quantity;//This will times the currentPrice variable by 1.26.
                    System.out.println("You have chosen Dragonfruit.");//This will print out to the user what they have chosen in this case.
                    totalPrice += currentPrice;//This declares that the variable totalPrice is now equal to currentPrice. += is a short notation for this process of adding two variables together.
                    break;//This will break my case and bring the user back to the menu of items.
                case 0://This is a case in which the user would input the number zero to finish.
                    System.out.println("The total is £" + totalPrice);//This will print out to the user the totalPrice variable with a sentence before for their total.
                    checkout = false;//This will change my boolean checkout 
                    break;//This will break my case.
            }
               
            }
        } catch (Exception e ) {//This is my catch. This part will catch any wrong inputs in my oode and any exceptions and execute the code below.
                System.out.println("Wrong input.");//This will print to the user that the wrong input has been entered.
            } finally {//This is my finally ststement. This will follow my catch block and end the execution of the program.
            System.out.println("Please run the program again");//This will print out to the user that the program has finished and that the user must run it again.
        }
        }
    }