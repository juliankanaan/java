/*

Exercise 1 (10pts): Write a computer program that asks the user for a password and checks if
the password is correct. If the password is valid, you display a message to the user saying “Valid
Password”. Otherwise, you display the message “Invalid Password”.
Assume that the valid password is “NYU42day”


*/

import java.util.*;


public class Exercise1 {

  public static void main(String[] args) {


    System.out.println("User & Password check");
    // can also just do print() but this gives a new line


    // Start with this:
    Scanner input = new Scanner(System.in);
    String userPass;
    String correctPass = "NYU42day";


    System.out.print("Enter your password:  ");

    userPass = input.next(); // capture user texts

    input.close(); // close it

    // Check if this matches w/ real

    if ( userPass.equals(correctPass) ) {

      System.out.println("Valid password");

    } else {

      System.out.println("Invalid Password");
    }

}
}
