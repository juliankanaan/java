

import java.util.*;

public class questionSeven {

  public static void main(String[] args){

    int[] nums = ask(5);

    printArray(nums);

    int max = findMax(nums);
    int min = findMin(nums);
    int[] reversed = reverse(nums);

    System.out.println("Largest is "+ max +" and smallest is "+min);

    printArray(reversed);
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
  public static int findMax(int[] arr){
    int maxSoFar = 0;
    for (int i =0; i < arr.length; i++){
      if (arr[i]> maxSoFar){
        maxSoFar = arr[i];
      }
    }
    return maxSoFar;

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
  public static int[] reverse(int[] arr){
    int[] newArray = new int[arr.length];

    for (int i =0; i < arr.length; i++){
      for (int j = newArray.length -1; j > -1; j--, i++){
        newArray[j] = arr[i];
      }
    }
    return newArray;
  }

}
