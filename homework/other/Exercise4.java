/*

Exercise 4 (15pts): Write a Java program that calculate the letter grade given the numeric
percent grade as an input by user. Your output will look like the following
You entered [numeric grade], Your letter grade is [letter grade]

*/

import java.util.*;


public class Exercise4 {


  public static void main(String[] args) {

    System.out.println("Enter a numerical number grade");

    // get user input
    Scanner input = new Scanner(System.in);

    int grade = input.nextInt();
    String letter;

    input.close();

    System.out.println("You Entered: "+grade );

    // classify

    if (grade >= 90 ) {

      if (grade >= 94 ) {

        letter = "A";

      } else {

        letter = "A-";
      }
    } else if (grade >= 80 ) {

      if (grade >= 87 ) {

        letter = "B+";

      } else if (grade >= 84 ) {

        letter = "B";
      } else if (grade >= 80 ) {

      } else {
        letter = "B-";
      }
    } else if (grade >= 74) {
      if (grade >= 77) {
        letter = "C+";
      } else {
        letter = "C";
      }
    } else if (grade >= 65) {
      letter = "D";
    } else {
      letter = "F";
    }

    System.out.println("Your grade: " + letter );


    }


}
