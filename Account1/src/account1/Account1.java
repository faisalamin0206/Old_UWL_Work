/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account1;

/**
 *
 * @author faisa
 */
public class Account1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());

    }
}

class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new java.util.Date();
    }
    public Account(int id, double balace) {
        this();
        this.id = id;
        this.balance = balance;
    }
    public int getId() {
        return this.id;
    }
    public double getBalance() {
        return this.balance;
    }
   
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public double getDateCreated() {
        return balance * getDateCreated();
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}
