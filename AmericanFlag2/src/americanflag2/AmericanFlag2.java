/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package americanflag2;

/**
 *
 * @author faisa
 */
public class AmericanFlag2 { //This is my file name. this is the whole program that I have created

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //This is my method to be able to start coding. This whole line means that it is available for use on any device as well as it being able to be self contained while also not returning any result to the end user. 
  String part1 = "* * * * * * ==================================\n * * * * *  =================================="; //Here I am declaring a string called part 1 and declaring two lines of output using the \n feature. This is used for the first half of my flag.
  String part2 = "==============================================";//Here I am declaring another string named part 2. This is used for the second half of my flag which has no stars in it. 
  for (int i = 0; i <= 1; i++) {//This is my first for loop used for the first half of my flag. I have declared an integer named i, set it to be less than equal to 10 and am indenting until it has satisfied that value
   System.out.println(part1);//This is where the string part1 will be printed until the value of i has reached 10
  }
  System.out.println("* * * * * * ==================================");
  for (int i = 0; i < 5; i++) {//This is my first for loop used for the second half of my flag. I have declared an integer named i, set it to be less than equal to 10 and am indenting until it has satisfied that value
   System.out.println(part2);//This is where the string part1 will be printed until the value of i has reached 5
  }
 }
}
