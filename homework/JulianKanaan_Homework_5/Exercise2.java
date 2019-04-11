import java.util.*;

/*
Exercise#2 (20pts): Write a program that reads integers between 1 and 100 and counts
the occurrences of each. Assume the input ends with 0.

Here is a sample run of the program:

Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
Output:
2 occurs 2 times, 3 occurs 1 time, 4 occurs 1 time,
5 occurs 2 times, 6 occurs 1 time, 23 occurs 1 time, 43 occurs 1 time
*/



public class Exercise2 {

  public static void main(String[] args) {

    System.out.println("Enter integers between 1 & 100");

    int[] integers = ask(5);

    analyzeIntegers(integers);

  }
  public static void analyzeIntegers(int[] arr){

    for (int i=0; i < arr.length; i++){ // loop thru every number

      int currentNum = arr[i];
      int count = 1; // count starts at 1 if we found this current num

      for (int j=0; j > arr.length; j++){
        System.out.println(arr[j]);
        if (currentNum == arr[j]){

          count++; // increment count for each match we find
        }

      } // end inside loop
      System.out.println(currentNum+" occurs "+count+" times");


    } // end outside array

     // @to-do: create a "checked nums array", so that we don't repeat ourselves in the outside loop


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

}
