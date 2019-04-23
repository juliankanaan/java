import java.util.*;


public class OneDimension {

  public static void main(String[] args) {

    int[] sample = {1,2,3,4,5};

    int[] reversed = reverse(sample);

    printArray(reversed);


  }
  public static int[] reverse(int[] arr){
    int[] newArray = new int[arr.length];

    for (int i= arr.length; i >= 0; i-- ){
      for (int j= 0; j < arr.length; j++){
        newArray[j] = arr[i];
      }
    }
    return newArray;
  }
  public static void printArray(int[] arr){

    for (int i=0; i < arr.length; i++){
      System.out.print(arr[i]);
    }

  }

}
