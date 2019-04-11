import java.util.*;

/*
Exercise#1 (10pts): (Reverse the numbers entered) Write a computer program that reads
ten integers and display them in the reverse of the order in which they read.
*/



public class Exercise1 {

    public static void main(String[] args) {


      int[] origArr = ask(10); // 10 integer list

      int[] reversed = reverse(origArr);

      System.out.println("Your list reversed: ");

      printArray(reversed);

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
}
