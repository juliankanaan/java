import java.util.*;

/*
Exercise#5 (30pts): Create a program that generate a random 7x7 array (1-100) and has two
methods
a. void sortArrayRows(int[][] arr) method which sorts each row of the array individually,
then print a well formed array
example on a 3x3 2D array:
input: 17 7 27 printed output: 7 17 27
12 2 1 1 2 12
8 70 45 8 45 70
b. void sortArray(int[][] arr) method which sorts the entire array ascending (from
smallest to largest) then print a well formed array
example on a 3x3 2D array:
input: 17 7 27 printed output: 1 2 7
 12 2 1 8 12 17
 8 70 45 27 45 70
*/



public class Exercise5 {

  public static void main(String[] args) {


    int[][] randArr = createMatrix(7, 7); // create a random 7x7

    System.out.println("Here is what the random 7x7 looks like: ");
    sortArrayRows(randArr);

    System.out.println("Now we can clean it up: ");




  }
  //public static void sortArrayRows(int[][] arr){ // sort ascending for each row of the array

  //}
  public static int[][] createMatrix(int rows, int columns){

    int[][] newArray = new int[rows][columns];

    for (int i =0; i < columns; i++){ // rows
      //System.out.println("Row: "+i);

      for (int j=0; j < newArray[i].length; j++){ // column values

        int rand = (int)(Math.random() * 100);

        newArray[i][j] = rand;

      }
    } // end outer
    return newArray;
  }
  public static void sortArrayRows(int[][] arr){
    for (int i=0; i < arr.length; i++){ // go row by row (length is total rows)
      System.out.println("Row: "+i);
      for (int j =0; j < arr[i].length; j++){ // go value by value (for as many as there are)
        System.out.println(arr[i][j]);
      }
    }
  }
  public static void sortArray(int[][] arr){

    int[][] newArray = int[arr.length][arr[0].length]; // assumes array has equal # of column vvals


    sortArrayRows(newArray); // show the new array
  }
}
