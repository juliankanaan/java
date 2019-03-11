
/*

Exercise 2 (10pts): Write a Java program that computes the maximum of two given numbers
using Java.Lang.Math You need to read the numbers from the console and display the maximum
to the console.


*/

import java.util.*;


public class Exercise2 {


  public static void main(String[] args) {

    System.out.println("Which num is greater?");

    Scanner input = new Scanner(System.in);
    int num1;
    int num2;
    double greater;


    System.out.print("Enter first number");
    num1 = input.nextInt();
    System.out.print("Enter second number");
    num2 = input.nextInt();

    input.close();

    // decide which is greater
    System.out.println("Bigger number is: " + Math.max(num1, num2));


  }

}
