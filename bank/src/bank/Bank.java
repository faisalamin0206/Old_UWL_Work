/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author faisa
 */
import java.util.ArrayList;//Here I am importing array list from the library. This allows for me to be able to have arrays that have dynamic sizes allowing for things to be added and removed from it.
import java.util.Scanner;//Here I am importing the java scanner utility class to be able to use the input tool.
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//This is my method to be able to start coding. This whole line means that it is available for use on any device as well as it being able to be self contained while also not returning any result to the end user.
        ArrayList<Account> accounts = new ArrayList<Account>();//Here I am declaring an array list called account as an integer list. The array list allows for it to be dynamically sized allowing for elements to be added and deleted.
        Account account1 = new Account(1111, 300, 2.2);//Here I am creating a new account value called account1.
        accounts.add(account1);//Here I am adding the account1 variable into the accounts array.
        Account account2 = new Account(2222, 30, 2.4);//Here I am creating a new account value called account2.
        accounts.add(account2);//Here I am adding the account2 variable into the accounts array.
        Account account3 = new Account(3333, 3000, 2.9);//Here I am creating a new account value called account3.
        accounts.add(account3);//Here I am adding the account1 variable into the accounts array.
        Scanner input = new Scanner (System.in);//This is my input method scanner. The scanner allows for me to be able to take a user input.
        Account currAccount = null;//Here I am creating a new account value called currAccount and setting to be null for later use.
        boolean isActive = false;//Here I am setting a new boolean value called isActive to be false
            int userInput = input.nextInt();//Here I am setting a integer input userInput for use later in the code.
            while(!isActive){//Here I am setting isActive to be true so that it will run forever until I stop it. 
            switch(userInput){//This is my switch statement. This allows for the program to judge certain scenarios of what the user will input.
                case 1://This is a case in which the user would input the number one.
                    System.out.println("What account?:");//This will print out to the user what account they want to use.
                    int userId = input.nextInt();//Here I am setting a integer input userID for use later in the code.
                    if(accounts.size() > 0){//Here I am making an if statement for the program to carry out if the size of the list is more tham 0.
                    for (int i = 0; i < accounts.size(); i++) {//This is my FOR loop that will keep this part repeating until the value of i is less than the size of the array.
                        if(accounts.get(i).getID() == userId ){//Here I am saying that if the value in the accounts array is equal to the userID input then to do the following.
                            currAccount = accounts.get(i);//Here I am setting currAccount to be the value of what has been retrieved.
                            isActive = true;//Here I am setting isActive to be true.
                            System.out.println("Account found");//This will print out to the user that it has found the account.
                            break;//Here I am breaking the swtich statement in this part of the case.
                        }
                    }
                    } else {//Here I am doing an else statement.
                        System.out.println("No Accounts");//This will print out to the user that there are no accounts.
                    }
                    break;//Here I am breaking the swtich statement in this part of the case.

                case 2://This is a case in which the user would input the number two.
                    System.out.println("Enter ID");//This will print out to the user tp enter the ID.
                    int userIn2 = input.nextInt();//Here I am setting an integer input userIn2 for use later in the code.
                    double userbalance = input.nextDouble();//Here I am setting a double input userbalance for use later in the code.
                    double userinterest = input.nextDouble();//Here I am setting a double input userinterest for use later in the code.
                    Account account = new account(userIn2, userbalance, userinterest);//Here I am creating a new account value called account while referencing all the variables above.
                    accounts.add(account);//Here I am adding the account variable into the accounts array.
                    isActive = true;//Here I am setting isActive to be true.
                    break;//Here I am breaking the swtich statement in this part of the case.
            }
            }
            while(isActive){//Here I am using isActive in a while loop.
                double amount;//Here I am setting a variable called amount as a double.
                System.out.println("1 - deposit, 2 - withdraw, Please press 3 to check your balance");//This will print out to the user their choices.
                userInput = input.nextInt();//Here I am setting the userInput as an input for use later in the code.
                switch(userInput){//This is my switch statement. This allows for the program to judge certain scenarios of what the user will input.
                    case 1://This is a case in which the user would input the number one.
                        System.out.println("How much?");//This will print out to the user how much they want to deposit.
                        amount = input.nextDouble();//Here I am setting the amount variablw as an input for use later in the code.
                        System.out.println("Please press 3 to check your balance");//This will print out to press 3.
                        currAccount.deposit(amount);//This will allow for the input to be added to the current amount.
                        break;//Here I am breaking the swtich statement in this part of the case.
                    case 2://This is a case in which the user would input the number two.
                        System.out.println("How much?:");//This will print out to the user how much they want to withdraw.
                        amount = input.nextDouble();//Here I am setting the amount variablw as an input for use later in the code.
                        System.out.println("Please press 3 to check your balance");//This will print out to press 3.
                        currAccount.withdraw(amount);//This will allow for the input to be taken away from the current amount.
                        break;//Here I am breaking the swtich statement in this part of the case.
                    case 3://This is a case in which the user would input the number three.
                        System.out.println("Your balance is:" + currAccount.getBalance());//This will print out the current value of currAccount.
                        break;//Here I am breaking the swtich statement in this part of the case.
                    case 4://This is a case in which the user would input the number four.
                        isActive = false;//This will break and stop the loop.
                        break;//Here I am breaking the swtich statement in this part of the case.
                }
            }
        }
       
       
    }
