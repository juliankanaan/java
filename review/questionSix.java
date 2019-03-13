

import java.util.*;

public class questionSix {

  public static void main(String[] args){

    int[] nums = {1,3,5,3,9,32};

    System.out.println(range(nums));
    
  }
  public static int range(int[] arr){ // finds largestDigit, smallest and gets range

    int max = largestDigit(arr);
    int min = smallestDigit(arr);

    return max - min;

  }


  public static int largestDigit(int[] arr){
    int maxSoFar = 0;
    for (int i=0; i < arr.length; i++){
      if ( arr[i] > maxSoFar){
        maxSoFar = arr[i];
      }
    }
    return maxSoFar;
  }
  public static int smallestDigit(int[] arr){
    int minSoFar = 2000;
    for (int i=0; i < arr.length; i++){
      if ( arr[i] < minSoFar){
        minSoFar = arr[i];
      }
    }
    return minSoFar;
  }
}
