import java.util.*;
/*
Exercise 2 (10pts) Write a Java program that contains a method that takes a number (from the
user as an input) and prints it in reverse order. That is, if the user enters 123, the program
should print 321.
(you are NOT allowed to use arrays)
*/

public class Exercise2 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter an integer number. thanks");

      String choice = input.next();

      input.close(); // close it up

      System.out.println("You chose: "+choice );

      reverseOrder(choice);


      }


    public static void reverseOrder(String num){
      int length = num.length(); // find length, convert
      //System.out.println(length);
      String stringNum = String.valueOf(num);
      // String digit;

      System.out.println("WRITING IN REVERSE ORDER.....");

      for (int j=(length - 1); j>-1; j--){

          System.out.println(stringNum.charAt(j));
      }

    }

}
