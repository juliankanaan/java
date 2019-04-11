import java.util.*;

/*
Exercise#4 (20pts): Implement the following method that returns true if the array is already
sorted in increasing order.
public static boolean isSorted(int[] list)
Write a test program that prompts the user to enter a list of int numbers and displays
whether the list is sorted or not.
Here is a sample run. Note that the first number in the input indicates the number of
elements in the list. This number is NOT part of the list.


e.g. Input: Enter list: 8 10 1 5 16 61 9 11 1
Output: The list is not sorted
e.g. Input: Enter list: 10 1 1 3 4 4 5 7 9 11 21
Output :The list is already sorted
*/



public class Exercise4 {

  public static void main(String[] args) {

    int[] integers = ask(5); // ask for 10 integers

    if (isSorted(integers)){

      System.out.println("Sorted.");

    } else {
      System.out.println("Not sorted. But here is what sorted looks like: ");
      int[] correctArr = sortDescending(integers);
      printArray(correctArr);
    }


  }
  public static int[] sortDescending(int[] arr){

    int[] newArray = new int[arr.length];

    for (int i=0; i < arr.length; i++){
      int referenceNum = arr[i];
      for (int j=1; j < arr.length; j++){
        int currentNum = arr[j];
        if ( currentNum < referenceNum ){
          newArray[j] = currentNum;
        } else {
          newArray[j] = referenceNum;
        }
      }
      newArray[0] = findMin(arr); // dont forget position 1 that we skipped
    }
    return newArray;



  }
  public static boolean isSorted(int[] arr){

    int[] sortedArr = sortDescending(arr);

    if (Arrays.equals(arr, sortedArr)){ // if arrays are the same, orig array was sorted right
      return true;
    } else {
      return false;
    }

  }
  public static int[] ask(int howMany){
    int[] newArray = new int[howMany]; // create array of desired slots
    Scanner input = new Scanner(System.in);
    System.out.println("Enter "+ howMany + " numbers");

    for (int i =0; i < howMany; i++){

      newArray[i] = input.nextInt();
    }

    return newArray;
  }
  public static void printArray(int arr[]){
    for (int i =0; i < arr.length; i++){
      System.out.print(arr[i]);
    }
    System.out.println(" "); // empty line

  }
  public static int findMin(int[] arr){
    int minSoFar = 300;
    for (int i =0; i < arr.length; i++){
      if (arr[i] < minSoFar){
        minSoFar = arr[i];
      }
    }
    return minSoFar;

  }
}
