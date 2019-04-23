import java.util.*;

/*
using array data types pt.2

*/

// GOOD built-ins: Arrays.sort(), Arrays.binarySearch() Arrays.equals(array1, arr2) [true, false boolean]
// Arrays.fill(arrayName, valueToFill) or Arrays.fill(arrayName, startingPos, EndingPos, Value); 
public class LessonNine {

  public static void main(String[] args) {

    int[] aRandomArray = randomArray(10);

    System.out.println("New array is...");

    printArray(aRandomArray);

    System.out.println("Reverse is..");
    int[] reversed = reverseArray(aRandomArray);
    printArray(reversed);

    boolean search = linearSearch(reversed, 10);
    if (search){
      System.out.println("does exist");
    } else {
      System.out.println("Doesnt exist");
    }
  }

  // pass arrays into funcitons like this:
  public static void printArray(int[] inputArray){

    for (int i=0; i < inputArray.length; i++){
      System.out.print(inputArray[i]+" ");
    }

  }
  public static int[] randomArray(int length){
    int[] newArray = new int[length]; // create new blank array of length asked

    for (int i=0; i < length; i++){
      newArray[i] = (int)(Math.random()*100); // btw 0 and 100(]
    }
    return newArray;
  }
  public static int[] reverseArray(int[] inputArray){
    int[] newArray = new int[inputArray.length]; // new blank array of same size
    for (int i=0; i < inputArray.length; i++){

      for (int j=inputArray.length-1; j >= 0; j--, i++){ //

        newArray[j] = inputArray[i];

      }

    }
    return newArray;

  }
  public static boolean linearSearch(int[] inputArray, int itemToSearch){
    int position = -1;
    for (int i=0; i < inputArray.length; i++){
      if (inputArray[i] == itemToSearch){
        position = i; // position
        break;
      }
    }
    if (position > -1) {
      return true;
    } else {
      return false;
    }
  }
}
