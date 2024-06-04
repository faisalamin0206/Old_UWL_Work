/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

/**
 *
 * @author faisa
 */
import java.util.Scanner;
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//This is my method to be able to start coding. This whole line means that it is available for use on any device as well as it being able to be self contained while also not returning any result to the end user.
        try {//This is my try statement. This allows for me to have error handling in my code. This is telling my code to try this piece of the code.
        for (int i = 0; i <= 5; i++) {//This is my FOR loop that will keep this BMI repeating for a total of 5 times. 
        Scanner input = new Scanner(System.in);//This is my input method scanner. The scanner allows for me to be able to take a user input.
        System.out.println("Enter your weight in KG:");//This will print out to the user for them to enter their weight.
        double weight = input.nextInt();//Here I am declaring a variable called weight as a double and as an input.
        System.out.println("Enter your height in CM:");//This will print out to the user for them to enter their weight.
        double height = input.nextInt();//Here I am declaring a variable called weight as a double and as an input.
        double bodymassindex;//Here I am declaring a variable called bodymassindex as a double.
        bodymassindex = weight/(height * height) *10000;//This is my sium for the BMI. I sm multiplying it by 10000 so that the result can be double digits. 
        System.out.println("Your BMI is: " + bodymassindex);//This is the output that will display the end result to the user of their BMI.
        
        String weightresult;//This is a string that I had created to be used to output the result of the BMI.
        if (bodymassindex <= 18.5) {//This is my if statement for the underweight section
            weightresult=("You are underweight");//This is my weightresult value for the underweight section
            System.out.println(weightresult);//This will print out the weightresult string
        } else if (bodymassindex > 18.5 && bodymassindex < 30) {//This is my else if statement for the healthy section
            weightresult=("You are healthy");//This is my weightresult value for the healthy section
            System.out.println(weightresult);//This will print out the weightresult string
        } else if (bodymassindex >= 30 && bodymassindex < 40) {//This is my else if statement for the fat section
            weightresult=("You are fat");//This is my weightresult value for the fat section
            System.out.println(weightresult);//This will print out the weightresult string
        } else if (bodymassindex >= 40 && bodymassindex < 50) {//This is my else if statement for the obese section
            weightresult=("You are obese");//This is my weightresult value for the fat section
            System.out.println(weightresult);//This will print out the weightresult string
        } else {//This is my else state,ent in case any of the statements have not been satisfied
            System.out.println("Please retry");//This will tell the user to retry if any of the values have not been satisfied.
        }
            
        }
        
        
    }
        catch (Exception e){//This is my catch. This part will catch any wrong inputs in my oode and any exceptions and execute the code below.
            System.out.println("Wrong input");//This will print to the user that the wrong input has been entered.
          
        } finally {//This is my finally ststement. This will follow my catch block and end the execution of the program.
            System.out.println("The program has finished, please run again");//This will print out to the user that the program has finished and that the user must run it again.
        }
    }
}
    