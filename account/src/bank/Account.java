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
import java.util.Date;//This allows for the user to display the current date and time.
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//This is my method to be able to start coding. This whole line means that it is available for use on any device as well as it being able to be self contained while also not returning any result to the end user.
    private int ID = 0;//Here I am setting a private integer ID as 0.
    private double balance = 0;//Here I am setting a private double balance as 0.
    private double annualInterestRate = 0;//Here I am setting a private double annualInterestRate as 0.
    private Date dateCreated;//Here I am setting a private dateCreated using the date I had imported. 
   
    public Account() {//This is my class that I am now editing from earlier.
        System.out.println(balance + " : " + annualInterestRate + " : " + dateCreated);//This will print out the balance, annualInterestRate and dateCreated variables.
    }

    public Account(int ID, double balance, double interest) {//Here I am using my class account again.
        this.ID = ID;//This is a keyword that can be used as a reference point. Here I am using it to assign the ID variable.
        this.balance = balance;//This is a keyword that can be used as a reference point. Here I am using it to assign the balance variable.
        this.annualInterestRate= interest;//This is a keyword that can be used as a reference point. Here I am using it to assign the intrest variable.

        System.out.println(balance + " : " + annualInterestRate + " : " + dateCreated);//This will print out the balance, annualInterestRate and dateCreated variables.
    }

    public int getID() {//This is my getter for the ID. It will return ID.
        return ID;
    }

    public void setID(int ID) {//This is my setter for the ID. It will use the this command to set the ID.
        this.ID = ID;
    }

    public double getBalance() {//This is my getter for the balance. It will return balnce.
        return balance;
    }

    public void setBalance(double balance) {//This is my setter for the balance. It will use the this command to set the balance.
        this.balance = balance;
    }

    public double getAnnualInterestRate() {//This is my getter for the date created. It will return annualinterestrate.
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {//This is my setter for the annual interest rate. It will use the this command to set the snnual interest rate.
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {//This is my getter for the date created. It will return the dateCreated.
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {//This is my setter for the date created. It will use the this command to set the date created.
        this.dateCreated = dateCreated;
    }
   
    public double getMonthlyInterestRate(double MonthlyInterestRate){//This is my getter for the monthly interest rate. It will return the monthly interest rate.
        return (annualInterestRate / 100) / 12;//Here I am using the annual interest rate seet earleir to be able to make the monthly interest rate.
    }
   
    public void withdraw(double amount){//This is my method for the withdraw that I use in the bank package. This carries out actions when referenced upon.
        balance = balance-amount;
    }
    public void deposit(double amount){//This is my method for the withdraw that I use in the bank package. This carries out actions when referenced upon.
        balance = balance+amount;
    }    
}
