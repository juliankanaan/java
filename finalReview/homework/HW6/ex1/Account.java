import java.util.*;


public class Account {
  private int id; // account ID
  private double balance;
  private double annualInterestRate = 0.0;
  private Date dateCreated = new Date();

  public Account() {
    // no args
  }

  public Account(int id, double balance) {
    this.balance = balance;
    this.id = id;
  }
  public int getID(){
    return id;
  }
  public double getBalance(){
    return balance;
  }
  public double withdraw(double amount){

    if (amount < balance){
      return balance - amount;
    } else {
      System.out.println("Dont have enough money");
      return balance;
    }

  } // withdraw

  public double deposit(double amount){
    return balance + amount;
  }
  public double getMonthlyInterest(){
    return annualInterestRate;
  }
  public String getDateCreated(){
    return dateCreated.toString(); 
  }



}
