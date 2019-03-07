import java.util.*;
/*
Exercise 7 (25pts) Write a program that prompts the user to enter two strings and displays the
largest common prefix of the two strings (ignoring the letters case). Here are some sample runs:
Enter the first string: Welcome to Java Enter the second string: Welcome to programming The
common prefix is Welcome to
Enter the first string: Atlanta Enter the second string: Miami
Output: Miami and Atlanta have no common prefix
*/


public class Exercise7 {


  public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.println("Enter two strings");

    String one = input.next();
    String two = input.next();


    input.close(); // close it up

    System.out.println( commonPrefix(one, two) );



  }
  public static String commonPrefix(String one, String two){

    one.toLowerCase();
    two.toLowerCase(); // convert to lowercase

    String matchingString = " "; // empty to be populated as we find matches

    // loop over each character of each, comparing as we go

    for (int i=0; i < one.length(); i++){

      if (one.charAt(i) == two.charAt(i)) { // character match?

        char charToAdd = one.charAt(i);

        matchingString = matchingString + charToAdd; // add matching to empty string
      }

    } // end loop


    return matchingString.trim(); // in case any weird spaces
  }


}
