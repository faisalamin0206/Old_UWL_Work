/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election1;

/**
 *
 * @author faisa
 */
import java.util.Scanner;//Here I am importing the java scanner utility class to be able to use the input tool.
import java.util.ArrayList;//Here I am importing array list from the library. This allows for me to be able to have arrays that have dynamic sizes allowing for things to be added and removed from it.
import java.util.*;//Here I am importing not just one type of class to the program but many. The * allows for me to import many different types of classes to my program.
public class Election1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//This is my method to be able to start coding. This whole line means that it is available for use on any device as well as it being able to be self contained while also not returning any result to the end user.
        Scanner input = new Scanner(System.in);//This is my input method scanner. The scanner allows for me to be able to take a user input.
        ArrayList<String> names = new ArrayList<String>();//Here I am declaring an array list called names as a string list. The array list allows for it to be dynamically sized allowing for elements to be added and deleted.
        ArrayList<String> count = new ArrayList<String>();//Here I am declaring an array list called names2 as a string list. This array list is to store all the names seperately instead of a single unit like names does.
        System.out.println("Please enter the people you want to vote for: When you are finished, please write Stop.");//This will prompt the user to enter the candidates thhey would like to vote for.
        int topvote = 0;//Here I am declaring an integer topvote equal to 0. This will be used later to be able to display the winner with the most votes.
        String topname = ("");//Here I am declaring a string topname equal to an empty string. This will be used later to be able to display the winner with the most votes.
        while (true) {//Here I am setting a while loop that will be continous as it is true. 
            String a = input.nextLine();//Here I am setting a string input a for use later in the code.
            if (a.equals("")) {//Here I am saying that if a is equal to an empty input, then to just continue on in the code and leave it.
                continue;//This will help the code carry on.
            }
            if (a.equals("Stop")) {//Here I am writing an if statement so the user can break out of the while loop and finish with the program. .equals is a method.
                break;//This allows for the user to break free from the while loop and stop. 
            }
            if(!names.contains(a)){//Here I am writing an if statement so that if the list does not contain the name added, then to add it.
                names.add(a);//This adds the input.
            }
            count.add(a);//This adds the input to count.

        }
        for (String s: names) {//Here I am using a for loop and creating a string s and basically assigning it to names and saying to run the commands below.
            int currVote = Collections.frequency(count, s);//Here I am creating a variable that counts the amount of names in count and names or s.
            System.out.println(s + ":" + currVote);//Here I am printing out s + the currVote variable.
            if(topvote < currVote){//Here I am comparing the topvote variable with the currVote variable and saying that if it is smaller then to do te following.
                topvote = currVote;//Here I am assigning topvote to the current value of currVote
                topname = s;//Here I am assigning the topname variable to the current value of s.
            }
            
        }
        System.out.println("The winner is: " + topname + " with: " + topvote + " votes");//Here I am printing out the winner output.
    }
}
