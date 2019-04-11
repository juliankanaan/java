import java.util.*;

/*
Exercise#3 (20pts): Write a test program that prompts the user to enter 10 double values.
5
The program has two overloaded methods that return the average of an array with the
following signatures:
public static int average (int [] array)
public static double average (double [] array)
Your program will read the input as entered by the user, invoke methods and displays the
average value.
*/



public class Exercise3 {

  public static void main(String[] args) {

    double[] nums = ask(10); // ask for 10 doubles / ints

    System.out.println("The average of your list is: "+average(nums));

  }
  public static double average(double[] arr){

    double sumSoFar = 0;

    for (int i=0; i < arr.length; i++){
      sumSoFar += arr[i];
    }
    double avg = sumSoFar / arr.length;
    return avg;
  }
  public static int average(int[] arr){

    int sumSoFar = 0;

    for (int i=0; i < arr.length; i++){
      sumSoFar += arr[i];
    }
    int avg = sumSoFar / arr.length;
    return avg;
  }
  public static double[] ask(int howMany){
    double[] newArray = new double[howMany]; // create array of desired slots
    Scanner input = new Scanner(System.in);
    System.out.println("Enter "+ howMany + " numbers");

    for (int i =0; i < howMany; i++){

      newArray[i] = input.nextDouble();
    }

    return newArray;
  }

}
