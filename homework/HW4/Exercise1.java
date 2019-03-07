import java.util.*;
/*
Exercise 1 (10pts) Repeat Kiosk problem in Assignment 3 with the following modifications
- Use methods. Each operations is represented by a method
- Use do – while loop to make sure the kiosk is always ready for further transactions – not
just one time run–
- If option “4” is entered the program exist.
- Starting balance is $100.00

*/

public class Exercise1 {

    public static void main(String[] args) {

      doTransaction(0.0); // start up the ATM w/ zero in the bank


    }


    public static void doTransaction(Double balance){
      System.out.println("\nYour balance is $"+balance);
      System.out.println("1. View balance");
      System.out.println("2. Deposit Cash");
      System.out.println("3. Withdraw Cash");
      System.out.println("4. Exit");

      int option = getInput();

      while (option < 4 ) {
          if (option == 1){
            viewBalance(balance);
          } else if (option == 2) {

            depositCash(balance);

          } else if (option == 3) {
            withdrawCash(balance);

          } else {

            break;
          }
      } // end loop
      System.out.println("Goodbye.");


    }

    public static int getInput(){ // ask for 1, 2 ,3 ,4

      Scanner input = new Scanner(System.in);
      System.out.println("\nEnter your selection");

      int option = input.nextInt();


      //input.close(); // not needed now

      return option;

    }
    public static void viewBalance(Double balance){

        System.out.println("Your balance is: "+balance);

        doTransaction(balance); // back to menu

    }


    public static void depositCash(Double currentBalance){

      Scanner input = new Scanner(System.in);
      System.out.println("How much to deposit?");
      Double deposit = input.nextDouble();
      //input.close();

      Double newBalance = currentBalance + deposit;

      doTransaction(newBalance); // back to menu


    }
    public static void withdrawCash(Double currentBalance){

      Scanner input = new Scanner(System.in);
      System.out.println("How much to withdraw?");
      Double withdrawal = input.nextDouble();
      //input.close();

      if (withdrawal > currentBalance){ // overdraft, whoops

        System.out.println("You do not have the funds for that");

        doTransaction(currentBalance); // bounce them back to menu

      } else {
        Double newBalance = currentBalance - withdrawal;

        doTransaction(newBalance); // back to menu w/ new balance
      }

    }



}
