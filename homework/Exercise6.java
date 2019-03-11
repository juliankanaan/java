/*

Exercise 6 (20 pts): Write a Java program that examine the user’s password strength as follows:
The program will ask the user to enter password

*/


import java.util.*;


public class Exercise6 {


  public static void main(String[] args) {

    // LOGIC: password strength 0 to 5 in strength


    // get user input

    System.out.println("Choose password: ");

    Scanner input = new Scanner(System.in);

    String password = input.next();

    input.close(); // no longer needed

    int length;
    int score = 0; // start from zero

    // check char length

    length = password.length();

    System.out.println("Your PW is length of " + length);

    if (length < 8 ) {

      // System.out.println("Weak password. Length");


    } else if ( length > 8  && length <= 12 ) {

      // System.out.println("Medium password. Length");

      score++;

    } else if (length > 12) {

      System.out.println("Strong password. Length");
      score++;
      score++;

    }



    // does it have mixed case?: ie compare lowercased & uppercased versions to string

    if (password.toLowerCase().equals(password.toUpperCase() )) {
      // no points given

    } else {
      // System.out.println("Medium password. Length");
      score++;
    }


    // Give Password a score:


    System.out.println("Password score: "+ score);
    // reject or give PW score




  }

}
