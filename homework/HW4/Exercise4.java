import java.util.*;

/*
Exercise 4 (10 point) Write a Java program that converts a decimal number to binary based
2. For instance, 45 in binary is 101101. The decimal number is an input from the user.
*/

public class Exercise4 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter number to be converted to binary");

      int choice = input.nextInt();

      input.close(); // close it up

      System.out.println("You chose: "+choice );

      binaryConverter(choice);


    }
    public static void binaryConverter(int num){
      

      String inBinary = Integer.toBinaryString(num); // built in function

      System.out.println(inBinary);


    }

}
