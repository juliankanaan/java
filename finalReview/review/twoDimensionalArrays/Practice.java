import java.util.*;

public class Practice {
  public static void main(String[] args) {

    int[][] randArr = createTwoDimensional(5);

    printTwoDimArr(randArr);

  }

  public static int[][] createTwoDimensional(int width){

    int[][] newArr = new int[width][width];

    for (int row=0; row<width; row++ ){ // rows first
      for (int j=0; j < newArr[row].length; j++ ) { // column by column now
        int randNum = (int)(Math.random() * 10);

        newArr[row][j] = randNum;
      }
    } // end outside loop

    return newArr;

  }
  /*
  public int[] pickOutOneRow(int[][] arr, int whichOne){

  }
  */
  public static void printTwoDimArr(int[][] arr){

    // assume symmetry here
    for (int row=0; row < arr.length; row++ ) { // go row by row
      System.out.println("Row: " + row + "\n");

      for (int i=0; i < arr[row].length; i++) {
        System.out.print(arr[row][i] + " "); // add space

      }
      System.out.println("\n");

    } // outer loop

  } // method
}
