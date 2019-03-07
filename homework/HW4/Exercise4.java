import java.util.*;

/*
Exercise 4 (10 point) Write a Java program that converts a decimal number to binary based
2. For instance, 45 in binary is 101101. The decimal number is an input from the user.
*/

public class Exercise4 {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter num 0-255");

      int choice = input.nextInt();

      input.close(); // close it up

      System.out.println("You chose: "+choice );

      binaryConverter(choice);


    }
    public static void binaryConverter(int num){
      // all the binary positions for decimals 0 -255


      int binary0, binary1, binary2, binary3, binary4, binary5, binary6, binary7;
      Double remainder; // remainder when we divide with %

      binary0 = num % 2; // clean divide by base 2
      remainder = Math.floor(num); // get remainder
      System.out.println(binary0);
      System.out.println(remainder);
      binary1 = remainder % 2;
      remainder = Math.floor(remainder);

      binary2 = remainder % 2;
      remainder = Math.floor(remainder);

      binary3 = remainder % 2;
      remainder = Math.floor(remainder);

      binary4 = remainder % 2;
      remainder = Math.floor(remainder);

      binary5 = remainder % 2;
      remainder = Math.floor(remainder);

      binary6 = remainder % 2;
      remainder = Math.floor(remainder);

      binary7 = remainder % 2;
      remainder = Math.floor(remainder);

      String result = binary7 + "" + binary6+ "" + binary5+ "" + binary4+ "" + binary3+ "" + binary2+ "" + binary1+ "" + binary0;

      System.out.println(result);


    }

}
