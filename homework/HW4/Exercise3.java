
/*
Exercise 3 (10pts) Write program in java that accepts user’s input and validates if the input
(could be a word or more) is a palindrome. A palindrome is a word that reads the same forwards
as it does backwards. For this exercise we will consider a palindrome a palindrome without
punctuation.
*/
import java.util.*;

public class Exercise3 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter an word to bec checked");

      String choice = input.next();

      input.close(); // close it up

      System.out.println("You chose: "+choice );

      palindromeCheck(choice);


    }


    public static void palindromeCheck(String word){

      int length = word.length();
      int notPalindrome = 0; // 0 for false, > 0 for true

      for (int i=0; i < length; i++){ // loop over every from beginning

        for (int j=(length - 1); j>-1; j--){


            if (word.charAt(i) == word.charAt(j)){ // check beginning and end
              // do nothing. this is good
            } else { // uh oh, not good
              notPalindrome++;
            }
        } // inner loop
      } //end loop
      if ( notPalindrome > 0 ){ // string shown to be a palindrome 
        System.out.println("String is a palindrome.");
      } else {

        System.out.println("String is NOT a palindrome.");

      }

    }

} // end class
