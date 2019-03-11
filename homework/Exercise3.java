
/*

Exercise 3 (10pts): Write a Java program to ask the user to enter letter” a “ to generate a
random char (a-z) , and ask the user to enter letter “A” to generate a random char between (AZ) . If the user enters anything else by “a” or “A” the program will print message, invalid entry,
please try again

*/

import java.util.*;


public class Exercise3 {


  public static void main(String[] args) {

  // ask user

  System.out.println("Enter a for random char a-z & A for char A-Z");


  Scanner input = new Scanner(System.in);

  String choice = input.next();


  input.close();

  System.out.println("You chose: "+choice );
  // generate random num
   // bc non

  if ( choice.equals("a") ) {

    // int rand = Math.random(97, 123);

    int rand = 96 + (int) (Math.random() * 216);

    // System.out.println(rand);

    System.out.println("Your random char is: "+ (char) rand );



  } else if (choice.equals("A")) {

     // int rand = Math.random(65, 91);

     int rand = 65 + (int) (Math.random() * 157);

    System.out.println("Your random char is: "+ (char) rand );


  } else {

    System.out.println("Something went very wrong" );

  }




  // A-Z



  }

}
