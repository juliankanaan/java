import java.util.*;

/*
Exercise#1 (10pts): (Reverse the numbers entered) Write a computer program that reads
ten integers and display them in the reverse of the order in which they read.
*/


public class Reverse {
  public static void main(String[] args) {

    int[] userInput = readIn(5);

    printArr(userInput);

    printArr( reverseArr(userInput) );

  }
  // read in 10 integers

  public static int[] readIn(int howMany){
    Scanner input = new Scanner(System.in);
    int[] newArray = new int[howMany]; // empty array
    System.out.println("Enter " + howMany + "numbers");
    for (int i =0; i < howMany; i++ ) {
      int newInt = input.nextInt();
      newArray[i] = newInt;
    }
    return newArray;


  }
  public static void printArr(int[] arr){
    for (int i=0; i < arr.length; i++ ) {
      System.out.print(arr[i]);
    }
  }
  public static int[] reverseArr(int[] arr){
    int[] newArr = new int[arr.length]; // empty arr of same length

    for (int i= arr.length - 1; i > -1; i--) {
      // will go to zero
      for (int j=0; j < arr.length; j++, i--) {
        newArr[j] = arr[i];
      } // decrement i pos after

    } // outer loop
    return newArr;
  }

}
