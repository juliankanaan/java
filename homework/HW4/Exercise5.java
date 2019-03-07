import java.util.*;

/*
Exercise 5 (15 pts) Write a java program that contain two overloaded methods that accepts two
numbers or two characters representing a range example (11, 37) or (c, w) inputted by the user.
The method generates a random integer within the given range and returns it, or a random char
with in the given range of chars and returns it. The method needs to be called in the main and
main prints the return of the method.
*/

public class Exercise5 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter a first num or character");

      String choice1 = input.next(); // accept it as string regardless

      System.out.println("Enter second num or character (no mixing)");

      String choice2 = input.next();

      input.close(); // close it up

      System.out.println("You chose: "+choice1 + choice2 );

      System.out.println( randomInRange(choice1, choice2) );


    }
    public static int randomInRange(int num1, int num2){

      num1 = Integer.valueOf(num1);
      num2 = Integer.valueOf(num2); // convert string input to integers

      int result = num1 + (int)Math.round(Math.random() * ( (num2 - num1) + 1 ) );

      return result; // integer

    }
    public static char randomInRange(String char1, String char2){

      char first = char1.charAt(0);
      char second = char2.charAt(0);

      int numeric1 = (char) first;
      int numeric2 = (char) second; // find ASCII number for randomizinf

      int result = numeric1 + (int)Math.round(Math.random() * ((numeric2- numeric1)+1));


      return (char)result;
    }


}
