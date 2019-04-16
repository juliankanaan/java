import java.util.*;

/*
Account Class:
- Balance of 20k
- Rd of 4.5%
- deposit meothof of
*/


class Account {
  double currentBalance; // all data types
  int userID;
  double interestRate = 0;
  Date dateCreated;

  public Account(int id, double initialBalance, Date currentDate){ // constructor for new acct

    currentBalance = initialBalance;
    userID = id; // userID
    dateCreated = currentDate;

  }
  public static double deposit(double amount, double beforeBalance){

    double newBalance = beforeBalance + amount; // quantify change

    return newBalance;
  }
  public static double withdraw(double amount, double beforeBalance){

    double newBalance = beforeBalance - amount; // quantify change

    return newBalance;
  }
  public  void setInterest(double rate){
    interestRate = rate;
  }
  public double getMonthlyInterest(){
    return interestRate / 12;
  }



  public static void main(String []args){

    Date currentDate = new Date();
    double defaultInterest = 0.045; // set interest rate

    /* Create Account & Notify */

    Account user1 = new Account(1122, 20000.00, currentDate); // create account
    System.out.println("CREATED ACCOUNT "+ user1.userID +" at time: "+ user1.dateCreated.toString());

    double startingBalance = user1.currentBalance;

    System.out.println("\nYour starting balance is: "+ startingBalance);

    /* Deposit & Withdraw functions */

    double afterDeposit = user1.deposit(3000.00, startingBalance ); // deposit $3k to user 1122

    System.out.println("After deposit, your new balance is: "+ afterDeposit);

    double afterWithdrawal = user1.withdraw(2500.00, afterDeposit);

    System.out.println("After withdrawl, your new balance is: "+ afterWithdrawal);

    /* Set interest rate */

    user1.setInterest(defaultInterest);
    double monthlyInterest = user1.getMonthlyInterest();


    System.out.println("\nUserID of "+user1.userID + " has a MONTHLY interest rate of " + monthlyInterest);



  }
}
